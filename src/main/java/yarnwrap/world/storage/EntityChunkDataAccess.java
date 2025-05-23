package yarnwrap.world.storage;
public class EntityChunkDataAccess { public net.minecraft.world.storage.EntityChunkDataAccess wrapperContained; public EntityChunkDataAccess(net.minecraft.world.storage.EntityChunkDataAccess wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.storage.EntityChunkDataAccess.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.storage.EntityChunkDataAccess.LOGGER = value; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.storage.EntityChunkDataAccess.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.world.storage.EntityChunkDataAccess.world = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.LongSet emptyChunks() { return wrapperContained.emptyChunks; }
// public void emptyChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.emptyChunks = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet emptyChunks() { return net.minecraft.world.storage.EntityChunkDataAccess.emptyChunks; }
// public static void emptyChunks(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.world.storage.EntityChunkDataAccess.emptyChunks = value; }

// public java.lang.String ENTITIES_KEY() { return wrapperContained.ENTITIES_KEY; }
// public void ENTITIES_KEY(java.lang.String value) { wrapperContained.ENTITIES_KEY = value; }
// public static java.lang.String ENTITIES_KEY() { return net.minecraft.world.storage.EntityChunkDataAccess.ENTITIES_KEY; }
// public static void ENTITIES_KEY(java.lang.String value, ) { net.minecraft.world.storage.EntityChunkDataAccess.ENTITIES_KEY = value; }

// public java.lang.String POSITION_KEY() { return wrapperContained.POSITION_KEY; }
// public void POSITION_KEY(java.lang.String value) { wrapperContained.POSITION_KEY = value; }
// public static java.lang.String POSITION_KEY() { return net.minecraft.world.storage.EntityChunkDataAccess.POSITION_KEY; }
// public static void POSITION_KEY(java.lang.String value, ) { net.minecraft.world.storage.EntityChunkDataAccess.POSITION_KEY = value; }

// public yarnwrap.util.thread.SimpleConsecutiveExecutor taskExecutor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(wrapperContained.taskExecutor); }
// public void taskExecutor(yarnwrap.util.thread.SimpleConsecutiveExecutor value) { wrapperContained.taskExecutor = value.wrapperContained; }
// public static yarnwrap.util.thread.SimpleConsecutiveExecutor taskExecutor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(net.minecraft.world.storage.EntityChunkDataAccess.taskExecutor); }
// public static void taskExecutor(yarnwrap.util.thread.SimpleConsecutiveExecutor value, ) { net.minecraft.world.storage.EntityChunkDataAccess.taskExecutor = value.wrapperContained; }

// public yarnwrap.world.storage.ChunkPosKeyedStorage storage() { return new yarnwrap.world.storage.ChunkPosKeyedStorage(wrapperContained.storage); }
// public void storage(yarnwrap.world.storage.ChunkPosKeyedStorage value) { wrapperContained.storage = value.wrapperContained; }
// public static yarnwrap.world.storage.ChunkPosKeyedStorage storage() { return new yarnwrap.world.storage.ChunkPosKeyedStorage(net.minecraft.world.storage.EntityChunkDataAccess.storage); }
// public static void storage(yarnwrap.world.storage.ChunkPosKeyedStorage value, ) { net.minecraft.world.storage.EntityChunkDataAccess.storage = value.wrapperContained; }

public EntityChunkDataAccess(yarnwrap.world.storage.ChunkPosKeyedStorage storage,yarnwrap.server.world.ServerWorld world,java.util.concurrent.Executor executor) { this.wrapperContained = new net.minecraft.world.storage.EntityChunkDataAccess(storage.wrapperContained,world.wrapperContained,executor); }
// public yarnwrap.world.storage.ChunkDataList method_31731(yarnwrap.util.math.ChunkPos nbt) { return new yarnwrap.world.storage.ChunkDataList(wrapperContained.method_31731(nbt.wrapperContained)); }
// public static yarnwrap.world.storage.ChunkDataList method_31731(yarnwrap.util.math.ChunkPos nbt, ) { return new yarnwrap.world.storage.ChunkDataList(net.minecraft.world.storage.EntityChunkDataAccess.method_31731(nbt.wrapperContained)); }
// public yarnwrap.world.storage.ChunkDataList emptyDataList(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.storage.ChunkDataList(wrapperContained.emptyDataList(pos.wrapperContained)); }
// public static yarnwrap.world.storage.ChunkDataList emptyDataList(yarnwrap.util.math.ChunkPos pos, ) { return new yarnwrap.world.storage.ChunkDataList(net.minecraft.world.storage.EntityChunkDataAccess.emptyDataList(pos.wrapperContained)); }
// public java.lang.Object method_61000(yarnwrap.util.math.ChunkPos throwable) { return wrapperContained.method_61000(throwable.wrapperContained); }
// public static java.lang.Object method_61000(yarnwrap.util.math.ChunkPos throwable, ) { return net.minecraft.world.storage.EntityChunkDataAccess.method_61000(throwable.wrapperContained); }
// public void handleSaveFailure(java.util.concurrent.CompletableFuture future,yarnwrap.util.math.ChunkPos pos) { wrapperContained.handleSaveFailure(future,pos.wrapperContained); }
// public static void handleSaveFailure(java.util.concurrent.CompletableFuture future,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.world.storage.EntityChunkDataAccess.handleSaveFailure(future,pos.wrapperContained); }
// public java.lang.Object method_61002(yarnwrap.util.math.ChunkPos throwable) { return wrapperContained.method_61002(throwable.wrapperContained); }
// public static java.lang.Object method_61002(yarnwrap.util.math.ChunkPos throwable, ) { return net.minecraft.world.storage.EntityChunkDataAccess.method_61002(throwable.wrapperContained); }
// public void handleLoadFailure(java.util.concurrent.CompletableFuture future,yarnwrap.util.math.ChunkPos pos) { wrapperContained.handleLoadFailure(future,pos.wrapperContained); }
// public static void handleLoadFailure(java.util.concurrent.CompletableFuture future,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.world.storage.EntityChunkDataAccess.handleLoadFailure(future,pos.wrapperContained); }

}