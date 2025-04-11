package yarnwrap.block;
public class SeaPickleBlock { public net.minecraft.block.SeaPickleBlock wrapperContained; public SeaPickleBlock(net.minecraft.block.SeaPickleBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape TWO_PICKLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TWO_PICKLES_SHAPE); }
// public void TWO_PICKLES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TWO_PICKLES_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape THREE_PICKLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.THREE_PICKLES_SHAPE); }
// public void THREE_PICKLES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.THREE_PICKLES_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.IntProperty PICKLES() { return new yarnwrap.state.property.IntProperty(wrapperContained.PICKLES); }
// public void PICKLES(yarnwrap.state.property.IntProperty value) { wrapperContained.PICKLES = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape ONE_PICKLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ONE_PICKLE_SHAPE); }
// public void ONE_PICKLE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.ONE_PICKLE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape FOUR_PICKLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FOUR_PICKLES_SHAPE); }
// public void FOUR_PICKLES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.FOUR_PICKLES_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public int MAX_PICKLES() { return wrapperContained.MAX_PICKLES; }
// public void MAX_PICKLES(int value) { wrapperContained.MAX_PICKLES = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean isDry(yarnwrap.block.BlockState state) { return wrapperContained.isDry(state.wrapperContained); }

}