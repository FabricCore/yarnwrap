package yarnwrap.enchantment.effect.entity;
public class SummonEntityEnchantmentEffect { public net.minecraft.enchantment.effect.entity.SummonEntityEnchantmentEffect wrapperContained; public SummonEntityEnchantmentEffect(net.minecraft.enchantment.effect.entity.SummonEntityEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}