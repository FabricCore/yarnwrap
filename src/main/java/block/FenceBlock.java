package yarnwrap.block;
public class FenceBlock { public net.minecraft.block.FenceBlock wrapperContained; public FenceBlock(net.minecraft.block.FenceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] cullingShapes() { return wrapperContained.cullingShapes; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean canConnect(yarnwrap.block.BlockState state,boolean neighborIsFullSquare,yarnwrap.util.math.Direction dir) { return wrapperContained.canConnect(state.wrapperContained,neighborIsFullSquare,dir.wrapperContained); }
// public boolean canConnectToFence(yarnwrap.block.BlockState state) { return wrapperContained.canConnectToFence(state.wrapperContained); }

}