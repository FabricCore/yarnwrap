package yarnwrap.block;
public class ChainBlock { public net.minecraft.block.ChainBlock wrapperContained; public ChainBlock(net.minecraft.block.ChainBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ChainBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ChainBlock.WATERLOGGED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ChainBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ChainBlock.CODEC = value; }

// public java.util.Map SHAPES_BY_AXIS() { return wrapperContained.SHAPES_BY_AXIS; }
// public void SHAPES_BY_AXIS(java.util.Map value) { wrapperContained.SHAPES_BY_AXIS = value; }
// public static java.util.Map SHAPES_BY_AXIS() { return net.minecraft.block.ChainBlock.SHAPES_BY_AXIS; }
// public static void SHAPES_BY_AXIS(java.util.Map value, ) { net.minecraft.block.ChainBlock.SHAPES_BY_AXIS = value; }


}