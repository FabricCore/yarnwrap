package yarnwrap.world.chunk.light;
public class BlockLightStorage { public net.minecraft.world.chunk.light.BlockLightStorage wrapperContained; public BlockLightStorage(net.minecraft.world.chunk.light.BlockLightStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public BlockLightStorage(yarnwrap.world.chunk.ChunkProvider chunkProvider) { this.wrapperContained = new net.minecraft.world.chunk.light.BlockLightStorage(chunkProvider.wrapperContained); }

}