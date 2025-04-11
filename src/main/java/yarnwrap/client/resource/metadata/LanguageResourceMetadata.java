package yarnwrap.client.resource.metadata;
public class LanguageResourceMetadata { public net.minecraft.client.resource.metadata.LanguageResourceMetadata wrapperContained; public LanguageResourceMetadata(net.minecraft.client.resource.metadata.LanguageResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map definitions() { return wrapperContained.definitions; }
// public void definitions(java.util.Map value) { wrapperContained.definitions = value; }
public com.mojang.serialization.Codec LANGUAGE_CODE_CODEC() { return wrapperContained.LANGUAGE_CODE_CODEC; }
// public void LANGUAGE_CODE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LANGUAGE_CODE_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
// public java.util.Map definitions() { return wrapperContained.definitions(); }

}