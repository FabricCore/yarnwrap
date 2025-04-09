package yarnwrap.util.math.random;
public class ChunkRandom { public net.minecraft.util.math.random.ChunkRandom wrapperContained; public ChunkRandom(net.minecraft.util.math.random.ChunkRandom wrapperContained) { this.wrapperContained = wrapperContained; }

// public int sampleCount() { return wrapperContained.sampleCount; }
// public yarnwrap.util.math.random.Random baseRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.baseRandom); }
public long setPopulationSeed(long worldSeed,int blockX,int blockZ) { return wrapperContained.setPopulationSeed(worldSeed,blockX,blockZ); }
public yarnwrap.util.math.random.Random getSlimeRandom(int chunkX,int chunkZ,long worldSeed,long scrambler) { return new yarnwrap.util.math.random.Random(wrapperContained.getSlimeRandom(chunkX,chunkZ,worldSeed,scrambler)); }
public void setCarverSeed(long worldSeed,int chunkX,int chunkZ) { wrapperContained.setCarverSeed(worldSeed,chunkX,chunkZ); }
public void setDecoratorSeed(long populationSeed,int index,int step) { wrapperContained.setDecoratorSeed(populationSeed,index,step); }
public void setRegionSeed(long worldSeed,int regionX,int regionZ,int salt) { wrapperContained.setRegionSeed(worldSeed,regionX,regionZ,salt); }
public int getSampleCount() { return wrapperContained.getSampleCount(); }

}