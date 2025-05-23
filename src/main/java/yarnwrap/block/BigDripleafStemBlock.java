package yarnwrap.block;
public class BigDripleafStemBlock { public net.minecraft.block.BigDripleafStemBlock wrapperContained; public BigDripleafStemBlock(net.minecraft.block.BigDripleafStemBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.BigDripleafStemBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.BigDripleafStemBlock.WATERLOGGED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BigDripleafStemBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BigDripleafStemBlock.CODEC = value; }

// public java.util.Map SHAPES_BY_DIRECTION() { return wrapperContained.SHAPES_BY_DIRECTION; }
// public void SHAPES_BY_DIRECTION(java.util.Map value) { wrapperContained.SHAPES_BY_DIRECTION = value; }
// public static java.util.Map SHAPES_BY_DIRECTION() { return net.minecraft.block.BigDripleafStemBlock.SHAPES_BY_DIRECTION; }
// public static void SHAPES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.BigDripleafStemBlock.SHAPES_BY_DIRECTION = value; }

// public boolean placeStemAt(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState fluidState,yarnwrap.util.math.Direction direction) { return wrapperContained.placeStemAt(world.wrapperContained,pos.wrapperContained,fluidState.wrapperContained,direction.wrapperContained); }
// public static boolean placeStemAt(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState fluidState,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.BigDripleafStemBlock.placeStemAt(world.wrapperContained,pos.wrapperContained,fluidState.wrapperContained,direction.wrapperContained); }

}