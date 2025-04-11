package yarnwrap.block;
public class AbstractPressurePlateBlock { public net.minecraft.block.AbstractPressurePlateBlock wrapperContained; public AbstractPressurePlateBlock(net.minecraft.block.AbstractPressurePlateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.blockSetType); }
// public void blockSetType(yarnwrap.block.BlockSetType value) { wrapperContained.blockSetType = value.wrapperContained; }
// public yarnwrap.util.math.Box BOX() { return new yarnwrap.util.math.Box(wrapperContained.BOX); }
// public void BOX(yarnwrap.util.math.Box value) { wrapperContained.BOX = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape PRESSED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.PRESSED_SHAPE); }
// public void PRESSED_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.PRESSED_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DEFAULT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DEFAULT_SHAPE); }
// public void DEFAULT_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DEFAULT_SHAPE = value.wrapperContained; }
// public int getEntityCount(yarnwrap.world.World world,yarnwrap.util.math.Box box,java.lang.Class entityClass) { return wrapperContained.getEntityCount(world.wrapperContained,box.wrapperContained,entityClass); }
// public yarnwrap.block.BlockState setRedstoneOutput(yarnwrap.block.BlockState state,int rsOut) { return new yarnwrap.block.BlockState(wrapperContained.setRedstoneOutput(state.wrapperContained,rsOut)); }
// public void updatePlateState(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int output) { wrapperContained.updatePlateState(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,output); }
// public int getRedstoneOutput(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getRedstoneOutput(world.wrapperContained,pos.wrapperContained); }
// public int getRedstoneOutput(yarnwrap.block.BlockState state) { return wrapperContained.getRedstoneOutput(state.wrapperContained); }
// public void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateNeighbors(world.wrapperContained,pos.wrapperContained); }
// public int getTickRate() { return wrapperContained.getTickRate(); }

}