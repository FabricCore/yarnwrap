package yarnwrap.enchantment.effect.entity;
public class SetBlockPropertiesEnchantmentEffect { public net.minecraft.enchantment.effect.entity.SetBlockPropertiesEnchantmentEffect wrapperContained; public SetBlockPropertiesEnchantmentEffect(net.minecraft.enchantment.effect.entity.SetBlockPropertiesEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}