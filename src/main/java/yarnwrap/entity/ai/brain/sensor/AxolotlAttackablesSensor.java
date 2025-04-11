package yarnwrap.entity.ai.brain.sensor;
public class AxolotlAttackablesSensor { public net.minecraft.entity.ai.brain.sensor.AxolotlAttackablesSensor wrapperContained; public AxolotlAttackablesSensor(net.minecraft.entity.ai.brain.sensor.AxolotlAttackablesSensor wrapperContained) { this.wrapperContained = wrapperContained; }

public float TARGET_RANGE() { return wrapperContained.TARGET_RANGE; }
// public void TARGET_RANGE(float value) { wrapperContained.TARGET_RANGE = value; }
// public boolean canHunt(yarnwrap.entity.LivingEntity axolotl,yarnwrap.entity.LivingEntity target) { return wrapperContained.canHunt(axolotl.wrapperContained,target.wrapperContained); }
// public boolean isAlwaysHostileTo(yarnwrap.entity.LivingEntity axolotl) { return wrapperContained.isAlwaysHostileTo(axolotl.wrapperContained); }
// public boolean isInRange(yarnwrap.entity.LivingEntity axolotl,yarnwrap.entity.LivingEntity target) { return wrapperContained.isInRange(axolotl.wrapperContained,target.wrapperContained); }

}