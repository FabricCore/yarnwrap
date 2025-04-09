package yarnwrap.block;
public class SmallDripleafBlock { public net.minecraft.block.SmallDripleafBlock wrapperContained; public SmallDripleafBlock(net.minecraft.block.SmallDripleafBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}