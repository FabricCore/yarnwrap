package yarnwrap.entity.ai.brain.task;
public class RemoveOffHandItemTask { public net.minecraft.entity.ai.brain.task.RemoveOffHandItemTask wrapperContained; public RemoveOffHandItemTask(net.minecraft.entity.ai.brain.task.RemoveOffHandItemTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
// public boolean method_47299(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.PiglinEntity entity,long time) { return wrapperContained.method_47299(world.wrapperContained,entity.wrapperContained,time); }
// public com.mojang.datafixers.kinds.App method_47300(Object context) { return wrapperContained.method_47300(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47301(yarnwrap.entity.ai.brain.MemoryQueryResult admiringItem) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47301(admiringItem.wrapperContained)); }

}