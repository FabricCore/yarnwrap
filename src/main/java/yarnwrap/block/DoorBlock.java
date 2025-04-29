package yarnwrap.block;
public class DoorBlock { public net.minecraft.block.DoorBlock wrapperContained; public DoorBlock(net.minecraft.block.DoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.DoorBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.DoorBlock.FACING = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public void SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SOUTH_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.DoorBlock.SOUTH_SHAPE); }
// public static void SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.DoorBlock.SOUTH_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.DoorBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.DoorBlock.POWERED = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty HINGE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HINGE); }
// public void HINGE(yarnwrap.state.property.EnumProperty value) { wrapperContained.HINGE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty HINGE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.DoorBlock.HINGE); }
// public static void HINGE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.DoorBlock.HINGE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public void NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.DoorBlock.NORTH_SHAPE); }
// public static void NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.DoorBlock.NORTH_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public void WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.WEST_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.DoorBlock.WEST_SHAPE); }
// public static void WEST_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.DoorBlock.WEST_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public void EAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.DoorBlock.EAST_SHAPE); }
// public static void EAST_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.DoorBlock.EAST_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
// public void OPEN(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OPEN = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.DoorBlock.OPEN); }
// public static void OPEN(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.DoorBlock.OPEN = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
// public void HALF(yarnwrap.state.property.EnumProperty value) { wrapperContained.HALF = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.DoorBlock.HALF); }
// public static void HALF(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.DoorBlock.HALF = value.wrapperContained; }

// public yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.blockSetType); }
// public void blockSetType(yarnwrap.block.BlockSetType value) { wrapperContained.blockSetType = value.wrapperContained; }
// public static yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(net.minecraft.block.DoorBlock.blockSetType); }
// public static void blockSetType(yarnwrap.block.BlockSetType value, ) { net.minecraft.block.DoorBlock.blockSetType = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.DoorBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.DoorBlock.CODEC = value; }

// public DoorBlock(yarnwrap.block.BlockSetType type,Object settings) { this.wrapperContained = new net.minecraft.block.DoorBlock(type.wrapperContained,settings); }
public void setOpen(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,boolean open) { wrapperContained.setOpen(entity.wrapperContained,world.wrapperContained,state.wrapperContained,pos.wrapperContained,open); }
// public static void setOpen(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,boolean open, ) { net.minecraft.block.DoorBlock.setOpen(entity.wrapperContained,world.wrapperContained,state.wrapperContained,pos.wrapperContained,open); }
// public yarnwrap.block.enums.DoorHinge getHinge(yarnwrap.item.ItemPlacementContext ctx) { return new yarnwrap.block.enums.DoorHinge(wrapperContained.getHinge(ctx.wrapperContained)); }
// public static yarnwrap.block.enums.DoorHinge getHinge(yarnwrap.item.ItemPlacementContext ctx, ) { return new yarnwrap.block.enums.DoorHinge(net.minecraft.block.DoorBlock.getHinge(ctx.wrapperContained)); }
// public void playOpenCloseSound(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean open) { wrapperContained.playOpenCloseSound(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,open); }
// public static void playOpenCloseSound(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean open, ) { net.minecraft.block.DoorBlock.playOpenCloseSound(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,open); }
// public boolean canOpenByHand(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canOpenByHand(world.wrapperContained,pos.wrapperContained); }
// public static boolean canOpenByHand(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.DoorBlock.canOpenByHand(world.wrapperContained,pos.wrapperContained); }
// public boolean canOpenByHand(yarnwrap.block.BlockState state) { return wrapperContained.canOpenByHand(state.wrapperContained); }
// public static boolean canOpenByHand(yarnwrap.block.BlockState state, ) { return net.minecraft.block.DoorBlock.canOpenByHand(state.wrapperContained); }
public boolean isOpen(yarnwrap.block.BlockState state) { return wrapperContained.isOpen(state.wrapperContained); }
// public static boolean isOpen(yarnwrap.block.BlockState state, ) { return net.minecraft.block.DoorBlock.isOpen(state.wrapperContained); }
public yarnwrap.block.BlockSetType getBlockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.getBlockSetType()); }
// public static yarnwrap.block.BlockSetType getBlockSetType() { return new yarnwrap.block.BlockSetType(net.minecraft.block.DoorBlock.getBlockSetType()); }
// public com.mojang.datafixers.kinds.App method_54010(Object instance) { return wrapperContained.method_54010(instance); }
// public static com.mojang.datafixers.kinds.App method_54010(Object instance, ) { return net.minecraft.block.DoorBlock.method_54010(instance); }

}