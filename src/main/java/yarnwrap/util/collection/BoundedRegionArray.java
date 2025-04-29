package yarnwrap.util.collection;
public class BoundedRegionArray { public net.minecraft.util.collection.BoundedRegionArray wrapperContained; public BoundedRegionArray(net.minecraft.util.collection.BoundedRegionArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public int minX() { return wrapperContained.minX; }
// public void minX(int value) { wrapperContained.minX = value; }
// public static int minX() { return net.minecraft.util.collection.BoundedRegionArray.minX; }
// public static void minX(int value, ) { net.minecraft.util.collection.BoundedRegionArray.minX = value; }

// public int minZ() { return wrapperContained.minZ; }
// public void minZ(int value) { wrapperContained.minZ = value; }
// public static int minZ() { return net.minecraft.util.collection.BoundedRegionArray.minZ; }
// public static void minZ(int value, ) { net.minecraft.util.collection.BoundedRegionArray.minZ = value; }

// public int maxX() { return wrapperContained.maxX; }
// public void maxX(int value) { wrapperContained.maxX = value; }
// public static int maxX() { return net.minecraft.util.collection.BoundedRegionArray.maxX; }
// public static void maxX(int value, ) { net.minecraft.util.collection.BoundedRegionArray.maxX = value; }

// public int maxZ() { return wrapperContained.maxZ; }
// public void maxZ(int value) { wrapperContained.maxZ = value; }
// public static int maxZ() { return net.minecraft.util.collection.BoundedRegionArray.maxZ; }
// public static void maxZ(int value, ) { net.minecraft.util.collection.BoundedRegionArray.maxZ = value; }

// public java.lang.Object[] array() { return wrapperContained.array; }
// public void array(java.lang.Object[] value) { wrapperContained.array = value; }
// public static java.lang.Object[] array() { return net.minecraft.util.collection.BoundedRegionArray.array; }
// public static void array(java.lang.Object[] value, ) { net.minecraft.util.collection.BoundedRegionArray.array = value; }

// public BoundedRegionArray(int minX,int minZ,int maxX,int maxZ,Object getter) { this.wrapperContained = new net.minecraft.util.collection.BoundedRegionArray(minX,minZ,maxX,maxZ,getter); }
public java.lang.Object get(int x,int z) { return wrapperContained.get(x,z); }
// public static java.lang.Object get(int x,int z, ) { return net.minecraft.util.collection.BoundedRegionArray.get(x,z); }
// public yarnwrap.util.collection.BoundedRegionArray create(int centerX,int centerZ,int radius,Object getter) { return new yarnwrap.util.collection.BoundedRegionArray(wrapperContained.create(centerX,centerZ,radius,getter)); }
// public static yarnwrap.util.collection.BoundedRegionArray create(int centerX,int centerZ,int radius,Object getter, ) { return new yarnwrap.util.collection.BoundedRegionArray(net.minecraft.util.collection.BoundedRegionArray.create(centerX,centerZ,radius,getter)); }
public void forEach(java.util.function.Consumer callback) { wrapperContained.forEach(callback); }
// public static void forEach(java.util.function.Consumer callback, ) { net.minecraft.util.collection.BoundedRegionArray.forEach(callback); }
public boolean isWithinBounds(int x,int z) { return wrapperContained.isWithinBounds(x,z); }
// public static boolean isWithinBounds(int x,int z, ) { return net.minecraft.util.collection.BoundedRegionArray.isWithinBounds(x,z); }
// public int toIndex(int x,int z) { return wrapperContained.toIndex(x,z); }
// public static int toIndex(int x,int z, ) { return net.minecraft.util.collection.BoundedRegionArray.toIndex(x,z); }

}