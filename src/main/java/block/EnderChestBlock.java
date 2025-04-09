package yarnwrap.block;
public class EnderChestBlock { public net.minecraft.block.EnderChestBlock wrapperContained; public EnderChestBlock(net.minecraft.block.EnderChestBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public yarnwrap.text.Text CONTAINER_NAME() { return new yarnwrap.text.Text(wrapperContained.CONTAINER_NAME); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}