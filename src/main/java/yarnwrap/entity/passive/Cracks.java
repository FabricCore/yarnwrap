package yarnwrap.entity.passive;
public class Cracks { public net.minecraft.entity.passive.Cracks wrapperContained; public Cracks(net.minecraft.entity.passive.Cracks wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.Cracks IRON_GOLEM() { return new yarnwrap.entity.passive.Cracks(wrapperContained.IRON_GOLEM); }
// public void IRON_GOLEM(yarnwrap.entity.passive.Cracks value) { wrapperContained.IRON_GOLEM = value.wrapperContained; }
public static yarnwrap.entity.passive.Cracks IRON_GOLEM() { return new yarnwrap.entity.passive.Cracks(net.minecraft.entity.passive.Cracks.IRON_GOLEM); }
// public static void IRON_GOLEM(yarnwrap.entity.passive.Cracks value, ) { net.minecraft.entity.passive.Cracks.IRON_GOLEM = value.wrapperContained; }

// public yarnwrap.entity.passive.Cracks WOLF_ARMOR() { return new yarnwrap.entity.passive.Cracks(wrapperContained.WOLF_ARMOR); }
// public void WOLF_ARMOR(yarnwrap.entity.passive.Cracks value) { wrapperContained.WOLF_ARMOR = value.wrapperContained; }
public static yarnwrap.entity.passive.Cracks WOLF_ARMOR() { return new yarnwrap.entity.passive.Cracks(net.minecraft.entity.passive.Cracks.WOLF_ARMOR); }
// public static void WOLF_ARMOR(yarnwrap.entity.passive.Cracks value, ) { net.minecraft.entity.passive.Cracks.WOLF_ARMOR = value.wrapperContained; }

// public float lowCrackThreshold() { return wrapperContained.lowCrackThreshold; }
// public void lowCrackThreshold(float value) { wrapperContained.lowCrackThreshold = value; }
// public static float lowCrackThreshold() { return net.minecraft.entity.passive.Cracks.lowCrackThreshold; }
// public static void lowCrackThreshold(float value, ) { net.minecraft.entity.passive.Cracks.lowCrackThreshold = value; }

// public float mediumCrackThreshold() { return wrapperContained.mediumCrackThreshold; }
// public void mediumCrackThreshold(float value) { wrapperContained.mediumCrackThreshold = value; }
// public static float mediumCrackThreshold() { return net.minecraft.entity.passive.Cracks.mediumCrackThreshold; }
// public static void mediumCrackThreshold(float value, ) { net.minecraft.entity.passive.Cracks.mediumCrackThreshold = value; }

// public float highCrackThreshold() { return wrapperContained.highCrackThreshold; }
// public void highCrackThreshold(float value) { wrapperContained.highCrackThreshold = value; }
// public static float highCrackThreshold() { return net.minecraft.entity.passive.Cracks.highCrackThreshold; }
// public static void highCrackThreshold(float value, ) { net.minecraft.entity.passive.Cracks.highCrackThreshold = value; }

// public Cracks(float lowCrackThreshold,float mediumCrackThreshold,float highCrackThreshold) { this.wrapperContained = new net.minecraft.entity.passive.Cracks(lowCrackThreshold,mediumCrackThreshold,highCrackThreshold); }
public Object getCrackLevel(float health) { return wrapperContained.getCrackLevel(health); }
// public static Object getCrackLevel(float health, ) { return net.minecraft.entity.passive.Cracks.getCrackLevel(health); }
public Object getCrackLevel(int currentDamage,int maxDamage) { return wrapperContained.getCrackLevel(currentDamage,maxDamage); }
// public static Object getCrackLevel(int currentDamage,int maxDamage, ) { return net.minecraft.entity.passive.Cracks.getCrackLevel(currentDamage,maxDamage); }
public Object getCrackLevel(yarnwrap.item.ItemStack stack) { return wrapperContained.getCrackLevel(stack.wrapperContained); }
// public static Object getCrackLevel(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.Cracks.getCrackLevel(stack.wrapperContained); }

}