package yarnwrap.client.resource.metadata;
public class LanguageResourceMetadata { public net.minecraft.client.resource.metadata.LanguageResourceMetadata wrapperContained; public LanguageResourceMetadata(net.minecraft.client.resource.metadata.LanguageResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map definitions() { return wrapperContained.definitions; }
public com.mojang.serialization.Codec LANGUAGE_CODE_CODEC() { return wrapperContained.LANGUAGE_CODE_CODEC; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public java.util.Map definitions() { return wrapperContained.definitions(); }

}