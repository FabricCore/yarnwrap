package yarnwrap.entity.passive;
public class ChickenEntity { public net.minecraft.entity.passive.ChickenEntity wrapperContained; public ChickenEntity(net.minecraft.entity.passive.ChickenEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float lastFlapProgress() { return wrapperContained.lastFlapProgress; }
public void lastFlapProgress(float value) { wrapperContained.lastFlapProgress = value; }
// public static float lastFlapProgress() { return net.minecraft.entity.passive.ChickenEntity.lastFlapProgress; }
// public static void lastFlapProgress(float value, ) { net.minecraft.entity.passive.ChickenEntity.lastFlapProgress = value; }

public float flapSpeed() { return wrapperContained.flapSpeed; }
public void flapSpeed(float value) { wrapperContained.flapSpeed = value; }
// public static float flapSpeed() { return net.minecraft.entity.passive.ChickenEntity.flapSpeed; }
// public static void flapSpeed(float value, ) { net.minecraft.entity.passive.ChickenEntity.flapSpeed = value; }

public float lastMaxWingDeviation() { return wrapperContained.lastMaxWingDeviation; }
public void lastMaxWingDeviation(float value) { wrapperContained.lastMaxWingDeviation = value; }
// public static float lastMaxWingDeviation() { return net.minecraft.entity.passive.ChickenEntity.lastMaxWingDeviation; }
// public static void lastMaxWingDeviation(float value, ) { net.minecraft.entity.passive.ChickenEntity.lastMaxWingDeviation = value; }

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

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.ChickenEntity.BABY_BASE_DIMENSIONS); }
// public static void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.ChickenEntity.BABY_BASE_DIMENSIONS = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.ChickenEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.ChickenEntity.VARIANT = value.wrapperContained; }

// public boolean DEFAULT_HAS_JOCKEY() { return wrapperContained.DEFAULT_HAS_JOCKEY; }
// public void DEFAULT_HAS_JOCKEY(boolean value) { wrapperContained.DEFAULT_HAS_JOCKEY = value; }
// public static boolean DEFAULT_HAS_JOCKEY() { return net.minecraft.entity.passive.ChickenEntity.DEFAULT_HAS_JOCKEY; }
// public static void DEFAULT_HAS_JOCKEY(boolean value, ) { net.minecraft.entity.passive.ChickenEntity.DEFAULT_HAS_JOCKEY = value; }

// public boolean hasJockey() { return wrapperContained.hasJockey(); }
// // public static boolean hasJockey() { return net.minecraft.entity.passive.ChickenEntity.hasJockey(); }
public void setHasJockey(boolean hasJockey) { wrapperContained.setHasJockey(hasJockey); }
// public static void setHasJockey(boolean hasJockey, ) { net.minecraft.entity.passive.ChickenEntity.setHasJockey(hasJockey); }
// public Object createChickenAttributes() { return wrapperContained.createChickenAttributes(); }
public static Object createChickenAttributes() { return net.minecraft.entity.passive.ChickenEntity.createChickenAttributes(); }
// public boolean method_58366(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58366(stack.wrapperContained); }
// public static boolean method_58366(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.ChickenEntity.method_58366(stack.wrapperContained); }
public void setVariant(yarnwrap.registry.entry.RegistryEntry variant) { wrapperContained.setVariant(variant.wrapperContained); }
// public static void setVariant(yarnwrap.registry.entry.RegistryEntry variant, ) { net.minecraft.entity.passive.ChickenEntity.setVariant(variant.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getVariant() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getVariant()); }
// public static yarnwrap.registry.entry.RegistryEntry getVariant() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.passive.ChickenEntity.getVariant()); }
// public void method_68267(java.lang.Integer eggLayTime) { wrapperContained.method_68267(eggLayTime); }
// public static void method_68267(java.lang.Integer eggLayTime, ) { net.minecraft.entity.passive.ChickenEntity.method_68267(eggLayTime); }

}