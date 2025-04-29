package yarnwrap.client.resource.metadata;
public class GuiResourceMetadata { public net.minecraft.client.resource.metadata.GuiResourceMetadata wrapperContained; public GuiResourceMetadata(net.minecraft.client.resource.metadata.GuiResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.metadata.GuiResourceMetadata DEFAULT() { return new yarnwrap.client.resource.metadata.GuiResourceMetadata(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.client.resource.metadata.GuiResourceMetadata value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.client.resource.metadata.GuiResourceMetadata DEFAULT() { return new yarnwrap.client.resource.metadata.GuiResourceMetadata(net.minecraft.client.resource.metadata.GuiResourceMetadata.DEFAULT); }
// public static void DEFAULT(yarnwrap.client.resource.metadata.GuiResourceMetadata value, ) { net.minecraft.client.resource.metadata.GuiResourceMetadata.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.resource.metadata.GuiResourceMetadata.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.resource.metadata.GuiResourceMetadata.CODEC = value; }

// public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
public static yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(net.minecraft.client.resource.metadata.GuiResourceMetadata.SERIALIZER); }
// public static void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value, ) { net.minecraft.client.resource.metadata.GuiResourceMetadata.SERIALIZER = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_52875(Object instance) { return wrapperContained.method_52875(instance); }
// public static com.mojang.datafixers.kinds.App method_52875(Object instance, ) { return net.minecraft.client.resource.metadata.GuiResourceMetadata.method_52875(instance); }

}