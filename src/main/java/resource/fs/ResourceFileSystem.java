package yarnwrap.resource.fs;
public class ResourceFileSystem { public net.minecraft.resource.fs.ResourceFileSystem wrapperContained; public ResourceFileSystem(net.minecraft.resource.fs.ResourceFileSystem wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String SEPARATOR() { return wrapperContained.SEPARATOR; }
// public java.util.Set SUPPORTED_FILE_ATTRIBUTE_VIEWS() { return wrapperContained.SUPPORTED_FILE_ATTRIBUTE_VIEWS; }
// public com.google.common.base.Splitter SEPARATOR_SPLITTER() { return wrapperContained.SEPARATOR_SPLITTER; }
// public java.nio.file.FileStore store() { return wrapperContained.store; }
// public java.nio.file.spi.FileSystemProvider fileSystemProvider() { return wrapperContained.fileSystemProvider; }
// public yarnwrap.resource.fs.ResourcePath root() { return new yarnwrap.resource.fs.ResourcePath(wrapperContained.root); }
public java.nio.file.FileStore getStore() { return wrapperContained.getStore(); }
// // public yarnwrap.resource.fs.ResourcePath toResourcePath(Object root,yarnwrap.resource.fs.ResourceFileSystem fileSystem,java.lang.String name,yarnwrap.resource.fs.ResourcePath parent) { return new yarnwrap.resource.fs.ResourcePath(wrapperContained.toResourcePath(root,fileSystem.wrapperContained,name,parent.wrapperContained)); }
// public yarnwrap.resource.fs.ResourcePath getRoot() { return new yarnwrap.resource.fs.ResourcePath(wrapperContained.getRoot()); }
public Object builder() { return wrapperContained.builder(); }

}