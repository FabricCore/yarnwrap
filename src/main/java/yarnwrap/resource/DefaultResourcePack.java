package yarnwrap.resource;
public class DefaultResourcePack { public net.minecraft.resource.DefaultResourcePack wrapperContained; public DefaultResourcePack(net.minecraft.resource.DefaultResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set namespaces() { return wrapperContained.namespaces; }
// public void namespaces(java.util.Set value) { wrapperContained.namespaces = value; }
// public static java.util.Set namespaces() { return net.minecraft.resource.DefaultResourcePack.namespaces; }
// public static void namespaces(java.util.Set value, ) { net.minecraft.resource.DefaultResourcePack.namespaces = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.resource.DefaultResourcePack.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.resource.DefaultResourcePack.LOGGER = value; }

// public yarnwrap.resource.metadata.ResourceMetadataMap metadata() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.metadata); }
// public void metadata(yarnwrap.resource.metadata.ResourceMetadataMap value) { wrapperContained.metadata = value.wrapperContained; }
// public static yarnwrap.resource.metadata.ResourceMetadataMap metadata() { return new yarnwrap.resource.metadata.ResourceMetadataMap(net.minecraft.resource.DefaultResourcePack.metadata); }
// public static void metadata(yarnwrap.resource.metadata.ResourceMetadataMap value, ) { net.minecraft.resource.DefaultResourcePack.metadata = value.wrapperContained; }

// public java.util.List rootPaths() { return wrapperContained.rootPaths; }
// public void rootPaths(java.util.List value) { wrapperContained.rootPaths = value; }
// public static java.util.List rootPaths() { return net.minecraft.resource.DefaultResourcePack.rootPaths; }
// public static void rootPaths(java.util.List value, ) { net.minecraft.resource.DefaultResourcePack.rootPaths = value; }

// public java.util.Map namespacePaths() { return wrapperContained.namespacePaths; }
// public void namespacePaths(java.util.Map value) { wrapperContained.namespacePaths = value; }
// public static java.util.Map namespacePaths() { return net.minecraft.resource.DefaultResourcePack.namespacePaths; }
// public static void namespacePaths(java.util.Map value, ) { net.minecraft.resource.DefaultResourcePack.namespacePaths = value; }

// public yarnwrap.resource.ResourcePackInfo info() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.info); }
// public void info(yarnwrap.resource.ResourcePackInfo value) { wrapperContained.info = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackInfo info() { return new yarnwrap.resource.ResourcePackInfo(net.minecraft.resource.DefaultResourcePack.info); }
// public static void info(yarnwrap.resource.ResourcePackInfo value, ) { net.minecraft.resource.DefaultResourcePack.info = value.wrapperContained; }

// public DefaultResourcePack(yarnwrap.resource.ResourcePackInfo info,yarnwrap.resource.metadata.ResourceMetadataMap metadata,java.util.Set namespaces,java.util.List rootPaths,java.util.Map namespacePaths) { this.wrapperContained = new net.minecraft.resource.DefaultResourcePack(info.wrapperContained,metadata.wrapperContained,namespaces,rootPaths,namespacePaths); }
// public void collectIdentifiers(Object consumer,java.lang.String namespace,java.nio.file.Path root,java.util.List prefixSegments) { wrapperContained.collectIdentifiers(consumer,namespace,root,prefixSegments); }
// public static void collectIdentifiers(Object consumer,java.lang.String namespace,java.nio.file.Path root,java.util.List prefixSegments, ) { net.minecraft.resource.DefaultResourcePack.collectIdentifiers(consumer,namespace,root,prefixSegments); }
public yarnwrap.resource.ResourceFactory getFactory() { return new yarnwrap.resource.ResourceFactory(wrapperContained.getFactory()); }
// public static yarnwrap.resource.ResourceFactory getFactory() { return new yarnwrap.resource.ResourceFactory(net.minecraft.resource.DefaultResourcePack.getFactory()); }
// public java.util.Optional method_45188(yarnwrap.util.Identifier id) { return wrapperContained.method_45188(id.wrapperContained); }
// public static java.util.Optional method_45188(yarnwrap.util.Identifier id, ) { return net.minecraft.resource.DefaultResourcePack.method_45188(id.wrapperContained); }
// public yarnwrap.resource.InputSupplier method_45189(yarnwrap.util.Identifier segments) { return new yarnwrap.resource.InputSupplier(wrapperContained.method_45189(segments.wrapperContained)); }
// public static yarnwrap.resource.InputSupplier method_45189(yarnwrap.util.Identifier segments, ) { return new yarnwrap.resource.InputSupplier(net.minecraft.resource.DefaultResourcePack.method_45189(segments.wrapperContained)); }
// public void method_45190(yarnwrap.util.Identifier segments) { wrapperContained.method_45190(segments.wrapperContained); }
// public static void method_45190(yarnwrap.util.Identifier segments, ) { net.minecraft.resource.DefaultResourcePack.method_45190(segments.wrapperContained); }
public void forEachNamespacedPath(yarnwrap.resource.ResourceType type,yarnwrap.util.Identifier path,java.util.function.Consumer consumer) { wrapperContained.forEachNamespacedPath(type.wrapperContained,path.wrapperContained,consumer); }
// public static void forEachNamespacedPath(yarnwrap.resource.ResourceType type,yarnwrap.util.Identifier path,java.util.function.Consumer consumer, ) { net.minecraft.resource.DefaultResourcePack.forEachNamespacedPath(type.wrapperContained,path.wrapperContained,consumer); }
// public void method_45193(yarnwrap.resource.ResourceType segments) { wrapperContained.method_45193(segments.wrapperContained); }
// public static void method_45193(yarnwrap.resource.ResourceType segments, ) { net.minecraft.resource.DefaultResourcePack.method_45193(segments.wrapperContained); }
// public yarnwrap.resource.Resource method_45194(yarnwrap.resource.InputSupplier stream) { return new yarnwrap.resource.Resource(wrapperContained.method_45194(stream.wrapperContained)); }
// public static yarnwrap.resource.Resource method_45194(yarnwrap.resource.InputSupplier stream, ) { return new yarnwrap.resource.Resource(net.minecraft.resource.DefaultResourcePack.method_45194(stream.wrapperContained)); }

}