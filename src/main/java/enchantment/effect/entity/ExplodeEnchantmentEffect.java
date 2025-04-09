package yarnwrap.enchantment.effect.entity;
public class ExplodeEnchantmentEffect { public net.minecraft.enchantment.effect.entity.ExplodeEnchantmentEffect wrapperContained; public ExplodeEnchantmentEffect(net.minecraft.enchantment.effect.entity.ExplodeEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.entity.damage.DamageSource getDamageSource(yarnwrap.entity.Entity user,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.getDamageSource(user.wrapperContained,pos.wrapperContained)); }

}