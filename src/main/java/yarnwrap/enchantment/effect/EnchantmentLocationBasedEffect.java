package yarnwrap.enchantment.effect;
public class EnchantmentLocationBasedEffect { public net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect wrapperContained; public EnchantmentLocationBasedEffect(net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect.CODEC = value; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect.getCodec(); }
public void apply(yarnwrap.server.world.ServerWorld world,int level,yarnwrap.enchantment.EnchantmentEffectContext context,yarnwrap.entity.Entity user,yarnwrap.util.math.Vec3d pos,boolean newlyApplied) { wrapperContained.apply(world.wrapperContained,level,context.wrapperContained,user.wrapperContained,pos.wrapperContained,newlyApplied); }
// public static void apply(yarnwrap.server.world.ServerWorld world,int level,yarnwrap.enchantment.EnchantmentEffectContext context,yarnwrap.entity.Entity user,yarnwrap.util.math.Vec3d pos,boolean newlyApplied, ) { net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect.apply(world.wrapperContained,level,context.wrapperContained,user.wrapperContained,pos.wrapperContained,newlyApplied); }
public void remove(yarnwrap.enchantment.EnchantmentEffectContext context,yarnwrap.entity.Entity user,yarnwrap.util.math.Vec3d pos,int level) { wrapperContained.remove(context.wrapperContained,user.wrapperContained,pos.wrapperContained,level); }
// public static void remove(yarnwrap.enchantment.EnchantmentEffectContext context,yarnwrap.entity.Entity user,yarnwrap.util.math.Vec3d pos,int level, ) { net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect.remove(context.wrapperContained,user.wrapperContained,pos.wrapperContained,level); }
// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect.registerAndGetDefault(registry.wrapperContained); }

}