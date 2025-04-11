package yarnwrap.block;
public class CoralParentBlock { public net.minecraft.block.CoralParentBlock wrapperContained; public CoralParentBlock(net.minecraft.block.CoralParentBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public void checkLivingConditions(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.checkLivingConditions(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean isInWater(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInWater(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}