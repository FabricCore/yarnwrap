package yarnwrap.entity.mob;
public class SlimeEntity { public net.minecraft.entity.mob.SlimeEntity wrapperContained; public SlimeEntity(net.minecraft.entity.mob.SlimeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float lastStretch() { return wrapperContained.lastStretch; }
public void lastStretch(float value) { wrapperContained.lastStretch = value; }
// public static float lastStretch() { return net.minecraft.entity.mob.SlimeEntity.lastStretch; }
// public static void lastStretch(float value, ) { net.minecraft.entity.mob.SlimeEntity.lastStretch = value; }

public float stretch() { return wrapperContained.stretch; }
public void stretch(float value) { wrapperContained.stretch = value; }
// public static float stretch() { return net.minecraft.entity.mob.SlimeEntity.stretch; }
// public static void stretch(float value, ) { net.minecraft.entity.mob.SlimeEntity.stretch = value; }

public float targetStretch() { return wrapperContained.targetStretch; }
public void targetStretch(float value) { wrapperContained.targetStretch = value; }
// public static float targetStretch() { return net.minecraft.entity.mob.SlimeEntity.targetStretch; }
// public static void targetStretch(float value, ) { net.minecraft.entity.mob.SlimeEntity.targetStretch = value; }

// public yarnwrap.entity.data.TrackedData SLIME_SIZE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SLIME_SIZE); }
// public void SLIME_SIZE(yarnwrap.entity.data.TrackedData value) { wrapperContained.SLIME_SIZE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SLIME_SIZE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.SlimeEntity.SLIME_SIZE); }
// public static void SLIME_SIZE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.SlimeEntity.SLIME_SIZE = value.wrapperContained; }

// public boolean onGroundLastTick() { return wrapperContained.onGroundLastTick; }
// public void onGroundLastTick(boolean value) { wrapperContained.onGroundLastTick = value; }
// public static boolean onGroundLastTick() { return net.minecraft.entity.mob.SlimeEntity.onGroundLastTick; }
// public static void onGroundLastTick(boolean value, ) { net.minecraft.entity.mob.SlimeEntity.onGroundLastTick = value; }

// public int MIN_SIZE() { return wrapperContained.MIN_SIZE; }
// public void MIN_SIZE(int value) { wrapperContained.MIN_SIZE = value; }
public static int MIN_SIZE() { return net.minecraft.entity.mob.SlimeEntity.MIN_SIZE; }
// public static void MIN_SIZE(int value, ) { net.minecraft.entity.mob.SlimeEntity.MIN_SIZE = value; }

// public int MAX_SIZE() { return wrapperContained.MAX_SIZE; }
// public void MAX_SIZE(int value) { wrapperContained.MAX_SIZE = value; }
public static int MAX_SIZE() { return net.minecraft.entity.mob.SlimeEntity.MAX_SIZE; }
// public static void MAX_SIZE(int value, ) { net.minecraft.entity.mob.SlimeEntity.MAX_SIZE = value; }

// public boolean DEFAULT_ON_GROUND_LAST_TICK() { return wrapperContained.DEFAULT_ON_GROUND_LAST_TICK; }
// public void DEFAULT_ON_GROUND_LAST_TICK(boolean value) { wrapperContained.DEFAULT_ON_GROUND_LAST_TICK = value; }
// public static boolean DEFAULT_ON_GROUND_LAST_TICK() { return net.minecraft.entity.mob.SlimeEntity.DEFAULT_ON_GROUND_LAST_TICK; }
// public static void DEFAULT_ON_GROUND_LAST_TICK(boolean value, ) { net.minecraft.entity.mob.SlimeEntity.DEFAULT_ON_GROUND_LAST_TICK = value; }

public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.entity.mob.SlimeEntity.getSize(); }
// public yarnwrap.sound.SoundEvent getJumpSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getJumpSound()); }
// public static yarnwrap.sound.SoundEvent getJumpSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.mob.SlimeEntity.getJumpSound()); }
// public int getTicksUntilNextJump() { return wrapperContained.getTicksUntilNextJump(); }
// public static int getTicksUntilNextJump() { return net.minecraft.entity.mob.SlimeEntity.getTicksUntilNextJump(); }
// public void damage(yarnwrap.entity.LivingEntity target) { wrapperContained.damage(target.wrapperContained); }
// public static void damage(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.mob.SlimeEntity.damage(target.wrapperContained); }
// public void updateStretch() { wrapperContained.updateStretch(); }
// public static void updateStretch() { net.minecraft.entity.mob.SlimeEntity.updateStretch(); }
public boolean isSmall() { return wrapperContained.isSmall(); }
// public static boolean isSmall() { return net.minecraft.entity.mob.SlimeEntity.isSmall(); }
// public float getDamageAmount() { return wrapperContained.getDamageAmount(); }
// public static float getDamageAmount() { return net.minecraft.entity.mob.SlimeEntity.getDamageAmount(); }
// public boolean makesJumpSound() { return wrapperContained.makesJumpSound(); }
// public static boolean makesJumpSound() { return net.minecraft.entity.mob.SlimeEntity.makesJumpSound(); }
// public yarnwrap.sound.SoundEvent getSquishSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSquishSound()); }
// public static yarnwrap.sound.SoundEvent getSquishSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.mob.SlimeEntity.getSquishSound()); }
public void setSize(int size,boolean heal) { wrapperContained.setSize(size,heal); }
// public static void setSize(int size,boolean heal, ) { net.minecraft.entity.mob.SlimeEntity.setSize(size,heal); }
// public yarnwrap.particle.ParticleEffect getParticles() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticles()); }
// public static yarnwrap.particle.ParticleEffect getParticles() { return new yarnwrap.particle.ParticleEffect(net.minecraft.entity.mob.SlimeEntity.getParticles()); }
// public boolean canAttack() { return wrapperContained.canAttack(); }
// public static boolean canAttack() { return net.minecraft.entity.mob.SlimeEntity.canAttack(); }
// public boolean method_18451(yarnwrap.entity.LivingEntity target,yarnwrap.server.world.ServerWorld world) { return wrapperContained.method_18451(target.wrapperContained,world.wrapperContained); }
// public static boolean method_18451(yarnwrap.entity.LivingEntity target,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.entity.mob.SlimeEntity.method_18451(target.wrapperContained,world.wrapperContained); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.SlimeEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public float getJumpSoundPitch() { return wrapperContained.getJumpSoundPitch(); }
// public static float getJumpSoundPitch() { return net.minecraft.entity.mob.SlimeEntity.getJumpSoundPitch(); }
// public void method_63653(int newSlime) { wrapperContained.method_63653(newSlime); }
// public static void method_63653(int newSlime, ) { net.minecraft.entity.mob.SlimeEntity.method_63653(newSlime); }

}