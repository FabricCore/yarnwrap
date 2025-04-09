package yarnwrap.world.storage;
public class ChunkDataAccess { public net.minecraft.world.storage.ChunkDataAccess wrapperContained; public ChunkDataAccess(net.minecraft.world.storage.ChunkDataAccess wrapperContained) { this.wrapperContained = wrapperContained; }

public void awaitAll(boolean sync) { wrapperContained.awaitAll(sync); }
public java.util.concurrent.CompletableFuture readChunkData(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.readChunkData(pos.wrapperContained); }
public void writeChunkData(yarnwrap.world.storage.ChunkDataList dataList) { wrapperContained.writeChunkData(dataList.wrapperContained); }

}