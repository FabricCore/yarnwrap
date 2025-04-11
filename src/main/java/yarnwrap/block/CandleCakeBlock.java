package yarnwrap.block;
public class CandleCakeBlock { public net.minecraft.block.CandleCakeBlock wrapperContained; public CandleCakeBlock(net.minecraft.block.CandleCakeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape CAKE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CAKE_SHAPE); }
// public void CAKE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.CAKE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape CANDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CANDLE_SHAPE); }
// public void CANDLE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.CANDLE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public java.util.Map CANDLES_TO_CANDLE_CAKES() { return wrapperContained.CANDLES_TO_CANDLE_CAKES; }
// public void CANDLES_TO_CANDLE_CAKES(java.util.Map value) { wrapperContained.CANDLES_TO_CANDLE_CAKES = value; }
// public java.lang.Iterable PARTICLE_OFFSETS() { return wrapperContained.PARTICLE_OFFSETS; }
// public void PARTICLE_OFFSETS(java.lang.Iterable value) { wrapperContained.PARTICLE_OFFSETS = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.block.CandleBlock candle() { return new yarnwrap.block.CandleBlock(wrapperContained.candle); }
// public void candle(yarnwrap.block.CandleBlock value) { wrapperContained.candle = value.wrapperContained; }
public yarnwrap.block.BlockState getCandleCakeFromCandle(yarnwrap.block.CandleBlock candle) { return new yarnwrap.block.BlockState(wrapperContained.getCandleCakeFromCandle(candle.wrapperContained)); }
// public boolean isHittingCandle(yarnwrap.util.hit.BlockHitResult hitResult) { return wrapperContained.isHittingCandle(hitResult.wrapperContained); }
public boolean canBeLit(yarnwrap.block.BlockState state) { return wrapperContained.canBeLit(state.wrapperContained); }

}