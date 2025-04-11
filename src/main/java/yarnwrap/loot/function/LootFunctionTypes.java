package yarnwrap.loot.function;
public class LootFunctionTypes { public net.minecraft.loot.function.LootFunctionTypes wrapperContained; public LootFunctionTypes(net.minecraft.loot.function.LootFunctionTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.BiFunction NOOP() { return wrapperContained.NOOP; }
// public void NOOP(java.util.function.BiFunction value) { wrapperContained.NOOP = value; }
public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.loot.function.LootFunctionType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.function.LootFunctionType(wrapperContained.register(id,codec)); }
public java.util.function.BiFunction join(java.util.List terms) { return wrapperContained.join(terms); }

}