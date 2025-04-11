package yarnwrap.world;
public class WorldView { public net.minecraft.world.WorldView wrapperContained; public WorldView(net.minecraft.world.WorldView wrapperContained) { this.wrapperContained = wrapperContained; }

public int getLightLevel(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightLevel(pos.wrapperContained); }
public boolean isChunkLoaded(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isChunkLoaded(pos.wrapperContained); }
public boolean isRegionLoaded(int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { return wrapperContained.isRegionLoaded(minX,minY,minZ,maxX,maxY,maxZ); }
public yarnwrap.world.chunk.Chunk getChunk(int chunkX,int chunkZ,yarnwrap.world.chunk.ChunkStatus status) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(chunkX,chunkZ,status.wrapperContained)); }
public boolean isRegionLoaded(yarnwrap.util.math.BlockPos min,yarnwrap.util.math.BlockPos max) { return wrapperContained.isRegionLoaded(min.wrapperContained,max.wrapperContained); }
public boolean containsFluid(yarnwrap.util.math.Box box) { return wrapperContained.containsFluid(box.wrapperContained); }
public int getLightLevel(yarnwrap.util.math.BlockPos pos,int ambientDarkness) { return wrapperContained.getLightLevel(pos.wrapperContained,ambientDarkness); }
public boolean isAir(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isAir(pos.wrapperContained); }
public boolean isSkyVisibleAllowingSea(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSkyVisibleAllowingSea(pos.wrapperContained); }
public float getBrightness(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBrightness(pos.wrapperContained); }
public yarnwrap.world.chunk.Chunk getChunk(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(pos.wrapperContained)); }
public boolean isWater(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isWater(pos.wrapperContained); }
public yarnwrap.world.biome.source.BiomeAccess getBiomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(wrapperContained.getBiomeAccess()); }
public yarnwrap.registry.entry.RegistryEntry getGeneratorStoredBiome(int biomeX,int biomeY,int biomeZ) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getGeneratorStoredBiome(biomeX,biomeY,biomeZ)); }
public yarnwrap.registry.entry.RegistryEntry getBiome(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiome(pos.wrapperContained)); }
public java.util.stream.Stream getStatesInBoxIfLoaded(yarnwrap.util.math.Box box) { return wrapperContained.getStatesInBoxIfLoaded(box.wrapperContained); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
public boolean isRegionLoaded(int minX,int minZ,int maxX,int maxZ) { return wrapperContained.isRegionLoaded(minX,minZ,maxX,maxZ); }
public boolean isPosLoaded(int x,int z) { return wrapperContained.isPosLoaded(x,z); }
public float getPhototaxisFavor(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPhototaxisFavor(pos.wrapperContained); }
public yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getEnabledFeatures()); }
public yarnwrap.registry.RegistryWrapper createCommandRegistryWrapper(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.registry.RegistryWrapper(wrapperContained.createCommandRegistryWrapper(registryRef.wrapperContained)); }
public yarnwrap.world.chunk.Chunk getChunk(int chunkX,int chunkZ) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(chunkX,chunkZ)); }
public boolean isChunkLoaded(int chunkX,int chunkZ) { return wrapperContained.isChunkLoaded(chunkX,chunkZ); }
public yarnwrap.world.chunk.Chunk getChunk(int chunkX,int chunkZ,yarnwrap.world.chunk.ChunkStatus leastStatus,boolean create) { return new yarnwrap.world.chunk.Chunk(wrapperContained.getChunk(chunkX,chunkZ,leastStatus.wrapperContained,create)); }
public int getAmbientDarkness() { return wrapperContained.getAmbientDarkness(); }
public yarnwrap.world.dimension.DimensionType getDimension() { return new yarnwrap.world.dimension.DimensionType(wrapperContained.getDimension()); }
// public yarnwrap.util.math.BlockPos getTopPosition(Object heightmap,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getTopPosition(heightmap,pos.wrapperContained)); }
public boolean isClient() { return wrapperContained.isClient(); }
public int getSeaLevel() { return wrapperContained.getSeaLevel(); }
// public int getTopY(Object heightmap,int x,int z) { return wrapperContained.getTopY(heightmap,x,z); }

}