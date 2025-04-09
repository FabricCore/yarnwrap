package yarnwrap.world.storage;
public class RecreatedChunkStorage { public net.minecraft.world.storage.RecreatedChunkStorage wrapperContained; public RecreatedChunkStorage(net.minecraft.world.storage.RecreatedChunkStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.storage.StorageIoWorker recreationWorker() { return new yarnwrap.world.storage.StorageIoWorker(wrapperContained.recreationWorker); }
// public java.nio.file.Path outputDirectory() { return wrapperContained.outputDirectory; }

}