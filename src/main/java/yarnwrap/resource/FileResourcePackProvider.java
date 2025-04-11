package yarnwrap.resource;
public class FileResourcePackProvider { public net.minecraft.resource.FileResourcePackProvider wrapperContained; public FileResourcePackProvider(net.minecraft.resource.FileResourcePackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path packsDir() { return wrapperContained.packsDir; }
// public void packsDir(java.nio.file.Path value) { wrapperContained.packsDir = value; }
// public yarnwrap.resource.ResourcePackSource source() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.source); }
// public void source(yarnwrap.resource.ResourcePackSource value) { wrapperContained.source = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(wrapperContained.type); }
// public void type(yarnwrap.resource.ResourceType value) { wrapperContained.type = value.wrapperContained; }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public void symlinkFinder(yarnwrap.util.path.SymlinkFinder value) { wrapperContained.symlinkFinder = value.wrapperContained; }
// public yarnwrap.resource.ResourcePackPosition POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.POSITION); }
// public void POSITION(yarnwrap.resource.ResourcePackPosition value) { wrapperContained.POSITION = value.wrapperContained; }
public FileResourcePackProvider(java.nio.file.Path packsDir,yarnwrap.resource.ResourceType type,yarnwrap.resource.ResourcePackSource source,yarnwrap.util.path.SymlinkFinder symlinkFinder) { this.wrapperContained = new net.minecraft.resource.FileResourcePackProvider(packsDir,type.wrapperContained,source.wrapperContained,symlinkFinder.wrapperContained); }
// public void forEachProfile(java.nio.file.Path path,yarnwrap.util.path.SymlinkFinder symlinkFinder,java.util.function.BiConsumer callback) { wrapperContained.forEachProfile(path,symlinkFinder.wrapperContained,callback); }
// public void method_45272(java.util.function.Consumer path,java.nio.file.Path packFactory) { wrapperContained.method_45272(path,packFactory); }
// public java.lang.String getFileName(java.nio.file.Path path) { return wrapperContained.getFileName(path); }
// public yarnwrap.resource.ResourcePackInfo createPackInfo(java.nio.file.Path path) { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.createPackInfo(path)); }

}