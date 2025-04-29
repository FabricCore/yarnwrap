package yarnwrap.enchantment.effect.entity;
public class ExplodeEnchantmentEffect { public net.minecraft.enchantment.effect.entity.ExplodeEnchantmentEffect wrapperContained; public ExplodeEnchantmentEffect(net.minecraft.enchantment.effect.entity.ExplodeEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.enchantment.effect.entity.ExplodeEnchantmentEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.enchantment.effect.entity.ExplodeEnchantmentEffect.CODEC = value; }

// public java.lang.Float method_60234(int knockbackMultiplier) { return wrapperContained.method_60234(knockbackMultiplier); }
// public static java.lang.Float method_60234(int knockbackMultiplier, ) { return net.minecraft.enchantment.effect.entity.ExplodeEnchantmentEffect.method_60234(knockbackMultiplier); }
// public yarnwrap.entity.damage.DamageSource getDamageSource(yarnwrap.entity.Entity user,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.getDamageSource(user.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource getDamageSource(yarnwrap.entity.Entity user,yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.enchantment.effect.entity.ExplodeEnchantmentEffect.getDamageSource(user.wrapperContained,pos.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_60236(Object instance) { return wrapperContained.method_60236(instance); }
// public static com.mojang.datafixers.kinds.App method_60236(Object instance, ) { return net.minecraft.enchantment.effect.entity.ExplodeEnchantmentEffect.method_60236(instance); }

}