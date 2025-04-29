package yarnwrap.entity.ai.brain.task;
public class GoToNearbyPositionTask { public net.minecraft.entity.ai.brain.task.GoToNearbyPositionTask wrapperContained; public GoToNearbyPositionTask(net.minecraft.entity.ai.brain.task.GoToNearbyPositionTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47155(Object walkTarget,int pos) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47155(walkTarget,pos)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47155(Object walkTarget,int pos, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.GoToNearbyPositionTask.method_47155(walkTarget,pos)); }
// public boolean method_47156(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,int time) { return wrapperContained.method_47156(world,entity.wrapperContained,time); }
// public static boolean method_47156(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,int time, ) { return net.minecraft.entity.ai.brain.task.GoToNearbyPositionTask.method_47156(world,entity.wrapperContained,time); }
// public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.ai.brain.MemoryModuleType posModule,float walkSpeed,int completionRange,int maxDistance) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(posModule.wrapperContained,walkSpeed,completionRange,maxDistance)); }
// public static yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.ai.brain.MemoryModuleType posModule,float walkSpeed,int completionRange,int maxDistance, ) { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.GoToNearbyPositionTask.create(posModule.wrapperContained,walkSpeed,completionRange,maxDistance)); }
// public com.mojang.datafixers.kinds.App method_47158(yarnwrap.entity.ai.brain.MemoryModuleType context) { return wrapperContained.method_47158(context.wrapperContained); }
// public static com.mojang.datafixers.kinds.App method_47158(yarnwrap.entity.ai.brain.MemoryModuleType context, ) { return net.minecraft.entity.ai.brain.task.GoToNearbyPositionTask.method_47158(context.wrapperContained); }

}