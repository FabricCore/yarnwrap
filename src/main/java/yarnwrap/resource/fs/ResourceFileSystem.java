package yarnwrap.resource.fs;
public class ResourceFileSystem { public net.minecraft.resource.fs.ResourceFileSystem wrapperContained; public ResourceFileSystem(net.minecraft.resource.fs.ResourceFileSystem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String SEPARATOR() { return wrapperContained.SEPARATOR; }
// public void SEPARATOR(java.lang.String value) { wrapperContained.SEPARATOR = value; }
public static java.lang.String SEPARATOR() { return net.minecraft.resource.fs.ResourceFileSystem.SEPARATOR; }
// public static void SEPARATOR(java.lang.String value, ) { net.minecraft.resource.fs.ResourceFileSystem.SEPARATOR = value; }

// public java.util.Set SUPPORTED_FILE_ATTRIBUTE_VIEWS() { return wrapperContained.SUPPORTED_FILE_ATTRIBUTE_VIEWS; }
// public void SUPPORTED_FILE_ATTRIBUTE_VIEWS(java.util.Set value) { wrapperContained.SUPPORTED_FILE_ATTRIBUTE_VIEWS = value; }
// public static java.util.Set SUPPORTED_FILE_ATTRIBUTE_VIEWS() { return net.minecraft.resource.fs.ResourceFileSystem.SUPPORTED_FILE_ATTRIBUTE_VIEWS; }
// public static void SUPPORTED_FILE_ATTRIBUTE_VIEWS(java.util.Set value, ) { net.minecraft.resource.fs.ResourceFileSystem.SUPPORTED_FILE_ATTRIBUTE_VIEWS = value; }

// public com.google.common.base.Splitter SEPARATOR_SPLITTER() { return wrapperContained.SEPARATOR_SPLITTER; }
// public void SEPARATOR_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.SEPARATOR_SPLITTER = value; }
// public static com.google.common.base.Splitter SEPARATOR_SPLITTER() { return net.minecraft.resource.fs.ResourceFileSystem.SEPARATOR_SPLITTER; }
// public static void SEPARATOR_SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.resource.fs.ResourceFileSystem.SEPARATOR_SPLITTER = value; }

// public java.nio.file.FileStore store() { return wrapperContained.store; }
// public void store(java.nio.file.FileStore value) { wrapperContained.store = value; }
// public static java.nio.file.FileStore store() { return net.minecraft.resource.fs.ResourceFileSystem.store; }
// public static void store(java.nio.file.FileStore value, ) { net.minecraft.resource.fs.ResourceFileSystem.store = value; }

// public java.nio.file.spi.FileSystemProvider fileSystemProvider() { return wrapperContained.fileSystemProvider; }
// public void fileSystemProvider(java.nio.file.spi.FileSystemProvider value) { wrapperContained.fileSystemProvider = value; }
// public static java.nio.file.spi.FileSystemProvider fileSystemProvider() { return net.minecraft.resource.fs.ResourceFileSystem.fileSystemProvider; }
// public static void fileSystemProvider(java.nio.file.spi.FileSystemProvider value, ) { net.minecraft.resource.fs.ResourceFileSystem.fileSystemProvider = value; }

// public yarnwrap.resource.fs.ResourcePath root() { return new yarnwrap.resource.fs.ResourcePath(wrapperContained.root); }
// public void root(yarnwrap.resource.fs.ResourcePath value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.resource.fs.ResourcePath root() { return new yarnwrap.resource.fs.ResourcePath(net.minecraft.resource.fs.ResourceFileSystem.root); }
// public static void root(yarnwrap.resource.fs.ResourcePath value, ) { net.minecraft.resource.fs.ResourceFileSystem.root = value.wrapperContained; }

// public ResourceFileSystem(java.lang.String name,Object root) { this.wrapperContained = new net.minecraft.resource.fs.ResourceFileSystem(name,root); }
public java.nio.file.Path getPath(java.lang.String first,java.lang.String[] more) { return wrapperContained.getPath(first,more); }
// public static java.nio.file.Path getPath(java.lang.String first,java.lang.String[] more, ) { return net.minecraft.resource.fs.ResourceFileSystem.getPath(first,more); }
public java.nio.file.PathMatcher getPathMatcher(java.lang.String syntaxAndPattern) { return wrapperContained.getPathMatcher(syntaxAndPattern); }
// public static java.nio.file.PathMatcher getPathMatcher(java.lang.String syntaxAndPattern, ) { return net.minecraft.resource.fs.ResourceFileSystem.getPathMatcher(syntaxAndPattern); }
public java.nio.file.FileStore getStore() { return wrapperContained.getStore(); }
// public static java.nio.file.FileStore getStore() { return net.minecraft.resource.fs.ResourceFileSystem.getStore(); }
// // public yarnwrap.resource.fs.ResourcePath toResourcePath(Object root,yarnwrap.resource.fs.ResourceFileSystem fileSystem,java.lang.String name,yarnwrap.resource.fs.ResourcePath parent) { return new yarnwrap.resource.fs.ResourcePath(wrapperContained.toResourcePath(root,fileSystem.wrapperContained,name,parent.wrapperContained)); }
// // public static yarnwrap.resource.fs.ResourcePath toResourcePath(Object root,yarnwrap.resource.fs.ResourceFileSystem fileSystem,java.lang.String name,yarnwrap.resource.fs.ResourcePath parent, ) { return new yarnwrap.resource.fs.ResourcePath(net.minecraft.resource.fs.ResourceFileSystem.toResourcePath(root,fileSystem.wrapperContained,name,parent.wrapperContained)); }
// public void method_45243(it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap directoryName,yarnwrap.resource.fs.ResourceFileSystem directory) { wrapperContained.method_45243(directoryName,directory.wrapperContained); }
// public static void method_45243(it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap directoryName,yarnwrap.resource.fs.ResourceFileSystem directory, ) { net.minecraft.resource.fs.ResourceFileSystem.method_45243(directoryName,directory.wrapperContained); }
// public void method_45244(it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap fileName,yarnwrap.resource.fs.ResourceFileSystem path) { wrapperContained.method_45244(fileName,path.wrapperContained); }
// public static void method_45244(it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap fileName,yarnwrap.resource.fs.ResourceFileSystem path, ) { net.minecraft.resource.fs.ResourceFileSystem.method_45244(fileName,path.wrapperContained); }
// public yarnwrap.resource.fs.ResourcePath getRoot() { return new yarnwrap.resource.fs.ResourcePath(wrapperContained.getRoot()); }
// public static yarnwrap.resource.fs.ResourcePath getRoot() { return new yarnwrap.resource.fs.ResourcePath(net.minecraft.resource.fs.ResourceFileSystem.getRoot()); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.resource.fs.ResourceFileSystem.builder(); }

}