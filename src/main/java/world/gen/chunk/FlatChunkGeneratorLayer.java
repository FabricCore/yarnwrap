package yarnwrap.world.gen.chunk;
public class FlatChunkGeneratorLayer { public net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer wrapperContained; public FlatChunkGeneratorLayer(net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int thickness() { return wrapperContained.thickness; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public int getThickness() { return wrapperContained.getThickness(); }

}