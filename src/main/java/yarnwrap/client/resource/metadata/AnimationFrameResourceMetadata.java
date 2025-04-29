package yarnwrap.client.resource.metadata;
public class AnimationFrameResourceMetadata { public net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata wrapperContained; public AnimationFrameResourceMetadata(net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public int UNDEFINED_TIME() { return wrapperContained.UNDEFINED_TIME; }
// public void UNDEFINED_TIME(int value) { wrapperContained.UNDEFINED_TIME = value; }
public static int UNDEFINED_TIME() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.UNDEFINED_TIME; }
// public static void UNDEFINED_TIME(int value, ) { net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.UNDEFINED_TIME = value; }

// public int time() { return wrapperContained.time; }
// public void time(int value) { wrapperContained.time = value; }
// public static int time() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.time; }
// public static void time(int value, ) { net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.time = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.index; }
// public static void index(int value, ) { net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.index = value; }

public AnimationFrameResourceMetadata(int index) { this.wrapperContained = new net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata(index); }
public AnimationFrameResourceMetadata(int index,int time) { this.wrapperContained = new net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata(index,time); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.getIndex(); }
public int getTime(int defaultTime) { return wrapperContained.getTime(defaultTime); }
// public static int getTime(int defaultTime, ) { return net.minecraft.client.resource.metadata.AnimationFrameResourceMetadata.getTime(defaultTime); }

}