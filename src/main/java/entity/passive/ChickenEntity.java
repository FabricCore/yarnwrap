package yarnwrap.entity.passive;
public class ChickenEntity { public net.minecraft.entity.passive.ChickenEntity wrapperContained; public ChickenEntity(net.minecraft.entity.passive.ChickenEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
public float prevFlapProgress() { return wrapperContained.prevFlapProgress; }
public float flapSpeed() { return wrapperContained.flapSpeed; }
public float prevMaxWingDeviation() { return wrapperContained.prevMaxWingDeviation; }
public int eggLayTime() { return wrapperContained.eggLayTime; }
public boolean hasJockey() { return wrapperContained.hasJockey; }
public float flapProgress() { return wrapperContained.flapProgress; }
public float maxWingDeviation() { return wrapperContained.maxWingDeviation; }
public Object createChickenAttributes() { return wrapperContained.createChickenAttributes(); }
// public boolean hasJockey() { return wrapperContained.hasJockey(); }
public void setHasJockey(boolean hasJockey) { wrapperContained.setHasJockey(hasJockey); }

}