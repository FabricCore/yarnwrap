package yarnwrap.block;
public class CandleCakeBlock { public net.minecraft.block.CandleCakeBlock wrapperContained; public CandleCakeBlock(net.minecraft.block.CandleCakeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.CandleCakeBlock.LIT); }
// public static void LIT(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.CandleCakeBlock.LIT = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape CAKE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CAKE_SHAPE); }
// public void CAKE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.CAKE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape CAKE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CandleCakeBlock.CAKE_SHAPE); }
// public static void CAKE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CandleCakeBlock.CAKE_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape CANDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CANDLE_SHAPE); }
// public void CANDLE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.CANDLE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape CANDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CandleCakeBlock.CANDLE_SHAPE); }
// public static void CANDLE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CandleCakeBlock.CANDLE_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CandleCakeBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CandleCakeBlock.SHAPE = value.wrapperContained; }

// public java.util.Map CANDLES_TO_CANDLE_CAKES() { return wrapperContained.CANDLES_TO_CANDLE_CAKES; }
// public void CANDLES_TO_CANDLE_CAKES(java.util.Map value) { wrapperContained.CANDLES_TO_CANDLE_CAKES = value; }
// public static java.util.Map CANDLES_TO_CANDLE_CAKES() { return net.minecraft.block.CandleCakeBlock.CANDLES_TO_CANDLE_CAKES; }
// public static void CANDLES_TO_CANDLE_CAKES(java.util.Map value, ) { net.minecraft.block.CandleCakeBlock.CANDLES_TO_CANDLE_CAKES = value; }

// public java.lang.Iterable PARTICLE_OFFSETS() { return wrapperContained.PARTICLE_OFFSETS; }
// public void PARTICLE_OFFSETS(java.lang.Iterable value) { wrapperContained.PARTICLE_OFFSETS = value; }
// public static java.lang.Iterable PARTICLE_OFFSETS() { return net.minecraft.block.CandleCakeBlock.PARTICLE_OFFSETS; }
// public static void PARTICLE_OFFSETS(java.lang.Iterable value, ) { net.minecraft.block.CandleCakeBlock.PARTICLE_OFFSETS = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CandleCakeBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CandleCakeBlock.CODEC = value; }

// public yarnwrap.block.CandleBlock candle() { return new yarnwrap.block.CandleBlock(wrapperContained.candle); }
// public void candle(yarnwrap.block.CandleBlock value) { wrapperContained.candle = value.wrapperContained; }
// public static yarnwrap.block.CandleBlock candle() { return new yarnwrap.block.CandleBlock(net.minecraft.block.CandleCakeBlock.candle); }
// public static void candle(yarnwrap.block.CandleBlock value, ) { net.minecraft.block.CandleCakeBlock.candle = value.wrapperContained; }

// public CandleCakeBlock(yarnwrap.block.Block candle,Object settings) { this.wrapperContained = new net.minecraft.block.CandleCakeBlock(candle.wrapperContained,settings); }
// public yarnwrap.block.BlockState getCandleCakeFromCandle(yarnwrap.block.CandleBlock candle) { return new yarnwrap.block.BlockState(wrapperContained.getCandleCakeFromCandle(candle.wrapperContained)); }
// public static yarnwrap.block.BlockState getCandleCakeFromCandle(yarnwrap.block.CandleBlock candle, ) { return new yarnwrap.block.BlockState(net.minecraft.block.CandleCakeBlock.getCandleCakeFromCandle(candle.wrapperContained)); }
// public boolean method_31633(yarnwrap.block.BlockState statex) { return wrapperContained.method_31633(statex.wrapperContained); }
// public static boolean method_31633(yarnwrap.block.BlockState statex, ) { return net.minecraft.block.CandleCakeBlock.method_31633(statex.wrapperContained); }
// public boolean isHittingCandle(yarnwrap.util.hit.BlockHitResult hitResult) { return wrapperContained.isHittingCandle(hitResult.wrapperContained); }
// public static boolean isHittingCandle(yarnwrap.util.hit.BlockHitResult hitResult, ) { return net.minecraft.block.CandleCakeBlock.isHittingCandle(hitResult.wrapperContained); }
// public boolean canBeLit(yarnwrap.block.BlockState state) { return wrapperContained.canBeLit(state.wrapperContained); }
// public static boolean canBeLit(yarnwrap.block.BlockState state, ) { return net.minecraft.block.CandleCakeBlock.canBeLit(state.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53989(Object instance) { return wrapperContained.method_53989(instance); }
// public static com.mojang.datafixers.kinds.App method_53989(Object instance, ) { return net.minecraft.block.CandleCakeBlock.method_53989(instance); }
// public yarnwrap.block.Block method_53990(yarnwrap.block.CandleCakeBlock block) { return new yarnwrap.block.Block(wrapperContained.method_53990(block.wrapperContained)); }
// public static yarnwrap.block.Block method_53990(yarnwrap.block.CandleCakeBlock block, ) { return new yarnwrap.block.Block(net.minecraft.block.CandleCakeBlock.method_53990(block.wrapperContained)); }

}