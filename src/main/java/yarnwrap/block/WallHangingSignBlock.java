package yarnwrap.block;
public class WallHangingSignBlock { public net.minecraft.block.WallHangingSignBlock wrapperContained; public WallHangingSignBlock(net.minecraft.block.WallHangingSignBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.WallHangingSignBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.WallHangingSignBlock.FACING = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape NORTH_SOUTH_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SOUTH_COLLISION_SHAPE); }
// public void NORTH_SOUTH_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_SOUTH_COLLISION_SHAPE = value.wrapperContained; }
public static yarnwrap.util.shape.VoxelShape NORTH_SOUTH_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.WallHangingSignBlock.NORTH_SOUTH_COLLISION_SHAPE); }
// public static void NORTH_SOUTH_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.WallHangingSignBlock.NORTH_SOUTH_COLLISION_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EAST_WEST_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_WEST_COLLISION_SHAPE); }
// public void EAST_WEST_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_WEST_COLLISION_SHAPE = value.wrapperContained; }
public static yarnwrap.util.shape.VoxelShape EAST_WEST_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.WallHangingSignBlock.EAST_WEST_COLLISION_SHAPE); }
// public static void EAST_WEST_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.WallHangingSignBlock.EAST_WEST_COLLISION_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape NORTH_SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SOUTH_SHAPE); }
// public void NORTH_SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_SOUTH_SHAPE = value.wrapperContained; }
public static yarnwrap.util.shape.VoxelShape NORTH_SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.WallHangingSignBlock.NORTH_SOUTH_SHAPE); }
// public static void NORTH_SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.WallHangingSignBlock.NORTH_SOUTH_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EAST_WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_WEST_SHAPE); }
// public void EAST_WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_WEST_SHAPE = value.wrapperContained; }
public static yarnwrap.util.shape.VoxelShape EAST_WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.WallHangingSignBlock.EAST_WEST_SHAPE); }
// public static void EAST_WEST_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.WallHangingSignBlock.EAST_WEST_SHAPE = value.wrapperContained; }

// public java.util.Map OUTLINE_SHAPES() { return wrapperContained.OUTLINE_SHAPES; }
// public void OUTLINE_SHAPES(java.util.Map value) { wrapperContained.OUTLINE_SHAPES = value; }
// public static java.util.Map OUTLINE_SHAPES() { return net.minecraft.block.WallHangingSignBlock.OUTLINE_SHAPES; }
// public static void OUTLINE_SHAPES(java.util.Map value, ) { net.minecraft.block.WallHangingSignBlock.OUTLINE_SHAPES = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WallHangingSignBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WallHangingSignBlock.CODEC = value; }

public boolean canAttachTo(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos toPos,yarnwrap.util.math.Direction direction) { return wrapperContained.canAttachTo(world.wrapperContained,state.wrapperContained,toPos.wrapperContained,direction.wrapperContained); }
// public static boolean canAttachTo(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos toPos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.WallHangingSignBlock.canAttachTo(world.wrapperContained,state.wrapperContained,toPos.wrapperContained,direction.wrapperContained); }
public boolean canAttachAt(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canAttachAt(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean canAttachAt(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.WallHangingSignBlock.canAttachAt(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean shouldTryAttaching(yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.entity.SignBlockEntity sign,yarnwrap.item.ItemStack stack) { return wrapperContained.shouldTryAttaching(state.wrapperContained,player.wrapperContained,hitResult.wrapperContained,sign.wrapperContained,stack.wrapperContained); }
// public static boolean shouldTryAttaching(yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.entity.SignBlockEntity sign,yarnwrap.item.ItemStack stack, ) { return net.minecraft.block.WallHangingSignBlock.shouldTryAttaching(state.wrapperContained,player.wrapperContained,hitResult.wrapperContained,sign.wrapperContained,stack.wrapperContained); }
// public boolean isHitOnFacingAxis(yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.BlockState state) { return wrapperContained.isHitOnFacingAxis(hitResult.wrapperContained,state.wrapperContained); }
// public static boolean isHitOnFacingAxis(yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.BlockState state, ) { return net.minecraft.block.WallHangingSignBlock.isHitOnFacingAxis(hitResult.wrapperContained,state.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54063(Object instance) { return wrapperContained.method_54063(instance); }
// public static com.mojang.datafixers.kinds.App method_54063(Object instance, ) { return net.minecraft.block.WallHangingSignBlock.method_54063(instance); }

}