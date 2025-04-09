package yarnwrap.block;
public class CandleBlock { public net.minecraft.block.CandleBlock wrapperContained; public CandleBlock(net.minecraft.block.CandleBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty CANDLES() { return new yarnwrap.state.property.IntProperty(wrapperContained.CANDLES); }
public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public java.util.function.ToIntFunction STATE_TO_LUMINANCE() { return wrapperContained.STATE_TO_LUMINANCE; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap CANDLES_TO_PARTICLE_OFFSETS() { return wrapperContained.CANDLES_TO_PARTICLE_OFFSETS; }
// public yarnwrap.util.shape.VoxelShape ONE_CANDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ONE_CANDLE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape TWO_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TWO_CANDLES_SHAPE); }
// public yarnwrap.util.shape.VoxelShape THREE_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.THREE_CANDLES_SHAPE); }
// public yarnwrap.util.shape.VoxelShape FOUR_CANDLES_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FOUR_CANDLES_SHAPE); }
public int MAX_CANDLE_AMOUNT() { return wrapperContained.MAX_CANDLE_AMOUNT; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean canBeLit(yarnwrap.block.BlockState state) { return wrapperContained.canBeLit(state.wrapperContained); }

}