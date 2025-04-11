package yarnwrap.entity.ai.brain.sensor;
public class GolemLastSeenSensor { public net.minecraft.entity.ai.brain.sensor.GolemLastSeenSensor wrapperContained; public GolemLastSeenSensor(net.minecraft.entity.ai.brain.sensor.GolemLastSeenSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
// public int GOLEM_DETECTED_WARMUP() { return wrapperContained.GOLEM_DETECTED_WARMUP; }
// public void GOLEM_DETECTED_WARMUP(int value) { wrapperContained.GOLEM_DETECTED_WARMUP = value; }
public void senseIronGolem(yarnwrap.entity.LivingEntity entity) { wrapperContained.senseIronGolem(entity.wrapperContained); }
public void rememberIronGolem(yarnwrap.entity.LivingEntity entity) { wrapperContained.rememberIronGolem(entity.wrapperContained); }

}