package yarnwrap.entity.ai.brain.task;
public class FindWalkTargetTask { public net.minecraft.entity.ai.brain.task.FindWalkTargetTask wrapperContained; public FindWalkTargetTask(net.minecraft.entity.ai.brain.task.FindWalkTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_HORIZONTAL_RANGE() { return wrapperContained.DEFAULT_HORIZONTAL_RANGE; }
// public int DEFAULT_VERTICAL_RANGE() { return wrapperContained.DEFAULT_VERTICAL_RANGE; }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(float walkSpeed) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(walkSpeed)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(float walkSpeed,int horizontalRange,int verticalRange) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(walkSpeed,horizontalRange,verticalRange)); }

}