package yarnwrap.world.gen.chunk;
public class FlatChunkGeneratorLayer { public net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer wrapperContained; public FlatChunkGeneratorLayer(net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int thickness() { return wrapperContained.thickness; }
// public void thickness(int value) { wrapperContained.thickness = value; }
// public static int thickness() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.thickness; }
// public static void thickness(int value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.thickness = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.CODEC = value; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.block); }
// public static void block(yarnwrap.block.Block value, ) { net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.block = value.wrapperContained; }

public FlatChunkGeneratorLayer(int thickness,yarnwrap.block.Block block) { this.wrapperContained = new net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer(thickness,block.wrapperContained); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public static yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.getBlockState()); }
public int getThickness() { return wrapperContained.getThickness(); }
// public static int getThickness() { return net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.getThickness(); }
// public com.mojang.datafixers.kinds.App method_28909(Object instance) { return wrapperContained.method_28909(instance); }
// public static com.mojang.datafixers.kinds.App method_28909(Object instance, ) { return net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.method_28909(instance); }
// public yarnwrap.block.Block method_28910(yarnwrap.world.gen.chunk.FlatChunkGeneratorLayer layer) { return new yarnwrap.block.Block(wrapperContained.method_28910(layer.wrapperContained)); }
// public static yarnwrap.block.Block method_28910(yarnwrap.world.gen.chunk.FlatChunkGeneratorLayer layer, ) { return new yarnwrap.block.Block(net.minecraft.world.gen.chunk.FlatChunkGeneratorLayer.method_28910(layer.wrapperContained)); }

}