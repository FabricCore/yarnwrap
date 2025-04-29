package yarnwrap.world.chunk.light;
public class ChunkSkyLightProvider { public net.minecraft.world.chunk.light.ChunkSkyLightProvider wrapperContained; public ChunkSkyLightProvider(net.minecraft.world.chunk.light.ChunkSkyLightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public ChunkSkyLightProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider) { this.wrapperContained = new net.minecraft.world.chunk.light.ChunkSkyLightProvider(chunkProvider.wrapperContained); }
// public ChunkSkyLightProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider,yarnwrap.world.chunk.light.SkyLightStorage lightStorage) { this.wrapperContained = new net.minecraft.world.chunk.light.ChunkSkyLightProvider(chunkProvider.wrapperContained,lightStorage.wrapperContained); }
// public int method_51585(int x,int z) { return wrapperContained.method_51585(x,z); }
// public static int method_51585(int x,int z, ) { return net.minecraft.world.chunk.light.ChunkSkyLightProvider.method_51585(x,z); }
// public void method_51586(int x,int z) { wrapperContained.method_51586(x,z); }
// public static void method_51586(int x,int z, ) { net.minecraft.world.chunk.light.ChunkSkyLightProvider.method_51586(x,z); }
// public void method_51587(long blockPos,yarnwrap.util.math.Direction direction,int lightLevel) { wrapperContained.method_51587(blockPos,direction.wrapperContained,lightLevel); }
// public static void method_51587(long blockPos,yarnwrap.util.math.Direction direction,int lightLevel, ) { net.minecraft.world.chunk.light.ChunkSkyLightProvider.method_51587(blockPos,direction.wrapperContained,lightLevel); }
// public boolean exitsChunkXZ(yarnwrap.util.math.Direction direction,int localX,int localZ) { return wrapperContained.exitsChunkXZ(direction.wrapperContained,localX,localZ); }
// public static boolean exitsChunkXZ(yarnwrap.util.math.Direction direction,int localX,int localZ, ) { return net.minecraft.world.chunk.light.ChunkSkyLightProvider.exitsChunkXZ(direction.wrapperContained,localX,localZ); }
// public yarnwrap.world.chunk.light.ChunkSkyLight method_51589(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.light.ChunkSkyLight(wrapperContained.method_51589(chunkX,chunkZ)); }
// public static yarnwrap.world.chunk.light.ChunkSkyLight method_51589(int chunkX,int chunkZ, ) { return new yarnwrap.world.chunk.light.ChunkSkyLight(net.minecraft.world.chunk.light.ChunkSkyLightProvider.method_51589(chunkX,chunkZ)); }
// public int getNumberOfSectionsBelowPos(long blockPos) { return wrapperContained.getNumberOfSectionsBelowPos(blockPos); }
// public static int getNumberOfSectionsBelowPos(long blockPos, ) { return net.minecraft.world.chunk.light.ChunkSkyLightProvider.getNumberOfSectionsBelowPos(blockPos); }

}