package yarnwrap.entity.ai.brain.sensor;
public class NearestVisibleAdultSensor { public net.minecraft.entity.ai.brain.sensor.NearestVisibleAdultSensor wrapperContained; public NearestVisibleAdultSensor(net.minecraft.entity.ai.brain.sensor.NearestVisibleAdultSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public void findNearestVisibleAdult(yarnwrap.entity.passive.PassiveEntity entity,yarnwrap.entity.ai.brain.LivingTargetCache livingTarget) { wrapperContained.findNearestVisibleAdult(entity.wrapperContained,livingTarget.wrapperContained); }
// public static void findNearestVisibleAdult(yarnwrap.entity.passive.PassiveEntity entity,yarnwrap.entity.ai.brain.LivingTargetCache livingTarget, ) { net.minecraft.entity.ai.brain.sensor.NearestVisibleAdultSensor.findNearestVisibleAdult(entity.wrapperContained,livingTarget.wrapperContained); }

}