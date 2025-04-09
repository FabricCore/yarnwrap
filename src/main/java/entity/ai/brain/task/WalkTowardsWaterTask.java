package yarnwrap.entity.ai.brain.task;
public class WalkTowardsWaterTask { public net.minecraft.entity.ai.brain.task.WalkTowardsWaterTask wrapperContained; public WalkTowardsWaterTask(net.minecraft.entity.ai.brain.task.WalkTowardsWaterTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int range,float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range,speed)); }

}