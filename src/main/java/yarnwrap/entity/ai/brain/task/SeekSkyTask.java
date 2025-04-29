package yarnwrap.entity.ai.brain.task;
public class SeekSkyTask { public net.minecraft.entity.ai.brain.task.SeekSkyTask wrapperContained; public SeekSkyTask(net.minecraft.entity.ai.brain.task.SeekSkyTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d findNearbySky(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.findNearbySky(world.wrapperContained,entity.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d findNearbySky(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.brain.task.SeekSkyTask.findNearbySky(world.wrapperContained,entity.wrapperContained)); }
// public boolean isSkyVisible(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSkyVisible(world.wrapperContained,entity.wrapperContained,pos.wrapperContained); }
// public static boolean isSkyVisible(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.brain.task.SeekSkyTask.isSkyVisible(world.wrapperContained,entity.wrapperContained,pos.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(speed)); }
// public static yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed, ) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(net.minecraft.entity.ai.brain.task.SeekSkyTask.create(speed)); }
// public com.mojang.datafixers.kinds.App method_46996(float context) { return wrapperContained.method_46996(context); }
// public static com.mojang.datafixers.kinds.App method_46996(float context, ) { return net.minecraft.entity.ai.brain.task.SeekSkyTask.method_46996(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46997(float walkTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46997(walkTarget)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_46997(float walkTarget, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.SeekSkyTask.method_46997(walkTarget)); }
// public boolean method_46998(yarnwrap.entity.ai.brain.MemoryQueryResult world,float entity,yarnwrap.server.world.ServerWorld time) { return wrapperContained.method_46998(world.wrapperContained,entity,time.wrapperContained); }
// public static boolean method_46998(yarnwrap.entity.ai.brain.MemoryQueryResult world,float entity,yarnwrap.server.world.ServerWorld time, ) { return net.minecraft.entity.ai.brain.task.SeekSkyTask.method_46998(world.wrapperContained,entity,time.wrapperContained); }
// public void method_46999(yarnwrap.entity.ai.brain.MemoryQueryResult pos) { wrapperContained.method_46999(pos.wrapperContained); }
// public static void method_46999(yarnwrap.entity.ai.brain.MemoryQueryResult pos, ) { net.minecraft.entity.ai.brain.task.SeekSkyTask.method_46999(pos.wrapperContained); }

}