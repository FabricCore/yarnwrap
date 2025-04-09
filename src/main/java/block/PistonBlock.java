package yarnwrap.block;
public class PistonBlock { public net.minecraft.block.PistonBlock wrapperContained; public PistonBlock(net.minecraft.block.PistonBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EXTENDED_WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EXTENDED_UP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_UP_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EXTENDED_SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_SOUTH_SHAPE); }
// public boolean sticky() { return wrapperContained.sticky; }
// public yarnwrap.util.shape.VoxelShape EXTENDED_EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_EAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EXTENDED_NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_NORTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EXTENDED_DOWN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EXTENDED_DOWN_SHAPE); }
public yarnwrap.state.property.BooleanProperty EXTENDED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EXTENDED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean move(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction dir,boolean retract) { return wrapperContained.move(world.wrapperContained,pos.wrapperContained,dir.wrapperContained,retract); }
// public boolean shouldExtend(yarnwrap.world.RedstoneView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction pistonFace) { return wrapperContained.shouldExtend(world.wrapperContained,pos.wrapperContained,pistonFace.wrapperContained); }
// public void tryMove(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.tryMove(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isMovable(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,boolean canBreak,yarnwrap.util.math.Direction pistonDir) { return wrapperContained.isMovable(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained,canBreak,pistonDir.wrapperContained); }

}