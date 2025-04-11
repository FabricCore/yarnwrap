package yarnwrap.world.chunk.light;
public class ChunkSkyLightProvider { public net.minecraft.world.chunk.light.ChunkSkyLightProvider wrapperContained; public ChunkSkyLightProvider(net.minecraft.world.chunk.light.ChunkSkyLightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean exitsChunkXZ(yarnwrap.util.math.Direction direction,int localX,int localZ) { return wrapperContained.exitsChunkXZ(direction.wrapperContained,localX,localZ); }
// public int getNumberOfSectionsBelowPos(long blockPos) { return wrapperContained.getNumberOfSectionsBelowPos(blockPos); }

}