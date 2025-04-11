package yarnwrap.entity.ai.brain.task;
public class PacifyTask { public net.minecraft.entity.ai.brain.task.PacifyTask wrapperContained; public PacifyTask(net.minecraft.entity.ai.brain.task.PacifyTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46905(int attackTarget,yarnwrap.entity.ai.brain.MemoryQueryResult pacified,yarnwrap.entity.ai.brain.MemoryQueryResult requiredMemoryResult) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46905(attackTarget,pacified.wrapperContained,requiredMemoryResult.wrapperContained)); }
// public boolean method_46906(yarnwrap.entity.ai.brain.MemoryQueryResult world,int entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_46906(world.wrapperContained,entity,time.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.ai.brain.MemoryModuleType requiredMemory,int duration) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(requiredMemory.wrapperContained,duration)); }
// public com.mojang.datafixers.kinds.App method_46909(yarnwrap.entity.ai.brain.MemoryModuleType context) { return wrapperContained.method_46909(context.wrapperContained); }

}