package yarnwrap.world.storage;
public class RecreatedChunkStorage { public net.minecraft.world.storage.RecreatedChunkStorage wrapperContained; public RecreatedChunkStorage(net.minecraft.world.storage.RecreatedChunkStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.storage.StorageIoWorker recreationWorker() { return new yarnwrap.world.storage.StorageIoWorker(wrapperContained.recreationWorker); }
// public void recreationWorker(yarnwrap.world.storage.StorageIoWorker value) { wrapperContained.recreationWorker = value.wrapperContained; }
// public static yarnwrap.world.storage.StorageIoWorker recreationWorker() { return new yarnwrap.world.storage.StorageIoWorker(net.minecraft.world.storage.RecreatedChunkStorage.recreationWorker); }
// public static void recreationWorker(yarnwrap.world.storage.StorageIoWorker value, ) { net.minecraft.world.storage.RecreatedChunkStorage.recreationWorker = value.wrapperContained; }

// public java.nio.file.Path outputDirectory() { return wrapperContained.outputDirectory; }
// public void outputDirectory(java.nio.file.Path value) { wrapperContained.outputDirectory = value; }
// public static java.nio.file.Path outputDirectory() { return net.minecraft.world.storage.RecreatedChunkStorage.outputDirectory; }
// public static void outputDirectory(java.nio.file.Path value, ) { net.minecraft.world.storage.RecreatedChunkStorage.outputDirectory = value; }

public RecreatedChunkStorage(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,yarnwrap.world.storage.StorageKey outputStorageKey,java.nio.file.Path outputDirectory,com.mojang.datafixers.DataFixer dataFixer,boolean dsync) { this.wrapperContained = new net.minecraft.world.storage.RecreatedChunkStorage(storageKey.wrapperContained,directory,outputStorageKey.wrapperContained,outputDirectory,dataFixer,dsync); }

}