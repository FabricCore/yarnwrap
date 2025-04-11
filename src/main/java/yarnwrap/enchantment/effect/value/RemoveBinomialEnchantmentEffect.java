package yarnwrap.enchantment.effect.value;
public class RemoveBinomialEnchantmentEffect { public net.minecraft.enchantment.effect.value.RemoveBinomialEnchantmentEffect wrapperContained; public RemoveBinomialEnchantmentEffect(net.minecraft.enchantment.effect.value.RemoveBinomialEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60241(Object instance) { return wrapperContained.method_60241(instance); }

}