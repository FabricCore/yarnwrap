package yarnwrap.entity.passive;
public class ParrotEntity { public net.minecraft.entity.passive.ParrotEntity wrapperContained; public ParrotEntity(net.minecraft.entity.passive.ParrotEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float flapProgress() { return wrapperContained.flapProgress; }
public void flapProgress(float value) { wrapperContained.flapProgress = value; }
public float maxWingDeviation() { return wrapperContained.maxWingDeviation; }
public void maxWingDeviation(float value) { wrapperContained.maxWingDeviation = value; }
// public yarnwrap.util.math.BlockPos songSource() { return new yarnwrap.util.math.BlockPos(wrapperContained.songSource); }
// public void songSource(yarnwrap.util.math.BlockPos value) { wrapperContained.songSource = value.wrapperContained; }
// public java.util.function.Predicate CAN_IMITATE() { return wrapperContained.CAN_IMITATE; }
// public void CAN_IMITATE(java.util.function.Predicate value) { wrapperContained.CAN_IMITATE = value; }
// public java.util.Map MOB_SOUNDS() { return wrapperContained.MOB_SOUNDS; }
// public void MOB_SOUNDS(java.util.Map value) { wrapperContained.MOB_SOUNDS = value; }
// public boolean songPlaying() { return wrapperContained.songPlaying; }
// public void songPlaying(boolean value) { wrapperContained.songPlaying = value; }
// public float flapSpeed() { return wrapperContained.flapSpeed; }
// public void flapSpeed(float value) { wrapperContained.flapSpeed = value; }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
public float prevMaxWingDeviation() { return wrapperContained.prevMaxWingDeviation; }
public void prevMaxWingDeviation(float value) { wrapperContained.prevMaxWingDeviation = value; }
public float prevFlapProgress() { return wrapperContained.prevFlapProgress; }
public void prevFlapProgress(float value) { wrapperContained.prevFlapProgress = value; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createParrotAttributes() { return wrapperContained.createParrotAttributes(); }
// public void flapWings() { wrapperContained.flapWings(); }
// public void method_6579(java.util.HashMap map) { wrapperContained.method_6579(map); }
public float getSoundPitch(yarnwrap.util.math.random.Random random) { return wrapperContained.getSoundPitch(random.wrapperContained); }
public boolean isSongPlaying() { return wrapperContained.isSongPlaying(); }
public yarnwrap.sound.SoundEvent getRandomSound(yarnwrap.world.World world,yarnwrap.util.math.random.Random random) { return new yarnwrap.sound.SoundEvent(wrapperContained.getRandomSound(world.wrapperContained,random.wrapperContained)); }
// public yarnwrap.sound.SoundEvent getSound(yarnwrap.entity.EntityType imitate) { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound(imitate.wrapperContained)); }
public boolean imitateNearbyMob(yarnwrap.world.World world,yarnwrap.entity.Entity parrot) { return wrapperContained.imitateNearbyMob(world.wrapperContained,parrot.wrapperContained); }

}