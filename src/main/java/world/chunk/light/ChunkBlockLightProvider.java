package yarnwrap.world.chunk.light;
public class ChunkBlockLightProvider { public net.minecraft.world.chunk.light.ChunkBlockLightProvider wrapperContained; public ChunkBlockLightProvider(net.minecraft.world.chunk.light.ChunkBlockLightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object mutablePos() { return wrapperContained.mutablePos; }
// public int getLightSourceLuminance(long blockPos,yarnwrap.block.BlockState blockState) { return wrapperContained.getLightSourceLuminance(blockPos,blockState.wrapperContained); }

}