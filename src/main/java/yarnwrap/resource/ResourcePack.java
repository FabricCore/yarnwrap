package yarnwrap.resource;
public class ResourcePack { public net.minecraft.resource.ResourcePack wrapperContained; public ResourcePack(net.minecraft.resource.ResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String METADATA_PATH_SUFFIX() { return wrapperContained.METADATA_PATH_SUFFIX; }
// public void METADATA_PATH_SUFFIX(java.lang.String value) { wrapperContained.METADATA_PATH_SUFFIX = value; }
public static java.lang.String METADATA_PATH_SUFFIX() { return net.minecraft.resource.ResourcePack.METADATA_PATH_SUFFIX; }
// public static void METADATA_PATH_SUFFIX(java.lang.String value, ) { net.minecraft.resource.ResourcePack.METADATA_PATH_SUFFIX = value; }

// public java.lang.String PACK_METADATA_NAME() { return wrapperContained.PACK_METADATA_NAME; }
// public void PACK_METADATA_NAME(java.lang.String value) { wrapperContained.PACK_METADATA_NAME = value; }
public static java.lang.String PACK_METADATA_NAME() { return net.minecraft.resource.ResourcePack.PACK_METADATA_NAME; }
// public static void PACK_METADATA_NAME(java.lang.String value, ) { net.minecraft.resource.ResourcePack.PACK_METADATA_NAME = value; }

public yarnwrap.resource.InputSupplier open(yarnwrap.resource.ResourceType type,yarnwrap.util.Identifier id) { return new yarnwrap.resource.InputSupplier(wrapperContained.open(type.wrapperContained,id.wrapperContained)); }
// public static yarnwrap.resource.InputSupplier open(yarnwrap.resource.ResourceType type,yarnwrap.util.Identifier id, ) { return new yarnwrap.resource.InputSupplier(net.minecraft.resource.ResourcePack.open(type.wrapperContained,id.wrapperContained)); }
public java.util.Set getNamespaces(yarnwrap.resource.ResourceType type) { return wrapperContained.getNamespaces(type.wrapperContained); }
// public static java.util.Set getNamespaces(yarnwrap.resource.ResourceType type, ) { return net.minecraft.resource.ResourcePack.getNamespaces(type.wrapperContained); }
// public java.lang.Object parseMetadata(yarnwrap.resource.metadata.ResourceMetadataReader metaReader) { return wrapperContained.parseMetadata(metaReader.wrapperContained); }
// public static java.lang.Object parseMetadata(yarnwrap.resource.metadata.ResourceMetadataReader metaReader, ) { return net.minecraft.resource.ResourcePack.parseMetadata(metaReader.wrapperContained); }
// public void findResources(yarnwrap.resource.ResourceType type,java.lang.String namespace,java.lang.String prefix,Object consumer) { wrapperContained.findResources(type.wrapperContained,namespace,prefix,consumer); }
// public static void findResources(yarnwrap.resource.ResourceType type,java.lang.String namespace,java.lang.String prefix,Object consumer, ) { net.minecraft.resource.ResourcePack.findResources(type.wrapperContained,namespace,prefix,consumer); }
public java.lang.String getId() { return wrapperContained.getId(); }
// public static java.lang.String getId() { return net.minecraft.resource.ResourcePack.getId(); }
public yarnwrap.resource.InputSupplier openRoot(java.lang.String[] segments) { return new yarnwrap.resource.InputSupplier(wrapperContained.openRoot(segments)); }
// public static yarnwrap.resource.InputSupplier openRoot(java.lang.String[] segments, ) { return new yarnwrap.resource.InputSupplier(net.minecraft.resource.ResourcePack.openRoot(segments)); }
public yarnwrap.resource.ResourcePackInfo getInfo() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.getInfo()); }
// public static yarnwrap.resource.ResourcePackInfo getInfo() { return new yarnwrap.resource.ResourcePackInfo(net.minecraft.resource.ResourcePack.getInfo()); }
public java.util.Optional getKnownPackInfo() { return wrapperContained.getKnownPackInfo(); }
// public static java.util.Optional getKnownPackInfo() { return net.minecraft.resource.ResourcePack.getKnownPackInfo(); }

}