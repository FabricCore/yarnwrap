package yarnwrap.enchantment.effect.entity;
public class ReplaceDiskEnchantmentEffect { public net.minecraft.enchantment.effect.entity.ReplaceDiskEnchantmentEffect wrapperContained; public ReplaceDiskEnchantmentEffect(net.minecraft.enchantment.effect.entity.ReplaceDiskEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.lang.Boolean method_60244(yarnwrap.server.world.ServerWorld predicate) { return wrapperContained.method_60244(predicate.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_60245(Object instance) { return wrapperContained.method_60245(instance); }
// public void method_60508(yarnwrap.server.world.ServerWorld gameEvent) { wrapperContained.method_60508(gameEvent.wrapperContained); }

}