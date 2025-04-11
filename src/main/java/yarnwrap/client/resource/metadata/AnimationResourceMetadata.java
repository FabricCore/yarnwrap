package yarnwrap.client.resource.metadata;
public class AnimationResourceMetadata { public net.minecraft.client.resource.metadata.AnimationResourceMetadata wrapperContained; public AnimationResourceMetadata(net.minecraft.client.resource.metadata.AnimationResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.resource.metadata.AnimationResourceMetadata EMPTY() { return new yarnwrap.client.resource.metadata.AnimationResourceMetadata(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.resource.metadata.AnimationResourceMetadata value) { wrapperContained.EMPTY = value.wrapperContained; }
public java.lang.String KEY() { return wrapperContained.KEY; }
// public void KEY(java.lang.String value) { wrapperContained.KEY = value; }
public int EMPTY_FRAME_TIME() { return wrapperContained.EMPTY_FRAME_TIME; }
// public void EMPTY_FRAME_TIME(int value) { wrapperContained.EMPTY_FRAME_TIME = value; }
public int UNDEFINED() { return wrapperContained.UNDEFINED; }
// public void UNDEFINED(int value) { wrapperContained.UNDEFINED = value; }
// public int defaultFrameTime() { return wrapperContained.defaultFrameTime; }
// public void defaultFrameTime(int value) { wrapperContained.defaultFrameTime = value; }
// public boolean interpolate() { return wrapperContained.interpolate; }
// public void interpolate(boolean value) { wrapperContained.interpolate = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
public yarnwrap.client.resource.metadata.AnimationResourceMetadataReader READER() { return new yarnwrap.client.resource.metadata.AnimationResourceMetadataReader(wrapperContained.READER); }
// public void READER(yarnwrap.client.resource.metadata.AnimationResourceMetadataReader value) { wrapperContained.READER = value.wrapperContained; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public java.util.List frames() { return wrapperContained.frames; }
// public void frames(java.util.List value) { wrapperContained.frames = value; }
public yarnwrap.client.texture.SpriteDimensions getSize(int defaultWidth,int defaultHeight) { return new yarnwrap.client.texture.SpriteDimensions(wrapperContained.getSize(defaultWidth,defaultHeight)); }
// public void forEachFrame(Object consumer) { wrapperContained.forEachFrame(consumer); }
public int getDefaultFrameTime() { return wrapperContained.getDefaultFrameTime(); }
public boolean shouldInterpolate() { return wrapperContained.shouldInterpolate(); }

}