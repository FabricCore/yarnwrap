package yarnwrap.entity.ai.brain.task;
public class StartRaidTask { public net.minecraft.entity.ai.brain.task.StartRaidTask wrapperContained; public StartRaidTask(net.minecraft.entity.ai.brain.task.StartRaidTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.StartRaidTask.create()); }
// public boolean method_47087(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.method_47087(world.wrapperContained,entity.wrapperContained,time); }
// public static boolean method_47087(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time, ) { return net.minecraft.entity.ai.brain.task.StartRaidTask.method_47087(world.wrapperContained,entity.wrapperContained,time); }
// public com.mojang.datafixers.kinds.App method_47088(Object context) { return wrapperContained.method_47088(context); }
// public static com.mojang.datafixers.kinds.App method_47088(Object context, ) { return net.minecraft.entity.ai.brain.task.StartRaidTask.method_47088(context); }

}