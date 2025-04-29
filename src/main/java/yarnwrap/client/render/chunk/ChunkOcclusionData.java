package yarnwrap.client.render.chunk;
public class ChunkOcclusionData { public net.minecraft.client.render.chunk.ChunkOcclusionData wrapperContained; public ChunkOcclusionData(net.minecraft.client.render.chunk.ChunkOcclusionData wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DIRECTION_COUNT() { return wrapperContained.DIRECTION_COUNT; }
// public void DIRECTION_COUNT(int value) { wrapperContained.DIRECTION_COUNT = value; }
// public static int DIRECTION_COUNT() { return net.minecraft.client.render.chunk.ChunkOcclusionData.DIRECTION_COUNT; }
// public static void DIRECTION_COUNT(int value, ) { net.minecraft.client.render.chunk.ChunkOcclusionData.DIRECTION_COUNT = value; }

// public java.util.BitSet visibility() { return wrapperContained.visibility; }
// public void visibility(java.util.BitSet value) { wrapperContained.visibility = value; }
// public static java.util.BitSet visibility() { return net.minecraft.client.render.chunk.ChunkOcclusionData.visibility; }
// public static void visibility(java.util.BitSet value, ) { net.minecraft.client.render.chunk.ChunkOcclusionData.visibility = value; }

public void setVisibleThrough(yarnwrap.util.math.Direction from,yarnwrap.util.math.Direction to,boolean visible) { wrapperContained.setVisibleThrough(from.wrapperContained,to.wrapperContained,visible); }
// public static void setVisibleThrough(yarnwrap.util.math.Direction from,yarnwrap.util.math.Direction to,boolean visible, ) { net.minecraft.client.render.chunk.ChunkOcclusionData.setVisibleThrough(from.wrapperContained,to.wrapperContained,visible); }
public void addOpenEdgeFaces(java.util.Set faces) { wrapperContained.addOpenEdgeFaces(faces); }
// public static void addOpenEdgeFaces(java.util.Set faces, ) { net.minecraft.client.render.chunk.ChunkOcclusionData.addOpenEdgeFaces(faces); }
public void fill(boolean visible) { wrapperContained.fill(visible); }
// public static void fill(boolean visible, ) { net.minecraft.client.render.chunk.ChunkOcclusionData.fill(visible); }
public boolean isVisibleThrough(yarnwrap.util.math.Direction from,yarnwrap.util.math.Direction to) { return wrapperContained.isVisibleThrough(from.wrapperContained,to.wrapperContained); }
// public static boolean isVisibleThrough(yarnwrap.util.math.Direction from,yarnwrap.util.math.Direction to, ) { return net.minecraft.client.render.chunk.ChunkOcclusionData.isVisibleThrough(from.wrapperContained,to.wrapperContained); }

}