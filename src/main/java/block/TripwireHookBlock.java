package yarnwrap.block;
public class TripwireHookBlock { public net.minecraft.block.TripwireHookBlock wrapperContained; public TripwireHookBlock(net.minecraft.block.TripwireHookBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
public yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ATTACHED); }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void updateNeighborsOnAxis(yarnwrap.block.Block block,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { wrapperContained.updateNeighborsOnAxis(block.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void playSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean attached,boolean on,boolean detached,boolean off) { wrapperContained.playSound(world.wrapperContained,pos.wrapperContained,attached,on,detached,off); }

}