package yarnwrap.entity.passive;
public class FishEntity { public net.minecraft.entity.passive.FishEntity wrapperContained; public FishEntity(net.minecraft.entity.passive.FishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData FROM_BUCKET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FROM_BUCKET); }
// public void FROM_BUCKET(yarnwrap.entity.data.TrackedData value) { wrapperContained.FROM_BUCKET = value.wrapperContained; }
public Object createFishAttributes() { return wrapperContained.createFishAttributes(); }
// public boolean hasSelfControl() { return wrapperContained.hasSelfControl(); }
// public yarnwrap.sound.SoundEvent getFlopSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getFlopSound()); }

}