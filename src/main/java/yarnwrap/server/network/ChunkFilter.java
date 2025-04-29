package yarnwrap.server.network;
public class ChunkFilter { public net.minecraft.server.network.ChunkFilter wrapperContained; public ChunkFilter(net.minecraft.server.network.ChunkFilter wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.network.ChunkFilter IGNORE_ALL() { return new yarnwrap.server.network.ChunkFilter(wrapperContained.IGNORE_ALL); }
// public void IGNORE_ALL(yarnwrap.server.network.ChunkFilter value) { wrapperContained.IGNORE_ALL = value.wrapperContained; }
public static yarnwrap.server.network.ChunkFilter IGNORE_ALL() { return new yarnwrap.server.network.ChunkFilter(net.minecraft.server.network.ChunkFilter.IGNORE_ALL); }
// public static void IGNORE_ALL(yarnwrap.server.network.ChunkFilter value, ) { net.minecraft.server.network.ChunkFilter.IGNORE_ALL = value.wrapperContained; }

public boolean isWithinDistance(int x,int z) { return wrapperContained.isWithinDistance(x,z); }
// public static boolean isWithinDistance(int x,int z, ) { return net.minecraft.server.network.ChunkFilter.isWithinDistance(x,z); }
// public boolean isWithinDistanceExcludingEdge(int centerX,int centerZ,int viewDistance,int x,int z) { return wrapperContained.isWithinDistanceExcludingEdge(centerX,centerZ,viewDistance,x,z); }
// public static boolean isWithinDistanceExcludingEdge(int centerX,int centerZ,int viewDistance,int x,int z, ) { return net.minecraft.server.network.ChunkFilter.isWithinDistanceExcludingEdge(centerX,centerZ,viewDistance,x,z); }
// public boolean isWithinDistance(int centerX,int centerZ,int viewDistance,int x,int z,boolean includeEdge) { return wrapperContained.isWithinDistance(centerX,centerZ,viewDistance,x,z,includeEdge); }
// public static boolean isWithinDistance(int centerX,int centerZ,int viewDistance,int x,int z,boolean includeEdge, ) { return net.minecraft.server.network.ChunkFilter.isWithinDistance(centerX,centerZ,viewDistance,x,z,includeEdge); }
public boolean isWithinDistance(int x,int z,boolean includeEdge) { return wrapperContained.isWithinDistance(x,z,includeEdge); }
// public static boolean isWithinDistance(int x,int z,boolean includeEdge, ) { return net.minecraft.server.network.ChunkFilter.isWithinDistance(x,z,includeEdge); }
// public void forEachChangedChunk(yarnwrap.server.network.ChunkFilter oldFilter,yarnwrap.server.network.ChunkFilter newFilter,java.util.function.Consumer newlyIncluded,java.util.function.Consumer justRemoved) { wrapperContained.forEachChangedChunk(oldFilter.wrapperContained,newFilter.wrapperContained,newlyIncluded,justRemoved); }
// public static void forEachChangedChunk(yarnwrap.server.network.ChunkFilter oldFilter,yarnwrap.server.network.ChunkFilter newFilter,java.util.function.Consumer newlyIncluded,java.util.function.Consumer justRemoved, ) { net.minecraft.server.network.ChunkFilter.forEachChangedChunk(oldFilter.wrapperContained,newFilter.wrapperContained,newlyIncluded,justRemoved); }
public boolean isWithinDistance(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.isWithinDistance(pos.wrapperContained); }
// public static boolean isWithinDistance(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.network.ChunkFilter.isWithinDistance(pos.wrapperContained); }
// public yarnwrap.server.network.ChunkFilter cylindrical(yarnwrap.util.math.ChunkPos center,int viewDistance) { return new yarnwrap.server.network.ChunkFilter(wrapperContained.cylindrical(center.wrapperContained,viewDistance)); }
// public static yarnwrap.server.network.ChunkFilter cylindrical(yarnwrap.util.math.ChunkPos center,int viewDistance, ) { return new yarnwrap.server.network.ChunkFilter(net.minecraft.server.network.ChunkFilter.cylindrical(center.wrapperContained,viewDistance)); }
public void forEach(java.util.function.Consumer consumer) { wrapperContained.forEach(consumer); }
// public static void forEach(java.util.function.Consumer consumer, ) { net.minecraft.server.network.ChunkFilter.forEach(consumer); }
public boolean isWithinDistanceExcludingEdge(int x,int z) { return wrapperContained.isWithinDistanceExcludingEdge(x,z); }
// public static boolean isWithinDistanceExcludingEdge(int x,int z, ) { return net.minecraft.server.network.ChunkFilter.isWithinDistanceExcludingEdge(x,z); }

}