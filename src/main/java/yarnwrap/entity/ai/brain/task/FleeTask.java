package yarnwrap.entity.ai.brain.task;
public class FleeTask { public net.minecraft.entity.ai.brain.task.FleeTask wrapperContained; public FleeTask(net.minecraft.entity.ai.brain.task.FleeTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_RUN_TIME() { return wrapperContained.MIN_RUN_TIME; }
// public void MIN_RUN_TIME(int value) { wrapperContained.MIN_RUN_TIME = value; }
// public static int MIN_RUN_TIME() { return net.minecraft.entity.ai.brain.task.FleeTask.MIN_RUN_TIME; }
// public static void MIN_RUN_TIME(int value, ) { net.minecraft.entity.ai.brain.task.FleeTask.MIN_RUN_TIME = value; }

// public int MAX_RUN_TIME() { return wrapperContained.MAX_RUN_TIME; }
// public void MAX_RUN_TIME(int value) { wrapperContained.MAX_RUN_TIME = value; }
// public static int MAX_RUN_TIME() { return net.minecraft.entity.ai.brain.task.FleeTask.MAX_RUN_TIME; }
// public static void MAX_RUN_TIME(int value, ) { net.minecraft.entity.ai.brain.task.FleeTask.MAX_RUN_TIME = value; }

// public int HORIZONTAL_RANGE() { return wrapperContained.HORIZONTAL_RANGE; }
// public void HORIZONTAL_RANGE(int value) { wrapperContained.HORIZONTAL_RANGE = value; }
// public static int HORIZONTAL_RANGE() { return net.minecraft.entity.ai.brain.task.FleeTask.HORIZONTAL_RANGE; }
// public static void HORIZONTAL_RANGE(int value, ) { net.minecraft.entity.ai.brain.task.FleeTask.HORIZONTAL_RANGE = value; }

// public int VERTICAL_RANGE() { return wrapperContained.VERTICAL_RANGE; }
// public void VERTICAL_RANGE(int value) { wrapperContained.VERTICAL_RANGE = value; }
// public static int VERTICAL_RANGE() { return net.minecraft.entity.ai.brain.task.FleeTask.VERTICAL_RANGE; }
// public static void VERTICAL_RANGE(int value, ) { net.minecraft.entity.ai.brain.task.FleeTask.VERTICAL_RANGE = value; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.ai.brain.task.FleeTask.speed; }
// public static void speed(float value, ) { net.minecraft.entity.ai.brain.task.FleeTask.speed = value; }

// public java.util.function.Function entityToDangerousDamageTypes() { return wrapperContained.entityToDangerousDamageTypes; }
// public void entityToDangerousDamageTypes(java.util.function.Function value) { wrapperContained.entityToDangerousDamageTypes = value; }
// public static java.util.function.Function entityToDangerousDamageTypes() { return net.minecraft.entity.ai.brain.task.FleeTask.entityToDangerousDamageTypes; }
// public static void entityToDangerousDamageTypes(java.util.function.Function value, ) { net.minecraft.entity.ai.brain.task.FleeTask.entityToDangerousDamageTypes = value; }

public FleeTask(float speed) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.FleeTask(speed); }
public FleeTask(float speed,java.util.function.Function entityToDangerousDamageTypes) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.FleeTask(speed,entityToDangerousDamageTypes); }
// public yarnwrap.util.math.Vec3d findTarget(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.util.math.Vec3d(wrapperContained.findTarget(entity.wrapperContained,world.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d findTarget(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.brain.task.FleeTask.findTarget(entity.wrapperContained,world.wrapperContained)); }
// public java.util.Optional findClosestWater(yarnwrap.world.BlockView world,yarnwrap.entity.Entity entity) { return wrapperContained.findClosestWater(world.wrapperContained,entity.wrapperContained); }
// public static java.util.Optional findClosestWater(yarnwrap.world.BlockView world,yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.ai.brain.task.FleeTask.findClosestWater(world.wrapperContained,entity.wrapperContained); }
// public boolean method_39763(yarnwrap.world.BlockView pos) { return wrapperContained.method_39763(pos.wrapperContained); }
// public static boolean method_39763(yarnwrap.world.BlockView pos, ) { return net.minecraft.entity.ai.brain.task.FleeTask.method_39763(pos.wrapperContained); }
// public boolean method_51505(yarnwrap.world.BlockView pos) { return wrapperContained.method_51505(pos.wrapperContained); }
// public static boolean method_51505(yarnwrap.world.BlockView pos, ) { return net.minecraft.entity.ai.brain.task.FleeTask.method_51505(pos.wrapperContained); }
// public boolean method_51506(yarnwrap.world.BlockView posx) { return wrapperContained.method_51506(posx.wrapperContained); }
// public static boolean method_51506(yarnwrap.world.BlockView posx, ) { return net.minecraft.entity.ai.brain.task.FleeTask.method_51506(posx.wrapperContained); }
// public yarnwrap.registry.tag.TagKey method_60720(yarnwrap.entity.mob.PathAwareEntity entity) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_60720(entity.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_60720(yarnwrap.entity.mob.PathAwareEntity entity, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.entity.ai.brain.task.FleeTask.method_60720(entity.wrapperContained)); }
// public java.lang.Boolean method_60721(yarnwrap.entity.mob.PathAwareEntity hurtBy) { return wrapperContained.method_60721(hurtBy.wrapperContained); }
// public static java.lang.Boolean method_60721(yarnwrap.entity.mob.PathAwareEntity hurtBy, ) { return net.minecraft.entity.ai.brain.task.FleeTask.method_60721(hurtBy.wrapperContained); }

}