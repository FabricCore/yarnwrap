package yarnwrap.entity.ai.brain.task;
public class StartRaidTask { public net.minecraft.entity.ai.brain.task.StartRaidTask wrapperContained; public StartRaidTask(net.minecraft.entity.ai.brain.task.StartRaidTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
// public boolean method_47087(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.method_47087(world.wrapperContained,entity.wrapperContained,time); }
// public com.mojang.datafixers.kinds.App method_47088(Object context) { return wrapperContained.method_47088(context); }

}