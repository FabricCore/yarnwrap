package yarnwrap.block;
public class StonecutterBlock { public net.minecraft.block.StonecutterBlock wrapperContained; public StonecutterBlock(net.minecraft.block.StonecutterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}