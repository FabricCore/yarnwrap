package yarnwrap.block;
public class PistonHeadBlock { public net.minecraft.block.PistonHeadBlock wrapperContained; public PistonHeadBlock(net.minecraft.block.PistonHeadBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty TYPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty TYPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.PistonHeadBlock.TYPE); }
// public static void TYPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.PistonHeadBlock.TYPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty SHORT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SHORT); }
// public void SHORT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SHORT = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty SHORT() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.PistonHeadBlock.SHORT); }
// public static void SHORT(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.PistonHeadBlock.SHORT = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PistonHeadBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PistonHeadBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BASE_SHAPE); }
// public void BASE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BASE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.PistonHeadBlock.BASE_SHAPE); }
// public static void BASE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.PistonHeadBlock.BASE_SHAPE = value.wrapperContained; }

// public java.util.Map SHORT_SHAPES() { return wrapperContained.SHORT_SHAPES; }
// public void SHORT_SHAPES(java.util.Map value) { wrapperContained.SHORT_SHAPES = value; }
// public static java.util.Map SHORT_SHAPES() { return net.minecraft.block.PistonHeadBlock.SHORT_SHAPES; }
// public static void SHORT_SHAPES(java.util.Map value, ) { net.minecraft.block.PistonHeadBlock.SHORT_SHAPES = value; }

// public java.util.Map LONG_SHAPES() { return wrapperContained.LONG_SHAPES; }
// public void LONG_SHAPES(java.util.Map value) { wrapperContained.LONG_SHAPES = value; }
// public static java.util.Map LONG_SHAPES() { return net.minecraft.block.PistonHeadBlock.LONG_SHAPES; }
// public static void LONG_SHAPES(java.util.Map value, ) { net.minecraft.block.PistonHeadBlock.LONG_SHAPES = value; }

// public boolean isAttached(yarnwrap.block.BlockState headState,yarnwrap.block.BlockState pistonState) { return wrapperContained.isAttached(headState.wrapperContained,pistonState.wrapperContained); }
// public static boolean isAttached(yarnwrap.block.BlockState headState,yarnwrap.block.BlockState pistonState, ) { return net.minecraft.block.PistonHeadBlock.isAttached(headState.wrapperContained,pistonState.wrapperContained); }

}