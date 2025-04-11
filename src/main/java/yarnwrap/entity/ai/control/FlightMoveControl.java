package yarnwrap.entity.ai.control;
public class FlightMoveControl { public net.minecraft.entity.ai.control.FlightMoveControl wrapperContained; public FlightMoveControl(net.minecraft.entity.ai.control.FlightMoveControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxPitchChange() { return wrapperContained.maxPitchChange; }
// public void maxPitchChange(int value) { wrapperContained.maxPitchChange = value; }
// public boolean noGravity() { return wrapperContained.noGravity; }
// public void noGravity(boolean value) { wrapperContained.noGravity = value; }
public FlightMoveControl(yarnwrap.entity.mob.MobEntity entity,int maxPitchChange,boolean noGravity) { this.wrapperContained = new net.minecraft.entity.ai.control.FlightMoveControl(entity.wrapperContained,maxPitchChange,noGravity); }

}