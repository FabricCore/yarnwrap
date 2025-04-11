package yarnwrap.resource;
public class DirectoryResourcePack { public net.minecraft.resource.DirectoryResourcePack wrapperContained; public DirectoryResourcePack(net.minecraft.resource.DirectoryResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.google.common.base.Joiner SEPARATOR_JOINER() { return wrapperContained.SEPARATOR_JOINER; }
// public void SEPARATOR_JOINER(com.google.common.base.Joiner value) { wrapperContained.SEPARATOR_JOINER = value; }
// public java.nio.file.Path root() { return wrapperContained.root; }
// public void root(java.nio.file.Path value) { wrapperContained.root = value; }
public boolean isValidPath(java.nio.file.Path path) { return wrapperContained.isValidPath(path); }
public yarnwrap.resource.InputSupplier open(yarnwrap.util.Identifier id,java.nio.file.Path path) { return new yarnwrap.resource.InputSupplier(wrapperContained.open(id.wrapperContained,path)); }
// public void findResources(java.lang.String namespace,java.nio.file.Path path,java.util.List prefixSegments,Object consumer) { wrapperContained.findResources(namespace,path,prefixSegments,consumer); }
// public yarnwrap.resource.InputSupplier open(java.nio.file.Path path) { return new yarnwrap.resource.InputSupplier(wrapperContained.open(path)); }

}