package yarnwrap.entity.ai.brain.task;
public class LookAtMobTask { public net.minecraft.entity.ai.brain.task.LookAtMobTask wrapperContained; public LookAtMobTask(net.minecraft.entity.ai.brain.task.LookAtMobTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(float maxDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(maxDistance)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(yarnwrap.entity.EntityType type,float maxDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(type.wrapperContained,maxDistance)); }
public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.SpawnGroup spawnGroup,float maxDistance) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(spawnGroup.wrapperContained,maxDistance)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(java.util.function.Predicate predicate,float maxDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(predicate,maxDistance)); }

}