package yarnwrap.enchantment.effect.value;
public class AddEnchantmentEffect { public net.minecraft.enchantment.effect.value.AddEnchantmentEffect wrapperContained; public AddEnchantmentEffect(net.minecraft.enchantment.effect.value.AddEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}