package yarnwrap.entity.ai.brain.task;
public class WalkTowardsWaterTask { public net.minecraft.entity.ai.brain.task.WalkTowardsWaterTask wrapperContained; public WalkTowardsWaterTask(net.minecraft.entity.ai.brain.task.WalkTowardsWaterTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int range,float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range,speed)); }
// public com.mojang.datafixers.kinds.App method_47173(org.apache.commons.lang3.mutable.MutableLong context) { return wrapperContained.method_47173(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47174(org.apache.commons.lang3.mutable.MutableLong attackTarget,int walkTarget,float lookTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47174(attackTarget,walkTarget,lookTarget)); }
// public boolean method_47175(org.apache.commons.lang3.mutable.MutableLong world,int entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47175(world,entity,time.wrapperContained); }

}