package yarnwrap.block;
public class TripwireBlock { public net.minecraft.block.TripwireBlock wrapperContained; public TripwireBlock(net.minecraft.block.TripwireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public yarnwrap.block.Block hookBlock() { return new yarnwrap.block.Block(wrapperContained.hookBlock); }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
public yarnwrap.state.property.BooleanProperty DISARMED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.DISARMED); }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public yarnwrap.util.shape.VoxelShape DETACHED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DETACHED_SHAPE); }
// public yarnwrap.util.shape.VoxelShape ATTACHED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ATTACHED_SHAPE); }
public yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ATTACHED); }
// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean shouldConnectTo(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction facing) { return wrapperContained.shouldConnectTo(state.wrapperContained,facing.wrapperContained); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updatePowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updatePowered(world.wrapperContained,pos.wrapperContained); }

}