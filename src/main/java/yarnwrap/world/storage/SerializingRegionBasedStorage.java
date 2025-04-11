package yarnwrap.world.storage;
public class SerializingRegionBasedStorage { public net.minecraft.world.storage.SerializingRegionBasedStorage wrapperContained; public SerializingRegionBasedStorage(net.minecraft.world.storage.SerializingRegionBasedStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap loadedElements() { return wrapperContained.loadedElements; }
// public void loadedElements(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.loadedElements = value; }
// public it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet unsavedElements() { return wrapperContained.unsavedElements; }
// public void unsavedElements(it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet value) { wrapperContained.unsavedElements = value; }
// public java.util.function.Function factory() { return wrapperContained.factory; }
// public void factory(java.util.function.Function value) { wrapperContained.factory = value; }
// public java.util.function.Function codecFactory() { return wrapperContained.codecFactory; }
// public void codecFactory(java.util.function.Function value) { wrapperContained.codecFactory = value; }
// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public void world(yarnwrap.world.HeightLimitView value) { wrapperContained.world = value.wrapperContained; }
// public java.lang.String SECTIONS_KEY() { return wrapperContained.SECTIONS_KEY; }
// public void SECTIONS_KEY(java.lang.String value) { wrapperContained.SECTIONS_KEY = value; }
// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public yarnwrap.world.storage.ChunkPosKeyedStorage storageAccess() { return new yarnwrap.world.storage.ChunkPosKeyedStorage(wrapperContained.storageAccess); }
// public void storageAccess(yarnwrap.world.storage.ChunkPosKeyedStorage value) { wrapperContained.storageAccess = value.wrapperContained; }
// public yarnwrap.server.world.ChunkErrorHandler errorHandler() { return new yarnwrap.server.world.ChunkErrorHandler(wrapperContained.errorHandler); }
// public void errorHandler(yarnwrap.server.world.ChunkErrorHandler value) { wrapperContained.errorHandler = value.wrapperContained; }
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