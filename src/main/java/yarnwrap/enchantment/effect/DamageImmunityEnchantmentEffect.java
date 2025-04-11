package yarnwrap.enchantment.effect;
public class DamageImmunityEnchantmentEffect { public net.minecraft.enchantment.effect.DamageImmunityEnchantmentEffect wrapperContained; public DamageImmunityEnchantmentEffect(net.minecraft.enchantment.effect.DamageImmunityEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.enchantment.effect.DamageImmunityEnchantmentEffect INSTANCE() { return new yarnwrap.enchantment.effect.DamageImmunityEnchantmentEffect(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.enchantment.effect.DamageImmunityEnchantmentEffect value) { wrapperContained.INSTANCE = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}