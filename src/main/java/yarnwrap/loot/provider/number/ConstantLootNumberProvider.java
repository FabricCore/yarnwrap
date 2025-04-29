package yarnwrap.loot.provider.number;
public class ConstantLootNumberProvider { public net.minecraft.loot.provider.number.ConstantLootNumberProvider wrapperContained; public ConstantLootNumberProvider(net.minecraft.loot.provider.number.ConstantLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.provider.number.ConstantLootNumberProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.provider.number.ConstantLootNumberProvider.CODEC = value; }

// public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public void INLINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INLINE_CODEC = value; }
public static com.mojang.serialization.Codec INLINE_CODEC() { return net.minecraft.loot.provider.number.ConstantLootNumberProvider.INLINE_CODEC; }
// public static void INLINE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.provider.number.ConstantLootNumberProvider.INLINE_CODEC = value; }

public ConstantLootNumberProvider(float value) { this.wrapperContained = new net.minecraft.loot.provider.number.ConstantLootNumberProvider(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.loot.provider.number.ConstantLootNumberProvider.equals(o); }
// public yarnwrap.loot.provider.number.ConstantLootNumberProvider create(float value) { return new yarnwrap.loot.provider.number.ConstantLootNumberProvider(wrapperContained.create(value)); }
// public static yarnwrap.loot.provider.number.ConstantLootNumberProvider create(float value, ) { return new yarnwrap.loot.provider.number.ConstantLootNumberProvider(net.minecraft.loot.provider.number.ConstantLootNumberProvider.create(value)); }
// public com.mojang.datafixers.kinds.App method_53439(Object instance) { return wrapperContained.method_53439(instance); }
// public static com.mojang.datafixers.kinds.App method_53439(Object instance, ) { return net.minecraft.loot.provider.number.ConstantLootNumberProvider.method_53439(instance); }

}