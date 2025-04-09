package yarnwrap.block;
public class AmethystClusterBlock { public net.minecraft.block.AmethystClusterBlock wrapperContained; public AmethystClusterBlock(net.minecraft.block.AmethystClusterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape northShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.northShape); }
// public yarnwrap.util.shape.VoxelShape southShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.southShape); }
// public yarnwrap.util.shape.VoxelShape eastShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.eastShape); }
// public yarnwrap.util.shape.VoxelShape westShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.westShape); }
// public yarnwrap.util.shape.VoxelShape upShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.upShape); }
// public yarnwrap.util.shape.VoxelShape downShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.downShape); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float height() { return wrapperContained.height; }
// public float xzOffset() { return wrapperContained.xzOffset; }

}