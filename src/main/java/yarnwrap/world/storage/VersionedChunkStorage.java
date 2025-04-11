package yarnwrap.world.storage;
public class VersionedChunkStorage { public net.minecraft.world.storage.VersionedChunkStorage wrapperContained; public VersionedChunkStorage(net.minecraft.world.storage.VersionedChunkStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.FeatureUpdater featureUpdater() { return new yarnwrap.world.FeatureUpdater(wrapperContained.featureUpdater); }
// public void featureUpdater(yarnwrap.world.FeatureUpdater value) { wrapperContained.featureUpdater = value.wrapperContained; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public yarnwrap.world.storage.StorageIoWorker worker() { return new yarnwrap.world.storage.StorageIoWorker(wrapperContained.worker); }
// public void worker(yarnwrap.world.storage.StorageIoWorker value) { wrapperContained.worker = value.wrapperContained; }
public int FEATURE_UPDATING_VERSION() { return wrapperContained.FEATURE_UPDATING_VERSION; }
// public void FEATURE_UPDATING_VERSION(int value) { wrapperContained.FEATURE_UPDATING_VERSION = value; }
public VersionedChunkStorage(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,com.mojang.datafixers.DataFixer dataFixer,boolean dsync) { this.wrapperContained = new net.minecraft.world.storage.VersionedChunkStorage(storageKey.wrapperContained,directory,dataFixer,dsync); }
public yarnwrap.nbt.NbtCompound updateChunkNbt(yarnwrap.registry.RegistryKey worldKey,java.util.function.Supplier persistentStateManagerFactory,yarnwrap.nbt.NbtCompound nbt,java.util.Optional generatorCodecKey) { return new yarnwrap.nbt.NbtCompound(wrapperContained.updateChunkNbt(worldKey.wrapperContained,persistentStateManagerFactory,nbt.wrapperContained,generatorCodecKey)); }
public int getDataVersion(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.getDataVersion(nbt.wrapperContained); }
public java.util.concurrent.CompletableFuture setNbt(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.setNbt(chunkPos.wrapperContained,nbt.wrapperContained); }
public java.util.concurrent.CompletableFuture getNbt(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.getNbt(chunkPos.wrapperContained); }
public void completeAll() { wrapperContained.completeAll(); }
// public void method_39798(yarnwrap.nbt.NbtCompound key) { wrapperContained.method_39798(key.wrapperContained); }
public void saveContextToNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.registry.RegistryKey worldKey,java.util.Optional generatorCodecKey) { wrapperContained.saveContextToNbt(nbt.wrapperContained,worldKey.wrapperContained,generatorCodecKey); }
public yarnwrap.world.storage.NbtScannable getWorker() { return new yarnwrap.world.storage.NbtScannable(wrapperContained.getWorker()); }
public boolean needsBlending(yarnwrap.util.math.ChunkPos chunkPos,int checkRadius) { return wrapperContained.needsBlending(chunkPos.wrapperContained,checkRadius); }
// public yarnwrap.world.FeatureUpdater getFeatureUpdater(yarnwrap.registry.RegistryKey worldKey,java.util.function.Supplier stateManagerGetter) { return new yarnwrap.world.FeatureUpdater(wrapperContained.getFeatureUpdater(worldKey.wrapperContained,stateManagerGetter)); }
// public void markFeatureUpdateResolved(yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.markFeatureUpdateResolved(chunkPos.wrapperContained); }
// public void removeContext(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.removeContext(nbt.wrapperContained); }
// public yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.getStorageKey()); }

}