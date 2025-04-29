package yarnwrap.block;
public class AbstractRedstoneGateBlock { public net.minecraft.block.AbstractRedstoneGateBlock wrapperContained; public AbstractRedstoneGateBlock(net.minecraft.block.AbstractRedstoneGateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.AbstractRedstoneGateBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.AbstractRedstoneGateBlock.POWERED = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractRedstoneGateBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AbstractRedstoneGateBlock.SHAPE = value.wrapperContained; }

// public int getMaxInputLevelSides(yarnwrap.world.RedstoneView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.getMaxInputLevelSides(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static int getMaxInputLevelSides(yarnwrap.world.RedstoneView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRedstoneGateBlock.getMaxInputLevelSides(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean getSideInputFromGatesOnly() { return wrapperContained.getSideInputFromGatesOnly(); }
// public static boolean getSideInputFromGatesOnly() { return net.minecraft.block.AbstractRedstoneGateBlock.getSideInputFromGatesOnly(); }
// public boolean canPlaceAbove(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canPlaceAbove(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static boolean canPlaceAbove(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRedstoneGateBlock.canPlaceAbove(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isTargetNotAligned(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.isTargetNotAligned(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static boolean isTargetNotAligned(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRedstoneGateBlock.isTargetNotAligned(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean hasPower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.hasPower(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static boolean hasPower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRedstoneGateBlock.hasPower(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public int getPower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.getPower(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static int getPower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRedstoneGateBlock.getPower(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public int getUpdateDelayInternal(yarnwrap.block.BlockState state) { return wrapperContained.getUpdateDelayInternal(state.wrapperContained); }
// public static int getUpdateDelayInternal(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRedstoneGateBlock.getUpdateDelayInternal(state.wrapperContained); }
// public int getOutputLevel(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.getOutputLevel(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static int getOutputLevel(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRedstoneGateBlock.getOutputLevel(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isLocked(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.isLocked(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static boolean isLocked(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRedstoneGateBlock.isLocked(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updateTarget(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateTarget(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updateTarget(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.AbstractRedstoneGateBlock.updateTarget(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updatePowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updatePowered(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updatePowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.AbstractRedstoneGateBlock.updatePowered(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean isRedstoneGate(yarnwrap.block.BlockState state) { return wrapperContained.isRedstoneGate(state.wrapperContained); }
// public static boolean isRedstoneGate(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractRedstoneGateBlock.isRedstoneGate(state.wrapperContained); }

}