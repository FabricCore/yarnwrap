package yarnwrap.server.network;
public class ChunkFilter { public net.minecraft.server.network.ChunkFilter wrapperContained; public ChunkFilter(net.minecraft.server.network.ChunkFilter wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.server.network.ChunkFilter IGNORE_ALL() { return new yarnwrap.server.network.ChunkFilter(wrapperContained.IGNORE_ALL); }
// public void IGNORE_ALL(yarnwrap.server.network.ChunkFilter value) { wrapperContained.IGNORE_ALL = value.wrapperContained; }
public boolean isWithinDistance(int x,int z) { return wrapperContained.isWithinDistance(x,z); }
// public boolean isWithinDistanceExcludingEdge(int centerX,int centerZ,int viewDistance,int x,int z) { return wrapperContained.isWithinDistanceExcludingEdge(centerX,centerZ,viewDistance,x,z); }
// public boolean isWithinDistance(int centerX,int centerZ,int viewDistance,int x,int z,boolean includeEdge) { return wrapperContained.isWithinDistance(centerX,centerZ,viewDistance,x,z,includeEdge); }
public boolean isWithinDistance(int x,int z,boolean includeEdge) { return wrapperContained.isWithinDistance(x,z,includeEdge); }
// public void forEachChangedChunk(yarnwrap.server.network.ChunkFilter oldFilter,yarnwrap.server.network.ChunkFilter newFilter,java.util.function.Consumer newlyIncluded,java.util.function.Consumer justRemoved) { wrapperContained.forEachChangedChunk(oldFilter.wrapperContained,newFilter.wrapperContained,newlyIncluded,justRemoved); }
public boolean isWithinDistance(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.isWithinDistance(pos.wrapperContained); }
// public yarnwrap.server.network.ChunkFilter cylindrical(yarnwrap.util.math.ChunkPos center,int viewDistance) { return new yarnwrap.server.network.ChunkFilter(wrapperContained.cylindrical(center.wrapperContained,viewDistance)); }
public void forEach(java.util.function.Consumer consumer) { wrapperContained.forEach(consumer); }
public boolean isWithinDistanceExcludingEdge(int x,int z) { return wrapperContained.isWithinDistanceExcludingEdge(x,z); }

}