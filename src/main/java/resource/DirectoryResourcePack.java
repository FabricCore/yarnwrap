package yarnwrap.resource;
public class DirectoryResourcePack { public net.minecraft.resource.DirectoryResourcePack wrapperContained; public DirectoryResourcePack(net.minecraft.resource.DirectoryResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.google.common.base.Joiner SEPARATOR_JOINER() { return wrapperContained.SEPARATOR_JOINER; }
// public java.nio.file.Path root() { return wrapperContained.root; }
public boolean isValidPath(java.nio.file.Path path) { return wrapperContained.isValidPath(path); }
public yarnwrap.resource.InputSupplier open(yarnwrap.util.Identifier id,java.nio.file.Path path) { return new yarnwrap.resource.InputSupplier(wrapperContained.open(id.wrapperContained,path)); }
// public void findResources(java.lang.String namespace,java.nio.file.Path path,java.util.List prefixSegments,Object consumer) { wrapperContained.findResources(namespace,path,prefixSegments,consumer); }
// public yarnwrap.resource.InputSupplier open(java.nio.file.Path path) { return new yarnwrap.resource.InputSupplier(wrapperContained.open(path)); }

}