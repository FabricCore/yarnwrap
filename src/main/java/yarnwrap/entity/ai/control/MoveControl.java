package yarnwrap.entity.ai.control;
public class MoveControl { public net.minecraft.entity.ai.control.MoveControl wrapperContained; public MoveControl(net.minecraft.entity.ai.control.MoveControl wrapperContained) { this.wrapperContained = wrapperContained; }

public float REACHED_DESTINATION_DISTANCE_SQUARED() { return wrapperContained.REACHED_DESTINATION_DISTANCE_SQUARED; }
// public void REACHED_DESTINATION_DISTANCE_SQUARED(float value) { wrapperContained.REACHED_DESTINATION_DISTANCE_SQUARED = value; }
// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public float forwardMovement() { return wrapperContained.forwardMovement; }
// public void forwardMovement(float value) { wrapperContained.forwardMovement = value; }
// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public float sidewaysMovement() { return wrapperContained.sidewaysMovement; }
// public void sidewaysMovement(float value) { wrapperContained.sidewaysMovement = value; }
// public Object state() { return wrapperContained.state; }
// // public void state(Object value) { wrapperContained.state = value; }
// public boolean isPosWalkable(float x,float z) { return wrapperContained.isPosWalkable(x,z); }
public double getTargetY() { return wrapperContained.getTargetY(); }
public double getTargetX() { return wrapperContained.getTargetX(); }
public double getTargetZ() { return wrapperContained.getTargetZ(); }
// public float wrapDegrees(float from,float to,float max) { return wrapperContained.wrapDegrees(from,to,max); }
public void moveTo(double x,double y,double z,double speed) { wrapperContained.moveTo(x,y,z,speed); }
public void tick() { wrapperContained.tick(); }
public boolean isMoving() { return wrapperContained.isMoving(); }
public double getSpeed() { return wrapperContained.getSpeed(); }
public void strafeTo(float forward,float sideways) { wrapperContained.strafeTo(forward,sideways); }

}