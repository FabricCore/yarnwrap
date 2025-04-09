package yarnwrap.resource.metadata;
public class PackResourceMetadata { public net.minecraft.resource.metadata.PackResourceMetadata wrapperContained; public PackResourceMetadata(net.minecraft.resource.metadata.PackResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}