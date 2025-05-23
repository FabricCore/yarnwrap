package yarnwrap.world.chunk.light;
public class ChunkSkyLightProvider { public net.minecraft.world.chunk.light.ChunkSkyLightProvider wrapperContained; public ChunkSkyLightProvider(net.minecraft.world.chunk.light.ChunkSkyLightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.light.ChunkSkyLight defaultSkyLight() { return new yarnwrap.world.chunk.light.ChunkSkyLight(wrapperContained.defaultSkyLight); }
// public void defaultSkyLight(yarnwrap.world.chunk.light.ChunkSkyLight value) { wrapperContained.defaultSkyLight = value.wrapperContained; }
// public static yarnwrap.world.chunk.light.ChunkSkyLight defaultSkyLight() { return new yarnwrap.world.chunk.light.ChunkSkyLight(net.minecraft.world.chunk.light.ChunkSkyLightProvider.defaultSkyLight); }
// public static void defaultSkyLight(yarnwrap.world.chunk.light.ChunkSkyLight value, ) { net.minecraft.world.chunk.light.ChunkSkyLightProvider.defaultSkyLight = value.wrapperContained; }

public ChunkSkyLightProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider) { this.wrapperContained = new net.minecraft.world.chunk.light.ChunkSkyLightProvider(chunkProvider.wrapperContained); }
// public ChunkSkyLightProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider,yarnwrap.world.chunk.light.SkyLightStorage lightStorage) { this.wrapperContained = new net.minecraft.world.chunk.light.ChunkSkyLightProvider(chunkProvider.wrapperContained,lightStorage.wrapperContained); }
// public boolean isMaxLightLevel(int lightLevel) { return wrapperContained.isMaxLightLevel(lightLevel); }
// public static boolean isMaxLightLevel(int lightLevel, ) { return net.minecraft.world.chunk.light.ChunkSkyLightProvider.isMaxLightLevel(lightLevel); }
// public int getSkyLightOrDefault(int x,int z,int defaultValue) { return wrapperContained.getSkyLightOrDefault(x,z,defaultValue); }
// public static int getSkyLightOrDefault(int x,int z,int defaultValue, ) { return net.minecraft.world.chunk.light.ChunkSkyLightProvider.getSkyLightOrDefault(x,z,defaultValue); }
// public void method_51586(int x,int z) { wrapperContained.method_51586(x,z); }
// public static void method_51586(int x,int z, ) { net.minecraft.world.chunk.light.ChunkSkyLightProvider.method_51586(x,z); }
// public void method_51587(long blockPos,yarnwrap.util.math.Direction direction,int lightLevel) { wrapperContained.method_51587(blockPos,direction.wrapperContained,lightLevel); }
// public static void method_51587(long blockPos,yarnwrap.util.math.Direction direction,int lightLevel, ) { net.minecraft.world.chunk.light.ChunkSkyLightProvider.method_51587(blockPos,direction.wrapperContained,lightLevel); }
// public boolean exitsChunkXZ(yarnwrap.util.math.Direction direction,int localX,int localZ) { return wrapperContained.exitsChunkXZ(direction.wrapperContained,localX,localZ); }
// public static boolean exitsChunkXZ(yarnwrap.util.math.Direction direction,int localX,int localZ, ) { return net.minecraft.world.chunk.light.ChunkSkyLightProvider.exitsChunkXZ(direction.wrapperContained,localX,localZ); }
// public yarnwrap.world.chunk.light.ChunkSkyLight getSkyLight(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.light.ChunkSkyLight(wrapperContained.getSkyLight(chunkX,chunkZ)); }
// public static yarnwrap.world.chunk.light.ChunkSkyLight getSkyLight(int chunkX,int chunkZ, ) { return new yarnwrap.world.chunk.light.ChunkSkyLight(net.minecraft.world.chunk.light.ChunkSkyLightProvider.getSkyLight(chunkX,chunkZ)); }
// public void method_51591(int x,int z) { wrapperContained.method_51591(x,z); }
// public static void method_51591(int x,int z, ) { net.minecraft.world.chunk.light.ChunkSkyLightProvider.method_51591(x,z); }
// public int getNumberOfSectionsBelowPos(long blockPos) { return wrapperContained.getNumberOfSectionsBelowPos(blockPos); }
// public static int getNumberOfSectionsBelowPos(long blockPos, ) { return net.minecraft.world.chunk.light.ChunkSkyLightProvider.getNumberOfSectionsBelowPos(blockPos); }

}