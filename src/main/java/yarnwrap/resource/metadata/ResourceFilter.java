package yarnwrap.resource.metadata;
public class ResourceFilter { public net.minecraft.resource.metadata.ResourceFilter wrapperContained; public ResourceFilter(net.minecraft.resource.metadata.ResourceFilter wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.List blocks() { return wrapperContained.blocks; }
// public void blocks(java.util.List value) { wrapperContained.blocks = value; }
public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
public ResourceFilter(java.util.List blocks) { this.wrapperContained = new net.minecraft.resource.metadata.ResourceFilter(blocks); }
// public java.util.List method_41277(yarnwrap.resource.metadata.ResourceFilter filter) { return wrapperContained.method_41277(filter.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_41278(Object instance) { return wrapperContained.method_41278(instance); }
public boolean isNamespaceBlocked(java.lang.String namespace) { return wrapperContained.isNamespaceBlocked(namespace); }
// public boolean method_41280(java.lang.String block) { return wrapperContained.method_41280(block); }
public boolean isPathBlocked(java.lang.String namespace) { return wrapperContained.isPathBlocked(namespace); }
// public boolean method_41282(java.lang.String block) { return wrapperContained.method_41282(block); }

}