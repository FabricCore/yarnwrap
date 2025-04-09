package yarnwrap.entity.mob;
public class EndermiteEntity { public net.minecraft.entity.mob.EndermiteEntity wrapperContained; public EndermiteEntity(net.minecraft.entity.mob.EndermiteEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DESPAWN_TIME() { return wrapperContained.DESPAWN_TIME; }
// public int lifeTime() { return wrapperContained.lifeTime; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createEndermiteAttributes() { return wrapperContained.createEndermiteAttributes(); }

}