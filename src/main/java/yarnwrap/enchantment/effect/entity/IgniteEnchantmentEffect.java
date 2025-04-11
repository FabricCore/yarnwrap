package yarnwrap.enchantment.effect.entity;
public class IgniteEnchantmentEffect { public net.minecraft.enchantment.effect.entity.IgniteEnchantmentEffect wrapperContained; public IgniteEnchantmentEffect(net.minecraft.enchantment.effect.entity.IgniteEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60237(Object instance) { return wrapperContained.method_60237(instance); }

}