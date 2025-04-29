package yarnwrap.entity;
public class LimbAnimator { public net.minecraft.entity.LimbAnimator wrapperContained; public LimbAnimator(net.minecraft.entity.LimbAnimator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float prevSpeed() { return wrapperContained.prevSpeed; }
// public void prevSpeed(float value) { wrapperContained.prevSpeed = value; }
// public static float prevSpeed() { return net.minecraft.entity.LimbAnimator.prevSpeed; }
// public static void prevSpeed(float value, ) { net.minecraft.entity.LimbAnimator.prevSpeed = value; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.LimbAnimator.speed; }
// public static void speed(float value, ) { net.minecraft.entity.LimbAnimator.speed = value; }

// public float pos() { return wrapperContained.pos; }
// public void pos(float value) { wrapperContained.pos = value; }
// public static float pos() { return net.minecraft.entity.LimbAnimator.pos; }
// public static void pos(float value, ) { net.minecraft.entity.LimbAnimator.pos = value; }

public float getSpeed() { return wrapperContained.getSpeed(); }
// public static float getSpeed() { return net.minecraft.entity.LimbAnimator.getSpeed(); }
public void setSpeed(float speed) { wrapperContained.setSpeed(speed); }
// public static void setSpeed(float speed, ) { net.minecraft.entity.LimbAnimator.setSpeed(speed); }
public void updateLimbs(float speed,float multiplier) { wrapperContained.updateLimbs(speed,multiplier); }
// public static void updateLimbs(float speed,float multiplier, ) { net.minecraft.entity.LimbAnimator.updateLimbs(speed,multiplier); }
public float getPos() { return wrapperContained.getPos(); }
// public static float getPos() { return net.minecraft.entity.LimbAnimator.getPos(); }
public float getSpeed(float tickDelta) { return wrapperContained.getSpeed(tickDelta); }
// public static float getSpeed(float tickDelta, ) { return net.minecraft.entity.LimbAnimator.getSpeed(tickDelta); }
public boolean isLimbMoving() { return wrapperContained.isLimbMoving(); }
// public static boolean isLimbMoving() { return net.minecraft.entity.LimbAnimator.isLimbMoving(); }
public float getPos(float tickDelta) { return wrapperContained.getPos(tickDelta); }
// public static float getPos(float tickDelta, ) { return net.minecraft.entity.LimbAnimator.getPos(tickDelta); }

}