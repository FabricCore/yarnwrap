package yarnwrap.entity.passive;
public class ParrotEntity { public net.minecraft.entity.passive.ParrotEntity wrapperContained; public ParrotEntity(net.minecraft.entity.passive.ParrotEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float flapProgress() { return wrapperContained.flapProgress; }
public float maxWingDeviation() { return wrapperContained.maxWingDeviation; }
// public yarnwrap.util.math.BlockPos songSource() { return new yarnwrap.util.math.BlockPos(wrapperContained.songSource); }
// public java.util.function.Predicate CAN_IMITATE() { return wrapperContained.CAN_IMITATE; }
// public java.util.Map MOB_SOUNDS() { return wrapperContained.MOB_SOUNDS; }
// public boolean songPlaying() { return wrapperContained.songPlaying; }
// public float flapSpeed() { return wrapperContained.flapSpeed; }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
public float prevMaxWingDeviation() { return wrapperContained.prevMaxWingDeviation; }
public float prevFlapProgress() { return wrapperContained.prevFlapProgress; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createParrotAttributes() { return wrapperContained.createParrotAttributes(); }
// public void flapWings() { wrapperContained.flapWings(); }
public float getSoundPitch(yarnwrap.util.math.random.Random random) { return wrapperContained.getSoundPitch(random.wrapperContained); }
public boolean isSongPlaying() { return wrapperContained.isSongPlaying(); }
public yarnwrap.sound.SoundEvent getRandomSound(yarnwrap.world.World world,yarnwrap.util.math.random.Random random) { return new yarnwrap.sound.SoundEvent(wrapperContained.getRandomSound(world.wrapperContained,random.wrapperContained)); }
// public yarnwrap.sound.SoundEvent getSound(yarnwrap.entity.EntityType imitate) { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound(imitate.wrapperContained)); }
public boolean imitateNearbyMob(yarnwrap.world.World world,yarnwrap.entity.Entity parrot) { return wrapperContained.imitateNearbyMob(world.wrapperContained,parrot.wrapperContained); }

}