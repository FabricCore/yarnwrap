package yarnwrap.server.network;
public class SpawnLocating { public net.minecraft.server.network.SpawnLocating wrapperContained; public SpawnLocating(net.minecraft.server.network.SpawnLocating wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos findOverworldSpawn(yarnwrap.server.world.ServerWorld world,int x,int z) { return new yarnwrap.util.math.BlockPos(wrapperContained.findOverworldSpawn(world.wrapperContained,x,z)); }
public yarnwrap.util.math.BlockPos findServerSpawnPoint(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.ChunkPos chunkPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.findServerSpawnPoint(world.wrapperContained,chunkPos.wrapperContained)); }

}