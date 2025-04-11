package yarnwrap.loot.provider.number;
public class UniformLootNumberProvider { public net.minecraft.loot.provider.number.UniformLootNumberProvider wrapperContained; public UniformLootNumberProvider(net.minecraft.loot.provider.number.UniformLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public UniformLootNumberProvider(yarnwrap.loot.provider.number.LootNumberProvider min,yarnwrap.loot.provider.number.LootNumberProvider max) { this.wrapperContained = new net.minecraft.loot.provider.number.UniformLootNumberProvider(min.wrapperContained,max.wrapperContained); }
public yarnwrap.loot.provider.number.UniformLootNumberProvider create(float min,float max) { return new yarnwrap.loot.provider.number.UniformLootNumberProvider(wrapperContained.create(min,max)); }
// public com.mojang.datafixers.kinds.App method_53444(Object instance) { return wrapperContained.method_53444(instance); }

}