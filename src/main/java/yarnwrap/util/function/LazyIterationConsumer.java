package yarnwrap.util.function;
public class LazyIterationConsumer { public net.minecraft.util.function.LazyIterationConsumer wrapperContained; public LazyIterationConsumer(net.minecraft.util.function.LazyIterationConsumer wrapperContained) { this.wrapperContained = wrapperContained; }

public Object accept(java.lang.Object value) { return wrapperContained.accept(value); }
// public static Object accept(java.lang.Object value, ) { return net.minecraft.util.function.LazyIterationConsumer.accept(value); }
// public yarnwrap.util.function.LazyIterationConsumer forConsumer(java.util.function.Consumer consumer) { return new yarnwrap.util.function.LazyIterationConsumer(wrapperContained.forConsumer(consumer)); }
// public static yarnwrap.util.function.LazyIterationConsumer forConsumer(java.util.function.Consumer consumer, ) { return new yarnwrap.util.function.LazyIterationConsumer(net.minecraft.util.function.LazyIterationConsumer.forConsumer(consumer)); }
// public Object method_47542(java.util.function.Consumer value) { return wrapperContained.method_47542(value); }
// public static Object method_47542(java.util.function.Consumer value, ) { return net.minecraft.util.function.LazyIterationConsumer.method_47542(value); }

}