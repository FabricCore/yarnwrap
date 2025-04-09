package yarnwrap.world;
public class CollisionView { public net.minecraft.world.CollisionView wrapperContained; public CollisionView(net.minecraft.world.CollisionView wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isSpaceEmpty(yarnwrap.entity.Entity entity) { return wrapperContained.isSpaceEmpty(entity.wrapperContained); }
public boolean isSpaceEmpty(yarnwrap.util.math.Box box) { return wrapperContained.isSpaceEmpty(box.wrapperContained); }
public java.util.List getEntityCollisions(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.getEntityCollisions(entity.wrapperContained,box.wrapperContained); }
public java.lang.Iterable getBlockCollisions(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.getBlockCollisions(entity.wrapperContained,box.wrapperContained); }
public yarnwrap.world.BlockView getChunkAsView(int chunkX,int chunkZ) { return new yarnwrap.world.BlockView(wrapperContained.getChunkAsView(chunkX,chunkZ)); }
public java.util.Optional findClosestCollision(yarnwrap.entity.Entity entity,yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Vec3d target,double x,double y,double z) { return wrapperContained.findClosestCollision(entity.wrapperContained,shape.wrapperContained,target.wrapperContained,x,y,z); }
public boolean canCollide(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.canCollide(entity.wrapperContained,box.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getWorldBorderCollisions(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getWorldBorderCollisions(entity.wrapperContained,box.wrapperContained)); }
public java.util.Optional findSupportingBlockPos(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.findSupportingBlockPos(entity.wrapperContained,box.wrapperContained); }
public boolean isBlockSpaceEmpty(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.isBlockSpaceEmpty(entity.wrapperContained,box.wrapperContained); }
public boolean isSpaceEmpty(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.isSpaceEmpty(entity.wrapperContained,box.wrapperContained); }
public java.lang.Iterable getCollisions(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box) { return wrapperContained.getCollisions(entity.wrapperContained,box.wrapperContained); }
public boolean doesNotIntersectEntities(yarnwrap.entity.Entity entity) { return wrapperContained.doesNotIntersectEntities(entity.wrapperContained); }
public boolean doesNotIntersectEntities(yarnwrap.entity.Entity except,yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.doesNotIntersectEntities(except.wrapperContained,shape.wrapperContained); }
public yarnwrap.world.border.WorldBorder getWorldBorder() { return new yarnwrap.world.border.WorldBorder(wrapperContained.getWorldBorder()); }
public boolean canPlace(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context) { return wrapperContained.canPlace(state.wrapperContained,pos.wrapperContained,context.wrapperContained); }

}