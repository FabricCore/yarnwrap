package yarnwrap.entity.player;
public class HungerConstants { public net.minecraft.entity.player.HungerConstants wrapperContained; public HungerConstants(net.minecraft.entity.player.HungerConstants wrapperContained) { this.wrapperContained = wrapperContained; }

// public int FULL_FOOD_LEVEL() { return wrapperContained.FULL_FOOD_LEVEL; }
// public void FULL_FOOD_LEVEL(int value) { wrapperContained.FULL_FOOD_LEVEL = value; }
public static int FULL_FOOD_LEVEL() { return net.minecraft.entity.player.HungerConstants.FULL_FOOD_LEVEL; }
// public static void FULL_FOOD_LEVEL(int value, ) { net.minecraft.entity.player.HungerConstants.FULL_FOOD_LEVEL = value; }

// public float INITIAL_SATURATION_LEVEL() { return wrapperContained.INITIAL_SATURATION_LEVEL; }
// public void INITIAL_SATURATION_LEVEL(float value) { wrapperContained.INITIAL_SATURATION_LEVEL = value; }
public static float INITIAL_SATURATION_LEVEL() { return net.minecraft.entity.player.HungerConstants.INITIAL_SATURATION_LEVEL; }
// public static void INITIAL_SATURATION_LEVEL(float value, ) { net.minecraft.entity.player.HungerConstants.INITIAL_SATURATION_LEVEL = value; }

// public float EXHAUSTION_UNIT() { return wrapperContained.EXHAUSTION_UNIT; }
// public void EXHAUSTION_UNIT(float value) { wrapperContained.EXHAUSTION_UNIT = value; }
public static float EXHAUSTION_UNIT() { return net.minecraft.entity.player.HungerConstants.EXHAUSTION_UNIT; }
// public static void EXHAUSTION_UNIT(float value, ) { net.minecraft.entity.player.HungerConstants.EXHAUSTION_UNIT = value; }

// public int SLOW_HEALING_STARVING_INTERVAL() { return wrapperContained.SLOW_HEALING_STARVING_INTERVAL; }
// public void SLOW_HEALING_STARVING_INTERVAL(int value) { wrapperContained.SLOW_HEALING_STARVING_INTERVAL = value; }
public static int SLOW_HEALING_STARVING_INTERVAL() { return net.minecraft.entity.player.HungerConstants.SLOW_HEALING_STARVING_INTERVAL; }
// public static void SLOW_HEALING_STARVING_INTERVAL(int value, ) { net.minecraft.entity.player.HungerConstants.SLOW_HEALING_STARVING_INTERVAL = value; }

// public int FAST_HEALING_INTERVAL() { return wrapperContained.FAST_HEALING_INTERVAL; }
// public void FAST_HEALING_INTERVAL(int value) { wrapperContained.FAST_HEALING_INTERVAL = value; }
public static int FAST_HEALING_INTERVAL() { return net.minecraft.entity.player.HungerConstants.FAST_HEALING_INTERVAL; }
// public static void FAST_HEALING_INTERVAL(int value, ) { net.minecraft.entity.player.HungerConstants.FAST_HEALING_INTERVAL = value; }

// public int SLOW_HEALING_FOOD_LEVEL() { return wrapperContained.SLOW_HEALING_FOOD_LEVEL; }
// public void SLOW_HEALING_FOOD_LEVEL(int value) { wrapperContained.SLOW_HEALING_FOOD_LEVEL = value; }
public static int SLOW_HEALING_FOOD_LEVEL() { return net.minecraft.entity.player.HungerConstants.SLOW_HEALING_FOOD_LEVEL; }
// public static void SLOW_HEALING_FOOD_LEVEL(int value, ) { net.minecraft.entity.player.HungerConstants.SLOW_HEALING_FOOD_LEVEL = value; }

// public int EXHAUSTION_PER_HITPOINT() { return wrapperContained.EXHAUSTION_PER_HITPOINT; }
// public void EXHAUSTION_PER_HITPOINT(int value) { wrapperContained.EXHAUSTION_PER_HITPOINT = value; }
public static int EXHAUSTION_PER_HITPOINT() { return net.minecraft.entity.player.HungerConstants.EXHAUSTION_PER_HITPOINT; }
// public static void EXHAUSTION_PER_HITPOINT(int value, ) { net.minecraft.entity.player.HungerConstants.EXHAUSTION_PER_HITPOINT = value; }

// public int STARVING_FOOD_LEVEL() { return wrapperContained.STARVING_FOOD_LEVEL; }
// public void STARVING_FOOD_LEVEL(int value) { wrapperContained.STARVING_FOOD_LEVEL = value; }
public static int STARVING_FOOD_LEVEL() { return net.minecraft.entity.player.HungerConstants.STARVING_FOOD_LEVEL; }
// public static void STARVING_FOOD_LEVEL(int value, ) { net.minecraft.entity.player.HungerConstants.STARVING_FOOD_LEVEL = value; }

// public float calculateSaturation(int nutrition,float saturationModifier) { return wrapperContained.calculateSaturation(nutrition,saturationModifier); }
// public static float calculateSaturation(int nutrition,float saturationModifier, ) { return net.minecraft.entity.player.HungerConstants.calculateSaturation(nutrition,saturationModifier); }

}