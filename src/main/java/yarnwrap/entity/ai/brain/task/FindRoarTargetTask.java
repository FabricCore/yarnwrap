package yarnwrap.entity.ai.brain.task;
public class FindRoarTargetTask { public net.minecraft.entity.ai.brain.task.FindRoarTargetTask wrapperContained; public FindRoarTargetTask(net.minecraft.entity.ai.brain.task.FindRoarTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Function targetFinder) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(targetFinder)); }
// public com.mojang.datafixers.kinds.App method_47256(java.util.function.Function context) { return wrapperContained.method_47256(context); }
// public boolean method_47257(java.util.function.Function world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47257(world,entity.wrapperContained,time.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47258(java.util.function.Function roarTarget,yarnwrap.entity.ai.brain.MemoryQueryResult attackTarget,yarnwrap.entity.ai.brain.MemoryQueryResult cantReachWalkTargetSince) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47258(roarTarget,attackTarget.wrapperContained,cantReachWalkTargetSince.wrapperContained)); }

}