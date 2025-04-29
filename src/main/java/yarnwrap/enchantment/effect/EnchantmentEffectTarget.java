package yarnwrap.enchantment.effect;
public class EnchantmentEffectTarget { public net.minecraft.enchantment.effect.EnchantmentEffectTarget wrapperContained; public EnchantmentEffectTarget(net.minecraft.enchantment.effect.EnchantmentEffectTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.enchantment.effect.EnchantmentEffectTarget.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.enchantment.effect.EnchantmentEffectTarget.CODEC = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.enchantment.effect.EnchantmentEffectTarget.id; }
// public static void id(java.lang.String value, ) { net.minecraft.enchantment.effect.EnchantmentEffectTarget.id = value; }

// public EnchantmentEffectTarget(java.lang.String id) { this.wrapperContained = new net.minecraft.enchantment.effect.EnchantmentEffectTarget(id); }

}