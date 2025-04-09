package yarnwrap.block;
public class NetherPortalBlock { public net.minecraft.block.NetherPortalBlock wrapperContained; public NetherPortalBlock(net.minecraft.block.NetherPortalBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape Z_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_SHAPE); }
// public yarnwrap.util.shape.VoxelShape X_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_SHAPE); }
public yarnwrap.state.property.EnumProperty AXIS() { return new yarnwrap.state.property.EnumProperty(wrapperContained.AXIS); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.TeleportTarget getOrCreateExitPortalTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos scaledPos,boolean inNether,yarnwrap.world.border.WorldBorder worldBorder) { return new yarnwrap.world.TeleportTarget(wrapperContained.getOrCreateExitPortalTarget(world.wrapperContained,entity.wrapperContained,pos.wrapperContained,scaledPos.wrapperContained,inNether,worldBorder.wrapperContained)); }
// public yarnwrap.world.TeleportTarget getExitPortalTarget(yarnwrap.server.world.ServerWorld world,Object exitPortalRectangle,Object axis,yarnwrap.util.math.Vec3d positionInPortal,yarnwrap.entity.Entity entity,yarnwrap.util.math.Vec3d velocity,float yaw,float pitch,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.getExitPortalTarget(world.wrapperContained,exitPortalRectangle,axis,positionInPortal.wrapperContained,entity.wrapperContained,velocity.wrapperContained,yaw,pitch,postDimensionTransition)); }
// public yarnwrap.world.TeleportTarget getExitPortalTarget(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos,Object exitPortalRectangle,yarnwrap.server.world.ServerWorld world,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.getExitPortalTarget(entity.wrapperContained,pos.wrapperContained,exitPortalRectangle,world.wrapperContained,postDimensionTransition)); }

}