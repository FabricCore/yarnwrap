package yarnwrap.world.storage;
public class EntityChunkDataAccess { public net.minecraft.world.storage.EntityChunkDataAccess wrapperContained; public EntityChunkDataAccess(net.minecraft.world.storage.EntityChunkDataAccess wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public it.unimi.dsi.fastutil.longs.LongSet emptyChunks() { return wrapperContained.emptyChunks; }
// public void emptyChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.emptyChunks = value; }
// public java.lang.String ENTITIES_KEY() { return wrapperContained.ENTITIES_KEY; }
// public void ENTITIES_KEY(java.lang.String value) { wrapperContained.ENTITIES_KEY = value; }
// public java.lang.String POSITION_KEY() { return wrapperContained.POSITION_KEY; }
// public void POSITION_KEY(java.lang.String value) { wrapperContained.POSITION_KEY = value; }
// public yarnwrap.util.thread.TaskExecutor taskExecutor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.taskExecutor); }
// public void taskExecutor(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.taskExecutor = value.wrapperContained; }
// public yarnwrap.world.storage.ChunkPosKeyedStorage storage() { return new yarnwrap.world.storage.ChunkPosKeyedStorage(wrapperContained.storage); }
// public void storage(yarnwrap.world.storage.ChunkPosKeyedStorage value) { wrapperContained.storage = value.wrapperContained; }
// public void putChunkPos(yarnwrap.nbt.NbtCompound chunkNbt,yarnwrap.util.math.ChunkPos pos) { wrapperContained.putChunkPos(chunkNbt.wrapperContained,pos.wrapperContained); }
// public yarnwrap.world.storage.ChunkDataList emptyDataList(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.storage.ChunkDataList(wrapperContained.emptyDataList(pos.wrapperContained)); }
// public yarnwrap.util.math.ChunkPos getChunkPos(yarnwrap.nbt.NbtCompound chunkNbt) { return new yarnwrap.util.math.ChunkPos(wrapperContained.getChunkPos(chunkNbt.wrapperContained)); }
// public void handleSaveFailure(java.util.concurrent.CompletableFuture future,yarnwrap.util.math.ChunkPos pos) { wrapperContained.handleSaveFailure(future,pos.wrapperContained); }
// public void handleLoadFailure(java.util.concurrent.CompletableFuture future,yarnwrap.util.math.ChunkPos pos) { wrapperContained.handleLoadFailure(future,pos.wrapperContained); }

}