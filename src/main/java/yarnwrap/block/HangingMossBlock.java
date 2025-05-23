package yarnwrap.block;
public class HangingMossBlock { public net.minecraft.block.HangingMossBlock wrapperContained; public HangingMossBlock(net.minecraft.block.HangingMossBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.HangingMossBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.HangingMossBlock.CODEC = value; }

// public yarnwrap.state.property.BooleanProperty TIP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.TIP); }
// public void TIP(yarnwrap.state.property.BooleanProperty value) { wrapperContained.TIP = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty TIP() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.HangingMossBlock.TIP); }
// public static void TIP(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.HangingMossBlock.TIP = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape TIP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TIP_SHAPE); }
// public void TIP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TIP_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape TIP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.HangingMossBlock.TIP_SHAPE); }
// public static void TIP_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.HangingMossBlock.TIP_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.HangingMossBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.HangingMossBlock.SHAPE = value.wrapperContained; }

public yarnwrap.util.math.BlockPos getTipPos(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getTipPos(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getTipPos(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.HangingMossBlock.getTipPos(world.wrapperContained,pos.wrapperContained)); }
// public boolean canPlaceAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlaceAt(world.wrapperContained,pos.wrapperContained); }
// public static boolean canPlaceAt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.HangingMossBlock.canPlaceAt(world.wrapperContained,pos.wrapperContained); }
// public boolean canGrowInto(yarnwrap.block.BlockState state) { return wrapperContained.canGrowInto(state.wrapperContained); }
// public static boolean canGrowInto(yarnwrap.block.BlockState state, ) { return net.minecraft.block.HangingMossBlock.canGrowInto(state.wrapperContained); }

}