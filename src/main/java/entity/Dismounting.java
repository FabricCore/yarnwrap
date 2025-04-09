package yarnwrap.entity;
public class Dismounting { public net.minecraft.entity.Dismounting wrapperContained; public Dismounting(net.minecraft.entity.Dismounting wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canDismountInBlock(double height) { return wrapperContained.canDismountInBlock(height); }
public boolean canPlaceEntityAt(yarnwrap.world.CollisionView world,yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.Box targetBox) { return wrapperContained.canPlaceEntityAt(world.wrapperContained,entity.wrapperContained,targetBox.wrapperContained); }
public int[][] getDismountOffsets(yarnwrap.util.math.Direction movementDirection) { return wrapperContained.getDismountOffsets(movementDirection.wrapperContained); }
public yarnwrap.util.shape.VoxelShape getCollisionShape(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCollisionShape(world.wrapperContained,pos.wrapperContained)); }
public double getCeilingHeight(yarnwrap.util.math.BlockPos pos,int maxDistance,java.util.function.Function collisionShapeGetter) { return wrapperContained.getCeilingHeight(pos.wrapperContained,maxDistance,collisionShapeGetter); }
public yarnwrap.util.math.Vec3d findRespawnPos(yarnwrap.entity.EntityType entityType,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,boolean ignoreInvalidPos) { return new yarnwrap.util.math.Vec3d(wrapperContained.findRespawnPos(entityType.wrapperContained,world.wrapperContained,pos.wrapperContained,ignoreInvalidPos)); }
public boolean canPlaceEntityAt(yarnwrap.world.CollisionView world,yarnwrap.util.math.Vec3d offset,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EntityPose pose) { return wrapperContained.canPlaceEntityAt(world.wrapperContained,offset.wrapperContained,entity.wrapperContained,pose.wrapperContained); }

}