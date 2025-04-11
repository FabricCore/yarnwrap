package yarnwrap.client.resource.metadata;
public class AnimationResourceMetadataReader { public net.minecraft.client.resource.metadata.AnimationResourceMetadataReader wrapperContained; public AnimationResourceMetadataReader(net.minecraft.client.resource.metadata.AnimationResourceMetadataReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata readFrameMetadata(int frame,com.google.gson.JsonElement json) { return new yarnwrap.client.resource.metadata.AnimationFrameResourceMetadata(wrapperContained.readFrameMetadata(frame,json)); }

}