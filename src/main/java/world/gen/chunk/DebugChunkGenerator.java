package yarnwrap.world.gen.chunk;
public class DebugChunkGenerator { public net.minecraft.world.gen.chunk.DebugChunkGenerator wrapperContained; public DebugChunkGenerator(net.minecraft.world.gen.chunk.DebugChunkGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int Z_SIDE_LENGTH() { return wrapperContained.Z_SIDE_LENGTH; }
// public int X_SIDE_LENGTH() { return wrapperContained.X_SIDE_LENGTH; }
// public yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(wrapperContained.AIR); }
// public java.util.List BLOCK_STATES() { return wrapperContained.BLOCK_STATES; }
// public yarnwrap.block.BlockState BARRIER() { return new yarnwrap.block.BlockState(wrapperContained.BARRIER); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.block.BlockState getBlockState(int x,int z) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(x,z)); }

}