package yarnwrap.resource;
public class DefaultResourcePackBuilder { public net.minecraft.resource.DefaultResourcePackBuilder wrapperContained; public DefaultResourcePackBuilder(net.minecraft.resource.DefaultResourcePackBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Consumer callback() { return wrapperContained.callback; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map RESOURCE_TYPE_TO_PATH() { return wrapperContained.RESOURCE_TYPE_TO_PATH; }
// public java.util.Set rootPaths() { return wrapperContained.rootPaths; }
// public java.util.Map paths() { return wrapperContained.paths; }
// public yarnwrap.resource.metadata.ResourceMetadataMap metadataMap() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.metadataMap); }
// public java.util.Set namespaces() { return wrapperContained.namespaces; }
public yarnwrap.resource.DefaultResourcePackBuilder withDefaultPaths() { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withDefaultPaths()); }
public yarnwrap.resource.DefaultResourcePackBuilder withMetadataMap(yarnwrap.resource.metadata.ResourceMetadataMap metadataMap) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withMetadataMap(metadataMap.wrapperContained)); }
public yarnwrap.resource.DefaultResourcePackBuilder withPaths(yarnwrap.resource.ResourceType type,java.lang.Class clazz) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withPaths(type.wrapperContained,clazz)); }
public yarnwrap.resource.DefaultResourcePackBuilder withPath(yarnwrap.resource.ResourceType type,java.nio.file.Path path) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withPath(type.wrapperContained,path)); }
// public java.nio.file.Path toPath(java.net.URI uri) { return wrapperContained.toPath(uri); }
public yarnwrap.resource.DefaultResourcePackBuilder withRoot(java.nio.file.Path root) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withRoot(root)); }
// public java.util.List reverse(java.util.Collection paths) { return wrapperContained.reverse(paths); }
public yarnwrap.resource.DefaultResourcePackBuilder withNamespaces(java.lang.String[] namespaces) { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.withNamespaces(namespaces)); }
public yarnwrap.resource.DefaultResourcePackBuilder runCallback() { return new yarnwrap.resource.DefaultResourcePackBuilder(wrapperContained.runCallback()); }
// public void addPath(yarnwrap.resource.ResourceType type,java.nio.file.Path path) { wrapperContained.addPath(type.wrapperContained,path); }
// public boolean exists(java.nio.file.Path path) { return wrapperContained.exists(path); }
public yarnwrap.resource.DefaultResourcePack build(yarnwrap.resource.ResourcePackInfo info) { return new yarnwrap.resource.DefaultResourcePack(wrapperContained.build(info.wrapperContained)); }
// public void addRootPath(java.nio.file.Path path) { wrapperContained.addRootPath(path); }

}