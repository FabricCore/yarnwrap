package yarnwrap.enchantment.effect;
public class EnchantmentEffectTarget { public net.minecraft.enchantment.effect.EnchantmentEffectTarget wrapperContained; public EnchantmentEffectTarget(net.minecraft.enchantment.effect.EnchantmentEffectTarget wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String id() { return wrapperContained.id; }

}