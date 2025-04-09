package yarnwrap.enchantment.effect.value;
public class RemoveBinomialEnchantmentEffect { public net.minecraft.enchantment.effect.value.RemoveBinomialEnchantmentEffect wrapperContained; public RemoveBinomialEnchantmentEffect(net.minecraft.enchantment.effect.value.RemoveBinomialEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}