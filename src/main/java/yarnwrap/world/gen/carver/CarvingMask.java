package yarnwrap.world.gen.carver;
public class CarvingMask { public net.minecraft.world.gen.carver.CarvingMask wrapperContained; public CarvingMask(net.minecraft.world.gen.carver.CarvingMask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int bottomY() { return wrapperContained.bottomY; }
// public void bottomY(int value) { wrapperContained.bottomY = value; }
// public static int bottomY() { return net.minecraft.world.gen.carver.CarvingMask.bottomY; }
// public static void bottomY(int value, ) { net.minecraft.world.gen.carver.CarvingMask.bottomY = value; }

// public java.util.BitSet mask() { return wrapperContained.mask; }
// public void mask(java.util.BitSet value) { wrapperContained.mask = value; }
// public static java.util.BitSet mask() { return net.minecraft.world.gen.carver.CarvingMask.mask; }
// public static void mask(java.util.BitSet value, ) { net.minecraft.world.gen.carver.CarvingMask.mask = value; }

// public Object maskPredicate() { return wrapperContained.maskPredicate; }
// // public void maskPredicate(Object value) { wrapperContained.maskPredicate = value; }
// // public static Object maskPredicate() { return net.minecraft.world.gen.carver.CarvingMask.maskPredicate; }
// // public static void maskPredicate(Object value, ) { net.minecraft.world.gen.carver.CarvingMask.maskPredicate = value; }

public CarvingMask(int height,int bottomY) { this.wrapperContained = new net.minecraft.world.gen.carver.CarvingMask(height,bottomY); }
// public CarvingMask(long mask,int bottomY) { this.wrapperContained = new net.minecraft.world.gen.carver.CarvingMask(mask,bottomY); }
public long[] getMask() { return wrapperContained.getMask(); }
// public static long[] getMask() { return net.minecraft.world.gen.carver.CarvingMask.getMask(); }
public void set(int offsetX,int y,int offsetZ) { wrapperContained.set(offsetX,y,offsetZ); }
// public static void set(int offsetX,int y,int offsetZ, ) { net.minecraft.world.gen.carver.CarvingMask.set(offsetX,y,offsetZ); }
public java.util.stream.Stream streamBlockPos(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.streamBlockPos(chunkPos.wrapperContained); }
// public static java.util.stream.Stream streamBlockPos(yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.gen.carver.CarvingMask.streamBlockPos(chunkPos.wrapperContained); }
// public yarnwrap.util.math.BlockPos method_38867(yarnwrap.util.math.ChunkPos mask) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_38867(mask.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos method_38867(yarnwrap.util.math.ChunkPos mask, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.carver.CarvingMask.method_38867(mask.wrapperContained)); }
public boolean get(int offsetX,int y,int offsetZ) { return wrapperContained.get(offsetX,y,offsetZ); }
// public static boolean get(int offsetX,int y,int offsetZ, ) { return net.minecraft.world.gen.carver.CarvingMask.get(offsetX,y,offsetZ); }
// public int getIndex(int offsetX,int y,int offsetZ) { return wrapperContained.getIndex(offsetX,y,offsetZ); }
// public static int getIndex(int offsetX,int y,int offsetZ, ) { return net.minecraft.world.gen.carver.CarvingMask.getIndex(offsetX,y,offsetZ); }
// public void setMaskPredicate(Object maskPredicate) { wrapperContained.setMaskPredicate(maskPredicate); }
// public static void setMaskPredicate(Object maskPredicate, ) { net.minecraft.world.gen.carver.CarvingMask.setMaskPredicate(maskPredicate); }
// public boolean method_39786(int offsetX,int y,int offsetZ) { return wrapperContained.method_39786(offsetX,y,offsetZ); }
// public static boolean method_39786(int offsetX,int y,int offsetZ, ) { return net.minecraft.world.gen.carver.CarvingMask.method_39786(offsetX,y,offsetZ); }

}