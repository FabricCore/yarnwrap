package yarnwrap.block;
public class CandleCakeBlock { public net.minecraft.block.CandleCakeBlock wrapperContained; public CandleCakeBlock(net.minecraft.block.CandleCakeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public yarnwrap.util.shape.VoxelShape CAKE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CAKE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape CANDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CANDLE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public java.util.Map CANDLES_TO_CANDLE_CAKES() { return wrapperContained.CANDLES_TO_CANDLE_CAKES; }
// public java.lang.Iterable PARTICLE_OFFSETS() { return wrapperContained.PARTICLE_OFFSETS; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.block.CandleBlock candle() { return new yarnwrap.block.CandleBlock(wrapperContained.candle); }
public yarnwrap.block.BlockState getCandleCakeFromCandle(yarnwrap.block.CandleBlock candle) { return new yarnwrap.block.BlockState(wrapperContained.getCandleCakeFromCandle(candle.wrapperContained)); }
// public boolean isHittingCandle(yarnwrap.util.hit.BlockHitResult hitResult) { return wrapperContained.isHittingCandle(hitResult.wrapperContained); }
public boolean canBeLit(yarnwrap.block.BlockState state) { return wrapperContained.canBeLit(state.wrapperContained); }

}