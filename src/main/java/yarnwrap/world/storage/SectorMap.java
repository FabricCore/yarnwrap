package yarnwrap.world.storage;
public class SectorMap { public net.minecraft.world.storage.SectorMap wrapperContained; public SectorMap(net.minecraft.world.storage.SectorMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.BitSet bitSet() { return wrapperContained.bitSet; }
// public void bitSet(java.util.BitSet value) { wrapperContained.bitSet = value; }
// public static java.util.BitSet bitSet() { return net.minecraft.world.storage.SectorMap.bitSet; }
// public static void bitSet(java.util.BitSet value, ) { net.minecraft.world.storage.SectorMap.bitSet = value; }

public int allocate(int size) { return wrapperContained.allocate(size); }
// public static int allocate(int size, ) { return net.minecraft.world.storage.SectorMap.allocate(size); }
public void allocate(int start,int size) { wrapperContained.allocate(start,size); }
// public static void allocate(int start,int size, ) { net.minecraft.world.storage.SectorMap.allocate(start,size); }
public void free(int start,int size) { wrapperContained.free(start,size); }
// public static void free(int start,int size, ) { net.minecraft.world.storage.SectorMap.free(start,size); }
public it.unimi.dsi.fastutil.ints.IntSet getAllocatedBits() { return wrapperContained.getAllocatedBits(); }
// public static it.unimi.dsi.fastutil.ints.IntSet getAllocatedBits() { return net.minecraft.world.storage.SectorMap.getAllocatedBits(); }

}