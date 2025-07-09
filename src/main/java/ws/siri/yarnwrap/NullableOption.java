package ws.siri.yarnwrap;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Alternative to Optional&lt;T&gt; but the contained value is allowed to be null
 */
public class NullableOption<T> {
    private final boolean isPresent;
    private final T value;

    private NullableOption(T value) {
        this.isPresent = true;
        this.value = value;
    }

    private NullableOption() {
        this.isPresent = false;
        this.value = null;
    }

    public static <T> NullableOption<T> of(T value) {
        return new NullableOption<>(value);
    }

    public static <T> NullableOption<T> empty() {
        return new NullableOption<>();
    }

    public boolean isPresent() {
        return isPresent;
    }

    public boolean isEmpty() {
        return !isPresent;
    }

    public T get() {
        if (isPresent) {
            return value;
        } else {
            throw new IllegalAccessError("Nullable option is not present");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof NullableOption) {
            NullableOption<?> other = (NullableOption<?>) obj;

            if (isPresent) {
                if (value == null)
                    return other.value == null;
                return value.equals(other.value);
            } else {
                return !other.isPresent;
            }
        } else {
            return false;
        }
    }

    public <U> NullableOption<U> flatMap(Function<? super T, NullableOption<U>> mapper) {
        if (isPresent) {
            return mapper.apply(this.value);
        } else {
            return NullableOption.empty();
        }
    }

    public void ifPresent(Consumer<? super T> consumer) {
        consumer.accept(this.value);
    }

    public <U> NullableOption<U> map(Function<? super T, ? extends U> mapper) {
        if (isPresent) {
            return NullableOption.of(mapper.apply(this.value));
        } else {
            return NullableOption.empty();
        }
    }

    public T orElse(T other) {
        return isPresent ? value : other;
    }

    T orElseGet(Supplier<? extends T> other) {
        if (isPresent) {
            return this.value;
        } else {
            return other.get();
        }
    }

    <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
        if (isPresent) {
            return this.value;
        } else {
            throw exceptionSupplier.get();
        }
    }

    @Override
    public String toString() {
        return isPresent
            ? ("NullableOption[" + value == null ? "null" : value + "]")
            : "NullableOption.empty";
    }
}
