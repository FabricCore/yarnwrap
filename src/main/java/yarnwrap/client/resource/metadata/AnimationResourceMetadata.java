package yarnwrap.client.resource.metadata;
public class AnimationResourceMetadata { public net.minecraft.client.resource.metadata.AnimationResourceMetadata wrapperContained; public AnimationResourceMetadata(net.minecraft.client.resource.metadata.AnimationResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.resource.metadata.AnimationResourceMetadata EMPTY() { return new yarnwrap.client.resource.metadata.AnimationResourceMetadata(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.resource.metadata.AnimationResourceMetadata value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.resource.metadata.AnimationResourceMetadata EMPTY() { return new yarnwrap.client.resource.metadata.AnimationResourceMetadata(net.minecraft.client.resource.metadata.AnimationResourceMetadata.EMPTY); }
// public static void EMPTY(yarnwrap.client.resource.metadata.AnimationResourceMetadata value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.EMPTY = value.wrapperContained; }

// public java.lang.String KEY() { return wrapperContained.KEY; }
// public void KEY(java.lang.String value) { wrapperContained.KEY = value; }
public static java.lang.String KEY() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.KEY; }
// public static void KEY(java.lang.String value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.KEY = value; }

// public int EMPTY_FRAME_TIME() { return wrapperContained.EMPTY_FRAME_TIME; }
// public void EMPTY_FRAME_TIME(int value) { wrapperContained.EMPTY_FRAME_TIME = value; }
public static int EMPTY_FRAME_TIME() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.EMPTY_FRAME_TIME; }
// public static void EMPTY_FRAME_TIME(int value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.EMPTY_FRAME_TIME = value; }

// public int UNDEFINED() { return wrapperContained.UNDEFINED; }
// public void UNDEFINED(int value) { wrapperContained.UNDEFINED = value; }
public static int UNDEFINED() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.UNDEFINED; }
// public static void UNDEFINED(int value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.UNDEFINED = value; }

// public int defaultFrameTime() { return wrapperContained.defaultFrameTime; }
// public void defaultFrameTime(int value) { wrapperContained.defaultFrameTime = value; }
// public static int defaultFrameTime() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.defaultFrameTime; }
// public static void defaultFrameTime(int value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.defaultFrameTime = value; }

// public boolean interpolate() { return wrapperContained.interpolate; }
// public void interpolate(boolean value) { wrapperContained.interpolate = value; }
// public static boolean interpolate() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.interpolate; }
// public static void interpolate(boolean value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.interpolate = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.height; }
// public static void height(int value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.height = value; }

// public yarnwrap.client.resource.metadata.AnimationResourceMetadataReader READER() { return new yarnwrap.client.resource.metadata.AnimationResourceMetadataReader(wrapperContained.READER); }
// public void READER(yarnwrap.client.resource.metadata.AnimationResourceMetadataReader value) { wrapperContained.READER = value.wrapperContained; }
public static yarnwrap.client.resource.metadata.AnimationResourceMetadataReader READER() { return new yarnwrap.client.resource.metadata.AnimationResourceMetadataReader(net.minecraft.client.resource.metadata.AnimationResourceMetadata.READER); }
// public static void READER(yarnwrap.client.resource.metadata.AnimationResourceMetadataReader value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.READER = value.wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.width; }
// public static void width(int value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.width = value; }

// public java.util.List frames() { return wrapperContained.frames; }
// public void frames(java.util.List value) { wrapperContained.frames = value; }
// public static java.util.List frames() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.frames; }
// public static void frames(java.util.List value, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.frames = value; }

public AnimationResourceMetadata(java.util.List frames,int width,int height,int defaultFrameTime,boolean interpolate) { this.wrapperContained = new net.minecraft.client.resource.metadata.AnimationResourceMetadata(frames,width,height,defaultFrameTime,interpolate); }
public yarnwrap.client.texture.SpriteDimensions getSize(int defaultWidth,int defaultHeight) { return new yarnwrap.client.texture.SpriteDimensions(wrapperContained.getSize(defaultWidth,defaultHeight)); }
// public static yarnwrap.client.texture.SpriteDimensions getSize(int defaultWidth,int defaultHeight, ) { return new yarnwrap.client.texture.SpriteDimensions(net.minecraft.client.resource.metadata.AnimationResourceMetadata.getSize(defaultWidth,defaultHeight)); }
// public void forEachFrame(Object consumer) { wrapperContained.forEachFrame(consumer); }
// public static void forEachFrame(Object consumer, ) { net.minecraft.client.resource.metadata.AnimationResourceMetadata.forEachFrame(consumer); }
public int getDefaultFrameTime() { return wrapperContained.getDefaultFrameTime(); }
// public static int getDefaultFrameTime() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.getDefaultFrameTime(); }
public boolean shouldInterpolate() { return wrapperContained.shouldInterpolate(); }
// public static boolean shouldInterpolate() { return net.minecraft.client.resource.metadata.AnimationResourceMetadata.shouldInterpolate(); }

}