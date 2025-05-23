package yarnwrap.component.type;
public class BlocksAttacksComponent { public net.minecraft.component.type.BlocksAttacksComponent wrapperContained; public BlocksAttacksComponent(net.minecraft.component.type.BlocksAttacksComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.BlocksAttacksComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.BlocksAttacksComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.BlocksAttacksComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.BlocksAttacksComponent.PACKET_CODEC = value.wrapperContained; }

public int getBlockDelayTicks() { return wrapperContained.getBlockDelayTicks(); }
// public static int getBlockDelayTicks() { return net.minecraft.component.type.BlocksAttacksComponent.getBlockDelayTicks(); }
// public int convertCooldownToTicks(float cooldownSeconds) { return wrapperContained.convertCooldownToTicks(cooldownSeconds); }
// public static int convertCooldownToTicks(float cooldownSeconds, ) { return net.minecraft.component.type.BlocksAttacksComponent.convertCooldownToTicks(cooldownSeconds); }
public void playBlockSound(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity from) { wrapperContained.playBlockSound(world.wrapperContained,from.wrapperContained); }
// public static void playBlockSound(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity from, ) { net.minecraft.component.type.BlocksAttacksComponent.playBlockSound(world.wrapperContained,from.wrapperContained); }
public void applyShieldCooldown(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity affectedEntity,float cooldownSeconds,yarnwrap.item.ItemStack stack) { wrapperContained.applyShieldCooldown(world.wrapperContained,affectedEntity.wrapperContained,cooldownSeconds,stack.wrapperContained); }
// public static void applyShieldCooldown(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity affectedEntity,float cooldownSeconds,yarnwrap.item.ItemStack stack, ) { net.minecraft.component.type.BlocksAttacksComponent.applyShieldCooldown(world.wrapperContained,affectedEntity.wrapperContained,cooldownSeconds,stack.wrapperContained); }
// public void method_67201(yarnwrap.server.world.ServerWorld sound) { wrapperContained.method_67201(sound.wrapperContained); }
// public static void method_67201(yarnwrap.server.world.ServerWorld sound, ) { net.minecraft.component.type.BlocksAttacksComponent.method_67201(sound.wrapperContained); }
public float getDamageReductionAmount(yarnwrap.entity.damage.DamageSource source,float damage,double angle) { return wrapperContained.getDamageReductionAmount(source.wrapperContained,damage,angle); }
// public static float getDamageReductionAmount(yarnwrap.entity.damage.DamageSource source,float damage,double angle, ) { return net.minecraft.component.type.BlocksAttacksComponent.getDamageReductionAmount(source.wrapperContained,damage,angle); }
// public com.mojang.datafixers.kinds.App method_67203(Object instance) { return wrapperContained.method_67203(instance); }
// public static com.mojang.datafixers.kinds.App method_67203(Object instance, ) { return net.minecraft.component.type.BlocksAttacksComponent.method_67203(instance); }
public void onShieldHit(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity entity,yarnwrap.util.Hand hand,float itemDamage) { wrapperContained.onShieldHit(world.wrapperContained,stack.wrapperContained,entity.wrapperContained,hand.wrapperContained,itemDamage); }
// public static void onShieldHit(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity entity,yarnwrap.util.Hand hand,float itemDamage, ) { net.minecraft.component.type.BlocksAttacksComponent.onShieldHit(world.wrapperContained,stack.wrapperContained,entity.wrapperContained,hand.wrapperContained,itemDamage); }
// public void method_67205(yarnwrap.server.world.ServerWorld sound) { wrapperContained.method_67205(sound.wrapperContained); }
// public static void method_67205(yarnwrap.server.world.ServerWorld sound, ) { net.minecraft.component.type.BlocksAttacksComponent.method_67205(sound.wrapperContained); }

}