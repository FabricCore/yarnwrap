package yarnwrap.entity;
public class SpawnRestriction { public net.minecraft.entity.SpawnRestriction wrapperContained; public SpawnRestriction(net.minecraft.entity.SpawnRestriction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RESTRICTIONS() { return wrapperContained.RESTRICTIONS; }
// public void RESTRICTIONS(java.util.Map value) { wrapperContained.RESTRICTIONS = value; }
// public static java.util.Map RESTRICTIONS() { return net.minecraft.entity.SpawnRestriction.RESTRICTIONS; }
// public static void RESTRICTIONS(java.util.Map value, ) { net.minecraft.entity.SpawnRestriction.RESTRICTIONS = value; }

// public yarnwrap.entity.SpawnLocation getLocation(yarnwrap.entity.EntityType type) { return new yarnwrap.entity.SpawnLocation(wrapperContained.getLocation(type.wrapperContained)); }
// public static yarnwrap.entity.SpawnLocation getLocation(yarnwrap.entity.EntityType type, ) { return new yarnwrap.entity.SpawnLocation(net.minecraft.entity.SpawnRestriction.getLocation(type.wrapperContained)); }
// public Object getHeightmapType(yarnwrap.entity.EntityType type) { return wrapperContained.getHeightmapType(type.wrapperContained); }
// public static Object getHeightmapType(yarnwrap.entity.EntityType type, ) { return net.minecraft.entity.SpawnRestriction.getHeightmapType(type.wrapperContained); }
// public void register(yarnwrap.entity.EntityType type,yarnwrap.entity.SpawnLocation location,Object heightmapType,Object predicate) { wrapperContained.register(type.wrapperContained,location.wrapperContained,heightmapType,predicate); }
// public static void register(yarnwrap.entity.EntityType type,yarnwrap.entity.SpawnLocation location,Object heightmapType,Object predicate, ) { net.minecraft.entity.SpawnRestriction.register(type.wrapperContained,location.wrapperContained,heightmapType,predicate); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.SpawnRestriction.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public boolean isSpawnPosAllowed(yarnwrap.entity.EntityType type,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSpawnPosAllowed(type.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean isSpawnPosAllowed(yarnwrap.entity.EntityType type,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.SpawnRestriction.isSpawnPosAllowed(type.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}