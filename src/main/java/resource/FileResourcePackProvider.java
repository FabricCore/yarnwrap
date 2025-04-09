package yarnwrap.resource;
public class FileResourcePackProvider { public net.minecraft.resource.FileResourcePackProvider wrapperContained; public FileResourcePackProvider(net.minecraft.resource.FileResourcePackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path packsDir() { return wrapperContained.packsDir; }
// public yarnwrap.resource.ResourcePackSource source() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.source); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(wrapperContained.type); }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public yarnwrap.resource.ResourcePackPosition POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.POSITION); }
// public void forEachProfile(java.nio.file.Path path,yarnwrap.util.path.SymlinkFinder symlinkFinder,java.util.function.BiConsumer callback) { wrapperContained.forEachProfile(path,symlinkFinder.wrapperContained,callback); }
// public java.lang.String getFileName(java.nio.file.Path path) { return wrapperContained.getFileName(path); }
// public yarnwrap.resource.ResourcePackInfo createPackInfo(java.nio.file.Path path) { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.createPackInfo(path)); }

}