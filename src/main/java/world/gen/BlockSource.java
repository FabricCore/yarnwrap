package yarnwrap.world.gen;
public class BlockSource { public net.minecraft.world.gen.BlockSource wrapperContained; public BlockSource(net.minecraft.world.gen.BlockSource wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockState apply(yarnwrap.world.gen.chunk.ChunkNoiseSampler sampler,int x,int y,int z) { return new yarnwrap.block.BlockState(wrapperContained.apply(sampler.wrapperContained,x,y,z)); }

}