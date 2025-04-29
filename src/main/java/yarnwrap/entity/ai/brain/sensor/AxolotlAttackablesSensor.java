package yarnwrap.entity.ai.brain.sensor;
public class AxolotlAttackablesSensor { public net.minecraft.entity.ai.brain.sensor.AxolotlAttackablesSensor wrapperContained; public AxolotlAttackablesSensor(net.minecraft.entity.ai.brain.sensor.AxolotlAttackablesSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public float TARGET_RANGE() { return wrapperContained.TARGET_RANGE; }
// public void TARGET_RANGE(float value) { wrapperContained.TARGET_RANGE = value; }
public static float TARGET_RANGE() { return net.minecraft.entity.ai.brain.sensor.AxolotlAttackablesSensor.TARGET_RANGE; }
// public static void TARGET_RANGE(float value, ) { net.minecraft.entity.ai.brain.sensor.AxolotlAttackablesSensor.TARGET_RANGE = value; }

// public boolean canHunt(yarnwrap.entity.LivingEntity axolotl,yarnwrap.entity.LivingEntity target) { return wrapperContained.canHunt(axolotl.wrapperContained,target.wrapperContained); }
// public static boolean canHunt(yarnwrap.entity.LivingEntity axolotl,yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.ai.brain.sensor.AxolotlAttackablesSensor.canHunt(axolotl.wrapperContained,target.wrapperContained); }
// public boolean isAlwaysHostileTo(yarnwrap.entity.LivingEntity axolotl) { return wrapperContained.isAlwaysHostileTo(axolotl.wrapperContained); }
// public static boolean isAlwaysHostileTo(yarnwrap.entity.LivingEntity axolotl, ) { return net.minecraft.entity.ai.brain.sensor.AxolotlAttackablesSensor.isAlwaysHostileTo(axolotl.wrapperContained); }
// public boolean isInRange(yarnwrap.entity.LivingEntity axolotl,yarnwrap.entity.LivingEntity target) { return wrapperContained.isInRange(axolotl.wrapperContained,target.wrapperContained); }
// public static boolean isInRange(yarnwrap.entity.LivingEntity axolotl,yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.ai.brain.sensor.AxolotlAttackablesSensor.isInRange(axolotl.wrapperContained,target.wrapperContained); }

}