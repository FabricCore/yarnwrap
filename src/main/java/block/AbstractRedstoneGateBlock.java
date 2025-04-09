package yarnwrap.block;
public class AbstractRedstoneGateBlock { public net.minecraft.block.AbstractRedstoneGateBlock wrapperContained; public AbstractRedstoneGateBlock(net.minecraft.block.AbstractRedstoneGateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public int getMaxInputLevelSides(yarnwrap.world.RedstoneView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.getMaxInputLevelSides(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean getSideInputFromGatesOnly() { return wrapperContained.getSideInputFromGatesOnly(); }
// public boolean canPlaceAbove(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canPlaceAbove(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isTargetNotAligned(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.isTargetNotAligned(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean hasPower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.hasPower(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public int getPower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.getPower(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public int getUpdateDelayInternal(yarnwrap.block.BlockState state) { return wrapperContained.getUpdateDelayInternal(state.wrapperContained); }
// public int getOutputLevel(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.getOutputLevel(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isLocked(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.isLocked(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updateTarget(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateTarget(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updatePowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updatePowered(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isRedstoneGate(yarnwrap.block.BlockState state) { return wrapperContained.isRedstoneGate(state.wrapperContained); }

}