package yarnwrap.util.math;
public class ColumnPos { public net.minecraft.util.math.ColumnPos wrapperContained; public ColumnPos(net.minecraft.util.math.ColumnPos wrapperContained) { this.wrapperContained = wrapperContained; }

// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.util.math.ColumnPos.x; }
// public static void x(int value, ) { net.minecraft.util.math.ColumnPos.x = value; }

// public int z() { return wrapperContained.z; }
// public void z(int value) { wrapperContained.z = value; }
// public static int z() { return net.minecraft.util.math.ColumnPos.z; }
// public static void z(int value, ) { net.minecraft.util.math.ColumnPos.z = value; }

// public int x() { return wrapperContained.x(); }
// // public static int x() { return net.minecraft.util.math.ColumnPos.x(); }
// public int z() { return wrapperContained.z(); }
// // public static int z() { return net.minecraft.util.math.ColumnPos.z(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.math.ColumnPos.equals(o); }
public yarnwrap.util.math.ChunkPos toChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.toChunkPos()); }
// public static yarnwrap.util.math.ChunkPos toChunkPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.util.math.ColumnPos.toChunkPos()); }
// public long pack(int x,int z) { return wrapperContained.pack(x,z); }
// public static long pack(int x,int z, ) { return net.minecraft.util.math.ColumnPos.pack(x,z); }
public long pack() { return wrapperContained.pack(); }
// public static long pack() { return net.minecraft.util.math.ColumnPos.pack(); }
// public int getX(long packed) { return wrapperContained.getX(packed); }
// public static int getX(long packed, ) { return net.minecraft.util.math.ColumnPos.getX(packed); }
// public int getZ(long packed) { return wrapperContained.getZ(packed); }
// public static int getZ(long packed, ) { return net.minecraft.util.math.ColumnPos.getZ(packed); }

}