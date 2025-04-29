package yarnwrap.world;
public class BlockCollisionSpliterator { public net.minecraft.world.BlockCollisionSpliterator wrapperContained; public BlockCollisionSpliterator(net.minecraft.world.BlockCollisionSpliterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(wrapperContained.box); }
// public void box(yarnwrap.util.math.Box value) { wrapperContained.box = value.wrapperContained; }
// public static yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(net.minecraft.world.BlockCollisionSpliterator.box); }
// public static void box(yarnwrap.util.math.Box value, ) { net.minecraft.world.BlockCollisionSpliterator.box = value.wrapperContained; }

// public yarnwrap.block.ShapeContext context() { return new yarnwrap.block.ShapeContext(wrapperContained.context); }
// public void context(yarnwrap.block.ShapeContext value) { wrapperContained.context = value.wrapperContained; }
// public static yarnwrap.block.ShapeContext context() { return new yarnwrap.block.ShapeContext(net.minecraft.world.BlockCollisionSpliterator.context); }
// public static void context(yarnwrap.block.ShapeContext value, ) { net.minecraft.world.BlockCollisionSpliterator.context = value.wrapperContained; }

// public yarnwrap.util.CuboidBlockIterator blockIterator() { return new yarnwrap.util.CuboidBlockIterator(wrapperContained.blockIterator); }
// public void blockIterator(yarnwrap.util.CuboidBlockIterator value) { wrapperContained.blockIterator = value.wrapperContained; }
// public static yarnwrap.util.CuboidBlockIterator blockIterator() { return new yarnwrap.util.CuboidBlockIterator(net.minecraft.world.BlockCollisionSpliterator.blockIterator); }
// public static void blockIterator(yarnwrap.util.CuboidBlockIterator value, ) { net.minecraft.world.BlockCollisionSpliterator.blockIterator = value.wrapperContained; }

// public Object pos() { return wrapperContained.pos; }
// // public void pos(Object value) { wrapperContained.pos = value; }
// // public static Object pos() { return net.minecraft.world.BlockCollisionSpliterator.pos; }
// // public static void pos(Object value, ) { net.minecraft.world.BlockCollisionSpliterator.pos = value; }

// public yarnwrap.util.shape.VoxelShape boxShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.boxShape); }
// public void boxShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.boxShape = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape boxShape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.world.BlockCollisionSpliterator.boxShape); }
// public static void boxShape(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.world.BlockCollisionSpliterator.boxShape = value.wrapperContained; }

// public yarnwrap.world.CollisionView world() { return new yarnwrap.world.CollisionView(wrapperContained.world); }
// public void world(yarnwrap.world.CollisionView value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.CollisionView world() { return new yarnwrap.world.CollisionView(net.minecraft.world.BlockCollisionSpliterator.world); }
// public static void world(yarnwrap.world.CollisionView value, ) { net.minecraft.world.BlockCollisionSpliterator.world = value.wrapperContained; }

// public yarnwrap.world.BlockView chunk() { return new yarnwrap.world.BlockView(wrapperContained.chunk); }
// public void chunk(yarnwrap.world.BlockView value) { wrapperContained.chunk = value.wrapperContained; }
// public static yarnwrap.world.BlockView chunk() { return new yarnwrap.world.BlockView(net.minecraft.world.BlockCollisionSpliterator.chunk); }
// public static void chunk(yarnwrap.world.BlockView value, ) { net.minecraft.world.BlockCollisionSpliterator.chunk = value.wrapperContained; }

// public long chunkPos() { return wrapperContained.chunkPos; }
// public void chunkPos(long value) { wrapperContained.chunkPos = value; }
// public static long chunkPos() { return net.minecraft.world.BlockCollisionSpliterator.chunkPos; }
// public static void chunkPos(long value, ) { net.minecraft.world.BlockCollisionSpliterator.chunkPos = value; }

// public boolean forEntity() { return wrapperContained.forEntity; }
// public void forEntity(boolean value) { wrapperContained.forEntity = value; }
// public static boolean forEntity() { return net.minecraft.world.BlockCollisionSpliterator.forEntity; }
// public static void forEntity(boolean value, ) { net.minecraft.world.BlockCollisionSpliterator.forEntity = value; }

// public java.util.function.BiFunction resultFunction() { return wrapperContained.resultFunction; }
// public void resultFunction(java.util.function.BiFunction value) { wrapperContained.resultFunction = value; }
// public static java.util.function.BiFunction resultFunction() { return net.minecraft.world.BlockCollisionSpliterator.resultFunction; }
// public static void resultFunction(java.util.function.BiFunction value, ) { net.minecraft.world.BlockCollisionSpliterator.resultFunction = value; }

public BlockCollisionSpliterator(yarnwrap.world.CollisionView world,yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box,boolean forEntity,java.util.function.BiFunction resultFunction) { this.wrapperContained = new net.minecraft.world.BlockCollisionSpliterator(world.wrapperContained,entity.wrapperContained,box.wrapperContained,forEntity,resultFunction); }
// public yarnwrap.world.BlockView getChunk(int x,int z) { return new yarnwrap.world.BlockView(wrapperContained.getChunk(x,z)); }
// public static yarnwrap.world.BlockView getChunk(int x,int z, ) { return new yarnwrap.world.BlockView(net.minecraft.world.BlockCollisionSpliterator.getChunk(x,z)); }

}