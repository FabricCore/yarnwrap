package yarnwrap.enchantment.effect.value;
public class MultiplyEnchantmentEffect { public net.minecraft.enchantment.effect.value.MultiplyEnchantmentEffect wrapperContained; public MultiplyEnchantmentEffect(net.minecraft.enchantment.effect.value.MultiplyEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}