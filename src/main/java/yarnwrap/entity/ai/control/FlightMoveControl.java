package yarnwrap.entity.ai.control;
public class FlightMoveControl { public net.minecraft.entity.ai.control.FlightMoveControl wrapperContained; public FlightMoveControl(net.minecraft.entity.ai.control.FlightMoveControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxPitchChange() { return wrapperContained.maxPitchChange; }
// public void maxPitchChange(int value) { wrapperContained.maxPitchChange = value; }
// public static int maxPitchChange() { return net.minecraft.entity.ai.control.FlightMoveControl.maxPitchChange; }
// public static void maxPitchChange(int value, ) { net.minecraft.entity.ai.control.FlightMoveControl.maxPitchChange = value; }

// public boolean noGravity() { return wrapperContained.noGravity; }
// public void noGravity(boolean value) { wrapperContained.noGravity = value; }
// public static boolean noGravity() { return net.minecraft.entity.ai.control.FlightMoveControl.noGravity; }
// public static void noGravity(boolean value, ) { net.minecraft.entity.ai.control.FlightMoveControl.noGravity = value; }

public FlightMoveControl(yarnwrap.entity.mob.MobEntity entity,int maxPitchChange,boolean noGravity) { this.wrapperContained = new net.minecraft.entity.ai.control.FlightMoveControl(entity.wrapperContained,maxPitchChange,noGravity); }

}