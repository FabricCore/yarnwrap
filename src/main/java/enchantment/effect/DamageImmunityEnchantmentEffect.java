package yarnwrap.enchantment.effect;
public class DamageImmunityEnchantmentEffect { public net.minecraft.enchantment.effect.DamageImmunityEnchantmentEffect wrapperContained; public DamageImmunityEnchantmentEffect(net.minecraft.enchantment.effect.DamageImmunityEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.enchantment.effect.DamageImmunityEnchantmentEffect INSTANCE() { return new yarnwrap.enchantment.effect.DamageImmunityEnchantmentEffect(wrapperContained.INSTANCE); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}