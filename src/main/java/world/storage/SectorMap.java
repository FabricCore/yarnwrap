package yarnwrap.world.storage;
public class SectorMap { public net.minecraft.world.storage.SectorMap wrapperContained; public SectorMap(net.minecraft.world.storage.SectorMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.BitSet bitSet() { return wrapperContained.bitSet; }
public int allocate(int size) { return wrapperContained.allocate(size); }
public void allocate(int start,int size) { wrapperContained.allocate(start,size); }
public void free(int start,int size) { wrapperContained.free(start,size); }
public it.unimi.dsi.fastutil.ints.IntSet getAllocatedBits() { return wrapperContained.getAllocatedBits(); }

}