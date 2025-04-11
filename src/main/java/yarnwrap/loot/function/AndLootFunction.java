package yarnwrap.loot.function;
public class AndLootFunction { public net.minecraft.loot.function.AndLootFunction wrapperContained; public AndLootFunction(net.minecraft.loot.function.AndLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List terms() { return wrapperContained.terms; }
// public void terms(java.util.List value) { wrapperContained.terms = value; }
// public java.util.function.BiFunction applier() { return wrapperContained.applier; }
// public void applier(java.util.function.BiFunction value) { wrapperContained.applier = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public void INLINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INLINE_CODEC = value; }
// public AndLootFunction(java.util.List terms) { this.wrapperContained = new net.minecraft.loot.function.AndLootFunction(terms); }
// public java.lang.Object apply(java.lang.Object stack,java.lang.Object context) { return wrapperContained.apply(stack,context); }
// public com.mojang.datafixers.kinds.App method_53351(Object instance) { return wrapperContained.method_53351(instance); }
// public java.util.List method_53352(yarnwrap.loot.function.AndLootFunction function) { return wrapperContained.method_53352(function.wrapperContained); }
public yarnwrap.loot.function.AndLootFunction create(java.util.List terms) { return new yarnwrap.loot.function.AndLootFunction(wrapperContained.create(terms)); }
// public java.util.List method_53354(yarnwrap.loot.function.AndLootFunction function) { return wrapperContained.method_53354(function.wrapperContained); }

}