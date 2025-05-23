package yarnwrap.client.resource.metadata;
public class TextureResourceMetadata { public net.minecraft.client.resource.metadata.TextureResourceMetadata wrapperContained; public TextureResourceMetadata(net.minecraft.client.resource.metadata.TextureResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean blur() { return wrapperContained.blur; }
// public void blur(boolean value) { wrapperContained.blur = value; }
// public static boolean blur() { return net.minecraft.client.resource.metadata.TextureResourceMetadata.blur; }
// public static void blur(boolean value, ) { net.minecraft.client.resource.metadata.TextureResourceMetadata.blur = value; }

// public boolean clamp() { return wrapperContained.clamp; }
// public void clamp(boolean value) { wrapperContained.clamp = value; }
// public static boolean clamp() { return net.minecraft.client.resource.metadata.TextureResourceMetadata.clamp; }
// public static void clamp(boolean value, ) { net.minecraft.client.resource.metadata.TextureResourceMetadata.clamp = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.resource.metadata.TextureResourceMetadata.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.resource.metadata.TextureResourceMetadata.CODEC = value; }

// public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
public static yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(net.minecraft.client.resource.metadata.TextureResourceMetadata.SERIALIZER); }
// public static void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value, ) { net.minecraft.client.resource.metadata.TextureResourceMetadata.SERIALIZER = value.wrapperContained; }

public TextureResourceMetadata(boolean blur,boolean clamp) { this.wrapperContained = new net.minecraft.client.resource.metadata.TextureResourceMetadata(blur,clamp); }
// public boolean blur() { return wrapperContained.blur(); }
// // public static boolean blur() { return net.minecraft.client.resource.metadata.TextureResourceMetadata.blur(); }
// public boolean clamp() { return wrapperContained.clamp(); }
// // public static boolean clamp() { return net.minecraft.client.resource.metadata.TextureResourceMetadata.clamp(); }
// public com.mojang.datafixers.kinds.App method_65889(Object instance) { return wrapperContained.method_65889(instance); }
// public static com.mojang.datafixers.kinds.App method_65889(Object instance, ) { return net.minecraft.client.resource.metadata.TextureResourceMetadata.method_65889(instance); }

}