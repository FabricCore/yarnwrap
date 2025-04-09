package yarnwrap.world;
public class BlockCollisionSpliterator { public net.minecraft.world.BlockCollisionSpliterator wrapperContained; public BlockCollisionSpliterator(net.minecraft.world.BlockCollisionSpliterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(wrapperContained.box); }
// public yarnwrap.block.ShapeContext context() { return new yarnwrap.block.ShapeContext(wrapperContained.context); }
// public yarnwrap.util.CuboidBlockIterator blockIterator() { return new yarnwrap.util.CuboidBlockIterator(wrapperContained.blockIterator); }
// public Object pos() { return wrapperContained.pos; }
// public yarnwrap.util.shape.VoxelShape boxShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.boxShape); }
// public yarnwrap.world.CollisionView world() { return new yarnwrap.world.CollisionView(wrapperContained.world); }
// public yarnwrap.world.BlockView chunk() { return new yarnwrap.world.BlockView(wrapperContained.chunk); }
// public long chunkPos() { return wrapperContained.chunkPos; }
// public boolean forEntity() { return wrapperContained.forEntity; }
// public java.util.function.BiFunction resultFunction() { return wrapperContained.resultFunction; }
// public yarnwrap.world.BlockView getChunk(int x,int z) { return new yarnwrap.world.BlockView(wrapperContained.getChunk(x,z)); }

}