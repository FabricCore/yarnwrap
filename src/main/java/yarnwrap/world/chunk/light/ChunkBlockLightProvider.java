package yarnwrap.world.chunk.light;
public class ChunkBlockLightProvider { public net.minecraft.world.chunk.light.ChunkBlockLightProvider wrapperContained; public ChunkBlockLightProvider(net.minecraft.world.chunk.light.ChunkBlockLightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object mutablePos() { return wrapperContained.mutablePos; }
// // public void mutablePos(Object value) { wrapperContained.mutablePos = value; }
// // public static Object mutablePos() { return net.minecraft.world.chunk.light.ChunkBlockLightProvider.mutablePos; }
// // public static void mutablePos(Object value, ) { net.minecraft.world.chunk.light.ChunkBlockLightProvider.mutablePos = value; }

public ChunkBlockLightProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider) { this.wrapperContained = new net.minecraft.world.chunk.light.ChunkBlockLightProvider(chunkProvider.wrapperContained); }
public ChunkBlockLightProvider(yarnwrap.world.chunk.ChunkProvider chunkProvider,yarnwrap.world.chunk.light.BlockLightStorage blockLightStorage) { this.wrapperContained = new net.minecraft.world.chunk.light.ChunkBlockLightProvider(chunkProvider.wrapperContained,blockLightStorage.wrapperContained); }
// public int getLightSourceLuminance(long blockPos,yarnwrap.block.BlockState blockState) { return wrapperContained.getLightSourceLuminance(blockPos,blockState.wrapperContained); }
// public static int getLightSourceLuminance(long blockPos,yarnwrap.block.BlockState blockState, ) { return net.minecraft.world.chunk.light.ChunkBlockLightProvider.getLightSourceLuminance(blockPos,blockState.wrapperContained); }
// public void method_51532(yarnwrap.util.math.BlockPos blockPos,yarnwrap.block.BlockState blockState) { wrapperContained.method_51532(blockPos.wrapperContained,blockState.wrapperContained); }
// public static void method_51532(yarnwrap.util.math.BlockPos blockPos,yarnwrap.block.BlockState blockState, ) { net.minecraft.world.chunk.light.ChunkBlockLightProvider.method_51532(blockPos.wrapperContained,blockState.wrapperContained); }

}