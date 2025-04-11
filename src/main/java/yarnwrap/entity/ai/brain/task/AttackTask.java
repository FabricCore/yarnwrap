package yarnwrap.entity.ai.brain.task;
public class AttackTask { public net.minecraft.entity.ai.brain.task.AttackTask wrapperContained; public AttackTask(net.minecraft.entity.ai.brain.task.AttackTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(int distance,float forwardMovement) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(distance,forwardMovement)); }
// public com.mojang.datafixers.kinds.App method_46902(int context) { return wrapperContained.method_46902(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46903(Object walkTarget,int lookTarget,float attackTarget,yarnwrap.entity.ai.brain.MemoryQueryResult visibleMobs) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46903(walkTarget,lookTarget,attackTarget,visibleMobs.wrapperContained)); }
// public boolean method_46904(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,int time) { return wrapperContained.method_46904(world,entity.wrapperContained,time); }

}