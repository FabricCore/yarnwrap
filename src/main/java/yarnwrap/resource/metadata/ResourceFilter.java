package yarnwrap.resource.metadata;
public class ResourceFilter { public net.minecraft.resource.metadata.ResourceFilter wrapperContained; public ResourceFilter(net.minecraft.resource.metadata.ResourceFilter wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.List blocks() { return wrapperContained.blocks; }
// public void blocks(java.util.List value) { wrapperContained.blocks = value; }
public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
public boolean isNamespaceBlocked(java.lang.String namespace) { return wrapperContained.isNamespaceBlocked(namespace); }
public boolean isPathBlocked(java.lang.String namespace) { return wrapperContained.isPathBlocked(namespace); }

}