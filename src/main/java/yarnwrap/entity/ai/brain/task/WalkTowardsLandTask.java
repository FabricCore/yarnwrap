package yarnwrap.entity.ai.brain.task;
public class WalkTowardsLandTask { public net.minecraft.entity.ai.brain.task.WalkTowardsLandTask wrapperContained; public WalkTowardsLandTask(net.minecraft.entity.ai.brain.task.WalkTowardsLandTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TASK_COOLDOWN() { return wrapperContained.TASK_COOLDOWN; }
// public void TASK_COOLDOWN(int value) { wrapperContained.TASK_COOLDOWN = value; }
public yarnwrap.entity.ai.brain.task.Task create(int range,float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range,speed)); }
// public com.mojang.datafixers.kinds.App method_47169(org.apache.commons.lang3.mutable.MutableLong context) { return wrapperContained.method_47169(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47170(org.apache.commons.lang3.mutable.MutableLong attackTarget,int walkTarget,float lookTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47170(attackTarget,walkTarget,lookTarget)); }
// public boolean method_47171(org.apache.commons.lang3.mutable.MutableLong world,int entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47171(world,entity,time.wrapperContained); }

}