package yarnwrap.entity.ai.brain.task;
public class TickCooldownTask { public net.minecraft.entity.ai.brain.task.TickCooldownTask wrapperContained; public TickCooldownTask(net.minecraft.entity.ai.brain.task.TickCooldownTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.MemoryModuleType cooldownModule() { return new yarnwrap.entity.ai.brain.MemoryModuleType(wrapperContained.cooldownModule); }
// public void cooldownModule(yarnwrap.entity.ai.brain.MemoryModuleType value) { wrapperContained.cooldownModule = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.MemoryModuleType cooldownModule() { return new yarnwrap.entity.ai.brain.MemoryModuleType(net.minecraft.entity.ai.brain.task.TickCooldownTask.cooldownModule); }
// public static void cooldownModule(yarnwrap.entity.ai.brain.MemoryModuleType value, ) { net.minecraft.entity.ai.brain.task.TickCooldownTask.cooldownModule = value.wrapperContained; }

public TickCooldownTask(yarnwrap.entity.ai.brain.MemoryModuleType cooldownModule) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.TickCooldownTask(cooldownModule.wrapperContained); }
// public java.util.Optional getRemainingCooldownTicks(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getRemainingCooldownTicks(entity.wrapperContained); }
// public static java.util.Optional getRemainingCooldownTicks(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.ai.brain.task.TickCooldownTask.getRemainingCooldownTicks(entity.wrapperContained); }

}