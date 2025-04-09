package yarnwrap.resource.metadata;
public class ResourceMetadataSerializer { public net.minecraft.resource.metadata.ResourceMetadataSerializer wrapperContained; public ResourceMetadataSerializer(net.minecraft.resource.metadata.ResourceMetadataSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.google.gson.JsonObject toJson(java.lang.Object metadata) { return wrapperContained.toJson(metadata); }
// public yarnwrap.resource.metadata.ResourceMetadataSerializer fromCodec(java.lang.String key,com.mojang.serialization.Codec codec) { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.fromCodec(key,codec)); }

}