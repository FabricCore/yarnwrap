package yarnwrap.entity.ai.control;
public class MoveControl { public net.minecraft.entity.ai.control.MoveControl wrapperContained; public MoveControl(net.minecraft.entity.ai.control.MoveControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public static double targetZ() { return net.minecraft.entity.ai.control.MoveControl.targetZ; }
// public static void targetZ(double value, ) { net.minecraft.entity.ai.control.MoveControl.targetZ = value; }

// public float forwardMovement() { return wrapperContained.forwardMovement; }
// public void forwardMovement(float value) { wrapperContained.forwardMovement = value; }
// public static float forwardMovement() { return net.minecraft.entity.ai.control.MoveControl.forwardMovement; }
// public static void forwardMovement(float value, ) { net.minecraft.entity.ai.control.MoveControl.forwardMovement = value; }

// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public static double targetY() { return net.minecraft.entity.ai.control.MoveControl.targetY; }
// public static void targetY(double value, ) { net.minecraft.entity.ai.control.MoveControl.targetY = value; }

// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public static double targetX() { return net.minecraft.entity.ai.control.MoveControl.targetX; }
// public static void targetX(double value, ) { net.minecraft.entity.ai.control.MoveControl.targetX = value; }

// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.control.MoveControl.entity); }
// public static void entity(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.control.MoveControl.entity = value.wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.control.MoveControl.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.control.MoveControl.speed = value; }

// public float sidewaysMovement() { return wrapperContained.sidewaysMovement; }
// public void sidewaysMovement(float value) { wrapperContained.sidewaysMovement = value; }
// public static float sidewaysMovement() { return net.minecraft.entity.ai.control.MoveControl.sidewaysMovement; }
// public static void sidewaysMovement(float value, ) { net.minecraft.entity.ai.control.MoveControl.sidewaysMovement = value; }

// public Object state() { return wrapperContained.state; }
// // public void state(Object value) { wrapperContained.state = value; }
// // public static Object state() { return net.minecraft.entity.ai.control.MoveControl.state; }
// // public static void state(Object value, ) { net.minecraft.entity.ai.control.MoveControl.state = value; }

// public float REACHED_DESTINATION_DISTANCE_SQUARED() { return wrapperContained.REACHED_DESTINATION_DISTANCE_SQUARED; }
// public void REACHED_DESTINATION_DISTANCE_SQUARED(float value) { wrapperContained.REACHED_DESTINATION_DISTANCE_SQUARED = value; }
public static float REACHED_DESTINATION_DISTANCE_SQUARED() { return net.minecraft.entity.ai.control.MoveControl.REACHED_DESTINATION_DISTANCE_SQUARED; }
// public static void REACHED_DESTINATION_DISTANCE_SQUARED(float value, ) { net.minecraft.entity.ai.control.MoveControl.REACHED_DESTINATION_DISTANCE_SQUARED = value; }

public MoveControl(yarnwrap.entity.mob.MobEntity entity) { this.wrapperContained = new net.minecraft.entity.ai.control.MoveControl(entity.wrapperContained); }
public double getTargetY() { return wrapperContained.getTargetY(); }
// public static double getTargetY() { return net.minecraft.entity.ai.control.MoveControl.getTargetY(); }
public double getTargetX() { return wrapperContained.getTargetX(); }
// public static double getTargetX() { return net.minecraft.entity.ai.control.MoveControl.getTargetX(); }
public double getTargetZ() { return wrapperContained.getTargetZ(); }
// public static double getTargetZ() { return net.minecraft.entity.ai.control.MoveControl.getTargetZ(); }
// public float wrapDegrees(float from,float to,float max) { return wrapperContained.wrapDegrees(from,to,max); }
// public static float wrapDegrees(float from,float to,float max, ) { return net.minecraft.entity.ai.control.MoveControl.wrapDegrees(from,to,max); }
public void moveTo(double x,double y,double z,double speed) { wrapperContained.moveTo(x,y,z,speed); }
// public static void moveTo(double x,double y,double z,double speed, ) { net.minecraft.entity.ai.control.MoveControl.moveTo(x,y,z,speed); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.ai.control.MoveControl.tick(); }
public boolean isMoving() { return wrapperContained.isMoving(); }
// public static boolean isMoving() { return net.minecraft.entity.ai.control.MoveControl.isMoving(); }
public double getSpeed() { return wrapperContained.getSpeed(); }
// public static double getSpeed() { return net.minecraft.entity.ai.control.MoveControl.getSpeed(); }
public void strafeTo(float forward,float sideways) { wrapperContained.strafeTo(forward,sideways); }
// public static void strafeTo(float forward,float sideways, ) { net.minecraft.entity.ai.control.MoveControl.strafeTo(forward,sideways); }
// public boolean isPosWalkable(float x,float z) { return wrapperContained.isPosWalkable(x,z); }
// public static boolean isPosWalkable(float x,float z, ) { return net.minecraft.entity.ai.control.MoveControl.isPosWalkable(x,z); }
// public void setWaiting() { wrapperContained.setWaiting(); }
// public static void setWaiting() { net.minecraft.entity.ai.control.MoveControl.setWaiting(); }

}