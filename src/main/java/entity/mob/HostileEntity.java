package yarnwrap.entity.mob;
public class HostileEntity { public net.minecraft.entity.mob.HostileEntity wrapperContained; public HostileEntity(net.minecraft.entity.mob.HostileEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public void updateDespawnCounter() { wrapperContained.updateDespawnCounter(); }
public boolean isSpawnDark(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.isSpawnDark(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean canSpawnInDark(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawnInDark(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean canSpawnIgnoreLightLevel(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawnIgnoreLightLevel(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createHostileAttributes() { return wrapperContained.createHostileAttributes(); }
public boolean isAngryAt(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isAngryAt(player.wrapperContained); }

}