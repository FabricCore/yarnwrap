package yarnwrap.entity.ai.brain.task;
public class FindWalkTargetTask { public net.minecraft.entity.ai.brain.task.FindWalkTargetTask wrapperContained; public FindWalkTargetTask(net.minecraft.entity.ai.brain.task.FindWalkTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_HORIZONTAL_RANGE() { return wrapperContained.DEFAULT_HORIZONTAL_RANGE; }
// public void DEFAULT_HORIZONTAL_RANGE(int value) { wrapperContained.DEFAULT_HORIZONTAL_RANGE = value; }
// public int DEFAULT_VERTICAL_RANGE() { return wrapperContained.DEFAULT_VERTICAL_RANGE; }
// public void DEFAULT_VERTICAL_RANGE(int value) { wrapperContained.DEFAULT_VERTICAL_RANGE = value; }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(float walkSpeed) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(walkSpeed)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(float walkSpeed,int horizontalRange,int verticalRange) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(walkSpeed,horizontalRange,verticalRange)); }
// public yarnwrap.entity.ai.brain.WalkTarget method_47193(float pos) { return new yarnwrap.entity.ai.brain.WalkTarget(wrapperContained.method_47193(pos)); }
// public com.mojang.datafixers.kinds.App method_47194(int context) { return wrapperContained.method_47194(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47195(int walkTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47195(walkTarget)); }
// public boolean method_47196(int world,int entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47196(world,entity,time.wrapperContained); }

}