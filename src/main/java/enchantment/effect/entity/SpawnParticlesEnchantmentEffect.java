package yarnwrap.enchantment.effect.entity;
public class SpawnParticlesEnchantmentEffect { public net.minecraft.enchantment.effect.entity.SpawnParticlesEnchantmentEffect wrapperContained; public SpawnParticlesEnchantmentEffect(net.minecraft.enchantment.effect.entity.SpawnParticlesEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object entityPosition(float offset) { return wrapperContained.entityPosition(offset); }
public Object fixedVelocity(yarnwrap.util.math.floatprovider.FloatProvider base) { return wrapperContained.fixedVelocity(base.wrapperContained); }
public Object withinBoundingBox() { return wrapperContained.withinBoundingBox(); }
public Object scaledVelocity(float movementScale) { return wrapperContained.scaledVelocity(movementScale); }

}