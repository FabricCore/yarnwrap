package yarnwrap.client.render.chunk;
public class Octree { public net.minecraft.client.render.chunk.Octree wrapperContained; public Octree(net.minecraft.client.render.chunk.Octree wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object root() { return wrapperContained.root; }
// // public void root(Object value) { wrapperContained.root = value; }
// // public static Object root() { return net.minecraft.client.render.chunk.Octree.root; }
// // public static void root(Object value, ) { net.minecraft.client.render.chunk.Octree.root = value; }

// public yarnwrap.util.math.BlockPos centerPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.centerPos); }
// public void centerPos(yarnwrap.util.math.BlockPos value) { wrapperContained.centerPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos centerPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.client.render.chunk.Octree.centerPos); }
// public static void centerPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.client.render.chunk.Octree.centerPos = value.wrapperContained; }

public Octree(yarnwrap.util.math.ChunkSectionPos sectionPos,int viewDistance,int sizeY,int bottomY) { this.wrapperContained = new net.minecraft.client.render.chunk.Octree(sectionPos.wrapperContained,viewDistance,sizeY,bottomY); }
// public void visit(Object visitor,yarnwrap.client.render.Frustum frustum,int margin) { wrapperContained.visit(visitor,frustum.wrapperContained,margin); }
// public static void visit(Object visitor,yarnwrap.client.render.Frustum frustum,int margin, ) { net.minecraft.client.render.chunk.Octree.visit(visitor,frustum.wrapperContained,margin); }
// public boolean add(Object chunk) { return wrapperContained.add(chunk); }
// public static boolean add(Object chunk, ) { return net.minecraft.client.render.chunk.Octree.add(chunk); }
// public boolean isCenterWithin(double minX,double minY,double minZ,double maxX,double maxY,double maxZ,int margin) { return wrapperContained.isCenterWithin(minX,minY,minZ,maxX,maxY,maxZ,margin); }
// public static boolean isCenterWithin(double minX,double minY,double minZ,double maxX,double maxY,double maxZ,int margin, ) { return net.minecraft.client.render.chunk.Octree.isCenterWithin(minX,minY,minZ,maxX,maxY,maxZ,margin); }

}