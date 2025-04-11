package yarnwrap.client.resource.metadata;
public class AnimationFrameResourceMetadata { public net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata wrapperContained; public AnimationFrameResourceMetadata(net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public int UNDEFINED_TIME() { return wrapperContained.UNDEFINED_TIME; }
// public void UNDEFINED_TIME(int value) { wrapperContained.UNDEFINED_TIME = value; }
// public int time() { return wrapperContained.time; }
// public void time(int value) { wrapperContained.time = value; }
// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
public int getIndex() { return wrapperContained.getIndex(); }
public int getTime(int defaultTime) { return wrapperContained.getTime(defaultTime); }

}