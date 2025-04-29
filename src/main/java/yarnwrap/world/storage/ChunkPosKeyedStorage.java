package yarnwrap.world.storage;
public class ChunkPosKeyedStorage { public net.minecraft.world.storage.ChunkPosKeyedStorage wrapperContained; public ChunkPosKeyedStorage(net.minecraft.world.storage.ChunkPosKeyedStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.storage.StorageIoWorker worker() { return new yarnwrap.world.storage.StorageIoWorker(wrapperContained.worker); }
// public void worker(yarnwrap.world.storage.StorageIoWorker value) { wrapperContained.worker = value.wrapperContained; }
// public static yarnwrap.world.storage.StorageIoWorker worker() { return new yarnwrap.world.storage.StorageIoWorker(net.minecraft.world.storage.ChunkPosKeyedStorage.worker); }
// public static void worker(yarnwrap.world.storage.StorageIoWorker value, ) { net.minecraft.world.storage.ChunkPosKeyedStorage.worker = value.wrapperContained; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.world.storage.ChunkPosKeyedStorage.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.world.storage.ChunkPosKeyedStorage.dataFixer = value; }

// public yarnwrap.datafixer.DataFixTypes dataFixTypes() { return new yarnwrap.datafixer.DataFixTypes(wrapperContained.dataFixTypes); }
// public void dataFixTypes(yarnwrap.datafixer.DataFixTypes value) { wrapperContained.dataFixTypes = value.wrapperContained; }
// public static yarnwrap.datafixer.DataFixTypes dataFixTypes() { return new yarnwrap.datafixer.DataFixTypes(net.minecraft.world.storage.ChunkPosKeyedStorage.dataFixTypes); }
// public static void dataFixTypes(yarnwrap.datafixer.DataFixTypes value, ) { net.minecraft.world.storage.ChunkPosKeyedStorage.dataFixTypes = value.wrapperContained; }

public ChunkPosKeyedStorage(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,com.mojang.datafixers.DataFixer dataFixer,boolean dsync,yarnwrap.datafixer.DataFixTypes dataFixTypes) { this.wrapperContained = new net.minecraft.world.storage.ChunkPosKeyedStorage(storageKey.wrapperContained,directory,dataFixer,dsync,dataFixTypes.wrapperContained); }
public java.util.concurrent.CompletableFuture set(yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.set(pos.wrapperContained,nbt.wrapperContained); }
// public static java.util.concurrent.CompletableFuture set(yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.world.storage.ChunkPosKeyedStorage.set(pos.wrapperContained,nbt.wrapperContained); }
public com.mojang.serialization.Dynamic update(com.mojang.serialization.Dynamic nbt,int oldVersion) { return wrapperContained.update(nbt,oldVersion); }
// public static com.mojang.serialization.Dynamic update(com.mojang.serialization.Dynamic nbt,int oldVersion, ) { return net.minecraft.world.storage.ChunkPosKeyedStorage.update(nbt,oldVersion); }
public java.util.concurrent.CompletableFuture read(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.read(pos.wrapperContained); }
// public static java.util.concurrent.CompletableFuture read(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.world.storage.ChunkPosKeyedStorage.read(pos.wrapperContained); }
public yarnwrap.nbt.NbtCompound update(yarnwrap.nbt.NbtCompound nbt,int oldVersion) { return new yarnwrap.nbt.NbtCompound(wrapperContained.update(nbt.wrapperContained,oldVersion)); }
// public static yarnwrap.nbt.NbtCompound update(yarnwrap.nbt.NbtCompound nbt,int oldVersion, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.storage.ChunkPosKeyedStorage.update(nbt.wrapperContained,oldVersion)); }
public java.util.concurrent.CompletableFuture completeAll(boolean sync) { return wrapperContained.completeAll(sync); }
// public static java.util.concurrent.CompletableFuture completeAll(boolean sync, ) { return net.minecraft.world.storage.ChunkPosKeyedStorage.completeAll(sync); }
public yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.getStorageKey()); }
// public static yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(net.minecraft.world.storage.ChunkPosKeyedStorage.getStorageKey()); }

}