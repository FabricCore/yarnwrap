package yarnwrap.block;
public class WallHangingSignBlock { public net.minecraft.block.WallHangingSignBlock wrapperContained; public WallHangingSignBlock(net.minecraft.block.WallHangingSignBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.WallHangingSignBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.WallHangingSignBlock.FACING = value.wrapperContained; }

// public java.util.Map OUTLINE_SHAPES_BY_AXIS() { return wrapperContained.OUTLINE_SHAPES_BY_AXIS; }
// public void OUTLINE_SHAPES_BY_AXIS(java.util.Map value) { wrapperContained.OUTLINE_SHAPES_BY_AXIS = value; }
// public static java.util.Map OUTLINE_SHAPES_BY_AXIS() { return net.minecraft.block.WallHangingSignBlock.OUTLINE_SHAPES_BY_AXIS; }
// public static void OUTLINE_SHAPES_BY_AXIS(java.util.Map value, ) { net.minecraft.block.WallHangingSignBlock.OUTLINE_SHAPES_BY_AXIS = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WallHangingSignBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WallHangingSignBlock.CODEC = value; }

// public java.util.Map COLLISION_SHAPES_BY_AXIS() { return wrapperContained.COLLISION_SHAPES_BY_AXIS; }
// public void COLLISION_SHAPES_BY_AXIS(java.util.Map value) { wrapperContained.COLLISION_SHAPES_BY_AXIS = value; }
// public static java.util.Map COLLISION_SHAPES_BY_AXIS() { return net.minecraft.block.WallHangingSignBlock.COLLISION_SHAPES_BY_AXIS; }
// public static void COLLISION_SHAPES_BY_AXIS(java.util.Map value, ) { net.minecraft.block.WallHangingSignBlock.COLLISION_SHAPES_BY_AXIS = value; }

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