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
// public void collectIdentifiers(Object consumer,java.lang.String namespace,java.nio.file.Path root,java.util.List prefixSegments) { wrapperContained.collectIdentifiers(consumer,namespace,root,prefixSegments); }
public yarnwrap.resource.ResourceFactory getFactory() { return new yarnwrap.resource.ResourceFactory(wrapperContained.getFactory()); }
public void forEachNamespacedPath(yarnwrap.resource.ResourceType type,yarnwrap.util.Identifier path,java.util.function.Consumer consumer) { wrapperContained.forEachNamespacedPath(type.wrapperContained,path.wrapperContained,consumer); }

}