package yarnwrap.enchantment.effect.value;
public class SetEnchantmentEffect { public net.minecraft.enchantment.effect.value.SetEnchantmentEffect wrapperContained; public SetEnchantmentEffect(net.minecraft.enchantment.effect.value.SetEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}