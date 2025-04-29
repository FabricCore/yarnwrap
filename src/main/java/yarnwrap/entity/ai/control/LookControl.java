package yarnwrap.entity.ai.control;
public class LookControl { public net.minecraft.entity.ai.control.LookControl wrapperContained; public LookControl(net.minecraft.entity.ai.control.LookControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lookAtTimer() { return wrapperContained.lookAtTimer; }
// public void lookAtTimer(int value) { wrapperContained.lookAtTimer = value; }
// public static int lookAtTimer() { return net.minecraft.entity.ai.control.LookControl.lookAtTimer; }
// public static void lookAtTimer(int value, ) { net.minecraft.entity.ai.control.LookControl.lookAtTimer = value; }

// public float maxPitchChange() { return wrapperContained.maxPitchChange; }
// public void maxPitchChange(float value) { wrapperContained.maxPitchChange = value; }
// public static float maxPitchChange() { return net.minecraft.entity.ai.control.LookControl.maxPitchChange; }
// public static void maxPitchChange(float value, ) { net.minecraft.entity.ai.control.LookControl.maxPitchChange = value; }

// public float maxYawChange() { return wrapperContained.maxYawChange; }
// public void maxYawChange(float value) { wrapperContained.maxYawChange = value; }
// public static float maxYawChange() { return net.minecraft.entity.ai.control.LookControl.maxYawChange; }
// public static void maxYawChange(float value, ) { net.minecraft.entity.ai.control.LookControl.maxYawChange = value; }

// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.control.LookControl.entity); }
// public static void entity(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.control.LookControl.entity = value.wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.entity.ai.control.LookControl.z; }
// public static void z(double value, ) { net.minecraft.entity.ai.control.LookControl.z = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.entity.ai.control.LookControl.y; }
// public static void y(double value, ) { net.minecraft.entity.ai.control.LookControl.y = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.entity.ai.control.LookControl.x; }
// public static void x(double value, ) { net.minecraft.entity.ai.control.LookControl.x = value; }

public LookControl(yarnwrap.entity.mob.MobEntity entity) { this.wrapperContained = new net.minecraft.entity.ai.control.LookControl(entity.wrapperContained); }
public void lookAt(yarnwrap.util.math.Vec3d direction) { wrapperContained.lookAt(direction.wrapperContained); }
// public static void lookAt(yarnwrap.util.math.Vec3d direction, ) { net.minecraft.entity.ai.control.LookControl.lookAt(direction.wrapperContained); }
public void lookAt(double x,double y,double z) { wrapperContained.lookAt(x,y,z); }
// public static void lookAt(double x,double y,double z, ) { net.minecraft.entity.ai.control.LookControl.lookAt(x,y,z); }
// public double getLookingHeightFor(yarnwrap.entity.Entity entity) { return wrapperContained.getLookingHeightFor(entity.wrapperContained); }
// public static double getLookingHeightFor(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.ai.control.LookControl.getLookingHeightFor(entity.wrapperContained); }
// public java.util.Optional getTargetPitch() { return wrapperContained.getTargetPitch(); }
// public static java.util.Optional getTargetPitch() { return net.minecraft.entity.ai.control.LookControl.getTargetPitch(); }
// public java.util.Optional getTargetYaw() { return wrapperContained.getTargetYaw(); }
// public static java.util.Optional getTargetYaw() { return net.minecraft.entity.ai.control.LookControl.getTargetYaw(); }
// public boolean shouldStayHorizontal() { return wrapperContained.shouldStayHorizontal(); }
// public static boolean shouldStayHorizontal() { return net.minecraft.entity.ai.control.LookControl.shouldStayHorizontal(); }
public void lookAt(yarnwrap.entity.Entity entity) { wrapperContained.lookAt(entity.wrapperContained); }
// public static void lookAt(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.ai.control.LookControl.lookAt(entity.wrapperContained); }
// public void clampHeadYaw() { wrapperContained.clampHeadYaw(); }
// public static void clampHeadYaw() { net.minecraft.entity.ai.control.LookControl.clampHeadYaw(); }
// public void method_37355(java.lang.Float pitch) { wrapperContained.method_37355(pitch); }
// public static void method_37355(java.lang.Float pitch, ) { net.minecraft.entity.ai.control.LookControl.method_37355(pitch); }
// public void method_37356(java.lang.Float yaw) { wrapperContained.method_37356(yaw); }
// public static void method_37356(java.lang.Float yaw, ) { net.minecraft.entity.ai.control.LookControl.method_37356(yaw); }
public boolean isLookingAtSpecificPosition() { return wrapperContained.isLookingAtSpecificPosition(); }
// public static boolean isLookingAtSpecificPosition() { return net.minecraft.entity.ai.control.LookControl.isLookingAtSpecificPosition(); }
public double getLookX() { return wrapperContained.getLookX(); }
// public static double getLookX() { return net.minecraft.entity.ai.control.LookControl.getLookX(); }
public void lookAt(yarnwrap.entity.Entity entity,float maxYawChange,float maxPitchChange) { wrapperContained.lookAt(entity.wrapperContained,maxYawChange,maxPitchChange); }
// public static void lookAt(yarnwrap.entity.Entity entity,float maxYawChange,float maxPitchChange, ) { net.minecraft.entity.ai.control.LookControl.lookAt(entity.wrapperContained,maxYawChange,maxPitchChange); }
public double getLookY() { return wrapperContained.getLookY(); }
// public static double getLookY() { return net.minecraft.entity.ai.control.LookControl.getLookY(); }
public double getLookZ() { return wrapperContained.getLookZ(); }
// public static double getLookZ() { return net.minecraft.entity.ai.control.LookControl.getLookZ(); }
// public float changeAngle(float from,float to,float max) { return wrapperContained.changeAngle(from,to,max); }
// public static float changeAngle(float from,float to,float max, ) { return net.minecraft.entity.ai.control.LookControl.changeAngle(from,to,max); }
public void lookAt(double x,double y,double z,float maxYawChange,float maxPitchChange) { wrapperContained.lookAt(x,y,z,maxYawChange,maxPitchChange); }
// public static void lookAt(double x,double y,double z,float maxYawChange,float maxPitchChange, ) { net.minecraft.entity.ai.control.LookControl.lookAt(x,y,z,maxYawChange,maxPitchChange); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.ai.control.LookControl.tick(); }

}