package yarnwrap.block;
public class NetherPortalBlock { public net.minecraft.block.NetherPortalBlock wrapperContained; public NetherPortalBlock(net.minecraft.block.NetherPortalBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape Z_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_SHAPE); }
// public void Z_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape Z_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.NetherPortalBlock.Z_SHAPE); }
// public static void Z_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.NetherPortalBlock.Z_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape X_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_SHAPE); }
// public void X_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape X_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.NetherPortalBlock.X_SHAPE); }
// public static void X_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.NetherPortalBlock.X_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty AXIS() { return new yarnwrap.state.property.EnumProperty(wrapperContained.AXIS); }
// public void AXIS(yarnwrap.state.property.EnumProperty value) { wrapperContained.AXIS = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty AXIS() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.NetherPortalBlock.AXIS); }
// public static void AXIS(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.NetherPortalBlock.AXIS = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.NetherPortalBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.NetherPortalBlock.CODEC = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.NetherPortalBlock.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.NetherPortalBlock.LOGGER = value; }

// public yarnwrap.world.TeleportTarget getOrCreateExitPortalTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos scaledPos,boolean inNether,yarnwrap.world.border.WorldBorder worldBorder) { return new yarnwrap.world.TeleportTarget(wrapperContained.getOrCreateExitPortalTarget(world.wrapperContained,entity.wrapperContained,pos.wrapperContained,scaledPos.wrapperContained,inNether,worldBorder.wrapperContained)); }
// public static yarnwrap.world.TeleportTarget getOrCreateExitPortalTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos scaledPos,boolean inNether,yarnwrap.world.border.WorldBorder worldBorder, ) { return new yarnwrap.world.TeleportTarget(net.minecraft.block.NetherPortalBlock.getOrCreateExitPortalTarget(world.wrapperContained,entity.wrapperContained,pos.wrapperContained,scaledPos.wrapperContained,inNether,worldBorder.wrapperContained)); }
// public yarnwrap.world.TeleportTarget getExitPortalTarget(yarnwrap.server.world.ServerWorld world,Object exitPortalRectangle,Object axis,yarnwrap.util.math.Vec3d positionInPortal,yarnwrap.entity.Entity entity,yarnwrap.util.math.Vec3d velocity,float yaw,float pitch,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.getExitPortalTarget(world.wrapperContained,exitPortalRectangle,axis,positionInPortal.wrapperContained,entity.wrapperContained,velocity.wrapperContained,yaw,pitch,postDimensionTransition)); }
// public static yarnwrap.world.TeleportTarget getExitPortalTarget(yarnwrap.server.world.ServerWorld world,Object exitPortalRectangle,Object axis,yarnwrap.util.math.Vec3d positionInPortal,yarnwrap.entity.Entity entity,yarnwrap.util.math.Vec3d velocity,float yaw,float pitch,Object postDimensionTransition, ) { return new yarnwrap.world.TeleportTarget(net.minecraft.block.NetherPortalBlock.getExitPortalTarget(world.wrapperContained,exitPortalRectangle,axis,positionInPortal.wrapperContained,entity.wrapperContained,velocity.wrapperContained,yaw,pitch,postDimensionTransition)); }
// public boolean method_60775(yarnwrap.entity.Entity posx) { return wrapperContained.method_60775(posx.wrapperContained); }
// public static boolean method_60775(yarnwrap.entity.Entity posx, ) { return net.minecraft.block.NetherPortalBlock.method_60775(posx.wrapperContained); }
// public yarnwrap.world.TeleportTarget getExitPortalTarget(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos,Object exitPortalRectangle,yarnwrap.server.world.ServerWorld world,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.getExitPortalTarget(entity.wrapperContained,pos.wrapperContained,exitPortalRectangle,world.wrapperContained,postDimensionTransition)); }
// public static yarnwrap.world.TeleportTarget getExitPortalTarget(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos,Object exitPortalRectangle,yarnwrap.server.world.ServerWorld world,Object postDimensionTransition, ) { return new yarnwrap.world.TeleportTarget(net.minecraft.block.NetherPortalBlock.getExitPortalTarget(entity.wrapperContained,pos.wrapperContained,exitPortalRectangle,world.wrapperContained,postDimensionTransition)); }
// public boolean method_60990(yarnwrap.server.world.ServerWorld posx) { return wrapperContained.method_60990(posx.wrapperContained); }
// public static boolean method_60990(yarnwrap.server.world.ServerWorld posx, ) { return net.minecraft.block.NetherPortalBlock.method_60990(posx.wrapperContained); }
// public void method_60991(yarnwrap.util.math.BlockPos entity) { wrapperContained.method_60991(entity.wrapperContained); }
// public static void method_60991(yarnwrap.util.math.BlockPos entity, ) { net.minecraft.block.NetherPortalBlock.method_60991(entity.wrapperContained); }

}