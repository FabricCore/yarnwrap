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
public yarnwrap.loot.function.AndLootFunction create(java.util.List terms) { return new yarnwrap.loot.function.AndLootFunction(wrapperContained.create(terms)); }

}