package yarnwrap.block;
public class FenceBlock { public net.minecraft.block.FenceBlock wrapperContained; public FenceBlock(net.minecraft.block.FenceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] cullingShapes() { return wrapperContained.cullingShapes; }
// public void cullingShapes(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.cullingShapes = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean canConnect(yarnwrap.block.BlockState state,boolean neighborIsFullSquare,yarnwrap.util.math.Direction dir) { return wrapperContained.canConnect(state.wrapperContained,neighborIsFullSquare,dir.wrapperContained); }
// public boolean canConnectToFence(yarnwrap.block.BlockState state) { return wrapperContained.canConnectToFence(state.wrapperContained); }

}