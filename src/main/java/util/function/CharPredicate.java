package yarnwrap.util.function;
public class CharPredicate { public net.minecraft.util.function.CharPredicate wrapperContained; public CharPredicate(net.minecraft.util.function.CharPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.function.CharPredicate negate() { return new yarnwrap.util.function.CharPredicate(wrapperContained.negate()); }
public yarnwrap.util.function.CharPredicate and(yarnwrap.util.function.CharPredicate predicate) { return new yarnwrap.util.function.CharPredicate(wrapperContained.and(predicate.wrapperContained)); }
public yarnwrap.util.function.CharPredicate or(yarnwrap.util.function.CharPredicate predicate) { return new yarnwrap.util.function.CharPredicate(wrapperContained.or(predicate.wrapperContained)); }

}