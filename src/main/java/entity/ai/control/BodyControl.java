package yarnwrap.entity.ai.control;
public class BodyControl { public net.minecraft.entity.ai.control.BodyControl wrapperContained; public BodyControl(net.minecraft.entity.ai.control.BodyControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BODY_KEEP_UP_THRESHOLD() { return wrapperContained.BODY_KEEP_UP_THRESHOLD; }
// public int ROTATE_BODY_START_TICK() { return wrapperContained.ROTATE_BODY_START_TICK; }
// public int ROTATION_INCREMENTS() { return wrapperContained.ROTATION_INCREMENTS; }
// public float lastHeadYaw() { return wrapperContained.lastHeadYaw; }
// public int bodyAdjustTicks() { return wrapperContained.bodyAdjustTicks; }
// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void keepUpBody() { wrapperContained.keepUpBody(); }
// public void keepUpHead() { wrapperContained.keepUpHead(); }
// public void slowlyAdjustBody() { wrapperContained.slowlyAdjustBody(); }
// public boolean isIndependent() { return wrapperContained.isIndependent(); }
// public boolean isMoving() { return wrapperContained.isMoving(); }
public void tick() { wrapperContained.tick(); }

}