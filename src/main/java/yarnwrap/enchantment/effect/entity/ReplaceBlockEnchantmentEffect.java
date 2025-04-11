package yarnwrap.enchantment.effect.entity;
public class ReplaceBlockEnchantmentEffect { public net.minecraft.enchantment.effect.entity.ReplaceBlockEnchantmentEffect wrapperContained; public ReplaceBlockEnchantmentEffect(net.minecraft.enchantment.effect.entity.ReplaceBlockEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.lang.Boolean method_60242(yarnwrap.server.world.ServerWorld predicate) { return wrapperContained.method_60242(predicate.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_60243(Object instance) { return wrapperContained.method_60243(instance); }
// public void method_60507(yarnwrap.server.world.ServerWorld gameEvent) { wrapperContained.method_60507(gameEvent.wrapperContained); }

}