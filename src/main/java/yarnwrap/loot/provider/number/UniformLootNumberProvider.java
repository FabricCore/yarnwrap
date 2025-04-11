package yarnwrap.loot.provider.number;
public class UniformLootNumberProvider { public net.minecraft.loot.provider.number.UniformLootNumberProvider wrapperContained; public UniformLootNumberProvider(net.minecraft.loot.provider.number.UniformLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.loot.provider.number.UniformLootNumberProvider create(float min,float max) { return new yarnwrap.loot.provider.number.UniformLootNumberProvider(wrapperContained.create(min,max)); }

}