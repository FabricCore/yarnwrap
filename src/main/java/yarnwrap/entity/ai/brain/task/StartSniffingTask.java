package yarnwrap.entity.ai.brain.task;
public class StartSniffingTask { public net.minecraft.entity.ai.brain.task.StartSniffingTask wrapperContained; public StartSniffingTask(net.minecraft.entity.ai.brain.task.StartSniffingTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider COOLDOWN() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.COOLDOWN); }
// public void COOLDOWN(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.COOLDOWN = value.wrapperContained; }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
// public com.mojang.datafixers.kinds.App method_47265(Object context) { return wrapperContained.method_47265(context); }
// public boolean method_47266(yarnwrap.entity.ai.brain.MemoryQueryResult world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47266(world.wrapperContained,entity.wrapperContained,time.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47267(yarnwrap.entity.ai.brain.MemoryQueryResult isSniffing,yarnwrap.entity.ai.brain.MemoryQueryResult walkTarget,yarnwrap.entity.ai.brain.MemoryQueryResult sniffCooldown,yarnwrap.entity.ai.brain.MemoryQueryResult nearestAttackable,yarnwrap.entity.ai.brain.MemoryQueryResult disturbanceLocation) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47267(isSniffing.wrapperContained,walkTarget.wrapperContained,sniffCooldown.wrapperContained,nearestAttackable.wrapperContained,disturbanceLocation.wrapperContained)); }

}