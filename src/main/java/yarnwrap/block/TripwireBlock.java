package yarnwrap.block;
public class TripwireBlock { public net.minecraft.block.TripwireBlock wrapperContained; public TripwireBlock(net.minecraft.block.TripwireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EAST = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
// public void WEST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WEST = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public void NORTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.NORTH = value.wrapperContained; }
// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public void FACING_PROPERTIES(java.util.Map value) { wrapperContained.FACING_PROPERTIES = value; }
// public yarnwrap.block.Block hookBlock() { return new yarnwrap.block.Block(wrapperContained.hookBlock); }
// public void hookBlock(yarnwrap.block.Block value) { wrapperContained.hookBlock = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public void SOUTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SOUTH = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty DISARMED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.DISARMED); }
// public void DISARMED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.DISARMED = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DETACHED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DETACHED_SHAPE); }
// public void DETACHED_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DETACHED_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape ATTACHED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ATTACHED_SHAPE); }
// public void ATTACHED_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.ATTACHED_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ATTACHED); }
// public void ATTACHED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.ATTACHED = value.wrapperContained; }
// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean shouldConnectTo(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction facing) { return wrapperContained.shouldConnectTo(state.wrapperContained,facing.wrapperContained); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updatePowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updatePowered(world.wrapperContained,pos.wrapperContained); }

}