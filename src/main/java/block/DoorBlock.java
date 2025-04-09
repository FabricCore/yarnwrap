package yarnwrap.block;
public class DoorBlock { public net.minecraft.block.DoorBlock wrapperContained; public DoorBlock(net.minecraft.block.DoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
public yarnwrap.state.property.EnumProperty HINGE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HINGE); }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
// public yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.blockSetType); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public void setOpen(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,boolean open) { wrapperContained.setOpen(entity.wrapperContained,world.wrapperContained,state.wrapperContained,pos.wrapperContained,open); }
// public yarnwrap.block.enums.DoorHinge getHinge(yarnwrap.item.ItemPlacementContext ctx) { return new yarnwrap.block.enums.DoorHinge(wrapperContained.getHinge(ctx.wrapperContained)); }
// public void playOpenCloseSound(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean open) { wrapperContained.playOpenCloseSound(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,open); }
public boolean canOpenByHand(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canOpenByHand(world.wrapperContained,pos.wrapperContained); }
public boolean canOpenByHand(yarnwrap.block.BlockState state) { return wrapperContained.canOpenByHand(state.wrapperContained); }
public boolean isOpen(yarnwrap.block.BlockState state) { return wrapperContained.isOpen(state.wrapperContained); }
public yarnwrap.block.BlockSetType getBlockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.getBlockSetType()); }

}