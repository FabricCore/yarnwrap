package yarnwrap.entity.ai.brain.task;
public class ForgetBellRingTask { public net.minecraft.entity.ai.brain.task.ForgetBellRingTask wrapperContained; public ForgetBellRingTask(net.minecraft.entity.ai.brain.task.ForgetBellRingTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_HEARD_BELL_TIME() { return wrapperContained.MIN_HEARD_BELL_TIME; }
// public void MIN_HEARD_BELL_TIME(int value) { wrapperContained.MIN_HEARD_BELL_TIME = value; }
public yarnwrap.entity.ai.brain.task.Task create(int maxHiddenSeconds,int distance) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(maxHiddenSeconds,distance)); }

}