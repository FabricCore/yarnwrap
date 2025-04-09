package yarnwrap.block;
public class HangingRootsBlock { public net.minecraft.block.HangingRootsBlock wrapperContained; public HangingRootsBlock(net.minecraft.block.HangingRootsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}