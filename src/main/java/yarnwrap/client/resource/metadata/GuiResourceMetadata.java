package yarnwrap.client.resource.metadata;
public class GuiResourceMetadata { public net.minecraft.client.resource.metadata.GuiResourceMetadata wrapperContained; public GuiResourceMetadata(net.minecraft.client.resource.metadata.GuiResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.resource.metadata.GuiResourceMetadata DEFAULT() { return new yarnwrap.client.resource.metadata.GuiResourceMetadata(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.client.resource.metadata.GuiResourceMetadata value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
// public com.mojang.datafixers.kinds.App method_52875(Object instance) { return wrapperContained.method_52875(instance); }

}