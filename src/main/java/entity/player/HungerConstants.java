package yarnwrap.entity.player;
public class HungerConstants { public net.minecraft.entity.player.HungerConstants wrapperContained; public HungerConstants(net.minecraft.entity.player.HungerConstants wrapperContained) { this.wrapperContained = wrapperContained; }

public int FULL_FOOD_LEVEL() { return wrapperContained.FULL_FOOD_LEVEL; }
public float INITIAL_SATURATION_LEVEL() { return wrapperContained.INITIAL_SATURATION_LEVEL; }
public float EXHAUSTION_UNIT() { return wrapperContained.EXHAUSTION_UNIT; }
public int SLOW_HEALING_STARVING_INTERVAL() { return wrapperContained.SLOW_HEALING_STARVING_INTERVAL; }
public int FAST_HEALING_INTERVAL() { return wrapperContained.FAST_HEALING_INTERVAL; }
public int SLOW_HEALING_FOOD_LEVEL() { return wrapperContained.SLOW_HEALING_FOOD_LEVEL; }
public int EXHAUSTION_PER_HITPOINT() { return wrapperContained.EXHAUSTION_PER_HITPOINT; }
public int STARVING_FOOD_LEVEL() { return wrapperContained.STARVING_FOOD_LEVEL; }
public float calculateSaturation(int nutrition,float saturationModifier) { return wrapperContained.calculateSaturation(nutrition,saturationModifier); }

}