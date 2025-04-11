package yarnwrap.enchantment.effect.entity;
public class ApplyMobEffectEnchantmentEffect { public net.minecraft.enchantment.effect.entity.ApplyMobEffectEnchantmentEffect wrapperContained; public ApplyMobEffectEnchantmentEffect(net.minecraft.enchantment.effect.entity.ApplyMobEffectEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60223(Object instance) { return wrapperContained.method_60223(instance); }

}