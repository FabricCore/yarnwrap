package yarnwrap.client.resource.metadata;
public class AnimationResourceMetadata { public net.minecraft.client.resource.metadata.AnimationResourceMetadata wrapperContained; public AnimationResourceMetadata(net.minecraft.client.resource.metadata.AnimationResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.resource.metadata.AnimationResourceMetadata EMPTY() { return new yarnwrap.client.resource.metadata.AnimationResourceMetadata(wrapperContained.EMPTY); }
public java.lang.String KEY() { return wrapperContained.KEY; }
public int EMPTY_FRAME_TIME() { return wrapperContained.EMPTY_FRAME_TIME; }
public int UNDEFINED() { return wrapperContained.UNDEFINED; }
// public int defaultFrameTime() { return wrapperContained.defaultFrameTime; }
// public boolean interpolate() { return wrapperContained.interpolate; }
// public int height() { return wrapperContained.height; }
public yarnwrap.client.resource.metadata.AnimationResourceMetadataReader READER() { return new yarnwrap.client.resource.metadata.AnimationResourceMetadataReader(wrapperContained.READER); }
// public int width() { return wrapperContained.width; }
// public java.util.List frames() { return wrapperContained.frames; }
public yarnwrap.client.texture.SpriteDimensions getSize(int defaultWidth,int defaultHeight) { return new yarnwrap.client.texture.SpriteDimensions(wrapperContained.getSize(defaultWidth,defaultHeight)); }
// public void forEachFrame(Object consumer) { wrapperContained.forEachFrame(consumer); }
public int getDefaultFrameTime() { return wrapperContained.getDefaultFrameTime(); }
public boolean shouldInterpolate() { return wrapperContained.shouldInterpolate(); }

}