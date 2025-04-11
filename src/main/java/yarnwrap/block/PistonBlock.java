package yarnwrap.block;
public class PistonBlock { public net.minecraft.block.PistonBlock wrapperContained; public PistonBlock(net.minecraft.block.PistonBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EXTENDED_WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_WEST_SHAPE); }
// public void EXTENDED_WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EXTENDED_WEST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EXTENDED_UP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_UP_SHAPE); }
// public void EXTENDED_UP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EXTENDED_UP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EXTENDED_SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_SOUTH_SHAPE); }
// public void EXTENDED_SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EXTENDED_SOUTH_SHAPE = value.wrapperContained; }
// public boolean sticky() { return wrapperContained.sticky; }
// public void sticky(boolean value) { wrapperContained.sticky = value; }
// public yarnwrap.util.shape.VoxelShape EXTENDED_EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_EAST_SHAPE); }
// public void EXTENDED_EAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EXTENDED_EAST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EXTENDED_NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_NORTH_SHAPE); }
// public void EXTENDED_NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EXTENDED_NORTH_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EXTENDED_DOWN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_DOWN_SHAPE); }
// public void EXTENDED_DOWN_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EXTENDED_DOWN_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty EXTENDED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EXTENDED); }
// public void EXTENDED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EXTENDED = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean move(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction dir,boolean retract) { return wrapperContained.move(world.wrapperContained,pos.wrapperContained,dir.wrapperContained,retract); }
// public boolean shouldExtend(yarnwrap.world.RedstoneView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction pistonFace) { return wrapperContained.shouldExtend(world.wrapperContained,pos.wrapperContained,pistonFace.wrapperContained); }
// public void tryMove(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.tryMove(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isMovable(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,boolean canBreak,yarnwrap.util.math.Direction pistonDir) { return wrapperContained.isMovable(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained,canBreak,pistonDir.wrapperContained); }

}