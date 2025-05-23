package yarnwrap.client.resource.metadata;
public class AnimationResourceMetadata { public net.minecraft.client.resource.metadata.AnimationResourceMetadata wrapperContained; public AnimationResourceMetadata(net.minecraft.client.resource.metadata.AnimationResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional width() { return wrapperContained.width; }
// public void width(java.util.Optional value) { wrapperContained.width = value; }
// public static java.util.Optional width() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.width; }
// public static void width(java.util.Optional value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.width = value; }

// public java.util.Optional height() { return wrapperContained.height; }
// public void height(java.util.Optional value) { wrapperContained.height = value; }
// public static java.util.Optional height() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.height; }
// public static void height(java.util.Optional value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.height = value; }

// public int defaultFrameTime() { return wrapperContained.defaultFrameTime; }
// public void defaultFrameTime(int value) { wrapperContained.defaultFrameTime = value; }
// public static int defaultFrameTime() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.defaultFrameTime; }
// public static void defaultFrameTime(int value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.defaultFrameTime = value; }

// public boolean interpolate() { return wrapperContained.interpolate; }
// public void interpolate(boolean value) { wrapperContained.interpolate = value; }
// public static boolean interpolate() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.interpolate; }
// public static void interpolate(boolean value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.interpolate = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.CODEC = value; }

// public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
public static yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(net.minecraft.client.resource.metadata.AnimationResourceMetadata.SERIALIZER); }
// public static void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.SERIALIZER = value.wrapperContained; }

// public AnimationResourceMetadata(java.util.Optional defaultFrameTime,java.util.Optional interpolate) { this.wrapperContained = new net.minecraft.client.resource.metadata.AnimationResourceMetadata(defaultFrameTime,interpolate); }
// public java.util.Optional width() { return wrapperContained.width(); }
// // public static java.util.Optional width() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.width(); }
// public java.util.Optional height() { return wrapperContained.height(); }
// // public static java.util.Optional height() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.height(); }
// public int defaultFrameTime() { return wrapperContained.defaultFrameTime(); }
// // public static int defaultFrameTime() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.defaultFrameTime(); }
// public boolean interpolate() { return wrapperContained.interpolate(); }
// // public static boolean interpolate() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.interpolate(); }
public yarnwrap.client.texture.SpriteDimensions getSize(int defaultWidth,int defaultHeight) { return new yarnwrap.client.texture.SpriteDimensions(wrapperContained.getSize(defaultWidth,defaultHeight)); }
// public static yarnwrap.client.texture.SpriteDimensions getSize(int defaultWidth,int defaultHeight, ) { return new yarnwrap.client.texture.SpriteDimensions(net.minecraft.client.resource.metadata.AnimationResourceMetadata.getSize(defaultWidth,defaultHeight)); }
// public com.mojang.datafixers.kinds.App method_65887(Object instance) { return wrapperContained.method_65887(instance); }
// public static com.mojang.datafixers.kinds.App method_65887(Object instance, ) { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.method_65887(instance); }

}