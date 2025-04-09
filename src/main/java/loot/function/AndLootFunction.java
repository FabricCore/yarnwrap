package yarnwrap.loot.function;
public class AndLootFunction { public net.minecraft.loot.function.AndLootFunction wrapperContained; public AndLootFunction(net.minecraft.loot.function.AndLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List terms() { return wrapperContained.terms; }
// public java.util.function.BiFunction applier() { return wrapperContained.applier; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
public yarnwrap.loot.function.AndLootFunction create(java.util.List terms) { return new yarnwrap.loot.function.AndLootFunction(wrapperContained.create(terms)); }

}