package yarnwrap.loot.provider.number;
public class ConstantLootNumberProvider { public net.minecraft.loot.provider.number.ConstantLootNumberProvider wrapperContained; public ConstantLootNumberProvider(net.minecraft.loot.provider.number.ConstantLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public void INLINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INLINE_CODEC = value; }
public yarnwrap.loot.provider.number.ConstantLootNumberProvider create(float value) { return new yarnwrap.loot.provider.number.ConstantLootNumberProvider(wrapperContained.create(value)); }

}