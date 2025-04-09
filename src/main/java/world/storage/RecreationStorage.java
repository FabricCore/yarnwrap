package yarnwrap.world.storage;
public class RecreationStorage { public net.minecraft.world.storage.RecreationStorage wrapperContained; public RecreationStorage(net.minecraft.world.storage.RecreationStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.storage.StorageIoWorker recreationWorker() { return new yarnwrap.world.storage.StorageIoWorker(wrapperContained.recreationWorker); }
// public java.nio.file.Path outputDirectory() { return wrapperContained.outputDirectory; }

}