package yarnwrap.enchantment.effect.entity;
public class PlaySoundEnchantmentEffect { public net.minecraft.enchantment.effect.entity.PlaySoundEnchantmentEffect wrapperContained; public PlaySoundEnchantmentEffect(net.minecraft.enchantment.effect.entity.PlaySoundEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60240(Object instance) { return wrapperContained.method_60240(instance); }

}