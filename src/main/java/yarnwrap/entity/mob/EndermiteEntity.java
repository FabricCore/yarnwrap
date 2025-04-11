package yarnwrap.entity.mob;
public class EndermiteEntity { public net.minecraft.entity.mob.EndermiteEntity wrapperContained; public EndermiteEntity(net.minecraft.entity.mob.EndermiteEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DESPAWN_TIME() { return wrapperContained.DESPAWN_TIME; }
// public void DESPAWN_TIME(int value) { wrapperContained.DESPAWN_TIME = value; }
// public int lifeTime() { return wrapperContained.lifeTime; }
// public void lifeTime(int value) { wrapperContained.lifeTime = value; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createEndermiteAttributes() { return wrapperContained.createEndermiteAttributes(); }

}