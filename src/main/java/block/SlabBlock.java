package yarnwrap.block;
public class SlabBlock { public net.minecraft.block.SlabBlock wrapperContained; public SlabBlock(net.minecraft.block.SlabBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape TOP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_SHAPE); }
// public yarnwrap.util.shape.VoxelShape BOTTOM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_SHAPE); }
public yarnwrap.state.property.EnumProperty TYPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.TYPE); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}