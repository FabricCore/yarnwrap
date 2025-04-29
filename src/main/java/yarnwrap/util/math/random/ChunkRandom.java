package yarnwrap.util.math.random;
public class ChunkRandom { public net.minecraft.util.math.random.ChunkRandom wrapperContained; public ChunkRandom(net.minecraft.util.math.random.ChunkRandom wrapperContained) { this.wrapperContained = wrapperContained; }

// public int sampleCount() { return wrapperContained.sampleCount; }
// public void sampleCount(int value) { wrapperContained.sampleCount = value; }
// public static int sampleCount() { return net.minecraft.util.math.random.ChunkRandom.sampleCount; }
// public static void sampleCount(int value, ) { net.minecraft.util.math.random.ChunkRandom.sampleCount = value; }

// public yarnwrap.util.math.random.Random baseRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.baseRandom); }
// public void baseRandom(yarnwrap.util.math.random.Random value) { wrapperContained.baseRandom = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random baseRandom() { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.ChunkRandom.baseRandom); }
// public static void baseRandom(yarnwrap.util.math.random.Random value, ) { net.minecraft.util.math.random.ChunkRandom.baseRandom = value.wrapperContained; }

public ChunkRandom(yarnwrap.util.math.random.Random baseRandom) { this.wrapperContained = new net.minecraft.util.math.random.ChunkRandom(baseRandom.wrapperContained); }
public long setPopulationSeed(long worldSeed,int blockX,int blockZ) { return wrapperContained.setPopulationSeed(worldSeed,blockX,blockZ); }
// public static long setPopulationSeed(long worldSeed,int blockX,int blockZ, ) { return net.minecraft.util.math.random.ChunkRandom.setPopulationSeed(worldSeed,blockX,blockZ); }
// public yarnwrap.util.math.random.Random getSlimeRandom(int chunkX,int chunkZ,long worldSeed,long scrambler) { return new yarnwrap.util.math.random.Random(wrapperContained.getSlimeRandom(chunkX,chunkZ,worldSeed,scrambler)); }
// public static yarnwrap.util.math.random.Random getSlimeRandom(int chunkX,int chunkZ,long worldSeed,long scrambler, ) { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.ChunkRandom.getSlimeRandom(chunkX,chunkZ,worldSeed,scrambler)); }
public void setCarverSeed(long worldSeed,int chunkX,int chunkZ) { wrapperContained.setCarverSeed(worldSeed,chunkX,chunkZ); }
// public static void setCarverSeed(long worldSeed,int chunkX,int chunkZ, ) { net.minecraft.util.math.random.ChunkRandom.setCarverSeed(worldSeed,chunkX,chunkZ); }
public void setDecoratorSeed(long populationSeed,int index,int step) { wrapperContained.setDecoratorSeed(populationSeed,index,step); }
// public static void setDecoratorSeed(long populationSeed,int index,int step, ) { net.minecraft.util.math.random.ChunkRandom.setDecoratorSeed(populationSeed,index,step); }
public void setRegionSeed(long worldSeed,int regionX,int regionZ,int salt) { wrapperContained.setRegionSeed(worldSeed,regionX,regionZ,salt); }
// public static void setRegionSeed(long worldSeed,int regionX,int regionZ,int salt, ) { net.minecraft.util.math.random.ChunkRandom.setRegionSeed(worldSeed,regionX,regionZ,salt); }
public int getSampleCount() { return wrapperContained.getSampleCount(); }
// public static int getSampleCount() { return net.minecraft.util.math.random.ChunkRandom.getSampleCount(); }

}