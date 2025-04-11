package yarnwrap.entity.ai.control;
public class LookControl { public net.minecraft.entity.ai.control.LookControl wrapperContained; public LookControl(net.minecraft.entity.ai.control.LookControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lookAtTimer() { return wrapperContained.lookAtTimer; }
// public void lookAtTimer(int value) { wrapperContained.lookAtTimer = value; }
// public float maxPitchChange() { return wrapperContained.maxPitchChange; }
// public void maxPitchChange(float value) { wrapperContained.maxPitchChange = value; }
// public float maxYawChange() { return wrapperContained.maxYawChange; }
// public void maxYawChange(float value) { wrapperContained.maxYawChange = value; }
// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
public void lookAt(yarnwrap.util.math.Vec3d direction) { wrapperContained.lookAt(direction.wrapperContained); }
public void lookAt(double x,double y,double z) { wrapperContained.lookAt(x,y,z); }
// public double getLookingHeightFor(yarnwrap.entity.Entity entity) { return wrapperContained.getLookingHeightFor(entity.wrapperContained); }
// public java.util.Optional getTargetPitch() { return wrapperContained.getTargetPitch(); }
// public java.util.Optional getTargetYaw() { return wrapperContained.getTargetYaw(); }
// public boolean shouldStayHorizontal() { return wrapperContained.shouldStayHorizontal(); }
public void lookAt(yarnwrap.entity.Entity entity) { wrapperContained.lookAt(entity.wrapperContained); }
// public void clampHeadYaw() { wrapperContained.clampHeadYaw(); }
public boolean isLookingAtSpecificPosition() { return wrapperContained.isLookingAtSpecificPosition(); }
public double getLookX() { return wrapperContained.getLookX(); }
public void lookAt(yarnwrap.entity.Entity entity,float maxYawChange,float maxPitchChange) { wrapperContained.lookAt(entity.wrapperContained,maxYawChange,maxPitchChange); }
public double getLookY() { return wrapperContained.getLookY(); }
public double getLookZ() { return wrapperContained.getLookZ(); }
// public float changeAngle(float from,float to,float max) { return wrapperContained.changeAngle(from,to,max); }
public void lookAt(double x,double y,double z,float maxYawChange,float maxPitchChange) { wrapperContained.lookAt(x,y,z,maxYawChange,maxPitchChange); }
public void tick() { wrapperContained.tick(); }

}