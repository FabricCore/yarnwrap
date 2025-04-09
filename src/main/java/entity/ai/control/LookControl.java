package yarnwrap.entity.ai.control;
public class LookControl { public net.minecraft.entity.ai.control.LookControl wrapperContained; public LookControl(net.minecraft.entity.ai.control.LookControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lookAtTimer() { return wrapperContained.lookAtTimer; }
// public float maxPitchChange() { return wrapperContained.maxPitchChange; }
// public float maxYawChange() { return wrapperContained.maxYawChange; }
// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public double z() { return wrapperContained.z; }
// public double y() { return wrapperContained.y; }
// public double x() { return wrapperContained.x; }
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