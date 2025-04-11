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
// public yarnwrap.entity.ai.brain.WalkTarget method_47016(float pos) { return new yarnwrap.entity.ai.brain.WalkTarget(wrapperContained.method_47016(pos)); }
// public yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed,java.util.function.Function targetGetter,java.util.function.Predicate shouldRun) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(speed,targetGetter,shouldRun)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed,boolean strollInsideWater) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(speed,strollInsideWater)); }
// public yarnwrap.util.math.Vec3d method_47019(int entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_47019(entity)); }
// public yarnwrap.util.math.Vec3d findTargetPos(yarnwrap.entity.mob.PathAwareEntity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.findTargetPos(entity.wrapperContained)); }
// public yarnwrap.util.math.Vec3d findTargetPos(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRadius,int verticalRadius) { return new yarnwrap.util.math.Vec3d(wrapperContained.findTargetPos(entity.wrapperContained,horizontalRadius,verticalRadius)); }
// public com.mojang.datafixers.kinds.App method_47022(java.util.function.Predicate context) { return wrapperContained.method_47022(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47023(java.util.function.Predicate walkTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47023(walkTarget)); }
// public boolean method_47024(java.util.function.Predicate world,java.util.function.Function entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47024(world,entity,time.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task createSolidTargeting(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.createSolidTargeting(speed)); }
// public boolean method_47026(yarnwrap.entity.mob.PathAwareEntity entity) { return wrapperContained.method_47026(entity.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task createDynamicRadius(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.createDynamicRadius(speed)); }
// public yarnwrap.util.math.Vec3d method_47028(yarnwrap.entity.mob.PathAwareEntity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_47028(entity.wrapperContained)); }
// public boolean method_47029(yarnwrap.entity.mob.PathAwareEntity entity) { return wrapperContained.method_47029(entity.wrapperContained); }
// public boolean method_47030(yarnwrap.entity.mob.PathAwareEntity entity) { return wrapperContained.method_47030(entity.wrapperContained); }
// public boolean method_47031(yarnwrap.entity.mob.PathAwareEntity entity) { return wrapperContained.method_47031(entity.wrapperContained); }
// public yarnwrap.util.math.Vec3d method_47032(yarnwrap.entity.mob.PathAwareEntity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_47032(entity.wrapperContained)); }

}