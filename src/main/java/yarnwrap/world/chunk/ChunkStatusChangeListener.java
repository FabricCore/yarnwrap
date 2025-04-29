package yarnwrap.world.chunk;
public class ChunkStatusChangeListener { public net.minecraft.world.chunk.ChunkStatusChangeListener wrapperContained; public ChunkStatusChangeListener(net.minecraft.world.chunk.ChunkStatusChangeListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onChunkStatusChange(yarnwrap.util.math.ChunkPos pos,yarnwrap.server.world.ChunkLevelType levelType) { wrapperContained.onChunkStatusChange(pos.wrapperContained,levelType.wrapperContained); }
// public static void onChunkStatusChange(yarnwrap.util.math.ChunkPos pos,yarnwrap.server.world.ChunkLevelType levelType, ) { net.minecraft.world.chunk.ChunkStatusChangeListener.onChunkStatusChange(pos.wrapperContained,levelType.wrapperContained); }

}