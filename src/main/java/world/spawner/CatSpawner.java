package yarnwrap.world.spawner;
public class CatSpawner { public net.minecraft.world.spawner.CatSpawner wrapperContained; public CatSpawner(net.minecraft.world.spawner.CatSpawner wrapperContained) { this.wrapperContained = wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown; }
// public int SPAWN_INTERVAL() { return wrapperContained.SPAWN_INTERVAL; }
// public int spawnInSwampHut(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.spawnInSwampHut(world.wrapperContained,pos.wrapperContained); }
// public int spawn(yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world) { return wrapperContained.spawn(pos.wrapperContained,world.wrapperContained); }
// public int spawnInHouse(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.spawnInHouse(world.wrapperContained,pos.wrapperContained); }

}