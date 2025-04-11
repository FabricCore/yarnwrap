package yarnwrap.entity.ai.brain.task;
public class EndRaidTask { public net.minecraft.entity.ai.brain.task.EndRaidTask wrapperContained; public EndRaidTask(net.minecraft.entity.ai.brain.task.EndRaidTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
// public boolean method_47042(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.method_47042(world.wrapperContained,entity.wrapperContained,time); }
// public com.mojang.datafixers.kinds.App method_47043(Object context) { return wrapperContained.method_47043(context); }

}