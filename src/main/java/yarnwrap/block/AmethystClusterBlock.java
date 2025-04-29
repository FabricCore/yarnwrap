package yarnwrap.block;
public class AmethystClusterBlock { public net.minecraft.block.AmethystClusterBlock wrapperContained; public AmethystClusterBlock(net.minecraft.block.AmethystClusterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.AmethystClusterBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.AmethystClusterBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.AmethystClusterBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.AmethystClusterBlock.FACING = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape northShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.northShape); }
// public void northShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.northShape = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape northShape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AmethystClusterBlock.northShape); }
// public static void northShape(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AmethystClusterBlock.northShape = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape southShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.southShape); }
// public void southShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.southShape = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape southShape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AmethystClusterBlock.southShape); }
// public static void southShape(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AmethystClusterBlock.southShape = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape eastShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.eastShape); }
// public void eastShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.eastShape = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape eastShape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AmethystClusterBlock.eastShape); }
// public static void eastShape(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AmethystClusterBlock.eastShape = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape westShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.westShape); }
// public void westShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.westShape = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape westShape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AmethystClusterBlock.westShape); }
// public static void westShape(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AmethystClusterBlock.westShape = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape upShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.upShape); }
// public void upShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.upShape = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape upShape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AmethystClusterBlock.upShape); }
// public static void upShape(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AmethystClusterBlock.upShape = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape downShape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.downShape); }
// public void downShape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.downShape = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape downShape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AmethystClusterBlock.downShape); }
// public static void downShape(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AmethystClusterBlock.downShape = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.AmethystClusterBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.AmethystClusterBlock.CODEC = value; }

// public float height() { return wrapperContained.height; }
// public void height(float value) { wrapperContained.height = value; }
// public static float height() { return net.minecraft.block.AmethystClusterBlock.height; }
// public static void height(float value, ) { net.minecraft.block.AmethystClusterBlock.height = value; }

// public float xzOffset() { return wrapperContained.xzOffset; }
// public void xzOffset(float value) { wrapperContained.xzOffset = value; }
// public static float xzOffset() { return net.minecraft.block.AmethystClusterBlock.xzOffset; }
// public static void xzOffset(float value, ) { net.minecraft.block.AmethystClusterBlock.xzOffset = value; }

// public AmethystClusterBlock(float height,float xzOffset,Object settings) { this.wrapperContained = new net.minecraft.block.AmethystClusterBlock(height,xzOffset,settings); }
// public com.mojang.datafixers.kinds.App method_53970(Object instance) { return wrapperContained.method_53970(instance); }
// public static com.mojang.datafixers.kinds.App method_53970(Object instance, ) { return net.minecraft.block.AmethystClusterBlock.method_53970(instance); }
// public java.lang.Float method_53971(yarnwrap.block.AmethystClusterBlock block) { return wrapperContained.method_53971(block.wrapperContained); }
// public static java.lang.Float method_53971(yarnwrap.block.AmethystClusterBlock block, ) { return net.minecraft.block.AmethystClusterBlock.method_53971(block.wrapperContained); }
// public java.lang.Float method_53972(yarnwrap.block.AmethystClusterBlock block) { return wrapperContained.method_53972(block.wrapperContained); }
// public static java.lang.Float method_53972(yarnwrap.block.AmethystClusterBlock block, ) { return net.minecraft.block.AmethystClusterBlock.method_53972(block.wrapperContained); }

}