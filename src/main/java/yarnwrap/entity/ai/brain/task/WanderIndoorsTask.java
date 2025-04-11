package yarnwrap.entity.ai.brain.task;
public class WanderIndoorsTask { public net.minecraft.entity.ai.brain.task.WanderIndoorsTask wrapperContained; public WanderIndoorsTask(net.minecraft.entity.ai.brain.task.WanderIndoorsTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }
// public com.mojang.datafixers.kinds.App method_46950(float context) { return wrapperContained.method_46950(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46951(float walkTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46951(walkTarget)); }
// public boolean method_46952(yarnwrap.server.world.ServerWorld pos) { return wrapperContained.method_46952(pos.wrapperContained); }
// public boolean method_46953(yarnwrap.server.world.ServerWorld pos) { return wrapperContained.method_46953(pos.wrapperContained); }
// public boolean method_46954(yarnwrap.entity.ai.brain.MemoryQueryResult world,float entity,yarnwrap.server.world.ServerWorld time) { return wrapperContained.method_46954(world.wrapperContained,entity,time.wrapperContained); }
// public void method_46955(yarnwrap.entity.ai.brain.MemoryQueryResult pos) { wrapperContained.method_46955(pos.wrapperContained); }
// public boolean method_46956(yarnwrap.server.world.ServerWorld pos) { return wrapperContained.method_46956(pos.wrapperContained); }

}