package yarnwrap.block;
public class ChainBlock { public net.minecraft.block.ChainBlock wrapperContained; public ChainBlock(net.minecraft.block.ChainBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape Y_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Y_SHAPE); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public yarnwrap.util.shape.VoxelShape Z_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_SHAPE); }
// public yarnwrap.util.shape.VoxelShape X_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}