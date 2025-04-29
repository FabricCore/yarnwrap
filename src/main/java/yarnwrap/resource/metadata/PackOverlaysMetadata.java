package yarnwrap.resource.metadata;
public class PackOverlaysMetadata { public net.minecraft.resource.metadata.PackOverlaysMetadata wrapperContained; public PackOverlaysMetadata(net.minecraft.resource.metadata.PackOverlaysMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
public static yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(net.minecraft.resource.metadata.PackOverlaysMetadata.SERIALIZER); }
// public static void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value, ) { net.minecraft.resource.metadata.PackOverlaysMetadata.SERIALIZER = value.wrapperContained; }

// public java.util.regex.Pattern DIRECTORY_NAME_PATTERN() { return wrapperContained.DIRECTORY_NAME_PATTERN; }
// public void DIRECTORY_NAME_PATTERN(java.util.regex.Pattern value) { wrapperContained.DIRECTORY_NAME_PATTERN = value; }
// public static java.util.regex.Pattern DIRECTORY_NAME_PATTERN() { return net.minecraft.resource.metadata.PackOverlaysMetadata.DIRECTORY_NAME_PATTERN; }
// public static void DIRECTORY_NAME_PATTERN(java.util.regex.Pattern value, ) { net.minecraft.resource.metadata.PackOverlaysMetadata.DIRECTORY_NAME_PATTERN = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public static com.mojang.serialization.Codec CODEC() { return net.minecraft.resource.metadata.PackOverlaysMetadata.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.resource.metadata.PackOverlaysMetadata.CODEC = value; }

public java.util.List getAppliedOverlays(int packFormat) { return wrapperContained.getAppliedOverlays(packFormat); }
// public static java.util.List getAppliedOverlays(int packFormat, ) { return net.minecraft.resource.metadata.PackOverlaysMetadata.getAppliedOverlays(packFormat); }
// public boolean method_52428(int overlay) { return wrapperContained.method_52428(overlay); }
// public static boolean method_52428(int overlay, ) { return net.minecraft.resource.metadata.PackOverlaysMetadata.method_52428(overlay); }
// public com.mojang.datafixers.kinds.App method_52429(Object instance) { return wrapperContained.method_52429(instance); }
// public static com.mojang.datafixers.kinds.App method_52429(Object instance, ) { return net.minecraft.resource.metadata.PackOverlaysMetadata.method_52429(instance); }
// public com.mojang.serialization.DataResult validate(java.lang.String directoryName) { return wrapperContained.validate(directoryName); }
// public static com.mojang.serialization.DataResult validate(java.lang.String directoryName, ) { return net.minecraft.resource.metadata.PackOverlaysMetadata.validate(directoryName); }

}