package yarnwrap.world.gen.chunk;
public class AquiferSampler { public net.minecraft.world.gen.chunk.AquiferSampler wrapperContained; public AquiferSampler(net.minecraft.world.gen.chunk.AquiferSampler wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean needsFluidTick() { return wrapperContained.needsFluidTick(); }
// public yarnwrap.world.gen.chunk.AquiferSampler seaLevel(Object fluidLevelSampler) { return new yarnwrap.world.gen.chunk.AquiferSampler(wrapperContained.seaLevel(fluidLevelSampler)); }
// public yarnwrap.world.gen.chunk.AquiferSampler aquifer(yarnwrap.world.gen.chunk.ChunkNoiseSampler chunkNoiseSampler,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.gen.noise.NoiseRouter noiseRouter,yarnwrap.util.math.random.RandomSplitter randomSplitter,int minimumY,int height,Object fluidLevelSampler) { return new yarnwrap.world.gen.chunk.AquiferSampler(wrapperContained.aquifer(chunkNoiseSampler.wrapperContained,chunkPos.wrapperContained,noiseRouter.wrapperContained,randomSplitter.wrapperContained,minimumY,height,fluidLevelSampler)); }
// public yarnwrap.block.BlockState apply(Object pos,double density) { return new yarnwrap.block.BlockState(wrapperContained.apply(pos,density)); }

}