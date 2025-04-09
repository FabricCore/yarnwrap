package yarnwrap.entity.ai.brain.task;
public class HideInHomeTask { public net.minecraft.entity.ai.brain.task.HideInHomeTask wrapperContained; public HideInHomeTask(net.minecraft.entity.ai.brain.task.HideInHomeTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(int maxDistance,float walkSpeed,int preferredDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(maxDistance,walkSpeed,preferredDistance)); }

}