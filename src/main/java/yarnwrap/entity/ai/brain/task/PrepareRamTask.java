package yarnwrap.entity.ai.brain.task;
public class PrepareRamTask { public net.minecraft.entity.ai.brain.task.PrepareRamTask wrapperContained; public PrepareRamTask(net.minecraft.entity.ai.brain.task.PrepareRamTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
public static int RUN_TIME() { return net.minecraft.entity.ai.brain.task.PrepareRamTask.RUN_TIME; }
// public static void RUN_TIME(int value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.RUN_TIME = value; }

// public java.util.function.ToIntFunction cooldownFactory() { return wrapperContained.cooldownFactory; }
// public void cooldownFactory(java.util.function.ToIntFunction value) { wrapperContained.cooldownFactory = value; }
// public static java.util.function.ToIntFunction cooldownFactory() { return net.minecraft.entity.ai.brain.task.PrepareRamTask.cooldownFactory; }
// public static void cooldownFactory(java.util.function.ToIntFunction value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.cooldownFactory = value; }

// public int minRamDistance() { return wrapperContained.minRamDistance; }
// public void minRamDistance(int value) { wrapperContained.minRamDistance = value; }
// public static int minRamDistance() { return net.minecraft.entity.ai.brain.task.PrepareRamTask.minRamDistance; }
// public static void minRamDistance(int value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.minRamDistance = value; }

// public int maxRamDistance() { return wrapperContained.maxRamDistance; }
// public void maxRamDistance(int value) { wrapperContained.maxRamDistance = value; }
// public static int maxRamDistance() { return net.minecraft.entity.ai.brain.task.PrepareRamTask.maxRamDistance; }
// public static void maxRamDistance(int value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.maxRamDistance = value; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.ai.brain.task.PrepareRamTask.speed; }
// public static void speed(float value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.speed = value; }

// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
// public void targetPredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.targetPredicate = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.brain.task.PrepareRamTask.targetPredicate); }
// public static void targetPredicate(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.targetPredicate = value.wrapperContained; }

// public int prepareTime() { return wrapperContained.prepareTime; }
// public void prepareTime(int value) { wrapperContained.prepareTime = value; }
// public static int prepareTime() { return net.minecraft.entity.ai.brain.task.PrepareRamTask.prepareTime; }
// public static void prepareTime(int value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.prepareTime = value; }

// public java.util.function.Function soundFactory() { return wrapperContained.soundFactory; }
// public void soundFactory(java.util.function.Function value) { wrapperContained.soundFactory = value; }
// public static java.util.function.Function soundFactory() { return net.minecraft.entity.ai.brain.task.PrepareRamTask.soundFactory; }
// public static void soundFactory(java.util.function.Function value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.soundFactory = value; }

// public java.util.Optional prepareStartTime() { return wrapperContained.prepareStartTime; }
// public void prepareStartTime(java.util.Optional value) { wrapperContained.prepareStartTime = value; }
// public static java.util.Optional prepareStartTime() { return net.minecraft.entity.ai.brain.task.PrepareRamTask.prepareStartTime; }
// public static void prepareStartTime(java.util.Optional value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.prepareStartTime = value; }

// public java.util.Optional ram() { return wrapperContained.ram; }
// public void ram(java.util.Optional value) { wrapperContained.ram = value; }
// public static java.util.Optional ram() { return net.minecraft.entity.ai.brain.task.PrepareRamTask.ram; }
// public static void ram(java.util.Optional value, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.ram = value; }

public PrepareRamTask(java.util.function.ToIntFunction cooldownFactory,int minDistance,int maxDistance,float speed,yarnwrap.entity.ai.TargetPredicate targetPredicate,int prepareTime,java.util.function.Function soundFactory) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.PrepareRamTask(cooldownFactory,minDistance,maxDistance,speed,targetPredicate.wrapperContained,prepareTime,soundFactory); }
// public Object method_36261(yarnwrap.entity.LivingEntity start) { return wrapperContained.method_36261(start.wrapperContained); }
// public static Object method_36261(yarnwrap.entity.LivingEntity start, ) { return net.minecraft.entity.ai.brain.task.PrepareRamTask.method_36261(start.wrapperContained); }
// public java.util.Optional findRamStart(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.findRamStart(entity.wrapperContained,target.wrapperContained); }
// public static java.util.Optional findRamStart(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.ai.brain.task.PrepareRamTask.findRamStart(entity.wrapperContained,target.wrapperContained); }
// public boolean canReach(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.util.math.BlockPos target) { return wrapperContained.canReach(entity.wrapperContained,target.wrapperContained); }
// public static boolean canReach(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.util.math.BlockPos target, ) { return net.minecraft.entity.ai.brain.task.PrepareRamTask.canReach(entity.wrapperContained,target.wrapperContained); }
// public java.util.Optional method_36264(yarnwrap.server.world.ServerWorld mobs) { return wrapperContained.method_36264(mobs.wrapperContained); }
// public static java.util.Optional method_36264(yarnwrap.server.world.ServerWorld mobs, ) { return net.minecraft.entity.ai.brain.task.PrepareRamTask.method_36264(mobs.wrapperContained); }
// public boolean method_36265(yarnwrap.entity.ai.pathing.EntityNavigation start) { return wrapperContained.method_36265(start.wrapperContained); }
// public static boolean method_36265(yarnwrap.entity.ai.pathing.EntityNavigation start, ) { return net.minecraft.entity.ai.brain.task.PrepareRamTask.method_36265(start.wrapperContained); }
// public yarnwrap.util.math.Vec3d calculateRamTarget(yarnwrap.util.math.BlockPos start,yarnwrap.util.math.BlockPos end) { return new yarnwrap.util.math.Vec3d(wrapperContained.calculateRamTarget(start.wrapperContained,end.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d calculateRamTarget(yarnwrap.util.math.BlockPos start,yarnwrap.util.math.BlockPos end, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.brain.task.PrepareRamTask.calculateRamTarget(start.wrapperContained,end.wrapperContained)); }
// public void findRam(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.entity.LivingEntity target) { wrapperContained.findRam(entity.wrapperContained,target.wrapperContained); }
// public static void findRam(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.findRam(entity.wrapperContained,target.wrapperContained); }
// public void method_36270(yarnwrap.entity.mob.PathAwareEntity mob) { wrapperContained.method_36270(mob.wrapperContained); }
// public static void method_36270(yarnwrap.entity.mob.PathAwareEntity mob, ) { net.minecraft.entity.ai.brain.task.PrepareRamTask.method_36270(mob.wrapperContained); }
// public boolean method_36272(yarnwrap.server.world.ServerWorld mob) { return wrapperContained.method_36272(mob.wrapperContained); }
// public static boolean method_36272(yarnwrap.server.world.ServerWorld mob, ) { return net.minecraft.entity.ai.brain.task.PrepareRamTask.method_36272(mob.wrapperContained); }

}