package yarnwrap.enchantment.effect.entity;
public class DamageItemEnchantmentEffect { public net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect wrapperContained; public DamageItemEnchantmentEffect(net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_60226(Object instance) { return wrapperContained.method_60226(instance); }
// public static com.mojang.datafixers.kinds.App method_60226(Object instance, ) { return net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect.method_60226(instance); }

}