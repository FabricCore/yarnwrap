package yarnwrap.enchantment.effect.value;
public class AddEnchantmentEffect { public net.minecraft.enchantment.effect.value.AddEnchantmentEffect wrapperContained; public AddEnchantmentEffect(net.minecraft.enchantment.effect.value.AddEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60212(Object instance) { return wrapperContained.method_60212(instance); }

}