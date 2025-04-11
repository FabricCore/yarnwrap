package yarnwrap.resource.metadata;
public class PackFeatureSetMetadata { public net.minecraft.resource.metadata.PackFeatureSetMetadata wrapperContained; public PackFeatureSetMetadata(net.minecraft.resource.metadata.PackFeatureSetMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_45176(Object instance) { return wrapperContained.method_45176(instance); }

}