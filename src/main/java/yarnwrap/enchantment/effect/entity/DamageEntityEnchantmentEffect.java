package yarnwrap.enchantment.effect.entity;
public class DamageEntityEnchantmentEffect { public net.minecraft.enchantment.effect.entity.DamageEntityEnchantmentEffect wrapperContained; public DamageEntityEnchantmentEffect(net.minecraft.enchantment.effect.entity.DamageEntityEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60224(Object instance) { return wrapperContained.method_60224(instance); }

}