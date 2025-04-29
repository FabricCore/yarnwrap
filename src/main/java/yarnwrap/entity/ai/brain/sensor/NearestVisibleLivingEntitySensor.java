package yarnwrap.entity.ai.brain.sensor;
public class NearestVisibleLivingEntitySensor { public net.minecraft.entity.ai.brain.sensor.NearestVisibleLivingEntitySensor wrapperContained; public NearestVisibleLivingEntitySensor(net.minecraft.entity.ai.brain.sensor.NearestVisibleLivingEntitySensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional getVisibleLivingEntities(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getVisibleLivingEntities(entity.wrapperContained); }
// public static java.util.Optional getVisibleLivingEntities(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.ai.brain.sensor.NearestVisibleLivingEntitySensor.getVisibleLivingEntities(entity.wrapperContained); }
// public boolean matches(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.matches(entity.wrapperContained,target.wrapperContained); }
// public static boolean matches(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.ai.brain.sensor.NearestVisibleLivingEntitySensor.matches(entity.wrapperContained,target.wrapperContained); }
// public yarnwrap.entity.ai.brain.MemoryModuleType getOutputMemoryModule() { return new yarnwrap.entity.ai.brain.MemoryModuleType(wrapperContained.getOutputMemoryModule()); }
// public static yarnwrap.entity.ai.brain.MemoryModuleType getOutputMemoryModule() { return new yarnwrap.entity.ai.brain.MemoryModuleType(net.minecraft.entity.ai.brain.sensor.NearestVisibleLivingEntitySensor.getOutputMemoryModule()); }
// public java.util.Optional getNearestVisibleLivingEntity(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getNearestVisibleLivingEntity(entity.wrapperContained); }
// public static java.util.Optional getNearestVisibleLivingEntity(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.ai.brain.sensor.NearestVisibleLivingEntitySensor.getNearestVisibleLivingEntity(entity.wrapperContained); }

}