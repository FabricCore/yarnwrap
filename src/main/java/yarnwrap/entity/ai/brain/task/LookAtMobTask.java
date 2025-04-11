package yarnwrap.entity.ai.brain.task;
public class LookAtMobTask { public net.minecraft.entity.ai.brain.task.LookAtMobTask wrapperContained; public LookAtMobTask(net.minecraft.entity.ai.brain.task.LookAtMobTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(float maxDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(maxDistance)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(yarnwrap.entity.EntityType type,float maxDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(type.wrapperContained,maxDistance)); }
// public boolean method_47058(yarnwrap.entity.EntityType entity) { return wrapperContained.method_47058(entity.wrapperContained); }
// public boolean method_47059(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_47059(entity.wrapperContained); }
// public boolean method_47060(yarnwrap.entity.LivingEntity target) { return wrapperContained.method_47060(target.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.SpawnGroup spawnGroup,float maxDistance) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(spawnGroup.wrapperContained,maxDistance)); }
// public boolean method_47062(yarnwrap.entity.SpawnGroup entity) { return wrapperContained.method_47062(entity.wrapperContained); }
// public boolean method_47063(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,java.util.function.Predicate time) { return wrapperContained.method_47063(world,entity.wrapperContained,time); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47064(Object lookTarget,java.util.function.Predicate visibleMobs) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47064(lookTarget,visibleMobs)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(java.util.function.Predicate predicate,float maxDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(predicate,maxDistance)); }
// public com.mojang.datafixers.kinds.App method_47066(java.util.function.Predicate context) { return wrapperContained.method_47066(context); }

}