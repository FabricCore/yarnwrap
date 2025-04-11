package yarnwrap.entity.ai.brain.task;
public class StrollTask { public net.minecraft.entity.ai.brain.task.StrollTask wrapperContained; public StrollTask(net.minecraft.entity.ai.brain.task.StrollTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_HORIZONTAL_RADIUS() { return wrapperContained.DEFAULT_HORIZONTAL_RADIUS; }
// public void DEFAULT_HORIZONTAL_RADIUS(int value) { wrapperContained.DEFAULT_HORIZONTAL_RADIUS = value; }
// public int DEFAULT_VERTICAL_RADIUS() { return wrapperContained.DEFAULT_VERTICAL_RADIUS; }
// public void DEFAULT_VERTICAL_RADIUS(int value) { wrapperContained.DEFAULT_VERTICAL_RADIUS = value; }
// public int[][] RADII() { return wrapperContained.RADII; }
// public void RADII(int[][] value) { wrapperContained.RADII = value; }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(speed)); }
public yarnwrap.entity.ai.brain.task.Task create(float speed,int horizontalRadius,int verticalRadius) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed,horizontalRadius,verticalRadius)); }
// public yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed,java.util.function.Function targetGetter,java.util.function.Predicate shouldRun) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(speed,targetGetter,shouldRun)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed,boolean strollInsideWater) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(speed,strollInsideWater)); }
// public yarnwrap.util.math.Vec3d findTargetPos(yarnwrap.entity.mob.PathAwareEntity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.findTargetPos(entity.wrapperContained)); }
// public yarnwrap.util.math.Vec3d findTargetPos(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRadius,int verticalRadius) { return new yarnwrap.util.math.Vec3d(wrapperContained.findTargetPos(entity.wrapperContained,horizontalRadius,verticalRadius)); }
public yarnwrap.entity.ai.brain.task.Task createSolidTargeting(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.createSolidTargeting(speed)); }
public yarnwrap.entity.ai.brain.task.Task createDynamicRadius(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.createDynamicRadius(speed)); }

}