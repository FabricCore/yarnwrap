package yarnwrap.client.resource.metadata;
public class GuiResourceMetadata { public net.minecraft.client.resource.metadata.GuiResourceMetadata wrapperContained; public GuiResourceMetadata(net.minecraft.client.resource.metadata.GuiResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.resource.metadata.GuiResourceMetadata DEFAULT() { return new yarnwrap.client.resource.metadata.GuiResourceMetadata(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }

}