package yarnwrap.block;
public class SeaPickleBlock { public net.minecraft.block.SeaPickleBlock wrapperContained; public SeaPickleBlock(net.minecraft.block.SeaPickleBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape TWO_PICKLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TWO_PICKLES_SHAPE); }
// public yarnwrap.util.shape.VoxelShape THREE_PICKLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.THREE_PICKLES_SHAPE); }
public yarnwrap.state.property.IntProperty PICKLES() { return new yarnwrap.state.property.IntProperty(wrapperContained.PICKLES); }
// public yarnwrap.util.shape.VoxelShape ONE_PICKLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ONE_PICKLE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape FOUR_PICKLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FOUR_PICKLES_SHAPE); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public int MAX_PICKLES() { return wrapperContained.MAX_PICKLES; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean isDry(yarnwrap.block.BlockState state) { return wrapperContained.isDry(state.wrapperContained); }

}