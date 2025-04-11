package yarnwrap.world.storage;
public class RecreatedChunkStorage { public net.minecraft.world.storage.RecreatedChunkStorage wrapperContained; public RecreatedChunkStorage(net.minecraft.world.storage.RecreatedChunkStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.storage.StorageIoWorker recreationWorker() { return new yarnwrap.world.storage.StorageIoWorker(wrapperContained.recreationWorker); }
// public void recreationWorker(yarnwrap.world.storage.StorageIoWorker value) { wrapperContained.recreationWorker = value.wrapperContained; }
// public java.nio.file.Path outputDirectory() { return wrapperContained.outputDirectory; }
// public void outputDirectory(java.nio.file.Path value) { wrapperContained.outputDirectory = value; }
public RecreatedChunkStorage(yarnwrap.world.storage.StorageKey storageKey,java.nio.file.Path directory,yarnwrap.world.storage.StorageKey outputStorageKey,java.nio.file.Path outputDirectory,com.mojang.datafixers.DataFixer dataFixer,boolean dsync) { this.wrapperContained = new net.minecraft.world.storage.RecreatedChunkStorage(storageKey.wrapperContained,directory,outputStorageKey.wrapperContained,outputDirectory,dataFixer,dsync); }

}