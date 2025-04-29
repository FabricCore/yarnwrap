package yarnwrap.enchantment.effect.value;
public class MultiplyEnchantmentEffect { public net.minecraft.enchantment.effect.value.MultiplyEnchantmentEffect wrapperContained; public MultiplyEnchantmentEffect(net.minecraft.enchantment.effect.value.MultiplyEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.enchantment.effect.value.MultiplyEnchantmentEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.enchantment.effect.value.MultiplyEnchantmentEffect.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_60239(Object instance) { return wrapperContained.method_60239(instance); }
// public static com.mojang.datafixers.kinds.App method_60239(Object instance, ) { return net.minecraft.enchantment.effect.value.MultiplyEnchantmentEffect.method_60239(instance); }

}