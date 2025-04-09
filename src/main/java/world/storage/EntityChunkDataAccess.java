package yarnwrap.world.storage;
public class EntityChunkDataAccess { public net.minecraft.world.storage.EntityChunkDataAccess wrapperContained; public EntityChunkDataAccess(net.minecraft.world.storage.EntityChunkDataAccess wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public it.unimi.dsi.fastutil.longs.LongSet emptyChunks() { return wrapperContained.emptyChunks; }
// public java.lang.String ENTITIES_KEY() { return wrapperContained.ENTITIES_KEY; }
// public java.lang.String POSITION_KEY() { return wrapperContained.POSITION_KEY; }
// public yarnwrap.util.thread.TaskExecutor taskExecutor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.taskExecutor); }
// public yarnwrap.world.storage.ChunkPosKeyedStorage storage() { return new yarnwrap.world.storage.ChunkPosKeyedStorage(wrapperContained.storage); }
// public void putChunkPos(yarnwrap.nbt.NbtCompound chunkNbt,yarnwrap.util.math.ChunkPos pos) { wrapperContained.putChunkPos(chunkNbt.wrapperContained,pos.wrapperContained); }
// public yarnwrap.world.storage.ChunkDataList emptyDataList(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.storage.ChunkDataList(wrapperContained.emptyDataList(pos.wrapperContained)); }
// public yarnwrap.util.math.ChunkPos getChunkPos(yarnwrap.nbt.NbtCompound chunkNbt) { return new yarnwrap.util.math.ChunkPos(wrapperContained.getChunkPos(chunkNbt.wrapperContained)); }
// public void handleSaveFailure(java.util.concurrent.CompletableFuture future,yarnwrap.util.math.ChunkPos pos) { wrapperContained.handleSaveFailure(future,pos.wrapperContained); }
// public void handleLoadFailure(java.util.concurrent.CompletableFuture future,yarnwrap.util.math.ChunkPos pos) { wrapperContained.handleLoadFailure(future,pos.wrapperContained); }

}