package yarnwrap.entity.passive;
public class ParrotEntity { public net.minecraft.entity.passive.ParrotEntity wrapperContained; public ParrotEntity(net.minecraft.entity.passive.ParrotEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float flapProgress() { return wrapperContained.flapProgress; }
public void flapProgress(float value) { wrapperContained.flapProgress = value; }
// public static float flapProgress() { return net.minecraft.entity.passive.ParrotEntity.flapProgress; }
// public static void flapProgress(float value, ) { net.minecraft.entity.passive.ParrotEntity.flapProgress = value; }

public float maxWingDeviation() { return wrapperContained.maxWingDeviation; }
public void maxWingDeviation(float value) { wrapperContained.maxWingDeviation = value; }
// public static float maxWingDeviation() { return net.minecraft.entity.passive.ParrotEntity.maxWingDeviation; }
// public static void maxWingDeviation(float value, ) { net.minecraft.entity.passive.ParrotEntity.maxWingDeviation = value; }

// public yarnwrap.util.math.BlockPos songSource() { return new yarnwrap.util.math.BlockPos(wrapperContained.songSource); }
// public void songSource(yarnwrap.util.math.BlockPos value) { wrapperContained.songSource = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos songSource() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.passive.ParrotEntity.songSource); }
// public static void songSource(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.passive.ParrotEntity.songSource = value.wrapperContained; }

// public java.util.function.Predicate CAN_IMITATE() { return wrapperContained.CAN_IMITATE; }
// public void CAN_IMITATE(java.util.function.Predicate value) { wrapperContained.CAN_IMITATE = value; }
// public static java.util.function.Predicate CAN_IMITATE() { return net.minecraft.entity.passive.ParrotEntity.CAN_IMITATE; }
// public static void CAN_IMITATE(java.util.function.Predicate value, ) { net.minecraft.entity.passive.ParrotEntity.CAN_IMITATE = value; }

// public java.util.Map MOB_SOUNDS() { return wrapperContained.MOB_SOUNDS; }
// public void MOB_SOUNDS(java.util.Map value) { wrapperContained.MOB_SOUNDS = value; }
// public static java.util.Map MOB_SOUNDS() { return net.minecraft.entity.passive.ParrotEntity.MOB_SOUNDS; }
// public static void MOB_SOUNDS(java.util.Map value, ) { net.minecraft.entity.passive.ParrotEntity.MOB_SOUNDS = value; }

// public boolean songPlaying() { return wrapperContained.songPlaying; }
// public void songPlaying(boolean value) { wrapperContained.songPlaying = value; }
// public static boolean songPlaying() { return net.minecraft.entity.passive.ParrotEntity.songPlaying; }
// public static void songPlaying(boolean value, ) { net.minecraft.entity.passive.ParrotEntity.songPlaying = value; }

// public float flapSpeed() { return wrapperContained.flapSpeed; }
// public void flapSpeed(float value) { wrapperContained.flapSpeed = value; }
// public static float flapSpeed() { return net.minecraft.entity.passive.ParrotEntity.flapSpeed; }
// public static void flapSpeed(float value, ) { net.minecraft.entity.passive.ParrotEntity.flapSpeed = value; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.ParrotEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.ParrotEntity.VARIANT = value.wrapperContained; }

public float lastMaxWingDeviation() { return wrapperContained.lastMaxWingDeviation; }
public void lastMaxWingDeviation(float value) { wrapperContained.lastMaxWingDeviation = value; }
// public static float lastMaxWingDeviation() { return net.minecraft.entity.passive.ParrotEntity.lastMaxWingDeviation; }
// public static void lastMaxWingDeviation(float value, ) { net.minecraft.entity.passive.ParrotEntity.lastMaxWingDeviation = value; }

public float lastFlapProgress() { return wrapperContained.lastFlapProgress; }
public void lastFlapProgress(float value) { wrapperContained.lastFlapProgress = value; }
// public static float lastFlapProgress() { return net.minecraft.entity.passive.ParrotEntity.lastFlapProgress; }
// public static void lastFlapProgress(float value, ) { net.minecraft.entity.passive.ParrotEntity.lastFlapProgress = value; }

// public void flapWings() { wrapperContained.flapWings(); }
// public static void flapWings() { net.minecraft.entity.passive.ParrotEntity.flapWings(); }
// public void method_6579(java.util.HashMap map) { wrapperContained.method_6579(map); }
// public static void method_6579(java.util.HashMap map, ) { net.minecraft.entity.passive.ParrotEntity.method_6579(map); }
// public float getSoundPitch(yarnwrap.util.math.random.Random random) { return wrapperContained.getSoundPitch(random.wrapperContained); }
// public static float getSoundPitch(yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.ParrotEntity.getSoundPitch(random.wrapperContained); }
public boolean isSongPlaying() { return wrapperContained.isSongPlaying(); }
// public static boolean isSongPlaying() { return net.minecraft.entity.passive.ParrotEntity.isSongPlaying(); }
// public yarnwrap.sound.SoundEvent getRandomSound(yarnwrap.world.World world,yarnwrap.util.math.random.Random random) { return new yarnwrap.sound.SoundEvent(wrapperContained.getRandomSound(world.wrapperContained,random.wrapperContained)); }
// public static yarnwrap.sound.SoundEvent getRandomSound(yarnwrap.world.World world,yarnwrap.util.math.random.Random random, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.ParrotEntity.getRandomSound(world.wrapperContained,random.wrapperContained)); }
public Object getVariant() { return wrapperContained.getVariant(); }
// public static Object getVariant() { return net.minecraft.entity.passive.ParrotEntity.getVariant(); }
// public yarnwrap.sound.SoundEvent getSound(yarnwrap.entity.EntityType imitate) { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound(imitate.wrapperContained)); }
// public static yarnwrap.sound.SoundEvent getSound(yarnwrap.entity.EntityType imitate, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.ParrotEntity.getSound(imitate.wrapperContained)); }
// public boolean imitateNearbyMob(yarnwrap.world.World world,yarnwrap.entity.Entity parrot) { return wrapperContained.imitateNearbyMob(world.wrapperContained,parrot.wrapperContained); }
// public static boolean imitateNearbyMob(yarnwrap.world.World world,yarnwrap.entity.Entity parrot, ) { return net.minecraft.entity.passive.ParrotEntity.imitateNearbyMob(world.wrapperContained,parrot.wrapperContained); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.ParrotEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createParrotAttributes() { return wrapperContained.createParrotAttributes(); }
public static Object createParrotAttributes() { return net.minecraft.entity.passive.ParrotEntity.createParrotAttributes(); }
// public void setVariant(Object variant) { wrapperContained.setVariant(variant); }
// public static void setVariant(Object variant, ) { net.minecraft.entity.passive.ParrotEntity.setVariant(variant); }

}