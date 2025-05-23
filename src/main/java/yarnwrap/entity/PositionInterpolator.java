package yarnwrap.entity;
public class PositionInterpolator { public net.minecraft.entity.PositionInterpolator wrapperContained; public PositionInterpolator(net.minecraft.entity.PositionInterpolator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_INTERPOLATION_DURATION() { return wrapperContained.DEFAULT_INTERPOLATION_DURATION; }
// public void DEFAULT_INTERPOLATION_DURATION(int value) { wrapperContained.DEFAULT_INTERPOLATION_DURATION = value; }
public static int DEFAULT_INTERPOLATION_DURATION() { return net.minecraft.entity.PositionInterpolator.DEFAULT_INTERPOLATION_DURATION; }
// public static void DEFAULT_INTERPOLATION_DURATION(int value, ) { net.minecraft.entity.PositionInterpolator.DEFAULT_INTERPOLATION_DURATION = value; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(net.minecraft.entity.PositionInterpolator.entity); }
// public static void entity(yarnwrap.entity.Entity value, ) { net.minecraft.entity.PositionInterpolator.entity = value.wrapperContained; }

// public int lerpDuration() { return wrapperContained.lerpDuration; }
// public void lerpDuration(int value) { wrapperContained.lerpDuration = value; }
// public static int lerpDuration() { return net.minecraft.entity.PositionInterpolator.lerpDuration; }
// public static void lerpDuration(int value, ) { net.minecraft.entity.PositionInterpolator.lerpDuration = value; }

// public Object data() { return wrapperContained.data; }
// // public void data(Object value) { wrapperContained.data = value; }
// // public static Object data() { return net.minecraft.entity.PositionInterpolator.data; }
// // public static void data(Object value, ) { net.minecraft.entity.PositionInterpolator.data = value; }

// public yarnwrap.util.math.Vec3d lastPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastPos); }
// public void lastPos(yarnwrap.util.math.Vec3d value) { wrapperContained.lastPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d lastPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.PositionInterpolator.lastPos); }
// public static void lastPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.PositionInterpolator.lastPos = value.wrapperContained; }

// public yarnwrap.util.math.Vec2f lastRotation() { return new yarnwrap.util.math.Vec2f(wrapperContained.lastRotation); }
// public void lastRotation(yarnwrap.util.math.Vec2f value) { wrapperContained.lastRotation = value.wrapperContained; }
// public static yarnwrap.util.math.Vec2f lastRotation() { return new yarnwrap.util.math.Vec2f(net.minecraft.entity.PositionInterpolator.lastRotation); }
// public static void lastRotation(yarnwrap.util.math.Vec2f value, ) { net.minecraft.entity.PositionInterpolator.lastRotation = value.wrapperContained; }

// public java.util.function.Consumer callback() { return wrapperContained.callback; }
// public void callback(java.util.function.Consumer value) { wrapperContained.callback = value; }
// public static java.util.function.Consumer callback() { return net.minecraft.entity.PositionInterpolator.callback; }
// public static void callback(java.util.function.Consumer value, ) { net.minecraft.entity.PositionInterpolator.callback = value; }

public PositionInterpolator(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.entity.PositionInterpolator(entity.wrapperContained); }
public PositionInterpolator(yarnwrap.entity.Entity entity,int lerpDuration) { this.wrapperContained = new net.minecraft.entity.PositionInterpolator(entity.wrapperContained,lerpDuration); }
public PositionInterpolator(yarnwrap.entity.Entity entity,int lerpDuration,java.util.function.Consumer callback) { this.wrapperContained = new net.minecraft.entity.PositionInterpolator(entity.wrapperContained,lerpDuration,callback); }
public PositionInterpolator(yarnwrap.entity.Entity entity,java.util.function.Consumer callback) { this.wrapperContained = new net.minecraft.entity.PositionInterpolator(entity.wrapperContained,callback); }
public yarnwrap.util.math.Vec3d getLerpedPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getLerpedPos()); }
// public static yarnwrap.util.math.Vec3d getLerpedPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.PositionInterpolator.getLerpedPos()); }
public void setLerpDuration(int lerpDuration) { wrapperContained.setLerpDuration(lerpDuration); }
// public static void setLerpDuration(int lerpDuration, ) { net.minecraft.entity.PositionInterpolator.setLerpDuration(lerpDuration); }
public void refreshPositionAndAngles(yarnwrap.util.math.Vec3d pow,float yaw,float pitch) { wrapperContained.refreshPositionAndAngles(pow.wrapperContained,yaw,pitch); }
// public static void refreshPositionAndAngles(yarnwrap.util.math.Vec3d pow,float yaw,float pitch, ) { net.minecraft.entity.PositionInterpolator.refreshPositionAndAngles(pow.wrapperContained,yaw,pitch); }
public float getLerpedYaw() { return wrapperContained.getLerpedYaw(); }
// public static float getLerpedYaw() { return net.minecraft.entity.PositionInterpolator.getLerpedYaw(); }
public float getLerpedPitch() { return wrapperContained.getLerpedPitch(); }
// public static float getLerpedPitch() { return net.minecraft.entity.PositionInterpolator.getLerpedPitch(); }
public boolean isInterpolating() { return wrapperContained.isInterpolating(); }
// public static boolean isInterpolating() { return net.minecraft.entity.PositionInterpolator.isInterpolating(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.PositionInterpolator.tick(); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.entity.PositionInterpolator.clear(); }

}