package yarnwrap.client.render.chunk;
public class ChunkOcclusionDataBuilder { public net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder wrapperContained; public ChunkOcclusionDataBuilder(net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public int openCount() { return wrapperContained.openCount; }
// public int[] EDGE_POINTS() { return wrapperContained.EDGE_POINTS; }
// public int STEP_Y() { return wrapperContained.STEP_Y; }
// public int STEP_Z() { return wrapperContained.STEP_Z; }
// public int STEP_X() { return wrapperContained.STEP_X; }
// public java.util.BitSet closed() { return wrapperContained.closed; }
// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
public yarnwrap.client.render.chunk.ChunkOcclusionData build() { return new yarnwrap.client.render.chunk.ChunkOcclusionData(wrapperContained.build()); }
// public int pack(int x,int y,int z) { return wrapperContained.pack(x,y,z); }
public void markClosed(yarnwrap.util.math.BlockPos pos) { wrapperContained.markClosed(pos.wrapperContained); }
// public int pack(yarnwrap.util.math.BlockPos pos) { return wrapperContained.pack(pos.wrapperContained); }
// public void addEdgeFaces(int pos,java.util.Set openFaces) { wrapperContained.addEdgeFaces(pos,openFaces); }
// public int offset(int pos,yarnwrap.util.math.Direction direction) { return wrapperContained.offset(pos,direction.wrapperContained); }
// public java.util.Set getOpenFaces(int pos) { return wrapperContained.getOpenFaces(pos); }

}