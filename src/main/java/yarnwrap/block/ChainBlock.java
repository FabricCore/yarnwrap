package yarnwrap.block;
public class ChainBlock { public net.minecraft.block.ChainBlock wrapperContained; public ChainBlock(net.minecraft.block.ChainBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape Y_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Y_SHAPE); }
// public void Y_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Y_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape Z_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_SHAPE); }
// public void Z_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape X_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_SHAPE); }
// public void X_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_SHAPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}