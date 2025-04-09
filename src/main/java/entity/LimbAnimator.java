package yarnwrap.entity;
public class LimbAnimator { public net.minecraft.entity.LimbAnimator wrapperContained; public LimbAnimator(net.minecraft.entity.LimbAnimator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float prevSpeed() { return wrapperContained.prevSpeed; }
// public float speed() { return wrapperContained.speed; }
// public float pos() { return wrapperContained.pos; }
public float getSpeed() { return wrapperContained.getSpeed(); }
public void setSpeed(float speed) { wrapperContained.setSpeed(speed); }
public void updateLimbs(float speed,float multiplier) { wrapperContained.updateLimbs(speed,multiplier); }
public float getPos() { return wrapperContained.getPos(); }
public float getSpeed(float tickDelta) { return wrapperContained.getSpeed(tickDelta); }
public boolean isLimbMoving() { return wrapperContained.isLimbMoving(); }
public float getPos(float tickDelta) { return wrapperContained.getPos(tickDelta); }

}