package yarnwrap.loot.provider.number;
public class UniformLootNumberProvider { public net.minecraft.loot.provider.number.UniformLootNumberProvider wrapperContained; public UniformLootNumberProvider(net.minecraft.loot.provider.number.UniformLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.provider.number.UniformLootNumberProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.provider.number.UniformLootNumberProvider.CODEC = value; }

public UniformLootNumberProvider(yarnwrap.loot.provider.number.LootNumberProvider min,yarnwrap.loot.provider.number.LootNumberProvider max) { this.wrapperContained = new net.minecraft.loot.provider.number.UniformLootNumberProvider(min.wrapperContained,max.wrapperContained); }
// public yarnwrap.loot.provider.number.UniformLootNumberProvider create(float min,float max) { return new yarnwrap.loot.provider.number.UniformLootNumberProvider(wrapperContained.create(min,max)); }
// public static yarnwrap.loot.provider.number.UniformLootNumberProvider create(float min,float max, ) { return new yarnwrap.loot.provider.number.UniformLootNumberProvider(net.minecraft.loot.provider.number.UniformLootNumberProvider.create(min,max)); }
// public com.mojang.datafixers.kinds.App method_53444(Object instance) { return wrapperContained.method_53444(instance); }
// public static com.mojang.datafixers.kinds.App method_53444(Object instance, ) { return net.minecraft.loot.provider.number.UniformLootNumberProvider.method_53444(instance); }

}