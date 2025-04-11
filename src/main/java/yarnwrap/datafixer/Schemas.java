package yarnwrap.datafixer;
public class Schemas { public net.minecraft.datafixer.Schemas wrapperContained; public Schemas(net.minecraft.datafixer.Schemas wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.BiFunction EMPTY_IDENTIFIER_NORMALIZE() { return wrapperContained.EMPTY_IDENTIFIER_NORMALIZE; }
// public void EMPTY_IDENTIFIER_NORMALIZE(java.util.function.BiFunction value) { wrapperContained.EMPTY_IDENTIFIER_NORMALIZE = value; }
// public java.util.function.BiFunction EMPTY() { return wrapperContained.EMPTY; }
// public void EMPTY(java.util.function.BiFunction value) { wrapperContained.EMPTY = value; }
// public Object FIXER() { return wrapperContained.FIXER; }
// // public void FIXER(Object value) { wrapperContained.FIXER = value; }
// public java.lang.String method_15449(java.lang.String id) { return wrapperContained.method_15449(id); }
public com.mojang.datafixers.DataFixer getFixer() { return wrapperContained.getFixer(); }
// public void build(com.mojang.datafixers.DataFixerBuilder builder) { wrapperContained.build(builder); }
// public java.lang.String method_15455(java.lang.String id) { return wrapperContained.method_15455(id); }
// public java.lang.String method_15459(java.lang.String id) { return wrapperContained.method_15459(id); }
// public Object create() { return wrapperContained.create(); }
// public java.util.function.UnaryOperator replacing(java.lang.String old,java.lang.String current) { return wrapperContained.replacing(old,current); }
// public java.lang.String method_30069(java.lang.String string) { return wrapperContained.method_30069(string); }
// public java.util.function.UnaryOperator replacing(java.util.Map replacements) { return wrapperContained.replacing(replacements); }
// public java.lang.String method_30071(java.util.Map string) { return wrapperContained.method_30071(string); }
// public void method_43061(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap frogVariants) { wrapperContained.method_43061(frogVariants); }
// public void method_43062(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap catVariants) { wrapperContained.method_43062(catVariants); }
// public java.util.function.UnaryOperator replacingRaw(java.util.Map replacements) { return wrapperContained.replacingRaw(replacements); }
// public java.lang.String method_57076(java.util.Map string) { return wrapperContained.method_57076(string); }
public java.util.concurrent.CompletableFuture optimize(java.util.Set requiredTypes) { return wrapperContained.optimize(requiredTypes); }

}