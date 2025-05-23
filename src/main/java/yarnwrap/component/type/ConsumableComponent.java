package yarnwrap.component.type;
public class ConsumableComponent { public net.minecraft.component.type.ConsumableComponent wrapperContained; public ConsumableComponent(net.minecraft.component.type.ConsumableComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.consume.UseAction useAction() { return new yarnwrap.item.consume.UseAction(wrapperContained.useAction); }
// public void useAction(yarnwrap.item.consume.UseAction value) { wrapperContained.useAction = value.wrapperContained; }
// public static yarnwrap.item.consume.UseAction useAction() { return new yarnwrap.item.consume.UseAction(net.minecraft.component.type.ConsumableComponent.useAction); }
// public static void useAction(yarnwrap.item.consume.UseAction value, ) { net.minecraft.component.type.ConsumableComponent.useAction = value.wrapperContained; }

// public float DEFAULT_CONSUME_SECONDS() { return wrapperContained.DEFAULT_CONSUME_SECONDS; }
// public void DEFAULT_CONSUME_SECONDS(float value) { wrapperContained.DEFAULT_CONSUME_SECONDS = value; }
public static float DEFAULT_CONSUME_SECONDS() { return net.minecraft.component.type.ConsumableComponent.DEFAULT_CONSUME_SECONDS; }
// public static void DEFAULT_CONSUME_SECONDS(float value, ) { net.minecraft.component.type.ConsumableComponent.DEFAULT_CONSUME_SECONDS = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.ConsumableComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ConsumableComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.ConsumableComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.ConsumableComponent.PACKET_CODEC = value.wrapperContained; }

// public int PARTICLES_AND_SOUND_TICK_INTERVAL() { return wrapperContained.PARTICLES_AND_SOUND_TICK_INTERVAL; }
// public void PARTICLES_AND_SOUND_TICK_INTERVAL(int value) { wrapperContained.PARTICLES_AND_SOUND_TICK_INTERVAL = value; }
// public static int PARTICLES_AND_SOUND_TICK_INTERVAL() { return net.minecraft.component.type.ConsumableComponent.PARTICLES_AND_SOUND_TICK_INTERVAL; }
// public static void PARTICLES_AND_SOUND_TICK_INTERVAL(int value, ) { net.minecraft.component.type.ConsumableComponent.PARTICLES_AND_SOUND_TICK_INTERVAL = value; }

// public float PARTICLES_AND_SOUND_TICK_THRESHOLD() { return wrapperContained.PARTICLES_AND_SOUND_TICK_THRESHOLD; }
// public void PARTICLES_AND_SOUND_TICK_THRESHOLD(float value) { wrapperContained.PARTICLES_AND_SOUND_TICK_THRESHOLD = value; }
// public static float PARTICLES_AND_SOUND_TICK_THRESHOLD() { return net.minecraft.component.type.ConsumableComponent.PARTICLES_AND_SOUND_TICK_THRESHOLD; }
// public static void PARTICLES_AND_SOUND_TICK_THRESHOLD(float value, ) { net.minecraft.component.type.ConsumableComponent.PARTICLES_AND_SOUND_TICK_THRESHOLD = value; }

// public yarnwrap.item.consume.UseAction useAction() { return new yarnwrap.item.consume.UseAction(wrapperContained.useAction()); }
// // public static yarnwrap.item.consume.UseAction useAction() { return new yarnwrap.item.consume.UseAction(net.minecraft.component.type.ConsumableComponent.useAction()); }
public int getConsumeTicks() { return wrapperContained.getConsumeTicks(); }
// public static int getConsumeTicks() { return net.minecraft.component.type.ConsumableComponent.getConsumeTicks(); }
public boolean shouldSpawnParticlesAndPlaySounds(int remainingUseTicks) { return wrapperContained.shouldSpawnParticlesAndPlaySounds(remainingUseTicks); }
// public static boolean shouldSpawnParticlesAndPlaySounds(int remainingUseTicks, ) { return net.minecraft.component.type.ConsumableComponent.shouldSpawnParticlesAndPlaySounds(remainingUseTicks); }
public void spawnParticlesAndPlaySound(yarnwrap.util.math.random.Random random,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,int particleCount) { wrapperContained.spawnParticlesAndPlaySound(random.wrapperContained,user.wrapperContained,stack.wrapperContained,particleCount); }
// public static void spawnParticlesAndPlaySound(yarnwrap.util.math.random.Random random,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,int particleCount, ) { net.minecraft.component.type.ConsumableComponent.spawnParticlesAndPlaySound(random.wrapperContained,user.wrapperContained,stack.wrapperContained,particleCount); }
public boolean canConsume(yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack) { return wrapperContained.canConsume(user.wrapperContained,stack.wrapperContained); }
// public static boolean canConsume(yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack, ) { return net.minecraft.component.type.ConsumableComponent.canConsume(user.wrapperContained,stack.wrapperContained); }
public yarnwrap.util.ActionResult consume(yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.consume(user.wrapperContained,stack.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult consume(yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.component.type.ConsumableComponent.consume(user.wrapperContained,stack.wrapperContained,hand.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_62846(Object instance) { return wrapperContained.method_62846(instance); }
// public static com.mojang.datafixers.kinds.App method_62846(Object instance, ) { return net.minecraft.component.type.ConsumableComponent.method_62846(instance); }
public yarnwrap.item.ItemStack finishConsumption(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.finishConsumption(world.wrapperContained,user.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack finishConsumption(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.component.type.ConsumableComponent.finishConsumption(world.wrapperContained,user.wrapperContained,stack.wrapperContained)); }
// public void method_62848(yarnwrap.world.World consumable) { wrapperContained.method_62848(consumable.wrapperContained); }
// public static void method_62848(yarnwrap.world.World consumable, ) { net.minecraft.component.type.ConsumableComponent.method_62848(consumable.wrapperContained); }
// public void method_62849(yarnwrap.world.World effect) { wrapperContained.method_62849(effect.wrapperContained); }
// public static void method_62849(yarnwrap.world.World effect, ) { net.minecraft.component.type.ConsumableComponent.method_62849(effect.wrapperContained); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.component.type.ConsumableComponent.builder(); }

}