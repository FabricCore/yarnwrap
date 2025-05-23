package yarnwrap.entity;
public class LimbAnimator { public net.minecraft.entity.LimbAnimator wrapperContained; public LimbAnimator(net.minecraft.entity.LimbAnimator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float lastSpeed() { return wrapperContained.lastSpeed; }
// public void lastSpeed(float value) { wrapperContained.lastSpeed = value; }
// public static float lastSpeed() { return net.minecraft.entity.LimbAnimator.lastSpeed; }
// public static void lastSpeed(float value, ) { net.minecraft.entity.LimbAnimator.lastSpeed = value; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.LimbAnimator.speed; }
// public static void speed(float value, ) { net.minecraft.entity.LimbAnimator.speed = value; }

// public float animationProgress() { return wrapperContained.animationProgress; }
// public void animationProgress(float value) { wrapperContained.animationProgress = value; }
// public static float animationProgress() { return net.minecraft.entity.LimbAnimator.animationProgress; }
// public static void animationProgress(float value, ) { net.minecraft.entity.LimbAnimator.animationProgress = value; }

// public float timeScale() { return wrapperContained.timeScale; }
// public void timeScale(float value) { wrapperContained.timeScale = value; }
// public static float timeScale() { return net.minecraft.entity.LimbAnimator.timeScale; }
// public static void timeScale(float value, ) { net.minecraft.entity.LimbAnimator.timeScale = value; }

public float getSpeed() { return wrapperContained.getSpeed(); }
// public static float getSpeed() { return net.minecraft.entity.LimbAnimator.getSpeed(); }
public void setSpeed(float speed) { wrapperContained.setSpeed(speed); }
// public static void setSpeed(float speed, ) { net.minecraft.entity.LimbAnimator.setSpeed(speed); }
public void updateLimbs(float targetSpeed,float speedChangeRate,float timeScale) { wrapperContained.updateLimbs(targetSpeed,speedChangeRate,timeScale); }
// public static void updateLimbs(float targetSpeed,float speedChangeRate,float timeScale, ) { net.minecraft.entity.LimbAnimator.updateLimbs(targetSpeed,speedChangeRate,timeScale); }
public float getAnimationProgress() { return wrapperContained.getAnimationProgress(); }
// public static float getAnimationProgress() { return net.minecraft.entity.LimbAnimator.getAnimationProgress(); }
public float getAmplitude(float tickProgress) { return wrapperContained.getAmplitude(tickProgress); }
// public static float getAmplitude(float tickProgress, ) { return net.minecraft.entity.LimbAnimator.getAmplitude(tickProgress); }
public boolean isLimbMoving() { return wrapperContained.isLimbMoving(); }
// public static boolean isLimbMoving() { return net.minecraft.entity.LimbAnimator.isLimbMoving(); }
public float getAnimationProgress(float tickProgress) { return wrapperContained.getAnimationProgress(tickProgress); }
// public static float getAnimationProgress(float tickProgress, ) { return net.minecraft.entity.LimbAnimator.getAnimationProgress(tickProgress); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.entity.LimbAnimator.reset(); }

}