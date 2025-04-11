package yarnwrap.entity.ai.control;
public class BodyControl { public net.minecraft.entity.ai.control.BodyControl wrapperContained; public BodyControl(net.minecraft.entity.ai.control.BodyControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BODY_KEEP_UP_THRESHOLD() { return wrapperContained.BODY_KEEP_UP_THRESHOLD; }
// public void BODY_KEEP_UP_THRESHOLD(int value) { wrapperContained.BODY_KEEP_UP_THRESHOLD = value; }
// public int ROTATE_BODY_START_TICK() { return wrapperContained.ROTATE_BODY_START_TICK; }
// public void ROTATE_BODY_START_TICK(int value) { wrapperContained.ROTATE_BODY_START_TICK = value; }
// public int ROTATION_INCREMENTS() { return wrapperContained.ROTATION_INCREMENTS; }
// public void ROTATION_INCREMENTS(int value) { wrapperContained.ROTATION_INCREMENTS = value; }
// public float lastHeadYaw() { return wrapperContained.lastHeadYaw; }
// public void lastHeadYaw(float value) { wrapperContained.lastHeadYaw = value; }
// public int bodyAdjustTicks() { return wrapperContained.bodyAdjustTicks; }
// public void bodyAdjustTicks(int value) { wrapperContained.bodyAdjustTicks = value; }
// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
public BodyControl(yarnwrap.entity.mob.MobEntity entity) { this.wrapperContained = new net.minecraft.entity.ai.control.BodyControl(entity.wrapperContained); }
// public void keepUpBody() { wrapperContained.keepUpBody(); }
// public void keepUpHead() { wrapperContained.keepUpHead(); }
// public void slowlyAdjustBody() { wrapperContained.slowlyAdjustBody(); }
// public boolean isIndependent() { return wrapperContained.isIndependent(); }
// public boolean isMoving() { return wrapperContained.isMoving(); }
public void tick() { wrapperContained.tick(); }

}