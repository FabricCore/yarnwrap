package yarnwrap.block;
public class BigDripleafStemBlock { public net.minecraft.block.BigDripleafStemBlock wrapperContained; public BigDripleafStemBlock(net.minecraft.block.BigDripleafStemBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean placeStemAt(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState fluidState,yarnwrap.util.math.Direction direction) { return wrapperContained.placeStemAt(world.wrapperContained,pos.wrapperContained,fluidState.wrapperContained,direction.wrapperContained); }

}