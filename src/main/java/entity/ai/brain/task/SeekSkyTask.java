package yarnwrap.entity.ai.brain.task;
public class SeekSkyTask { public net.minecraft.entity.ai.brain.task.SeekSkyTask wrapperContained; public SeekSkyTask(net.minecraft.entity.ai.brain.task.SeekSkyTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d findNearbySky(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.findNearbySky(world.wrapperContained,entity.wrapperContained)); }
public boolean isSkyVisible(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSkyVisible(world.wrapperContained,entity.wrapperContained,pos.wrapperContained); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(speed)); }

}