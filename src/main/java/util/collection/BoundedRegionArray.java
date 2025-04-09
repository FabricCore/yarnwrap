package yarnwrap.util.collection;
public class BoundedRegionArray { public net.minecraft.util.collection.BoundedRegionArray wrapperContained; public BoundedRegionArray(net.minecraft.util.collection.BoundedRegionArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public int minX() { return wrapperContained.minX; }
// public int minZ() { return wrapperContained.minZ; }
// public int maxX() { return wrapperContained.maxX; }
// public int maxZ() { return wrapperContained.maxZ; }
// public java.lang.Object[] array() { return wrapperContained.array; }
public java.lang.Object get(int x,int z) { return wrapperContained.get(x,z); }
// public yarnwrap.util.collection.BoundedRegionArray create(int centerX,int centerZ,int radius,Object getter) { return new yarnwrap.util.collection.BoundedRegionArray(wrapperContained.create(centerX,centerZ,radius,getter)); }
public void forEach(java.util.function.Consumer callback) { wrapperContained.forEach(callback); }
public boolean isWithinBounds(int x,int z) { return wrapperContained.isWithinBounds(x,z); }
// public int toIndex(int x,int z) { return wrapperContained.toIndex(x,z); }

}