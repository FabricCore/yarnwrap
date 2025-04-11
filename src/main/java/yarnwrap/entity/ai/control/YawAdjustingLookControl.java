package yarnwrap.entity.ai.control;
public class YawAdjustingLookControl { public net.minecraft.entity.ai.control.YawAdjustingLookControl wrapperContained; public YawAdjustingLookControl(net.minecraft.entity.ai.control.YawAdjustingLookControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ADDED_PITCH() { return wrapperContained.ADDED_PITCH; }
// public void ADDED_PITCH(int value) { wrapperContained.ADDED_PITCH = value; }
// public int ADDED_YAW() { return wrapperContained.ADDED_YAW; }
// public void ADDED_YAW(int value) { wrapperContained.ADDED_YAW = value; }
// public int yawAdjustThreshold() { return wrapperContained.yawAdjustThreshold; }
// public void yawAdjustThreshold(int value) { wrapperContained.yawAdjustThreshold = value; }
public YawAdjustingLookControl(yarnwrap.entity.mob.MobEntity entity,int yawAdjustThreshold) { this.wrapperContained = new net.minecraft.entity.ai.control.YawAdjustingLookControl(entity.wrapperContained,yawAdjustThreshold); }
// public void method_37357(java.lang.Float pitch) { wrapperContained.method_37357(pitch); }
// public void method_37358(java.lang.Float yaw) { wrapperContained.method_37358(yaw); }

}