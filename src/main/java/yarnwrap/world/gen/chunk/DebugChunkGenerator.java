package yarnwrap.world.gen.chunk;
public class DebugChunkGenerator { public net.minecraft.world.gen.chunk.DebugChunkGenerator wrapperContained; public DebugChunkGenerator(net.minecraft.world.gen.chunk.DebugChunkGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int Z_SIDE_LENGTH() { return wrapperContained.Z_SIDE_LENGTH; }
// public void Z_SIDE_LENGTH(int value) { wrapperContained.Z_SIDE_LENGTH = value; }
// public int X_SIDE_LENGTH() { return wrapperContained.X_SIDE_LENGTH; }
// public void X_SIDE_LENGTH(int value) { wrapperContained.X_SIDE_LENGTH = value; }
// public yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(wrapperContained.AIR); }
// public void AIR(yarnwrap.block.BlockState value) { wrapperContained.AIR = value.wrapperContained; }
// public java.util.List BLOCK_STATES() { return wrapperContained.BLOCK_STATES; }
// public void BLOCK_STATES(java.util.List value) { wrapperContained.BLOCK_STATES = value; }
// public yarnwrap.block.BlockState BARRIER() { return new yarnwrap.block.BlockState(wrapperContained.BARRIER); }
// public void BARRIER(yarnwrap.block.BlockState value) { wrapperContained.BARRIER = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public DebugChunkGenerator(Object biomeEntry) { this.wrapperContained = new net.minecraft.world.gen.chunk.DebugChunkGenerator(biomeEntry); }
public yarnwrap.block.BlockState getBlockState(int x,int z) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(x,z)); }
// public java.util.stream.Stream method_12579(yarnwrap.block.Block block) { return wrapperContained.method_12579(block.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_40465(Object instance) { return wrapperContained.method_40465(instance); }

}