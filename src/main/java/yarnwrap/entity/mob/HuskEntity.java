package yarnwrap.entity.mob;
public class HuskEntity { public net.minecraft.entity.mob.HuskEntity wrapperContained; public HuskEntity(net.minecraft.entity.mob.HuskEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}