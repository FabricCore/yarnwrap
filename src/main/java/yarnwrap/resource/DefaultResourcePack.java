package yarnwrap.resource;
public class DefaultResourcePack { public net.minecraft.resource.DefaultResourcePack wrapperContained; public DefaultResourcePack(net.minecraft.resource.DefaultResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set namespaces() { return wrapperContained.namespaces; }
// public void namespaces(java.util.Set value) { wrapperContained.namespaces = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.resource.metadata.ResourceMetadataMap metadata() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.metadata); }
// public void metadata(yarnwrap.resource.metadata.ResourceMetadataMap value) { wrapperContained.metadata = value.wrapperContained; }
// public java.util.List rootPaths() { return wrapperContained.rootPaths; }
// public void rootPaths(java.util.List value) { wrapperContained.rootPaths = value; }
// public java.util.Map namespacePaths() { return wrapperContained.namespacePaths; }
// public void namespacePaths(java.util.Map value) { wrapperContained.namespacePaths = value; }
// public yarnwrap.resource.ResourcePackInfo info() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.info); }
// public void info(yarnwrap.resource.ResourcePackInfo value) { wrapperContained.info = value.wrapperContained; }
// public DefaultResourcePack(yarnwrap.resource.ResourcePackInfo info,yarnwrap.resource.metadata.ResourceMetadataMap metadata,java.util.Set namespaces,java.util.List rootPaths,java.util.Map namespacePaths) { this.wrapperContained = new net.minecraft.resource.DefaultResourcePack(info.wrapperContained,metadata.wrapperContained,namespaces,rootPaths,namespacePaths); }
// public void collectIdentifiers(Object consumer,java.lang.String namespace,java.nio.file.Path root,java.util.List prefixSegments) { wrapperContained.collectIdentifiers(consumer,namespace,root,prefixSegments); }
public yarnwrap.resource.ResourceFactory getFactory() { return new yarnwrap.resource.ResourceFactory(wrapperContained.getFactory()); }
// public java.util.Optional method_45188(yarnwrap.util.Identifier id) { return wrapperContained.method_45188(id.wrapperContained); }
// public yarnwrap.resource.InputSupplier method_45189(yarnwrap.util.Identifier segments) { return new yarnwrap.resource.InputSupplier(wrapperContained.method_45189(segments.wrapperContained)); }
// public void method_45190(yarnwrap.util.Identifier segments) { wrapperContained.method_45190(segments.wrapperContained); }
public void forEachNamespacedPath(yarnwrap.resource.ResourceType type,yarnwrap.util.Identifier path,java.util.function.Consumer consumer) { wrapperContained.forEachNamespacedPath(type.wrapperContained,path.wrapperContained,consumer); }
// public void method_45193(yarnwrap.resource.ResourceType segments) { wrapperContained.method_45193(segments.wrapperContained); }
// public yarnwrap.resource.Resource method_45194(yarnwrap.resource.InputSupplier stream) { return new yarnwrap.resource.Resource(wrapperContained.method_45194(stream.wrapperContained)); }

}