package yarnwrap.world.storage;
public class SerializingRegionBasedStorage { public net.minecraft.world.storage.SerializingRegionBasedStorage wrapperContained; public SerializingRegionBasedStorage(net.minecraft.world.storage.SerializingRegionBasedStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.storage.SerializingRegionBasedStorage.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.LOGGER = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap loadedElements() { return wrapperContained.loadedElements; }
// public void loadedElements(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.loadedElements = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap loadedElements() { return net.minecraft.world.storage.SerializingRegionBasedStorage.loadedElements; }
// public static void loadedElements(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.loadedElements = value; }

// public it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet unsavedElements() { return wrapperContained.unsavedElements; }
// public void unsavedElements(it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet value) { wrapperContained.unsavedElements = value; }
// public static it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet unsavedElements() { return net.minecraft.world.storage.SerializingRegionBasedStorage.unsavedElements; }
// public static void unsavedElements(it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.unsavedElements = value; }

// public java.util.function.Function factory() { return wrapperContained.factory; }
// public void factory(java.util.function.Function value) { wrapperContained.factory = value; }
// public static java.util.function.Function factory() { return net.minecraft.world.storage.SerializingRegionBasedStorage.factory; }
// public static void factory(java.util.function.Function value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.factory = value; }

// public java.util.function.Function codecFactory() { return wrapperContained.codecFactory; }
// public void codecFactory(java.util.function.Function value) { wrapperContained.codecFactory = value; }
// public static java.util.function.Function codecFactory() { return net.minecraft.world.storage.SerializingRegionBasedStorage.codecFactory; }
// public static void codecFactory(java.util.function.Function value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.codecFactory = value; }

// public yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(wrapperContained.world); }
// public void world(yarnwrap.world.HeightLimitView value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.HeightLimitView world() { return new yarnwrap.world.HeightLimitView(net.minecraft.world.storage.SerializingRegionBasedStorage.world); }
// public static void world(yarnwrap.world.HeightLimitView value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.world = value.wrapperContained; }

// public java.lang.String SECTIONS_KEY() { return wrapperContained.SECTIONS_KEY; }
// public void SECTIONS_KEY(java.lang.String value) { wrapperContained.SECTIONS_KEY = value; }
// public static java.lang.String SECTIONS_KEY() { return net.minecraft.world.storage.SerializingRegionBasedStorage.SECTIONS_KEY; }
// public static void SECTIONS_KEY(java.lang.String value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.SECTIONS_KEY = value; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public static yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.world.storage.SerializingRegionBasedStorage.registryManager); }
// public static void registryManager(yarnwrap.registry.DynamicRegistryManager value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.registryManager = value.wrapperContained; }

// public yarnwrap.world.storage.ChunkPosKeyedStorage storageAccess() { return new yarnwrap.world.storage.ChunkPosKeyedStorage(wrapperContained.storageAccess); }
// public void storageAccess(yarnwrap.world.storage.ChunkPosKeyedStorage value) { wrapperContained.storageAccess = value.wrapperContained; }
// public static yarnwrap.world.storage.ChunkPosKeyedStorage storageAccess() { return new yarnwrap.world.storage.ChunkPosKeyedStorage(net.minecraft.world.storage.SerializingRegionBasedStorage.storageAccess); }
// public static void storageAccess(yarnwrap.world.storage.ChunkPosKeyedStorage value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.storageAccess = value.wrapperContained; }

// public yarnwrap.server.world.ChunkErrorHandler errorHandler() { return new yarnwrap.server.world.ChunkErrorHandler(wrapperContained.errorHandler); }
// public void errorHandler(yarnwrap.server.world.ChunkErrorHandler value) { wrapperContained.errorHandler = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkErrorHandler errorHandler() { return new yarnwrap.server.world.ChunkErrorHandler(net.minecraft.world.storage.SerializingRegionBasedStorage.errorHandler); }
// public static void errorHandler(yarnwrap.server.world.ChunkErrorHandler value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.errorHandler = value.wrapperContained; }

public SerializingRegionBasedStorage(yarnwrap.world.storage.ChunkPosKeyedStorage storageAccess,java.util.function.Function codecFactory,java.util.function.Function factory,yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.server.world.ChunkErrorHandler errorHandler,yarnwrap.world.HeightLimitView world) { this.wrapperContained = new net.minecraft.world.storage.SerializingRegionBasedStorage(storageAccess.wrapperContained,codecFactory,factory,registryManager.wrapperContained,errorHandler.wrapperContained,world.wrapperContained); }
// public void onUpdate(long pos) { wrapperContained.onUpdate(pos); }
// public static void onUpdate(long pos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.onUpdate(pos); }
// public void loadDataAt(yarnwrap.util.math.ChunkPos pos) { wrapperContained.loadDataAt(pos.wrapperContained); }
// public static void loadDataAt(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.loadDataAt(pos.wrapperContained); }
// public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }
// public static void tick(java.util.function.BooleanSupplier shouldKeepTicking, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.tick(shouldKeepTicking); }
// public void onLoad(long pos) { wrapperContained.onLoad(pos); }
// public static void onLoad(long pos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.onLoad(pos); }
// public boolean isPosInvalid(long pos) { return wrapperContained.isPosInvalid(pos); }
// public static boolean isPosInvalid(long pos, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.isPosInvalid(pos); }
// public java.util.Optional getIfLoaded(long pos) { return wrapperContained.getIfLoaded(pos); }
// public static java.util.Optional getIfLoaded(long pos, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.getIfLoaded(pos); }
// public java.util.Optional get(long pos) { return wrapperContained.get(pos); }
// public static java.util.Optional get(long pos, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.get(pos); }
// public java.lang.Object getOrCreate(long pos) { return wrapperContained.getOrCreate(pos); }
// public static java.lang.Object getOrCreate(long pos, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.getOrCreate(pos); }
// public void method_20366(long sections) { wrapperContained.method_20366(sections); }
// public static void method_20366(long sections, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.method_20366(sections); }
// public com.mojang.serialization.Dynamic serialize(yarnwrap.util.math.ChunkPos chunkPos,com.mojang.serialization.DynamicOps ops) { return wrapperContained.serialize(chunkPos.wrapperContained,ops); }
// public static com.mojang.serialization.Dynamic serialize(yarnwrap.util.math.ChunkPos chunkPos,com.mojang.serialization.DynamicOps ops, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.serialize(chunkPos.wrapperContained,ops); }
// public void update(yarnwrap.util.math.ChunkPos pos,yarnwrap.registry.RegistryOps ops,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.update(pos.wrapperContained,ops.wrapperContained,nbt.wrapperContained); }
// public static void update(yarnwrap.util.math.ChunkPos pos,yarnwrap.registry.RegistryOps ops,yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.update(pos.wrapperContained,ops.wrapperContained,nbt.wrapperContained); }
// public int getDataVersion(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.getDataVersion(dynamic); }
// public static int getDataVersion(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.getDataVersion(dynamic); }
// public void save(yarnwrap.util.math.ChunkPos pos) { wrapperContained.save(pos.wrapperContained); }
// public static void save(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.save(pos.wrapperContained); }
public void saveChunk(yarnwrap.util.math.ChunkPos pos) { wrapperContained.saveChunk(pos.wrapperContained); }
// public static void saveChunk(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.saveChunk(pos.wrapperContained); }
// public java.util.concurrent.CompletableFuture loadNbt(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.loadNbt(pos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture loadNbt(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.loadNbt(pos.wrapperContained); }
// public java.util.Optional method_28511(long dynamic) { return wrapperContained.method_28511(dynamic); }
// public static java.util.Optional method_28511(long dynamic, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_28511(dynamic); }
// public void method_28512(java.util.Map object) { wrapperContained.method_28512(object); }
// public static void method_28512(java.util.Map object, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.method_28512(object); }
// public long chunkSectionPosAsLong(yarnwrap.util.math.ChunkPos chunkPos,int y) { return wrapperContained.chunkSectionPosAsLong(chunkPos.wrapperContained,y); }
// public static long chunkSectionPosAsLong(yarnwrap.util.math.ChunkPos chunkPos,int y, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.chunkSectionPosAsLong(chunkPos.wrapperContained,y); }
public boolean hasUnsavedElements() { return wrapperContained.hasUnsavedElements(); }
// public static boolean hasUnsavedElements() { return net.minecraft.world.storage.SerializingRegionBasedStorage.hasUnsavedElements(); }
// public java.util.Optional method_43412(yarnwrap.util.math.ChunkPos throwable) { return wrapperContained.method_43412(throwable.wrapperContained); }
// public static java.util.Optional method_43412(yarnwrap.util.math.ChunkPos throwable, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_43412(throwable.wrapperContained); }
// public java.lang.Void method_61006(yarnwrap.util.math.ChunkPos throwable) { return wrapperContained.method_61006(throwable.wrapperContained); }
// public static java.lang.Void method_61006(yarnwrap.util.math.ChunkPos throwable, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_61006(throwable.wrapperContained); }

}