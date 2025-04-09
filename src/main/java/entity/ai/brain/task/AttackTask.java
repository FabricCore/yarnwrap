package yarnwrap.entity.ai.brain.task;
public class AttackTask { public net.minecraft.entity.ai.brain.task.AttackTask wrapperContained; public AttackTask(net.minecraft.entity.ai.brain.task.AttackTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(int distance,float forwardMovement) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(distance,forwardMovement)); }

}