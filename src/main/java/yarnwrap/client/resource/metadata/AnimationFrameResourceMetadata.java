package yarnwrap.client.resource.metadata;
public class AnimationFrameResourceMetadata { public net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata wrapperContained; public AnimationFrameResourceMetadata(net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.index; }
// public static void index(int value, ) { net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.index = value; }

// public java.util.Optional time() { return wrapperContained.time; }
// public void time(java.util.Optional value) { wrapperContained.time = value; }
// public static java.util.Optional time() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.time; }
// public static void time(java.util.Optional value, ) { net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.time = value; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.BASE_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.CODEC = value; }

public AnimationFrameResourceMetadata(int index) { this.wrapperContained = new net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata(index); }
// public AnimationFrameResourceMetadata(int index) { this.wrapperContained = new net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata(index); }
// public int index() { return wrapperContained.index(); }
// // public static int index() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.index(); }
// public java.util.Optional time() { return wrapperContained.time(); }
// // public static java.util.Optional time() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.time(); }
public int getTime(int defaultTime) { return wrapperContained.getTime(defaultTime); }
// public static int getTime(int defaultTime, ) { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.getTime(defaultTime); }
// public yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata method_65883(com.mojang.datafixers.util.Either either) { return new yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata(wrapperContained.method_65883(either)); }
// public static yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata method_65883(com.mojang.datafixers.util.Either either, ) { return new yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata(net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.method_65883(either)); }
// public com.mojang.datafixers.kinds.App method_65884(Object instance) { return wrapperContained.method_65884(instance); }
// public static com.mojang.datafixers.kinds.App method_65884(Object instance, ) { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.method_65884(instance); }
// public com.mojang.datafixers.util.Either method_65885(yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata metadatax) { return wrapperContained.method_65885(metadatax.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_65885(yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata metadatax, ) { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.method_65885(metadatax.wrapperContained); }
// public yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata method_65886(yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata metadata) { return new yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata(wrapperContained.method_65886(metadata.wrapperContained)); }
// public static yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata method_65886(yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata metadata, ) { return new yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata(net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.method_65886(metadata.wrapperContained)); }

}