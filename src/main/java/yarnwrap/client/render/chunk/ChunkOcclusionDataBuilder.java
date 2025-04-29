package yarnwrap.client.render.chunk;
public class ChunkOcclusionDataBuilder { public net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder wrapperContained; public ChunkOcclusionDataBuilder(net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public int openCount() { return wrapperContained.openCount; }
// public void openCount(int value) { wrapperContained.openCount = value; }
// public static int openCount() { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.openCount; }
// public static void openCount(int value, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.openCount = value; }

// public int[] EDGE_POINTS() { return wrapperContained.EDGE_POINTS; }
// public void EDGE_POINTS(int[] value) { wrapperContained.EDGE_POINTS = value; }
// public static int[] EDGE_POINTS() { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.EDGE_POINTS; }
// public static void EDGE_POINTS(int[] value, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.EDGE_POINTS = value; }

// public int STEP_Y() { return wrapperContained.STEP_Y; }
// public void STEP_Y(int value) { wrapperContained.STEP_Y = value; }
// public static int STEP_Y() { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.STEP_Y; }
// public static void STEP_Y(int value, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.STEP_Y = value; }

// public int STEP_Z() { return wrapperContained.STEP_Z; }
// public void STEP_Z(int value) { wrapperContained.STEP_Z = value; }
// public static int STEP_Z() { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.STEP_Z; }
// public static void STEP_Z(int value, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.STEP_Z = value; }

// public int STEP_X() { return wrapperContained.STEP_X; }
// public void STEP_X(int value) { wrapperContained.STEP_X = value; }
// public static int STEP_X() { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.STEP_X; }
// public static void STEP_X(int value, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.STEP_X = value; }

// public java.util.BitSet closed() { return wrapperContained.closed; }
// public void closed(java.util.BitSet value) { wrapperContained.closed = value; }
// public static java.util.BitSet closed() { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.closed; }
// public static void closed(java.util.BitSet value, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.closed = value; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
// public static net.minecraft.util.math.Direction[] DIRECTIONS() { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.DIRECTIONS; }
// public static void DIRECTIONS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.DIRECTIONS = value; }

public yarnwrap.client.render.chunk.ChunkOcclusionData build() { return new yarnwrap.client.render.chunk.ChunkOcclusionData(wrapperContained.build()); }
// public static yarnwrap.client.render.chunk.ChunkOcclusionData build() { return new yarnwrap.client.render.chunk.ChunkOcclusionData(net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.build()); }
// public void method_3680(int edgePoints) { wrapperContained.method_3680(edgePoints); }
// public static void method_3680(int edgePoints, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.method_3680(edgePoints); }
// public int pack(int x,int y,int z) { return wrapperContained.pack(x,y,z); }
// public static int pack(int x,int y,int z, ) { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.pack(x,y,z); }
public void markClosed(yarnwrap.util.math.BlockPos pos) { wrapperContained.markClosed(pos.wrapperContained); }
// public static void markClosed(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.markClosed(pos.wrapperContained); }
// public int pack(yarnwrap.util.math.BlockPos pos) { return wrapperContained.pack(pos.wrapperContained); }
// public static int pack(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.pack(pos.wrapperContained); }
// public void addEdgeFaces(int pos,java.util.Set openFaces) { wrapperContained.addEdgeFaces(pos,openFaces); }
// public static void addEdgeFaces(int pos,java.util.Set openFaces, ) { net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.addEdgeFaces(pos,openFaces); }
// public int offset(int pos,yarnwrap.util.math.Direction direction) { return wrapperContained.offset(pos,direction.wrapperContained); }
// public static int offset(int pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.offset(pos,direction.wrapperContained); }
// public java.util.Set getOpenFaces(int pos) { return wrapperContained.getOpenFaces(pos); }
// public static java.util.Set getOpenFaces(int pos, ) { return net.minecraft.client.render.chunk.ChunkOcclusionDataBuilder.getOpenFaces(pos); }

}