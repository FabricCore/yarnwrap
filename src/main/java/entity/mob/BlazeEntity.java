package yarnwrap.entity.mob;
public class BlazeEntity { public net.minecraft.entity.mob.BlazeEntity wrapperContained; public BlazeEntity(net.minecraft.entity.mob.BlazeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float eyeOffset() { return wrapperContained.eyeOffset; }
// public int eyeOffsetCooldown() { return wrapperContained.eyeOffsetCooldown; }
// public yarnwrap.entity.data.TrackedData BLAZE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BLAZE_FLAGS); }
public Object createBlazeAttributes() { return wrapperContained.createBlazeAttributes(); }
// public void setFireActive(boolean fireActive) { wrapperContained.setFireActive(fireActive); }
// public boolean isFireActive() { return wrapperContained.isFireActive(); }

}