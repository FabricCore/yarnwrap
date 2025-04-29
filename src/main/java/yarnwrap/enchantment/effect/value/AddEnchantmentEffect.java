package yarnwrap.enchantment.effect.value;
public class AddEnchantmentEffect { public net.minecraft.enchantment.effect.value.AddEnchantmentEffect wrapperContained; public AddEnchantmentEffect(net.minecraft.enchantment.effect.value.AddEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.enchantment.effect.value.AddEnchantmentEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.enchantment.effect.value.AddEnchantmentEffect.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_60212(Object instance) { return wrapperContained.method_60212(instance); }
// public static com.mojang.datafixers.kinds.App method_60212(Object instance, ) { return net.minecraft.enchantment.effect.value.AddEnchantmentEffect.method_60212(instance); }

}