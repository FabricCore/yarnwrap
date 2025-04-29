package yarnwrap.enchantment.effect.value;
public class SetEnchantmentEffect { public net.minecraft.enchantment.effect.value.SetEnchantmentEffect wrapperContained; public SetEnchantmentEffect(net.minecraft.enchantment.effect.value.SetEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.enchantment.effect.value.SetEnchantmentEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.enchantment.effect.value.SetEnchantmentEffect.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_60248(Object instance) { return wrapperContained.method_60248(instance); }
// public static com.mojang.datafixers.kinds.App method_60248(Object instance, ) { return net.minecraft.enchantment.effect.value.SetEnchantmentEffect.method_60248(instance); }

}