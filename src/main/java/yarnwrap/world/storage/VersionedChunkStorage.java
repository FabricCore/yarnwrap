package yarnwrap.world.storage;
public class VersionedChunkStorage { public net.minecraft.world.storage.VersionedChunkStorage wrapperContained; public VersionedChunkStorage(net.minecraft.world.storage.VersionedChunkStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.FeatureUpdater featureUpdater() { return new yarnwrap.world.FeatureUpdater(wrapperContained.featureUpdater); }
// public void featureUpdater(yarnwrap.world.FeatureUpdater value) { wrapperContained.featureUpdater = value.wrapperContained; }
// public static yarnwrap.world.FeatureUpdater featureUpdater() { return new yarnwrap.world.FeatureUpdater(net.minecraft.world.storage.VersionedChunkStorage.featureUpdater); }
// public static void featureUpdater(yarnwrap.world.FeatureUpdater value, ) { net.minecraft.world.storage.VersionedChunkStorage.featureUpdater = value.wrapperContained; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.world.storage.VersionedChunkStorage.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.world.storage.VersionedChunkStorage.dataFixer = value; }

// public yarnwrap.world.storage.StorageIoWorker worker() { return new yarnwrap.world.storage.StorageIoWorker(wrapperContained.worker); }
// public void worker(yarnwrap.world.storage.StorageIoWorker value) { wrapperContained.worker = value.wrapperContained; }
// public static yarnwrap.world.storage.StorageIoWorker worker() { return new yarnwrap.world.storage.StorageIoWorker(net.minecraft.world.storage.VersionedChunkStorage.worker); }
// public static void worker(yarnwrap.world.storage.StorageIoWorker value, ) { net.minecraft.world.storage.VersionedChunkStorage.worker = value.wrapperContained; }

// public int FEATURE_UPDATING_VERSION() { return wrapperContained.FEATURE_UPDATING_VERSION; }
// public void FEATURE_UPDATING_VERSION(int value) { wrapperContained.FEATURE_UPDATING_VERSION = value; }
public static int FEATURE_UPDATING_VERSION() { return net.minecraft.world.storage.VersionedChunkStorage.FEATURE_UPDATING_VERSION; }
// public static void FEATURE_UPDATING_VERSION(int value, ) { net.minecraft.world.storage.VersionedChunkStorage.FEATURE_UPDATING_VERSION = value; }

public VersionedChunkStorage(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,com.mojang.datafixers.DataFixer dataFixer,boolean dsync) { this.wrapperContained = new net.minecraft.world.storage.VersionedChunkStorage(storageKey.wrapperContained,directory,dataFixer,dsync); }
public yarnwrap.nbt.NbtCompound updateChunkNbt(yarnwrap.registry.RegistryKey worldKey,java.util.function.Supplier persistentStateManagerFactory,yarnwrap.nbt.NbtCompound nbt,java.util.Optional generatorCodecKey) { return new yarnwrap.nbt.NbtCompound(wrapperContained.updateChunkNbt(worldKey.wrapperContained,persistentStateManagerFactory,nbt.wrapperContained,generatorCodecKey)); }
// public static yarnwrap.nbt.NbtCompound updateChunkNbt(yarnwrap.registry.RegistryKey worldKey,java.util.function.Supplier persistentStateManagerFactory,yarnwrap.nbt.NbtCompound nbt,java.util.Optional generatorCodecKey, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.storage.VersionedChunkStorage.updateChunkNbt(worldKey.wrapperContained,persistentStateManagerFactory,nbt.wrapperContained,generatorCodecKey)); }
// public int getDataVersion(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.getDataVersion(nbt.wrapperContained); }
// public static int getDataVersion(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.world.storage.VersionedChunkStorage.getDataVersion(nbt.wrapperContained); }
public java.util.concurrent.CompletableFuture setNbt(yarnwrap.util.math.ChunkPos chunkPos,java.util.function.Supplier nbtSupplier) { return wrapperContained.setNbt(chunkPos.wrapperContained,nbtSupplier); }
// public static java.util.concurrent.CompletableFuture setNbt(yarnwrap.util.math.ChunkPos chunkPos,java.util.function.Supplier nbtSupplier, ) { return net.minecraft.world.storage.VersionedChunkStorage.setNbt(chunkPos.wrapperContained,nbtSupplier); }
public java.util.concurrent.CompletableFuture getNbt(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getNbt(chunkPos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture getNbt(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.storage.VersionedChunkStorage.getNbt(chunkPos.wrapperContained); }
public void completeAll() { wrapperContained.completeAll(); }
// public static void completeAll() { net.minecraft.world.storage.VersionedChunkStorage.completeAll(); }
// public void method_39798(yarnwrap.nbt.NbtCompound key) { wrapperContained.method_39798(key.wrapperContained); }
// public static void method_39798(yarnwrap.nbt.NbtCompound key, ) { net.minecraft.world.storage.VersionedChunkStorage.method_39798(key.wrapperContained); }
// public void saveContextToNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.registry.RegistryKey worldKey,java.util.Optional generatorCodecKey) { wrapperContained.saveContextToNbt(nbt.wrapperContained,worldKey.wrapperContained,generatorCodecKey); }
// public static void saveContextToNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.registry.RegistryKey worldKey,java.util.Optional generatorCodecKey, ) { net.minecraft.world.storage.VersionedChunkStorage.saveContextToNbt(nbt.wrapperContained,worldKey.wrapperContained,generatorCodecKey); }
public yarnwrap.world.storage.NbtScannable getWorker() { return new yarnwrap.world.storage.NbtScannable(wrapperContained.getWorker()); }
// public static yarnwrap.world.storage.NbtScannable getWorker() { return new yarnwrap.world.storage.NbtScannable(net.minecraft.world.storage.VersionedChunkStorage.getWorker()); }
public boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius) { return wrapperContained.needsBlending(chunkPos.wrapperContained,checkRadius); }
// public static boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius, ) { return net.minecraft.world.storage.VersionedChunkStorage.needsBlending(chunkPos.wrapperContained,checkRadius); }
// public yarnwrap.world.FeatureUpdater getFeatureUpdater(yarnwrap.registry.RegistryKey worldKey,java.util.function.Supplier stateManagerGetter) { return new yarnwrap.world.FeatureUpdater(wrapperContained.getFeatureUpdater(worldKey.wrapperContained,stateManagerGetter)); }
// public static yarnwrap.world.FeatureUpdater getFeatureUpdater(yarnwrap.registry.RegistryKey worldKey,java.util.function.Supplier stateManagerGetter, ) { return new yarnwrap.world.FeatureUpdater(net.minecraft.world.storage.VersionedChunkStorage.getFeatureUpdater(worldKey.wrapperContained,stateManagerGetter)); }
// public void markFeatureUpdateResolved(yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.markFeatureUpdateResolved(chunkPos.wrapperContained); }
// public static void markFeatureUpdateResolved(yarnwrap.util.math.ChunkPos chunkPos, ) { net.minecraft.world.storage.VersionedChunkStorage.markFeatureUpdateResolved(chunkPos.wrapperContained); }
// public void removeContext(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.removeContext(nbt.wrapperContained); }
// public static void removeContext(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.world.storage.VersionedChunkStorage.removeContext(nbt.wrapperContained); }
// public yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.getStorageKey()); }
// public static yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(net.minecraft.world.storage.VersionedChunkStorage.getStorageKey()); }
// public java.util.Optional method_68289(yarnwrap.nbt.NbtCompound level) { return wrapperContained.method_68289(level.wrapperContained); }
// public static java.util.Optional method_68289(yarnwrap.nbt.NbtCompound level, ) { return net.minecraft.world.storage.VersionedChunkStorage.method_68289(level.wrapperContained); }

}