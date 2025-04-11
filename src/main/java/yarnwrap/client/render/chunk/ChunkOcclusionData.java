package yarnwrap.client.render.chunk;
public class ChunkOcclusionData { public net.minecraft.client.render.chunk.ChunkOcclusionData wrapperContained; public ChunkOcclusionData(net.minecraft.client.render.chunk.ChunkOcclusionData wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DIRECTION_COUNT() { return wrapperContained.DIRECTION_COUNT; }
// public void DIRECTION_COUNT(int value) { wrapperContained.DIRECTION_COUNT = value; }
// public java.util.BitSet visibility() { return wrapperContained.visibility; }
// public void visibility(java.util.BitSet value) { wrapperContained.visibility = value; }
public void setVisibleThrough(yarnwrap.util.math.Direction from,yarnwrap.util.math.Direction to,boolean visible) { wrapperContained.setVisibleThrough(from.wrapperContained,to.wrapperContained,visible); }
public void addOpenEdgeFaces(java.util.Set faces) { wrapperContained.addOpenEdgeFaces(faces); }
public void fill(boolean visible) { wrapperContained.fill(visible); }
public boolean isVisibleThrough(yarnwrap.util.math.Direction from,yarnwrap.util.math.Direction to) { return wrapperContained.isVisibleThrough(from.wrapperContained,to.wrapperContained); }

}