package yarnwrap.entity.ai.brain.sensor;
public class FrogAttackablesSensor { public net.minecraft.entity.ai.brain.sensor.FrogAttackablesSensor wrapperContained; public FrogAttackablesSensor(net.minecraft.entity.ai.brain.sensor.FrogAttackablesSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public float RANGE() { return wrapperContained.RANGE; }
// public void RANGE(float value) { wrapperContained.RANGE = value; }
public static float RANGE() { return net.minecraft.entity.ai.brain.sensor.FrogAttackablesSensor.RANGE; }
// public static void RANGE(float value, ) { net.minecraft.entity.ai.brain.sensor.FrogAttackablesSensor.RANGE = value; }

// public boolean isTargetUnreachable(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.isTargetUnreachable(entity.wrapperContained,target.wrapperContained); }
// public static boolean isTargetUnreachable(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.ai.brain.sensor.FrogAttackablesSensor.isTargetUnreachable(entity.wrapperContained,target.wrapperContained); }

}