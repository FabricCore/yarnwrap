package yarnwrap.world.gen.chunk;
public class FlatChunkGeneratorLayer { public net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer wrapperContained; public FlatChunkGeneratorLayer(net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int thickness() { return wrapperContained.thickness; }
// public void thickness(int value) { wrapperContained.thickness = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
public FlatChunkGeneratorLayer(int thickness,yarnwrap.block.Block block) { this.wrapperContained = new net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer(thickness,block.wrapperContained); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public int getThickness() { return wrapperContained.getThickness(); }
// public com.mojang.datafixers.kinds.App method_28909(Object instance) { return wrapperContained.method_28909(instance); }
// public yarnwrap.block.Block method_28910(yarnwrap.world.gen.chunk.FlatChunkGeneratorLayer layer) { return new yarnwrap.block.Block(wrapperContained.method_28910(layer.wrapperContained)); }

}