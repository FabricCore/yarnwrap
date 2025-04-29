package yarnwrap.resource;
public class FileResourcePackProvider { public net.minecraft.resource.FileResourcePackProvider wrapperContained; public FileResourcePackProvider(net.minecraft.resource.FileResourcePackProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path packsDir() { return wrapperContained.packsDir; }
// public void packsDir(java.nio.file.Path value) { wrapperContained.packsDir = value; }
// public static java.nio.file.Path packsDir() { return net.minecraft.resource.FileResourcePackProvider.packsDir; }
// public static void packsDir(java.nio.file.Path value, ) { net.minecraft.resource.FileResourcePackProvider.packsDir = value; }

// public yarnwrap.resource.ResourcePackSource source() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.source); }
// public void source(yarnwrap.resource.ResourcePackSource value) { wrapperContained.source = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackSource source() { return new yarnwrap.resource.ResourcePackSource(net.minecraft.resource.FileResourcePackProvider.source); }
// public static void source(yarnwrap.resource.ResourcePackSource value, ) { net.minecraft.resource.FileResourcePackProvider.source = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.resource.FileResourcePackProvider.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.resource.FileResourcePackProvider.LOGGER = value; }

// public yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(wrapperContained.type); }
// public void type(yarnwrap.resource.ResourceType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(net.minecraft.resource.FileResourcePackProvider.type); }
// public static void type(yarnwrap.resource.ResourceType value, ) { net.minecraft.resource.FileResourcePackProvider.type = value.wrapperContained; }

// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public void symlinkFinder(yarnwrap.util.path.SymlinkFinder value) { wrapperContained.symlinkFinder = value.wrapperContained; }
// public static yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(net.minecraft.resource.FileResourcePackProvider.symlinkFinder); }
// public static void symlinkFinder(yarnwrap.util.path.SymlinkFinder value, ) { net.minecraft.resource.FileResourcePackProvider.symlinkFinder = value.wrapperContained; }

// public yarnwrap.resource.ResourcePackPosition POSITION() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.POSITION); }
// public void POSITION(yarnwrap.resource.ResourcePackPosition value) { wrapperContained.POSITION = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackPosition POSITION() { return new yarnwrap.resource.ResourcePackPosition(net.minecraft.resource.FileResourcePackProvider.POSITION); }
// public static void POSITION(yarnwrap.resource.ResourcePackPosition value, ) { net.minecraft.resource.FileResourcePackProvider.POSITION = value.wrapperContained; }

public FileResourcePackProvider(java.nio.file.Path packsDir,yarnwrap.resource.ResourceType type,yarnwrap.resource.ResourcePackSource source,yarnwrap.util.path.SymlinkFinder symlinkFinder) { this.wrapperContained = new net.minecraft.resource.FileResourcePackProvider(packsDir,type.wrapperContained,source.wrapperContained,symlinkFinder.wrapperContained); }
// public void forEachProfile(java.nio.file.Path path,yarnwrap.util.path.SymlinkFinder symlinkFinder,java.util.function.BiConsumer callback) { wrapperContained.forEachProfile(path,symlinkFinder.wrapperContained,callback); }
// public static void forEachProfile(java.nio.file.Path path,yarnwrap.util.path.SymlinkFinder symlinkFinder,java.util.function.BiConsumer callback, ) { net.minecraft.resource.FileResourcePackProvider.forEachProfile(path,symlinkFinder.wrapperContained,callback); }
// public void method_45272(java.util.function.Consumer path,java.nio.file.Path packFactory) { wrapperContained.method_45272(path,packFactory); }
// public static void method_45272(java.util.function.Consumer path,java.nio.file.Path packFactory, ) { net.minecraft.resource.FileResourcePackProvider.method_45272(path,packFactory); }
// public java.lang.String getFileName(java.nio.file.Path path) { return wrapperContained.getFileName(path); }
// public static java.lang.String getFileName(java.nio.file.Path path, ) { return net.minecraft.resource.FileResourcePackProvider.getFileName(path); }
// public yarnwrap.resource.ResourcePackInfo createPackInfo(java.nio.file.Path path) { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.createPackInfo(path)); }
// public static yarnwrap.resource.ResourcePackInfo createPackInfo(java.nio.file.Path path, ) { return new yarnwrap.resource.ResourcePackInfo(net.minecraft.resource.FileResourcePackProvider.createPackInfo(path)); }

}