package yarnwrap.datafixer;
public class Schemas { public net.minecraft.datafixer.Schemas wrapperContained; public Schemas(net.minecraft.datafixer.Schemas wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.BiFunction EMPTY_IDENTIFIER_NORMALIZE() { return wrapperContained.EMPTY_IDENTIFIER_NORMALIZE; }
// public java.util.function.BiFunction EMPTY() { return wrapperContained.EMPTY; }
// public Object FIXER() { return wrapperContained.FIXER; }
public com.mojang.datafixers.DataFixer getFixer() { return wrapperContained.getFixer(); }
// public void build(com.mojang.datafixers.DataFixerBuilder builder) { wrapperContained.build(builder); }
// public Object create() { return wrapperContained.create(); }
// public java.util.function.UnaryOperator replacing(java.lang.String old,java.lang.String current) { return wrapperContained.replacing(old,current); }
// public java.util.function.UnaryOperator replacing(java.util.Map replacements) { return wrapperContained.replacing(replacements); }
// public java.util.function.UnaryOperator replacingRaw(java.util.Map replacements) { return wrapperContained.replacingRaw(replacements); }
public java.util.concurrent.CompletableFuture optimize(java.util.Set requiredTypes) { return wrapperContained.optimize(requiredTypes); }

}