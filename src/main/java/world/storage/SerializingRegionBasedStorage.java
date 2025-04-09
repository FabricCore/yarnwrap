package yarnwrap.world.storage;
public class SerializingRegionBasedStorage { public net.minecraft.world.storage.SerializingRegionBasedStorage wrapperContained; public SerializingRegionBasedStorage(net.minecraft.world.storage.SerializingRegionBasedStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap loadedElements() { return wrapperContained.loadedElements; }
// public it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet unsavedElements() { return wrapperContained.unsavedElements; }
// public java.util.function.Function factory() { return wrapperContained.factory; }
// public java.util.function.Function codecFactory() { return wrapperContained.codecFactory; }
// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public java.lang.String SECTIONS_KEY() { return wrapperContained.SECTIONS_KEY; }
// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public yarnwrap.world.storage.ChunkPosKeyedStorage storageAccess() { return new yarnwrap.world.storage.ChunkPosKeyedStorage(wrapperContained.storageAccess); }
// public yarnwrap.server.world.ChunkErrorHandler errorHandler() { return new yarnwrap.server.world.ChunkErrorHandler(wrapperContained.errorHandler); }
// public void onUpdate(long pos) { wrapperContained.onUpdate(pos); }
// public void loadDataAt(yarnwrap.util.math.ChunkPos pos) { wrapperContained.loadDataAt(pos.wrapperContained); }
// public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }
// public void onLoad(long pos) { wrapperContained.onLoad(pos); }
// public boolean isPosInvalid(long pos) { return wrapperContained.isPosInvalid(pos); }
// public java.util.Optional getIfLoaded(long pos) { return wrapperContained.getIfLoaded(pos); }
// public java.util.Optional get(long pos) { return wrapperContained.get(pos); }
// public java.lang.Object getOrCreate(long pos) { return wrapperContained.getOrCreate(pos); }
// public com.mojang.serialization.Dynamic serialize(yarnwrap.util.math.ChunkPos chunkPos,com.mojang.serialization.DynamicOps ops) { return wrapperContained.serialize(chunkPos.wrapperContained,ops); }
// public void update(yarnwrap.util.math.ChunkPos pos,yarnwrap.registry.RegistryOps ops,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.update(pos.wrapperContained,ops.wrapperContained,nbt.wrapperContained); }
// public int getDataVersion(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.getDataVersion(dynamic); }
// public void save(yarnwrap.util.math.ChunkPos pos) { wrapperContained.save(pos.wrapperContained); }
public void saveChunk(yarnwrap.util.math.ChunkPos pos) { wrapperContained.saveChunk(pos.wrapperContained); }
// public java.util.concurrent.CompletableFuture loadNbt(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.loadNbt(pos.wrapperContained); }
// public long chunkSectionPosAsLong(yarnwrap.util.math.ChunkPos chunkPos,int y) { return wrapperContained.chunkSectionPosAsLong(chunkPos.wrapperContained,y); }
public boolean hasUnsavedElements() { return wrapperContained.hasUnsavedElements(); }

}