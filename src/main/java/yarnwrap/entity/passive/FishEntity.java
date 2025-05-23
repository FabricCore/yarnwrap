package yarnwrap.entity.passive;
public class FishEntity { public net.minecraft.entity.passive.FishEntity wrapperContained; public FishEntity(net.minecraft.entity.passive.FishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData FROM_BUCKET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FROM_BUCKET); }
// public void FROM_BUCKET(yarnwrap.entity.data.TrackedData value) { wrapperContained.FROM_BUCKET = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData FROM_BUCKET() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.FishEntity.FROM_BUCKET); }
// public static void FROM_BUCKET(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.FishEntity.FROM_BUCKET = value.wrapperContained; }

// public boolean DEFAULT_FROM_BUCKET() { return wrapperContained.DEFAULT_FROM_BUCKET; }
// public void DEFAULT_FROM_BUCKET(boolean value) { wrapperContained.DEFAULT_FROM_BUCKET = value; }
// public static boolean DEFAULT_FROM_BUCKET() { return net.minecraft.entity.passive.FishEntity.DEFAULT_FROM_BUCKET; }
// public static void DEFAULT_FROM_BUCKET(boolean value, ) { net.minecraft.entity.passive.FishEntity.DEFAULT_FROM_BUCKET = value; }

// public boolean hasSelfControl() { return wrapperContained.hasSelfControl(); }
// public static boolean hasSelfControl() { return net.minecraft.entity.passive.FishEntity.hasSelfControl(); }
// public yarnwrap.sound.SoundEvent getFlopSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getFlopSound()); }
// public static yarnwrap.sound.SoundEvent getFlopSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.FishEntity.getFlopSound()); }
// public Object createFishAttributes() { return wrapperContained.createFishAttributes(); }
public static Object createFishAttributes() { return net.minecraft.entity.passive.FishEntity.createFishAttributes(); }

}