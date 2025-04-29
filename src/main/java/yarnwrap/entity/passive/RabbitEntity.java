package yarnwrap.entity.passive;
public class RabbitEntity { public net.minecraft.entity.passive.RabbitEntity wrapperContained; public RabbitEntity(net.minecraft.entity.passive.RabbitEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public double ESCAPE_DANGER_SPEED() { return wrapperContained.ESCAPE_DANGER_SPEED; }
// public void ESCAPE_DANGER_SPEED(double value) { wrapperContained.ESCAPE_DANGER_SPEED = value; }
public static double ESCAPE_DANGER_SPEED() { return net.minecraft.entity.passive.RabbitEntity.ESCAPE_DANGER_SPEED; }
// public static void ESCAPE_DANGER_SPEED(double value, ) { net.minecraft.entity.passive.RabbitEntity.ESCAPE_DANGER_SPEED = value; }

// public double MELEE_ATTACK_SPEED() { return wrapperContained.MELEE_ATTACK_SPEED; }
// public void MELEE_ATTACK_SPEED(double value) { wrapperContained.MELEE_ATTACK_SPEED = value; }
public static double MELEE_ATTACK_SPEED() { return net.minecraft.entity.passive.RabbitEntity.MELEE_ATTACK_SPEED; }
// public static void MELEE_ATTACK_SPEED(double value, ) { net.minecraft.entity.passive.RabbitEntity.MELEE_ATTACK_SPEED = value; }

// public yarnwrap.util.Identifier KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID); }
// public void KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID() { return new yarnwrap.util.Identifier(net.minecraft.entity.passive.RabbitEntity.KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID); }
// public static void KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.entity.passive.RabbitEntity.KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID = value.wrapperContained; }

// public yarnwrap.util.Identifier KILLER_BUNNY() { return new yarnwrap.util.Identifier(wrapperContained.KILLER_BUNNY); }
// public void KILLER_BUNNY(yarnwrap.util.Identifier value) { wrapperContained.KILLER_BUNNY = value.wrapperContained; }
// public static yarnwrap.util.Identifier KILLER_BUNNY() { return new yarnwrap.util.Identifier(net.minecraft.entity.passive.RabbitEntity.KILLER_BUNNY); }
// public static void KILLER_BUNNY(yarnwrap.util.Identifier value, ) { net.minecraft.entity.passive.RabbitEntity.KILLER_BUNNY = value.wrapperContained; }

// public int moreCarrotTicks() { return wrapperContained.moreCarrotTicks; }
// public void moreCarrotTicks(int value) { wrapperContained.moreCarrotTicks = value; }
// public static int moreCarrotTicks() { return net.minecraft.entity.passive.RabbitEntity.moreCarrotTicks; }
// public static void moreCarrotTicks(int value, ) { net.minecraft.entity.passive.RabbitEntity.moreCarrotTicks = value; }

// public int ticksUntilJump() { return wrapperContained.ticksUntilJump; }
// public void ticksUntilJump(int value) { wrapperContained.ticksUntilJump = value; }
// public static int ticksUntilJump() { return net.minecraft.entity.passive.RabbitEntity.ticksUntilJump; }
// public static void ticksUntilJump(int value, ) { net.minecraft.entity.passive.RabbitEntity.ticksUntilJump = value; }

// public int jumpDuration() { return wrapperContained.jumpDuration; }
// public void jumpDuration(int value) { wrapperContained.jumpDuration = value; }
// public static int jumpDuration() { return net.minecraft.entity.passive.RabbitEntity.jumpDuration; }
// public static void jumpDuration(int value, ) { net.minecraft.entity.passive.RabbitEntity.jumpDuration = value; }

// public boolean lastOnGround() { return wrapperContained.lastOnGround; }
// public void lastOnGround(boolean value) { wrapperContained.lastOnGround = value; }
// public static boolean lastOnGround() { return net.minecraft.entity.passive.RabbitEntity.lastOnGround; }
// public static void lastOnGround(boolean value, ) { net.minecraft.entity.passive.RabbitEntity.lastOnGround = value; }

// public int jumpTicks() { return wrapperContained.jumpTicks; }
// public void jumpTicks(int value) { wrapperContained.jumpTicks = value; }
// public static int jumpTicks() { return net.minecraft.entity.passive.RabbitEntity.jumpTicks; }
// public static void jumpTicks(int value, ) { net.minecraft.entity.passive.RabbitEntity.jumpTicks = value; }

// public yarnwrap.entity.data.TrackedData RABBIT_TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RABBIT_TYPE); }
// public void RABBIT_TYPE(yarnwrap.entity.data.TrackedData value) { wrapperContained.RABBIT_TYPE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData RABBIT_TYPE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.RabbitEntity.RABBIT_TYPE); }
// public static void RABBIT_TYPE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.RabbitEntity.RABBIT_TYPE = value.wrapperContained; }

// public boolean canSpawn(yarnwrap.entity.EntityType entity,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(entity.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType entity,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.RabbitEntity.canSpawn(entity.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createRabbitAttributes() { return wrapperContained.createRabbitAttributes(); }
public static Object createRabbitAttributes() { return net.minecraft.entity.passive.RabbitEntity.createRabbitAttributes(); }
// public Object getTypeFromPos(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getTypeFromPos(world.wrapperContained,pos.wrapperContained); }
// public static Object getTypeFromPos(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.passive.RabbitEntity.getTypeFromPos(world.wrapperContained,pos.wrapperContained); }
// public boolean method_58374(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58374(stack.wrapperContained); }
// public static boolean method_58374(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.RabbitEntity.method_58374(stack.wrapperContained); }
public float getJumpProgress(float delta) { return wrapperContained.getJumpProgress(delta); }
// public static float getJumpProgress(float delta, ) { return net.minecraft.entity.passive.RabbitEntity.getJumpProgress(delta); }
public void setSpeed(double speed) { wrapperContained.setSpeed(speed); }
// public static void setSpeed(double speed, ) { net.minecraft.entity.passive.RabbitEntity.setSpeed(speed); }
// public boolean wantsCarrots() { return wrapperContained.wantsCarrots(); }
// public static boolean wantsCarrots() { return net.minecraft.entity.passive.RabbitEntity.wantsCarrots(); }
// public void doScheduleJump() { wrapperContained.doScheduleJump(); }
// public static void doScheduleJump() { net.minecraft.entity.passive.RabbitEntity.doScheduleJump(); }
// public void enableJump() { wrapperContained.enableJump(); }
// public static void enableJump() { net.minecraft.entity.passive.RabbitEntity.enableJump(); }
// public yarnwrap.sound.SoundEvent getJumpSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getJumpSound()); }
// public static yarnwrap.sound.SoundEvent getJumpSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.RabbitEntity.getJumpSound()); }
// public void lookTowards(double x,double z) { wrapperContained.lookTowards(x,z); }
// public static void lookTowards(double x,double z, ) { net.minecraft.entity.passive.RabbitEntity.lookTowards(x,z); }
public void startJump() { wrapperContained.startJump(); }
// public static void startJump() { net.minecraft.entity.passive.RabbitEntity.startJump(); }
// public void scheduleJump() { wrapperContained.scheduleJump(); }
// public static void scheduleJump() { net.minecraft.entity.passive.RabbitEntity.scheduleJump(); }
// public void disableJump() { wrapperContained.disableJump(); }
// public static void disableJump() { net.minecraft.entity.passive.RabbitEntity.disableJump(); }

}