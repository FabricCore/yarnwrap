package yarnwrap.entity.ai.brain.task;
public class LoseJobOnSiteLossTask { public net.minecraft.entity.ai.brain.task.LoseJobOnSiteLossTask wrapperContained; public LoseJobOnSiteLossTask(net.minecraft.entity.ai.brain.task.LoseJobOnSiteLossTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.LoseJobOnSiteLossTask.create()); }
// public boolean method_47038(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.VillagerEntity entity,long time) { return wrapperContained.method_47038(world.wrapperContained,entity.wrapperContained,time); }
// public static boolean method_47038(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.VillagerEntity entity,long time, ) { return net.minecraft.entity.ai.brain.task.LoseJobOnSiteLossTask.method_47038(world.wrapperContained,entity.wrapperContained,time); }
// public com.mojang.datafixers.kinds.App method_47039(Object context) { return wrapperContained.method_47039(context); }
// public static com.mojang.datafixers.kinds.App method_47039(Object context, ) { return net.minecraft.entity.ai.brain.task.LoseJobOnSiteLossTask.method_47039(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47040(yarnwrap.entity.ai.brain.MemoryQueryResult jobSite) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47040(jobSite.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47040(yarnwrap.entity.ai.brain.MemoryQueryResult jobSite, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.LoseJobOnSiteLossTask.method_47040(jobSite.wrapperContained)); }

}