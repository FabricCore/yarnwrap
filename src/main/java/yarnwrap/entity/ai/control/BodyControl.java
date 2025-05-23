package yarnwrap.entity.ai.control;
public class BodyControl { public net.minecraft.entity.ai.control.BodyControl wrapperContained; public BodyControl(net.minecraft.entity.ai.control.BodyControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public float lastHeadYaw() { return wrapperContained.lastHeadYaw; }
// public void lastHeadYaw(float value) { wrapperContained.lastHeadYaw = value; }
// public static float lastHeadYaw() { return net.minecraft.entity.ai.control.BodyControl.lastHeadYaw; }
// public static void lastHeadYaw(float value, ) { net.minecraft.entity.ai.control.BodyControl.lastHeadYaw = value; }

// public int bodyAdjustTicks() { return wrapperContained.bodyAdjustTicks; }
// public void bodyAdjustTicks(int value) { wrapperContained.bodyAdjustTicks = value; }
// public static int bodyAdjustTicks() { return net.minecraft.entity.ai.control.BodyControl.bodyAdjustTicks; }
// public static void bodyAdjustTicks(int value, ) { net.minecraft.entity.ai.control.BodyControl.bodyAdjustTicks = value; }

// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.control.BodyControl.entity); }
// public static void entity(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.control.BodyControl.entity = value.wrapperContained; }

// public int BODY_KEEP_UP_THRESHOLD() { return wrapperContained.BODY_KEEP_UP_THRESHOLD; }
// public void BODY_KEEP_UP_THRESHOLD(int value) { wrapperContained.BODY_KEEP_UP_THRESHOLD = value; }
// public static int BODY_KEEP_UP_THRESHOLD() { return net.minecraft.entity.ai.control.BodyControl.BODY_KEEP_UP_THRESHOLD; }
// public static void BODY_KEEP_UP_THRESHOLD(int value, ) { net.minecraft.entity.ai.control.BodyControl.BODY_KEEP_UP_THRESHOLD = value; }

// public int ROTATE_BODY_START_TICK() { return wrapperContained.ROTATE_BODY_START_TICK; }
// public void ROTATE_BODY_START_TICK(int value) { wrapperContained.ROTATE_BODY_START_TICK = value; }
// public static int ROTATE_BODY_START_TICK() { return net.minecraft.entity.ai.control.BodyControl.ROTATE_BODY_START_TICK; }
// public static void ROTATE_BODY_START_TICK(int value, ) { net.minecraft.entity.ai.control.BodyControl.ROTATE_BODY_START_TICK = value; }

// public int ROTATION_INCREMENTS() { return wrapperContained.ROTATION_INCREMENTS; }
// public void ROTATION_INCREMENTS(int value) { wrapperContained.ROTATION_INCREMENTS = value; }
// public static int ROTATION_INCREMENTS() { return net.minecraft.entity.ai.control.BodyControl.ROTATION_INCREMENTS; }
// public static void ROTATION_INCREMENTS(int value, ) { net.minecraft.entity.ai.control.BodyControl.ROTATION_INCREMENTS = value; }

public BodyControl(yarnwrap.entity.mob.MobEntity entity) { this.wrapperContained = new net.minecraft.entity.ai.control.BodyControl(entity.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.ai.control.BodyControl.tick(); }
// public void keepUpBody() { wrapperContained.keepUpBody(); }
// public static void keepUpBody() { net.minecraft.entity.ai.control.BodyControl.keepUpBody(); }
// public void keepUpHead() { wrapperContained.keepUpHead(); }
// public static void keepUpHead() { net.minecraft.entity.ai.control.BodyControl.keepUpHead(); }
// public void slowlyAdjustBody() { wrapperContained.slowlyAdjustBody(); }
// public static void slowlyAdjustBody() { net.minecraft.entity.ai.control.BodyControl.slowlyAdjustBody(); }
// public boolean isIndependent() { return wrapperContained.isIndependent(); }
// public static boolean isIndependent() { return net.minecraft.entity.ai.control.BodyControl.isIndependent(); }
// public boolean isMoving() { return wrapperContained.isMoving(); }
// public static boolean isMoving() { return net.minecraft.entity.ai.control.BodyControl.isMoving(); }

}