package yarnwrap.world.storage;
public class RegionBasedStorage { public net.minecraft.world.storage.RegionBasedStorage wrapperContained; public RegionBasedStorage(net.minecraft.world.storage.RegionBasedStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap cachedRegionFiles() { return wrapperContained.cachedRegionFiles; }
// public void cachedRegionFiles(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value) { wrapperContained.cachedRegionFiles = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap cachedRegionFiles() { return net.minecraft.world.storage.RegionBasedStorage.cachedRegionFiles; }
// public static void cachedRegionFiles(it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap value, ) { net.minecraft.world.storage.RegionBasedStorage.cachedRegionFiles = value; }

// public java.nio.file.Path directory() { return wrapperContained.directory; }
// public void directory(java.nio.file.Path value) { wrapperContained.directory = value; }
// public static java.nio.file.Path directory() { return net.minecraft.world.storage.RegionBasedStorage.directory; }
// public static void directory(java.nio.file.Path value, ) { net.minecraft.world.storage.RegionBasedStorage.directory = value; }

// public boolean dsync() { return wrapperContained.dsync; }
// public void dsync(boolean value) { wrapperContained.dsync = value; }
// public static boolean dsync() { return net.minecraft.world.storage.RegionBasedStorage.dsync; }
// public static void dsync(boolean value, ) { net.minecraft.world.storage.RegionBasedStorage.dsync = value; }

// public java.lang.String MCA_EXTENSION() { return wrapperContained.MCA_EXTENSION; }
// public void MCA_EXTENSION(java.lang.String value) { wrapperContained.MCA_EXTENSION = value; }
public static java.lang.String MCA_EXTENSION() { return net.minecraft.world.storage.RegionBasedStorage.MCA_EXTENSION; }
// public static void MCA_EXTENSION(java.lang.String value, ) { net.minecraft.world.storage.RegionBasedStorage.MCA_EXTENSION = value; }

// public int MAX_CACHE_SIZE() { return wrapperContained.MAX_CACHE_SIZE; }
// public void MAX_CACHE_SIZE(int value) { wrapperContained.MAX_CACHE_SIZE = value; }
// public static int MAX_CACHE_SIZE() { return net.minecraft.world.storage.RegionBasedStorage.MAX_CACHE_SIZE; }
// public static void MAX_CACHE_SIZE(int value, ) { net.minecraft.world.storage.RegionBasedStorage.MAX_CACHE_SIZE = value; }

// public yarnwrap.world.storage.StorageKey storageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.storageKey); }
// public void storageKey(yarnwrap.world.storage.StorageKey value) { wrapperContained.storageKey = value.wrapperContained; }
// public static yarnwrap.world.storage.StorageKey storageKey() { return new yarnwrap.world.storage.StorageKey(net.minecraft.world.storage.RegionBasedStorage.storageKey); }
// public static void storageKey(yarnwrap.world.storage.StorageKey value, ) { net.minecraft.world.storage.RegionBasedStorage.storageKey = value.wrapperContained; }

// public RegionBasedStorage(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,boolean dsync) { this.wrapperContained = new net.minecraft.world.storage.RegionBasedStorage(storageKey.wrapperContained,directory,dsync); }
// public yarnwrap.world.storage.RegionFile getRegionFile(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.storage.RegionFile(wrapperContained.getRegionFile(pos.wrapperContained)); }
// public static yarnwrap.world.storage.RegionFile getRegionFile(yarnwrap.util.math.ChunkPos pos, ) { return new yarnwrap.world.storage.RegionFile(net.minecraft.world.storage.RegionBasedStorage.getRegionFile(pos.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound getTagAt(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getTagAt(pos.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound getTagAt(yarnwrap.util.math.ChunkPos pos, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.storage.RegionBasedStorage.getTagAt(pos.wrapperContained)); }
// public void write(yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.write(pos.wrapperContained,nbt.wrapperContained); }
// public static void write(yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.world.storage.RegionBasedStorage.write(pos.wrapperContained,nbt.wrapperContained); }
// public void sync() { wrapperContained.sync(); }
// public static void sync() { net.minecraft.world.storage.RegionBasedStorage.sync(); }
// public void scanChunk(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.nbt.scanner.NbtScanner scanner) { wrapperContained.scanChunk(chunkPos.wrapperContained,scanner.wrapperContained); }
// public static void scanChunk(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.nbt.scanner.NbtScanner scanner, ) { net.minecraft.world.storage.RegionBasedStorage.scanChunk(chunkPos.wrapperContained,scanner.wrapperContained); }
public yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(wrapperContained.getStorageKey()); }
// public static yarnwrap.world.storage.StorageKey getStorageKey() { return new yarnwrap.world.storage.StorageKey(net.minecraft.world.storage.RegionBasedStorage.getStorageKey()); }

}