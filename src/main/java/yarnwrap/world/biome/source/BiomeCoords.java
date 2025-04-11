package yarnwrap.world.biome.source;
public class BiomeCoords { public net.minecraft.world.biome.source.BiomeCoords wrapperContained; public BiomeCoords(net.minecraft.world.biome.source.BiomeCoords wrapperContained) { this.wrapperContained = wrapperContained; }

public int fromBlock(int blockCoord) { return wrapperContained.fromBlock(blockCoord); }
public int toBlock(int biomeCoord) { return wrapperContained.toBlock(biomeCoord); }
public int fromChunk(int chunkCoord) { return wrapperContained.fromChunk(chunkCoord); }
public int toChunk(int biomeCoord) { return wrapperContained.toChunk(biomeCoord); }

}