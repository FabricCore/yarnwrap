package yarnwrap.util.math;
public class ColumnPos { public net.minecraft.util.math.ColumnPos wrapperContained; public ColumnPos(net.minecraft.util.math.ColumnPos wrapperContained) { this.wrapperContained = wrapperContained; }

// public int x() { return wrapperContained.x; }
// public int z() { return wrapperContained.z; }
// public int x() { return wrapperContained.x(); }
// public int z() { return wrapperContained.z(); }
public yarnwrap.util.math.ChunkPos toChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.toChunkPos()); }
public long pack(int x,int z) { return wrapperContained.pack(x,z); }
public long pack() { return wrapperContained.pack(); }
public int getX(long packed) { return wrapperContained.getX(packed); }
public int getZ(long packed) { return wrapperContained.getZ(packed); }

}