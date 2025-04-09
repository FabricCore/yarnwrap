package yarnwrap.entity.ai.brain.sensor;
public class FrogAttackablesSensor { public net.minecraft.entity.ai.brain.sensor.FrogAttackablesSensor wrapperContained; public FrogAttackablesSensor(net.minecraft.entity.ai.brain.sensor.FrogAttackablesSensor wrapperContained) { this.wrapperContained = wrapperContained; }

public float RANGE() { return wrapperContained.RANGE; }
// public boolean isTargetUnreachable(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.isTargetUnreachable(entity.wrapperContained,target.wrapperContained); }

}