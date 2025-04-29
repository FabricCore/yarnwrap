package yarnwrap.enchantment.effect.entity;
public class SummonEntityEnchantmentEffect { public net.minecraft.enchantment.effect.entity.SummonEntityEnchantmentEffect wrapperContained; public SummonEntityEnchantmentEffect(net.minecraft.enchantment.effect.entity.SummonEntityEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.enchantment.effect.entity.SummonEntityEnchantmentEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.enchantment.effect.entity.SummonEntityEnchantmentEffect.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_60264(Object instance) { return wrapperContained.method_60264(instance); }
// public static com.mojang.datafixers.kinds.App method_60264(Object instance, ) { return net.minecraft.enchantment.effect.entity.SummonEntityEnchantmentEffect.method_60264(instance); }

}