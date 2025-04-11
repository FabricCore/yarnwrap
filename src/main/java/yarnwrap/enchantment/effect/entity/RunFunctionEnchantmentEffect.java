package yarnwrap.enchantment.effect.entity;
public class RunFunctionEnchantmentEffect { public net.minecraft.enchantment.effect.entity.RunFunctionEnchantmentEffect wrapperContained; public RunFunctionEnchantmentEffect(net.minecraft.enchantment.effect.entity.RunFunctionEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.mojang.datafixers.kinds.App method_60246(Object instance) { return wrapperContained.method_60246(instance); }

}