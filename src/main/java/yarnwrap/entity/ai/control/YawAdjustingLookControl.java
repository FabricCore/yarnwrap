package yarnwrap.entity.ai.control;
public class YawAdjustingLookControl { public net.minecraft.entity.ai.control.YawAdjustingLookControl wrapperContained; public YawAdjustingLookControl(net.minecraft.entity.ai.control.YawAdjustingLookControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int yawAdjustThreshold() { return wrapperContained.yawAdjustThreshold; }
// public void yawAdjustThreshold(int value) { wrapperContained.yawAdjustThreshold = value; }
// public static int yawAdjustThreshold() { return net.minecraft.entity.ai.control.YawAdjustingLookControl.yawAdjustThreshold; }
// public static void yawAdjustThreshold(int value, ) { net.minecraft.entity.ai.control.YawAdjustingLookControl.yawAdjustThreshold = value; }

// public int ADDED_PITCH() { return wrapperContained.ADDED_PITCH; }
// public void ADDED_PITCH(int value) { wrapperContained.ADDED_PITCH = value; }
// public static int ADDED_PITCH() { return net.minecraft.entity.ai.control.YawAdjustingLookControl.ADDED_PITCH; }
// public static void ADDED_PITCH(int value, ) { net.minecraft.entity.ai.control.YawAdjustingLookControl.ADDED_PITCH = value; }

// public int ADDED_YAW() { return wrapperContained.ADDED_YAW; }
// public void ADDED_YAW(int value) { wrapperContained.ADDED_YAW = value; }
// public static int ADDED_YAW() { return net.minecraft.entity.ai.control.YawAdjustingLookControl.ADDED_YAW; }
// public static void ADDED_YAW(int value, ) { net.minecraft.entity.ai.control.YawAdjustingLookControl.ADDED_YAW = value; }

public YawAdjustingLookControl(yarnwrap.entity.mob.MobEntity entity,int yawAdjustThreshold) { this.wrapperContained = new net.minecraft.entity.ai.control.YawAdjustingLookControl(entity.wrapperContained,yawAdjustThreshold); }
// public void method_37357(java.lang.Float pitch) { wrapperContained.method_37357(pitch); }
// public static void method_37357(java.lang.Float pitch, ) { net.minecraft.entity.ai.control.YawAdjustingLookControl.method_37357(pitch); }
// public void method_37358(java.lang.Float yaw) { wrapperContained.method_37358(yaw); }
// public static void method_37358(java.lang.Float yaw, ) { net.minecraft.entity.ai.control.YawAdjustingLookControl.method_37358(yaw); }

}