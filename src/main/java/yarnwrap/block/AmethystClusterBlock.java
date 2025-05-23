package yarnwrap.block;
public class AmethystClusterBlock { public net.minecraft.block.AmethystClusterBlock wrapperContained; public AmethystClusterBlock(net.minecraft.block.AmethystClusterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.AmethystClusterBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.AmethystClusterBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.AmethystClusterBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.AmethystClusterBlock.FACING = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.AmethystClusterBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.AmethystClusterBlock.CODEC = value; }

// public float height() { return wrapperContained.height; }
// public void height(float value) { wrapperContained.height = value; }
// public static float height() { return net.minecraft.block.AmethystClusterBlock.height; }
// public static void height(float value, ) { net.minecraft.block.AmethystClusterBlock.height = value; }

// public float width() { return wrapperContained.width; }
// public void width(float value) { wrapperContained.width = value; }
// public static float width() { return net.minecraft.block.AmethystClusterBlock.width; }
// public static void width(float value, ) { net.minecraft.block.AmethystClusterBlock.width = value; }

// public java.util.Map shapesByDirection() { return wrapperContained.shapesByDirection; }
// public void shapesByDirection(java.util.Map value) { wrapperContained.shapesByDirection = value; }
// public static java.util.Map shapesByDirection() { return net.minecraft.block.AmethystClusterBlock.shapesByDirection; }
// public static void shapesByDirection(java.util.Map value, ) { net.minecraft.block.AmethystClusterBlock.shapesByDirection = value; }

// public AmethystClusterBlock(float height,float width,Object settings) { this.wrapperContained = new net.minecraft.block.AmethystClusterBlock(height,width,settings); }
// public com.mojang.datafixers.kinds.App method_53970(Object instance) { return wrapperContained.method_53970(instance); }
// public static com.mojang.datafixers.kinds.App method_53970(Object instance, ) { return net.minecraft.block.AmethystClusterBlock.method_53970(instance); }
// public java.lang.Float method_53971(yarnwrap.block.AmethystClusterBlock block) { return wrapperContained.method_53971(block.wrapperContained); }
// public static java.lang.Float method_53971(yarnwrap.block.AmethystClusterBlock block, ) { return net.minecraft.block.AmethystClusterBlock.method_53971(block.wrapperContained); }
// public java.lang.Float method_53972(yarnwrap.block.AmethystClusterBlock block) { return wrapperContained.method_53972(block.wrapperContained); }
// public static java.lang.Float method_53972(yarnwrap.block.AmethystClusterBlock block, ) { return net.minecraft.block.AmethystClusterBlock.method_53972(block.wrapperContained); }

}