package yarnwrap.entity.ai.brain.task;
public class WalkTowardsLandTask { public net.minecraft.entity.ai.brain.task.WalkTowardsLandTask wrapperContained; public WalkTowardsLandTask(net.minecraft.entity.ai.brain.task.WalkTowardsLandTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TASK_COOLDOWN() { return wrapperContained.TASK_COOLDOWN; }
public yarnwrap.entity.ai.brain.task.Task create(int range,float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range,speed)); }

}