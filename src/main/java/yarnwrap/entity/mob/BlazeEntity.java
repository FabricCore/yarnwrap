package yarnwrap.entity.mob;
public class BlazeEntity { public net.minecraft.entity.mob.BlazeEntity wrapperContained; public BlazeEntity(net.minecraft.entity.mob.BlazeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float eyeOffset() { return wrapperContained.eyeOffset; }
// public void eyeOffset(float value) { wrapperContained.eyeOffset = value; }
// public int eyeOffsetCooldown() { return wrapperContained.eyeOffsetCooldown; }
// public void eyeOffsetCooldown(int value) { wrapperContained.eyeOffsetCooldown = value; }
// public yarnwrap.entity.data.TrackedData BLAZE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BLAZE_FLAGS); }
// public void BLAZE_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.BLAZE_FLAGS = value.wrapperContained; }
public Object createBlazeAttributes() { return wrapperContained.createBlazeAttributes(); }
// public void setFireActive(boolean fireActive) { wrapperContained.setFireActive(fireActive); }
// public boolean isFireActive() { return wrapperContained.isFireActive(); }

}