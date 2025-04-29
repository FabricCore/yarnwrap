package yarnwrap.world.storage;
public class ChunkDataAccess { public net.minecraft.world.storage.ChunkDataAccess wrapperContained; public ChunkDataAccess(net.minecraft.world.storage.ChunkDataAccess wrapperContained) { this.wrapperContained = wrapperContained; }

public void awaitAll(boolean sync) { wrapperContained.awaitAll(sync); }
// public static void awaitAll(boolean sync, ) { net.minecraft.world.storage.ChunkDataAccess.awaitAll(sync); }
public java.util.concurrent.CompletableFuture readChunkData(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.readChunkData(pos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture readChunkData(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.ChunkDataAccess.readChunkData(pos.wrapperContained); }
public void writeChunkData(yarnwrap.world.storage.ChunkDataList dataList) { wrapperContained.writeChunkData(dataList.wrapperContained); }
// public static void writeChunkData(yarnwrap.world.storage.ChunkDataList dataList, ) { net.minecraft.world.storage.ChunkDataAccess.writeChunkData(dataList.wrapperContained); }

}