package yarnwrap.entity.passive;
public class ChickenEntity { public net.minecraft.entity.passive.ChickenEntity wrapperContained; public ChickenEntity(net.minecraft.entity.passive.ChickenEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
public float prevFlapProgress() { return wrapperContained.prevFlapProgress; }
public void prevFlapProgress(float value) { wrapperContained.prevFlapProgress = value; }
public float flapSpeed() { return wrapperContained.flapSpeed; }
public void flapSpeed(float value) { wrapperContained.flapSpeed = value; }
public float prevMaxWingDeviation() { return wrapperContained.prevMaxWingDeviation; }
public void prevMaxWingDeviation(float value) { wrapperContained.prevMaxWingDeviation = value; }
public int eggLayTime() { return wrapperContained.eggLayTime; }
public void eggLayTime(int value) { wrapperContained.eggLayTime = value; }
public boolean hasJockey() { return wrapperContained.hasJockey; }
public void hasJockey(boolean value) { wrapperContained.hasJockey = value; }
public float flapProgress() { return wrapperContained.flapProgress; }
public void flapProgress(float value) { wrapperContained.flapProgress = value; }
public float maxWingDeviation() { return wrapperContained.maxWingDeviation; }
public void maxWingDeviation(float value) { wrapperContained.maxWingDeviation = value; }
public Object createChickenAttributes() { return wrapperContained.createChickenAttributes(); }
// public boolean method_58366(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58366(stack.wrapperContained); }
// public boolean hasJockey() { return wrapperContained.hasJockey(); }
public void setHasJockey(boolean hasJockey) { wrapperContained.setHasJockey(hasJockey); }

}