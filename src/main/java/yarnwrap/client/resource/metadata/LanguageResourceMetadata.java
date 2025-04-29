package yarnwrap.client.resource.metadata;
public class LanguageResourceMetadata { public net.minecraft.client.resource.metadata.LanguageResourceMetadata wrapperContained; public LanguageResourceMetadata(net.minecraft.client.resource.metadata.LanguageResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map definitions() { return wrapperContained.definitions; }
// public void definitions(java.util.Map value) { wrapperContained.definitions = value; }
// public static java.util.Map definitions() { return net.minecraft.client.resource.metadata.LanguageResourceMetadata.definitions; }
// public static void definitions(java.util.Map value, ) { net.minecraft.client.resource.metadata.LanguageResourceMetadata.definitions = value; }

// public com.mojang.serialization.Codec LANGUAGE_CODE_CODEC() { return wrapperContained.LANGUAGE_CODE_CODEC; }
// public void LANGUAGE_CODE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LANGUAGE_CODE_CODEC = value; }
public static com.mojang.serialization.Codec LANGUAGE_CODE_CODEC() { return net.minecraft.client.resource.metadata.LanguageResourceMetadata.LANGUAGE_CODE_CODEC; }
// public static void LANGUAGE_CODE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.resource.metadata.LanguageResourceMetadata.LANGUAGE_CODE_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.resource.metadata.LanguageResourceMetadata.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.resource.metadata.LanguageResourceMetadata.CODEC = value; }

// public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
public static yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(net.minecraft.client.resource.metadata.LanguageResourceMetadata.SERIALIZER); }
// public static void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value, ) { net.minecraft.client.resource.metadata.LanguageResourceMetadata.SERIALIZER = value.wrapperContained; }

// public java.util.Map definitions() { return wrapperContained.definitions(); }
// // public static java.util.Map definitions() { return net.minecraft.client.resource.metadata.LanguageResourceMetadata.definitions(); }

}