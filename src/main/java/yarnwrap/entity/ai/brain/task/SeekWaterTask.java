package yarnwrap.entity.ai.brain.task;
public class SeekWaterTask { public net.minecraft.entity.ai.brain.task.SeekWaterTask wrapperContained; public SeekWaterTask(net.minecraft.entity.ai.brain.task.SeekWaterTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int range,float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range,speed)); }
// public com.mojang.datafixers.kinds.App method_47177(org.apache.commons.lang3.mutable.MutableLong context) { return wrapperContained.method_47177(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47178(org.apache.commons.lang3.mutable.MutableLong attackTarget,int walkTarget,float lookTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47178(attackTarget,walkTarget,lookTarget)); }
// public boolean method_47179(org.apache.commons.lang3.mutable.MutableLong world,int entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47179(world,entity,time.wrapperContained); }

}