package yarnwrap.block;
public class AmethystClusterBlock { public net.minecraft.block.AmethystClusterBlock wrapperContained; public AmethystClusterBlock(net.minecraft.block.AmethystClusterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape northShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.northShape); }
// public void northShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.northShape = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape southShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.southShape); }
// public void southShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.southShape = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape eastShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.eastShape); }
// public void eastShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.eastShape = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape westShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.westShape); }
// public void westShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.westShape = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape upShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.upShape); }
// public void upShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.upShape = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape downShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.downShape); }
// public void downShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.downShape = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float height() { return wrapperContained.height; }
// public void height(float value) { wrapperContained.height = value; }
// public float xzOffset() { return wrapperContained.xzOffset; }
// public void xzOffset(float value) { wrapperContained.xzOffset = value; }

}