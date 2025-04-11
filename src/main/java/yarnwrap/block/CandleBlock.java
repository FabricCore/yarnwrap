package yarnwrap.block;
public class CandleBlock { public net.minecraft.block.CandleBlock wrapperContained; public CandleBlock(net.minecraft.block.CandleBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty CANDLES() { return new yarnwrap.state.property.IntProperty(wrapperContained.CANDLES); }
// public void CANDLES(yarnwrap.state.property.IntProperty value) { wrapperContained.CANDLES = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public java.util.function.ToIntFunction STATE_TO_LUMINANCE() { return wrapperContained.STATE_TO_LUMINANCE; }
// public void STATE_TO_LUMINANCE(java.util.function.ToIntFunction value) { wrapperContained.STATE_TO_LUMINANCE = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap CANDLES_TO_PARTICLE_OFFSETS() { return wrapperContained.CANDLES_TO_PARTICLE_OFFSETS; }
// public void CANDLES_TO_PARTICLE_OFFSETS(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.CANDLES_TO_PARTICLE_OFFSETS = value; }
// public yarnwrap.util.shape.VoxelShape ONE_CANDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ONE_CANDLE_SHAPE); }
// public void ONE_CANDLE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.ONE_CANDLE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape TWO_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TWO_CANDLES_SHAPE); }
// public void TWO_CANDLES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TWO_CANDLES_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape THREE_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.THREE_CANDLES_SHAPE); }
// public void THREE_CANDLES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.THREE_CANDLES_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape FOUR_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FOUR_CANDLES_SHAPE); }
// public void FOUR_CANDLES_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.FOUR_CANDLES_SHAPE = value.wrapperContained; }
public int MAX_CANDLE_AMOUNT() { return wrapperContained.MAX_CANDLE_AMOUNT; }
// public void MAX_CANDLE_AMOUNT(int value) { wrapperContained.MAX_CANDLE_AMOUNT = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean canBeLit(yarnwrap.block.BlockState state) { return wrapperContained.canBeLit(state.wrapperContained); }

}