package yarnwrap.client.resource.metadata;
public class AnimationFrameResourceMetadata { public net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata wrapperContained; public AnimationFrameResourceMetadata(net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public int UNDEFINED_TIME() { return wrapperContained.UNDEFINED_TIME; }
// public int time() { return wrapperContained.time; }
// public int index() { return wrapperContained.index; }
public int getIndex() { return wrapperContained.getIndex(); }
public int getTime(int defaultTime) { return wrapperContained.getTime(defaultTime); }

}