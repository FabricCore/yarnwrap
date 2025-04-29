package yarnwrap.entity.ai.brain.task;
public class TemptationCooldownTask { public net.minecraft.entity.ai.brain.task.TemptationCooldownTask wrapperContained; public TemptationCooldownTask(net.minecraft.entity.ai.brain.task.TemptationCooldownTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.MemoryModuleType moduleType() { return new yarnwrap.entity.ai.brain.MemoryModuleType(wrapperContained.moduleType); }
// public void moduleType(yarnwrap.entity.ai.brain.MemoryModuleType value) { wrapperContained.moduleType = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.MemoryModuleType moduleType() { return new yarnwrap.entity.ai.brain.MemoryModuleType(net.minecraft.entity.ai.brain.task.TemptationCooldownTask.moduleType); }
// public static void moduleType(yarnwrap.entity.ai.brain.MemoryModuleType value, ) { net.minecraft.entity.ai.brain.task.TemptationCooldownTask.moduleType = value.wrapperContained; }

public TemptationCooldownTask(yarnwrap.entity.ai.brain.MemoryModuleType moduleType) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.TemptationCooldownTask(moduleType.wrapperContained); }
// public java.util.Optional getTemptationCooldownTicks(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getTemptationCooldownTicks(entity.wrapperContained); }
// public static java.util.Optional getTemptationCooldownTicks(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.ai.brain.task.TemptationCooldownTask.getTemptationCooldownTicks(entity.wrapperContained); }

}