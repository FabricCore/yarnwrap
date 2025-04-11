package yarnwrap.enchantment.effect.entity;
public class SetBlockPropertiesEnchantmentEffect { public net.minecraft.enchantment.effect.entity.SetBlockPropertiesEnchantmentEffect wrapperContained; public SetBlockPropertiesEnchantmentEffect(net.minecraft.enchantment.effect.entity.SetBlockPropertiesEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public SetBlockPropertiesEnchantmentEffect(yarnwrap.component.type.BlockStateComponent properties) { this.wrapperContained = new net.minecraft.enchantment.effect.entity.SetBlockPropertiesEnchantmentEffect(properties.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_60247(Object instance) { return wrapperContained.method_60247(instance); }
// public void method_60509(yarnwrap.server.world.ServerWorld gameEvent) { wrapperContained.method_60509(gameEvent.wrapperContained); }

}