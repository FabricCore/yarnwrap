package yarnwrap.entity.ai.brain.task;
public class FindInteractionTargetTask { public net.minecraft.entity.ai.brain.task.FindInteractionTargetTask wrapperContained; public FindInteractionTargetTask(net.minecraft.entity.ai.brain.task.FindInteractionTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.datafixers.kinds.App method_47081(int context) { return wrapperContained.method_47081(context); }
public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.EntityType type,int maxDistance) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(type.wrapperContained,maxDistance)); }
// public boolean method_47083(yarnwrap.entity.LivingEntity target) { return wrapperContained.method_47083(target.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47084(Object lookTarget,int interactionTarget,yarnwrap.entity.EntityType visibleMobs) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47084(lookTarget,interactionTarget,visibleMobs.wrapperContained)); }
// public boolean method_47085(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,int time) { return wrapperContained.method_47085(world,entity.wrapperContained,time); }

}