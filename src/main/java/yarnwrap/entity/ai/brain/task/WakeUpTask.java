package yarnwrap.entity.ai.brain.task;
public class WakeUpTask { public net.minecraft.entity.ai.brain.task.WakeUpTask wrapperContained; public WakeUpTask(net.minecraft.entity.ai.brain.task.WakeUpTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
// public boolean method_47205(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.method_47205(world.wrapperContained,entity.wrapperContained,time); }
// public com.mojang.datafixers.kinds.App method_47206(Object context) { return wrapperContained.method_47206(context); }

}