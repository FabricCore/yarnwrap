package yarnwrap.entity.passive;
public class ChickenEntity { public net.minecraft.entity.passive.ChickenEntity wrapperContained; public ChickenEntity(net.minecraft.entity.passive.ChickenEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.ChickenEntity.BABY_BASE_DIMENSIONS); }
// public static void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.ChickenEntity.BABY_BASE_DIMENSIONS = value.wrapperContained; }

public float prevFlapProgress() { return wrapperContained.prevFlapProgress; }
public void prevFlapProgress(float value) { wrapperContained.prevFlapProgress = value; }
// public static float prevFlapProgress() { return net.minecraft.entity.passive.ChickenEntity.prevFlapProgress; }
// public static void prevFlapProgress(float value, ) { net.minecraft.entity.passive.ChickenEntity.prevFlapProgress = value; }

public float flapSpeed() { return wrapperContained.flapSpeed; }
public void flapSpeed(float value) { wrapperContained.flapSpeed = value; }
// public static float flapSpeed() { return net.minecraft.entity.passive.ChickenEntity.flapSpeed; }
// public static void flapSpeed(float value, ) { net.minecraft.entity.passive.ChickenEntity.flapSpeed = value; }

public float prevMaxWingDeviation() { return wrapperContained.prevMaxWingDeviation; }
public void prevMaxWingDeviation(float value) { wrapperContained.prevMaxWingDeviation = value; }
// public static float prevMaxWingDeviation() { return net.minecraft.entity.passive.ChickenEntity.prevMaxWingDeviation; }
// public static void prevMaxWingDeviation(float value, ) { net.minecraft.entity.passive.ChickenEntity.prevMaxWingDeviation = value; }

public int eggLayTime() { return wrapperContained.eggLayTime; }
public void eggLayTime(int value) { wrapperContained.eggLayTime = value; }
// public static int eggLayTime() { return net.minecraft.entity.passive.ChickenEntity.eggLayTime; }
// public static void eggLayTime(int value, ) { net.minecraft.entity.passive.ChickenEntity.eggLayTime = value; }

public boolean hasJockey() { return wrapperContained.hasJockey; }
public void hasJockey(boolean value) { wrapperContained.hasJockey = value; }
// public static boolean hasJockey() { return net.minecraft.entity.passive.ChickenEntity.hasJockey; }
// public static void hasJockey(boolean value, ) { net.minecraft.entity.passive.ChickenEntity.hasJockey = value; }

public float flapProgress() { return wrapperContained.flapProgress; }
public void flapProgress(float value) { wrapperContained.flapProgress = value; }
// public static float flapProgress() { return net.minecraft.entity.passive.ChickenEntity.flapProgress; }
// public static void flapProgress(float value, ) { net.minecraft.entity.passive.ChickenEntity.flapProgress = value; }

public float maxWingDeviation() { return wrapperContained.maxWingDeviation; }
public void maxWingDeviation(float value) { wrapperContained.maxWingDeviation = value; }
// public static float maxWingDeviation() { return net.minecraft.entity.passive.ChickenEntity.maxWingDeviation; }
// public static void maxWingDeviation(float value, ) { net.minecraft.entity.passive.ChickenEntity.maxWingDeviation = value; }

// public Object createChickenAttributes() { return wrapperContained.createChickenAttributes(); }
public static Object createChickenAttributes() { return net.minecraft.entity.passive.ChickenEntity.createChickenAttributes(); }
// public boolean method_58366(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58366(stack.wrapperContained); }
// public static boolean method_58366(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.ChickenEntity.method_58366(stack.wrapperContained); }
// public boolean hasJockey() { return wrapperContained.hasJockey(); }
// // public static boolean hasJockey() { return net.minecraft.entity.passive.ChickenEntity.hasJockey(); }
public void setHasJockey(boolean hasJockey) { wrapperContained.setHasJockey(hasJockey); }
// public static void setHasJockey(boolean hasJockey, ) { net.minecraft.entity.passive.ChickenEntity.setHasJockey(hasJockey); }

}