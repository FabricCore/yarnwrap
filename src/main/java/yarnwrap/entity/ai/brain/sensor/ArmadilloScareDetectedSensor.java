package yarnwrap.entity.ai.brain.sensor;
public class ArmadilloScareDetectedSensor { public net.minecraft.entity.ai.brain.sensor.ArmadilloScareDetectedSensor wrapperContained; public ArmadilloScareDetectedSensor(net.minecraft.entity.ai.brain.sensor.ArmadilloScareDetectedSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.BiPredicate threateningEntityPredicate() { return wrapperContained.threateningEntityPredicate; }
// public void threateningEntityPredicate(java.util.function.BiPredicate value) { wrapperContained.threateningEntityPredicate = value; }
// public java.util.function.Predicate canRollUpPredicate() { return wrapperContained.canRollUpPredicate; }
// public void canRollUpPredicate(java.util.function.Predicate value) { wrapperContained.canRollUpPredicate = value; }
// public yarnwrap.entity.ai.brain.MemoryModuleType memoryModuleType() { return new yarnwrap.entity.ai.brain.MemoryModuleType(wrapperContained.memoryModuleType); }
// public void memoryModuleType(yarnwrap.entity.ai.brain.MemoryModuleType value) { wrapperContained.memoryModuleType = value.wrapperContained; }
// public int expiry() { return wrapperContained.expiry; }
// public void expiry(int value) { wrapperContained.expiry = value; }
public ArmadilloScareDetectedSensor(int senseInterval,java.util.function.BiPredicate threateningEntityPredicate,java.util.function.Predicate canRollUpPredicate,yarnwrap.entity.ai.brain.MemoryModuleType memoryModuleType,int expiry) { this.wrapperContained = new net.minecraft.entity.ai.brain.sensor.ArmadilloScareDetectedSensor(senseInterval,threateningEntityPredicate,canRollUpPredicate,memoryModuleType.wrapperContained,expiry); }
public void tryDetectThreat(yarnwrap.entity.LivingEntity entity) { wrapperContained.tryDetectThreat(entity.wrapperContained); }
// public boolean method_55703(yarnwrap.entity.LivingEntity threat) { return wrapperContained.method_55703(threat.wrapperContained); }
public void onDetected(yarnwrap.entity.LivingEntity entity) { wrapperContained.onDetected(entity.wrapperContained); }
public void clear(yarnwrap.entity.LivingEntity entity) { wrapperContained.clear(entity.wrapperContained); }

}