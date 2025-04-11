package yarnwrap.entity.ai.brain.task;
public class ForgetBellRingTask { public net.minecraft.entity.ai.brain.task.ForgetBellRingTask wrapperContained; public ForgetBellRingTask(net.minecraft.entity.ai.brain.task.ForgetBellRingTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_HEARD_BELL_TIME() { return wrapperContained.MIN_HEARD_BELL_TIME; }
// public void MIN_HEARD_BELL_TIME(int value) { wrapperContained.MIN_HEARD_BELL_TIME = value; }
public yarnwrap.entity.ai.brain.task.Task create(int maxHiddenSeconds,int distance) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(maxHiddenSeconds,distance)); }
// public boolean method_47078(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,org.apache.commons.lang3.mutable.MutableInt time) { return wrapperContained.method_47078(world,entity.wrapperContained,time); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47079(Object hidingPlace,org.apache.commons.lang3.mutable.MutableInt heardBellTime) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47079(hidingPlace,heardBellTime)); }
// public com.mojang.datafixers.kinds.App method_47080(org.apache.commons.lang3.mutable.MutableInt context) { return wrapperContained.method_47080(context); }

}