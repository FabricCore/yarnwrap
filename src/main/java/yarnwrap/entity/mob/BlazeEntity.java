package yarnwrap.entity.mob;
public class BlazeEntity { public net.minecraft.entity.mob.BlazeEntity wrapperContained; public BlazeEntity(net.minecraft.entity.mob.BlazeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float eyeOffset() { return wrapperContained.eyeOffset; }
// public void eyeOffset(float value) { wrapperContained.eyeOffset = value; }
// public static float eyeOffset() { return net.minecraft.entity.mob.BlazeEntity.eyeOffset; }
// public static void eyeOffset(float value, ) { net.minecraft.entity.mob.BlazeEntity.eyeOffset = value; }

// public int eyeOffsetCooldown() { return wrapperContained.eyeOffsetCooldown; }
// public void eyeOffsetCooldown(int value) { wrapperContained.eyeOffsetCooldown = value; }
// public static int eyeOffsetCooldown() { return net.minecraft.entity.mob.BlazeEntity.eyeOffsetCooldown; }
// public static void eyeOffsetCooldown(int value, ) { net.minecraft.entity.mob.BlazeEntity.eyeOffsetCooldown = value; }

// public yarnwrap.entity.data.TrackedData BLAZE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BLAZE_FLAGS); }
// public void BLAZE_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.BLAZE_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData BLAZE_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.BlazeEntity.BLAZE_FLAGS); }
// public static void BLAZE_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.BlazeEntity.BLAZE_FLAGS = value.wrapperContained; }

// public Object createBlazeAttributes() { return wrapperContained.createBlazeAttributes(); }
public static Object createBlazeAttributes() { return net.minecraft.entity.mob.BlazeEntity.createBlazeAttributes(); }
// public void setFireActive(boolean fireActive) { wrapperContained.setFireActive(fireActive); }
// public static void setFireActive(boolean fireActive, ) { net.minecraft.entity.mob.BlazeEntity.setFireActive(fireActive); }
// public boolean isFireActive() { return wrapperContained.isFireActive(); }
// public static boolean isFireActive() { return net.minecraft.entity.mob.BlazeEntity.isFireActive(); }

}