package yarnwrap.block;
public class EnderChestBlock { public net.minecraft.block.EnderChestBlock wrapperContained; public EnderChestBlock(net.minecraft.block.EnderChestBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.EnderChestBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.EnderChestBlock.FACING = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.EnderChestBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.EnderChestBlock.SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.EnderChestBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.EnderChestBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.text.Text CONTAINER_NAME() { return new yarnwrap.text.Text(wrapperContained.CONTAINER_NAME); }
// public void CONTAINER_NAME(yarnwrap.text.Text value) { wrapperContained.CONTAINER_NAME = value.wrapperContained; }
// public static yarnwrap.text.Text CONTAINER_NAME() { return new yarnwrap.text.Text(net.minecraft.block.EnderChestBlock.CONTAINER_NAME); }
// public static void CONTAINER_NAME(yarnwrap.text.Text value, ) { net.minecraft.block.EnderChestBlock.CONTAINER_NAME = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.EnderChestBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.EnderChestBlock.CODEC = value; }


}