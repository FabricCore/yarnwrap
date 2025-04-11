package yarnwrap.util.math;
public class BlockBox { public net.minecraft.util.math.BlockBox wrapperContained; public BlockBox(net.minecraft.util.math.BlockBox wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxY() { return wrapperContained.maxY; }
// public void maxY(int value) { wrapperContained.maxY = value; }
// public int maxX() { return wrapperContained.maxX; }
// public void maxX(int value) { wrapperContained.maxX = value; }
// public int minZ() { return wrapperContained.minZ; }
// public void minZ(int value) { wrapperContained.minZ = value; }
// public int minY() { return wrapperContained.minY; }
// public void minY(int value) { wrapperContained.minY = value; }
// public int minX() { return wrapperContained.minX; }
// public void minX(int value) { wrapperContained.minX = value; }
// public int maxZ() { return wrapperContained.maxZ; }
// public void maxZ(int value) { wrapperContained.maxZ = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public boolean intersects(yarnwrap.util.math.BlockBox other) { return wrapperContained.intersects(other.wrapperContained); }
public yarnwrap.util.math.Vec3i getDimensions() { return new yarnwrap.util.math.Vec3i(wrapperContained.getDimensions()); }
public int getBlockCountY() { return wrapperContained.getBlockCountY(); }
public yarnwrap.util.math.BlockBox move(int dx,int dy,int dz) { return new yarnwrap.util.math.BlockBox(wrapperContained.move(dx,dy,dz)); }
public boolean contains(yarnwrap.util.math.Vec3i pos) { return wrapperContained.contains(pos.wrapperContained); }
public int getBlockCountZ() { return wrapperContained.getBlockCountZ(); }
public yarnwrap.util.math.BlockBox infinite() { return new yarnwrap.util.math.BlockBox(wrapperContained.infinite()); }
public yarnwrap.util.math.BlockBox rotated(int x,int y,int z,int offsetX,int offsetY,int offsetZ,int sizeX,int sizeY,int sizeZ,yarnwrap.util.math.Direction facing) { return new yarnwrap.util.math.BlockBox(wrapperContained.rotated(x,y,z,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,facing.wrapperContained)); }
public boolean intersectsXZ(int minX,int minZ,int maxX,int maxZ) { return wrapperContained.intersectsXZ(minX,minZ,maxX,maxZ); }
public yarnwrap.util.math.BlockBox offset(int x,int y,int z) { return new yarnwrap.util.math.BlockBox(wrapperContained.offset(x,y,z)); }
public yarnwrap.util.math.BlockPos getCenter() { return new yarnwrap.util.math.BlockPos(wrapperContained.getCenter()); }
public yarnwrap.util.math.BlockBox move(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.BlockBox(wrapperContained.move(vec.wrapperContained)); }
public yarnwrap.util.math.BlockBox encompass(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockBox(wrapperContained.encompass(pos.wrapperContained)); }
public yarnwrap.util.math.BlockBox create(yarnwrap.util.math.Vec3i first,yarnwrap.util.math.Vec3i second) { return new yarnwrap.util.math.BlockBox(wrapperContained.create(first.wrapperContained,second.wrapperContained)); }
public void forEachVertex(java.util.function.Consumer consumer) { wrapperContained.forEachVertex(consumer); }
public yarnwrap.util.math.BlockBox expand(int offset) { return new yarnwrap.util.math.BlockBox(wrapperContained.expand(offset)); }
public java.util.Optional encompassPositions(java.lang.Iterable positions) { return wrapperContained.encompassPositions(positions); }
public yarnwrap.util.math.BlockBox encompass(yarnwrap.util.math.BlockBox box) { return new yarnwrap.util.math.BlockBox(wrapperContained.encompass(box.wrapperContained)); }
public java.util.Optional encompass(java.lang.Iterable boxes) { return wrapperContained.encompass(boxes); }
public int getBlockCountX() { return wrapperContained.getBlockCountX(); }
public int getMinX() { return wrapperContained.getMinX(); }
public int getMinY() { return wrapperContained.getMinY(); }
public int getMinZ() { return wrapperContained.getMinZ(); }
public int getMaxX() { return wrapperContained.getMaxX(); }
public int getMaxY() { return wrapperContained.getMaxY(); }
public int getMaxZ() { return wrapperContained.getMaxZ(); }
public boolean contains(int x,int y,int z) { return wrapperContained.contains(x,y,z); }
public java.util.stream.Stream streamChunkPos() { return wrapperContained.streamChunkPos(); }
public yarnwrap.util.math.BlockBox expand(int x,int y,int z) { return new yarnwrap.util.math.BlockBox(wrapperContained.expand(x,y,z)); }

}