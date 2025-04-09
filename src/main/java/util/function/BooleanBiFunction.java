package yarnwrap.util.function;
public class BooleanBiFunction { public net.minecraft.util.function.BooleanBiFunction wrapperContained; public BooleanBiFunction(net.minecraft.util.function.BooleanBiFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.function.BooleanBiFunction OR() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.OR); }
public yarnwrap.util.function.BooleanBiFunction NOT_OR() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.NOT_OR); }
public yarnwrap.util.function.BooleanBiFunction ONLY_FIRST() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.ONLY_FIRST); }
public yarnwrap.util.function.BooleanBiFunction SECOND() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.SECOND); }
public yarnwrap.util.function.BooleanBiFunction NOT_AND() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.NOT_AND); }
public yarnwrap.util.function.BooleanBiFunction CAUSES() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.CAUSES); }
public yarnwrap.util.function.BooleanBiFunction SAME() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.SAME); }
public yarnwrap.util.function.BooleanBiFunction FIRST() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.FIRST); }
public yarnwrap.util.function.BooleanBiFunction NOT_SAME() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.NOT_SAME); }
public yarnwrap.util.function.BooleanBiFunction ONLY_SECOND() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.ONLY_SECOND); }
public yarnwrap.util.function.BooleanBiFunction NOT_FIRST() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.NOT_FIRST); }
public yarnwrap.util.function.BooleanBiFunction TRUE() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.TRUE); }
public yarnwrap.util.function.BooleanBiFunction AND() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.AND); }
public yarnwrap.util.function.BooleanBiFunction FALSE() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.FALSE); }
public yarnwrap.util.function.BooleanBiFunction NOT_SECOND() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.NOT_SECOND); }
public yarnwrap.util.function.BooleanBiFunction CAUSED_BY() { return new yarnwrap.util.function.BooleanBiFunction(wrapperContained.CAUSED_BY); }

}