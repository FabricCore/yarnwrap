package yarnwrap.util.shape;
public class BitSetVoxelSet { public net.minecraft.util.shape.BitSetVoxelSet wrapperContained; public BitSetVoxelSet(net.minecraft.util.shape.BitSetVoxelSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxY() { return wrapperContained.maxY; }
// public int maxX() { return wrapperContained.maxX; }
// public int minZ() { return wrapperContained.minZ; }
// public int minY() { return wrapperContained.minY; }
// public int minX() { return wrapperContained.minX; }
// public java.util.BitSet storage() { return wrapperContained.storage; }
// public int maxZ() { return wrapperContained.maxZ; }
// public int getIndex(int x,int y,int z) { return wrapperContained.getIndex(x,y,z); }
// // // public yarnwrap.util.shape.BitSetVoxelSet combine(yarnwrap.util.shape.VoxelSet first,yarnwrap.util.shape.VoxelSet second,yarnwrap.util.shape.PairList xPoints,yarnwrap.util.shape.PairList yPoints,yarnwrap.util.shape.PairList zPoints,yarnwrap.util.function.BooleanBiFunction function) { return new yarnwrap.util.shape.BitSetVoxelSet(wrapperContained.combine(first.wrapperContained,second.wrapperContained,xPoints.wrapperContained,yPoints.wrapperContained,zPoints.wrapperContained,function.wrapperContained)); }
// public boolean isColumnFull(int z1,int z2,int x,int y) { return wrapperContained.isColumnFull(z1,z2,x,y); }
// public boolean isXzSquareFull(int x1,int x2,int z1,int z2,int y) { return wrapperContained.isXzSquareFull(x1,x2,z1,z2,y); }
public yarnwrap.util.shape.BitSetVoxelSet create(int sizeX,int sizeY,int sizeZ,int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { return new yarnwrap.util.shape.BitSetVoxelSet(wrapperContained.create(sizeX,sizeY,sizeZ,minX,minY,minZ,maxX,maxY,maxZ)); }
// public void set(int x,int y,int z,boolean updateBounds) { wrapperContained.set(x,y,z,updateBounds); }
// public void forEachBox(yarnwrap.util.shape.VoxelSet voxelSet,Object callback,boolean coalesce) { wrapperContained.forEachBox(voxelSet.wrapperContained,callback,coalesce); }
// public void clearColumn(int z1,int z2,int x,int y) { wrapperContained.clearColumn(z1,z2,x,y); }
public boolean surrounded(int x,int y,int z) { return wrapperContained.surrounded(x,y,z); }

}