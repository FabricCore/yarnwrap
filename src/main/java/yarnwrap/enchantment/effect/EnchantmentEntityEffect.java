package yarnwrap.enchantment.effect;
public class EnchantmentEntityEffect { public net.minecraft.enchantment.effect.EnchantmentEntityEffect wrapperContained; public EnchantmentEntityEffect(net.minecraft.enchantment.effect.EnchantmentEntityEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.enchantment.effect.EnchantmentEntityEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.enchantment.effect.EnchantmentEntityEffect.CODEC = value; }

public void apply(yarnwrap.server.world.ServerWorld world,int level,yarnwrap.enchantment.EnchantmentEffectContext context,yarnwrap.entity.Entity user,yarnwrap.util.math.Vec3d pos) { wrapperContained.apply(world.wrapperContained,level,context.wrapperContained,user.wrapperContained,pos.wrapperContained); }
// public static void apply(yarnwrap.server.world.ServerWorld world,int level,yarnwrap.enchantment.EnchantmentEffectContext context,yarnwrap.entity.Entity user,yarnwrap.util.math.Vec3d pos, ) { net.minecraft.enchantment.effect.EnchantmentEntityEffect.apply(world.wrapperContained,level,context.wrapperContained,user.wrapperContained,pos.wrapperContained); }
// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.enchantment.effect.EnchantmentEntityEffect.registerAndGetDefault(registry.wrapperContained); }

}