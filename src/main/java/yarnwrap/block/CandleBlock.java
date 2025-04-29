package yarnwrap.block;
public class CandleBlock { public net.minecraft.block.CandleBlock wrapperContained; public CandleBlock(net.minecraft.block.CandleBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty CANDLES() { return new yarnwrap.state.property.IntProperty(wrapperContained.CANDLES); }
// public void CANDLES(yarnwrap.state.property.IntProperty value) { wrapperContained.CANDLES = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty CANDLES() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.CandleBlock.CANDLES); }
// public static void CANDLES(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.CandleBlock.CANDLES = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.CandleBlock.LIT); }
// public static void LIT(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.CandleBlock.LIT = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.CandleBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.CandleBlock.WATERLOGGED = value.wrapperContained; }

// public java.util.function.ToIntFunction STATE_TO_LUMINANCE() { return wrapperContained.STATE_TO_LUMINANCE; }
// public void STATE_TO_LUMINANCE(java.util.function.ToIntFunction value) { wrapperContained.STATE_TO_LUMINANCE = value; }
public static java.util.function.ToIntFunction STATE_TO_LUMINANCE() { return net.minecraft.block.CandleBlock.STATE_TO_LUMINANCE; }
// public static void STATE_TO_LUMINANCE(java.util.function.ToIntFunction value, ) { net.minecraft.block.CandleBlock.STATE_TO_LUMINANCE = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap CANDLES_TO_PARTICLE_OFFSETS() { return wrapperContained.CANDLES_TO_PARTICLE_OFFSETS; }
// public void CANDLES_TO_PARTICLE_OFFSETS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.CANDLES_TO_PARTICLE_OFFSETS = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap CANDLES_TO_PARTICLE_OFFSETS() { return net.minecraft.block.CandleBlock.CANDLES_TO_PARTICLE_OFFSETS; }
// public static void CANDLES_TO_PARTICLE_OFFSETS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.block.CandleBlock.CANDLES_TO_PARTICLE_OFFSETS = value; }

// public yarnwrap.util.shape.VoxelShape ONE_CANDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ONE_CANDLE_SHAPE); }
// public void ONE_CANDLE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.ONE_CANDLE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape ONE_CANDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CandleBlock.ONE_CANDLE_SHAPE); }
// public static void ONE_CANDLE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CandleBlock.ONE_CANDLE_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape TWO_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TWO_CANDLES_SHAPE); }
// public void TWO_CANDLES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TWO_CANDLES_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape TWO_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CandleBlock.TWO_CANDLES_SHAPE); }
// public static void TWO_CANDLES_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CandleBlock.TWO_CANDLES_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape THREE_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.THREE_CANDLES_SHAPE); }
// public void THREE_CANDLES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.THREE_CANDLES_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape THREE_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CandleBlock.THREE_CANDLES_SHAPE); }
// public static void THREE_CANDLES_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CandleBlock.THREE_CANDLES_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape FOUR_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FOUR_CANDLES_SHAPE); }
// public void FOUR_CANDLES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.FOUR_CANDLES_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape FOUR_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CandleBlock.FOUR_CANDLES_SHAPE); }
// public static void FOUR_CANDLES_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CandleBlock.FOUR_CANDLES_SHAPE = value.wrapperContained; }

// public int MAX_CANDLE_AMOUNT() { return wrapperContained.MAX_CANDLE_AMOUNT; }
// public void MAX_CANDLE_AMOUNT(int value) { wrapperContained.MAX_CANDLE_AMOUNT = value; }
public static int MAX_CANDLE_AMOUNT() { return net.minecraft.block.CandleBlock.MAX_CANDLE_AMOUNT; }
// public static void MAX_CANDLE_AMOUNT(int value, ) { net.minecraft.block.CandleBlock.MAX_CANDLE_AMOUNT = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CandleBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CandleBlock.CODEC = value; }

// public boolean method_31628(Object statex) { return wrapperContained.method_31628(statex); }
// public static boolean method_31628(Object statex, ) { return net.minecraft.block.CandleBlock.method_31628(statex); }
// public boolean canBeLit(yarnwrap.block.BlockState state) { return wrapperContained.canBeLit(state.wrapperContained); }
// public static boolean canBeLit(yarnwrap.block.BlockState state, ) { return net.minecraft.block.CandleBlock.canBeLit(state.wrapperContained); }
// public int method_31631(yarnwrap.block.BlockState state) { return wrapperContained.method_31631(state.wrapperContained); }
// public static int method_31631(yarnwrap.block.BlockState state, ) { return net.minecraft.block.CandleBlock.method_31631(state.wrapperContained); }

}