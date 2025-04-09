package yarnwrap.resource.metadata;
public class ResourceFilter { public net.minecraft.resource.metadata.ResourceFilter wrapperContained; public ResourceFilter(net.minecraft.resource.metadata.ResourceFilter wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.List blocks() { return wrapperContained.blocks; }
public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
public boolean isNamespaceBlocked(java.lang.String namespace) { return wrapperContained.isNamespaceBlocked(namespace); }
public boolean isPathBlocked(java.lang.String namespace) { return wrapperContained.isPathBlocked(namespace); }

}