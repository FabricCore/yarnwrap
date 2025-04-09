package yarnwrap.resource.metadata;
public class PackFeatureSetMetadata { public net.minecraft.resource.metadata.PackFeatureSetMetadata wrapperContained; public PackFeatureSetMetadata(net.minecraft.resource.metadata.PackFeatureSetMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}