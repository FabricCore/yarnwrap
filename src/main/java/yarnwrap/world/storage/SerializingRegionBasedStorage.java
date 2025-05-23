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

// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.Codec codec() { return net.minecraft.world.storage.SerializingRegionBasedStorage.codec; }
// public static void codec(com.mojang.serialization.Codec value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.codec = value; }

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

// public java.util.function.Function serializer() { return wrapperContained.serializer; }
// public void serializer(java.util.function.Function value) { wrapperContained.serializer = value; }
// public static java.util.function.Function serializer() { return net.minecraft.world.storage.SerializingRegionBasedStorage.serializer; }
// public static void serializer(java.util.function.Function value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.serializer = value; }

// public java.util.function.BiFunction deserializer() { return wrapperContained.deserializer; }
// public void deserializer(java.util.function.BiFunction value) { wrapperContained.deserializer = value; }
// public static java.util.function.BiFunction deserializer() { return net.minecraft.world.storage.SerializingRegionBasedStorage.deserializer; }
// public static void deserializer(java.util.function.BiFunction value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.deserializer = value; }

// public it.unimi.dsi.fastutil.longs.LongSet loadedChunks() { return wrapperContained.loadedChunks; }
// public void loadedChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.loadedChunks = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet loadedChunks() { return net.minecraft.world.storage.SerializingRegionBasedStorage.loadedChunks; }
// public static void loadedChunks(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.loadedChunks = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap pendingLoads() { return wrapperContained.pendingLoads; }
// public void pendingLoads(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.pendingLoads = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap pendingLoads() { return net.minecraft.world.storage.SerializingRegionBasedStorage.pendingLoads; }
// public static void pendingLoads(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.pendingLoads = value; }

// public java.lang.Object lock() { return wrapperContained.lock; }
// public void lock(java.lang.Object value) { wrapperContained.lock = value; }
// // public static java.lang.Object lock() { return net.minecraft.world.storage.SerializingRegionBasedStorage.lock; }
// public static void lock(java.lang.Object value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.lock = value; }

public SerializingRegionBasedStorage(yarnwrap.world.storage.ChunkPosKeyedStorage storageAccess,com.mojang.serialization.Codec codec,java.util.function.Function serializer,java.util.function.BiFunction deserializer,java.util.function.Function factory,yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.server.world.ChunkErrorHandler errorHandler,yarnwrap.world.HeightLimitView world) { this.wrapperContained = new net.minecraft.world.storage.SerializingRegionBasedStorage(storageAccess.wrapperContained,codec,serializer,deserializer,factory,registryManager.wrapperContained,errorHandler.wrapperContained,world.wrapperContained); }
// public void onUpdate(long pos) { wrapperContained.onUpdate(pos); }
// public static void onUpdate(long pos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.onUpdate(pos); }
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
// public com.mojang.serialization.Dynamic serialize(yarnwrap.util.math.ChunkPos chunkPos,com.mojang.serialization.DynamicOps ops) { return wrapperContained.serialize(chunkPos.wrapperContained,ops); }
// public static com.mojang.serialization.Dynamic serialize(yarnwrap.util.math.ChunkPos chunkPos,com.mojang.serialization.DynamicOps ops, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.serialize(chunkPos.wrapperContained,ops); }
// public int getDataVersion(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.getDataVersion(dynamic); }
// public static int getDataVersion(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.getDataVersion(dynamic); }
// public void save(yarnwrap.util.math.ChunkPos pos) { wrapperContained.save(pos.wrapperContained); }
// public static void save(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.save(pos.wrapperContained); }
public void saveChunk(yarnwrap.util.math.ChunkPos pos) { wrapperContained.saveChunk(pos.wrapperContained); }
// public static void saveChunk(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.saveChunk(pos.wrapperContained); }
// public java.util.concurrent.CompletableFuture loadNbt(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.loadNbt(chunkPos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture loadNbt(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.loadNbt(chunkPos.wrapperContained); }
// public long chunkSectionPosAsLong(yarnwrap.util.math.ChunkPos chunkPos,int y) { return wrapperContained.chunkSectionPosAsLong(chunkPos.wrapperContained,y); }
// public static long chunkSectionPosAsLong(yarnwrap.util.math.ChunkPos chunkPos,int y, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.chunkSectionPosAsLong(chunkPos.wrapperContained,y); }
public boolean hasUnsavedElements() { return wrapperContained.hasUnsavedElements(); }
// public static boolean hasUnsavedElements() { return net.minecraft.world.storage.SerializingRegionBasedStorage.hasUnsavedElements(); }
// public java.util.Optional method_43412(yarnwrap.util.math.ChunkPos throwable) { return wrapperContained.method_43412(throwable.wrapperContained); }
// public static java.util.Optional method_43412(yarnwrap.util.math.ChunkPos throwable, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_43412(throwable.wrapperContained); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.world.storage.SerializingRegionBasedStorage.save(); }
// public java.lang.Object method_61776(long section) { return wrapperContained.method_61776(section); }
// public static java.lang.Object method_61776(long section, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_61776(section); }
// public java.util.Optional method_61778(yarnwrap.registry.RegistryOps chunkNbt) { return wrapperContained.method_61778(chunkNbt.wrapperContained); }
// public static java.util.Optional method_61778(yarnwrap.registry.RegistryOps chunkNbt, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_61778(chunkNbt.wrapperContained); }
// public Object method_61779(yarnwrap.registry.RegistryOps nbt) { return wrapperContained.method_61779(nbt.wrapperContained); }
// public static Object method_61779(yarnwrap.registry.RegistryOps nbt, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_61779(nbt.wrapperContained); }
public java.util.concurrent.CompletableFuture load(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.load(chunkPos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture load(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.load(chunkPos.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_61781(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.method_61781(pos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture method_61781(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_61781(pos.wrapperContained); }
// public void onLoad(yarnwrap.util.math.ChunkPos chunkPos,Object result) { wrapperContained.onLoad(chunkPos.wrapperContained,result); }
// public static void onLoad(yarnwrap.util.math.ChunkPos chunkPos,Object result, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.onLoad(chunkPos.wrapperContained,result); }
// public java.lang.Void method_61783(yarnwrap.util.math.ChunkPos throwable) { return wrapperContained.method_61783(throwable.wrapperContained); }
// public static java.lang.Void method_61783(yarnwrap.util.math.ChunkPos throwable, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_61783(throwable.wrapperContained); }
// public void method_61784(java.util.Map value) { wrapperContained.method_61784(value); }
// public static void method_61784(java.util.Map value, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.method_61784(value); }
// public java.util.concurrent.CompletableFuture method_61785(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.method_61785(pos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture method_61785(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.SerializingRegionBasedStorage.method_61785(pos.wrapperContained); }
// public void tickPendingLoads() { wrapperContained.tickPendingLoads(); }
// public static void tickPendingLoads() { net.minecraft.world.storage.SerializingRegionBasedStorage.tickPendingLoads(); }
// public void loadAndWait(yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.loadAndWait(chunkPos.wrapperContained); }
// public static void loadAndWait(yarnwrap.util.math.ChunkPos chunkPos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.loadAndWait(chunkPos.wrapperContained); }
// public void method_61789(long chunkPos) { wrapperContained.method_61789(chunkPos); }
// public static void method_61789(long chunkPos, ) { net.minecraft.world.storage.SerializingRegionBasedStorage.method_61789(chunkPos); }

}