package yarnwrap.enchantment.effect.value;
public class SetEnchantmentEffect { public net.minecraft.enchantment.effect.value.SetEnchantmentEffect wrapperContained; public SetEnchantmentEffect(net.minecraft.enchantment.effect.value.SetEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60248(Object instance) { return wrapperContained.method_60248(instance); }

}