package yarnwrap.world;
public class BlockCollisionSpliterator { public net.minecraft.world.BlockCollisionSpliterator wrapperContained; public BlockCollisionSpliterator(net.minecraft.world.BlockCollisionSpliterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(wrapperContained.box); }
// public void box(yarnwrap.util.math.Box value) { wrapperContained.box = value.wrapperContained; }
// public yarnwrap.block.ShapeContext context() { return new yarnwrap.block.ShapeContext(wrapperContained.context); }
// public void context(yarnwrap.block.ShapeContext value) { wrapperContained.context = value.wrapperContained; }
// public yarnwrap.util.CuboidBlockIterator blockIterator() { return new yarnwrap.util.CuboidBlockIterator(wrapperContained.blockIterator); }
// public void blockIterator(yarnwrap.util.CuboidBlockIterator value) { wrapperContained.blockIterator = value.wrapperContained; }
// public Object pos() { return wrapperContained.pos; }
// // public void pos(Object value) { wrapperContained.pos = value; }
// public yarnwrap.util.shape.VoxelShape boxShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.boxShape); }
// public void boxShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.boxShape = value.wrapperContained; }
// public yarnwrap.world.CollisionView world() { return new yarnwrap.world.CollisionView(wrapperContained.world); }
// public void world(yarnwrap.world.CollisionView value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.world.BlockView chunk() { return new yarnwrap.world.BlockView(wrapperContained.chunk); }
// public void chunk(yarnwrap.world.BlockView value) { wrapperContained.chunk = value.wrapperContained; }
// public long chunkPos() { return wrapperContained.chunkPos; }
// public void chunkPos(long value) { wrapperContained.chunkPos = value; }
// public boolean forEntity() { return wrapperContained.forEntity; }
// public void forEntity(boolean value) { wrapperContained.forEntity = value; }
// public java.util.function.BiFunction resultFunction() { return wrapperContained.resultFunction; }
// public void resultFunction(java.util.function.BiFunction value) { wrapperContained.resultFunction = value; }
public BlockCollisionSpliterator(yarnwrap.world.CollisionView world,yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box,boolean forEntity,java.util.function.BiFunction resultFunction) { this.wrapperContained = new net.minecraft.world.BlockCollisionSpliterator(world.wrapperContained,entity.wrapperContained,box.wrapperContained,forEntity,resultFunction); }
// public yarnwrap.world.BlockView getChunk(int x,int z) { return new yarnwrap.world.BlockView(wrapperContained.getChunk(x,z)); }

}