package yarnwrap.block;
public class KelpBlock { public net.minecraft.block.KelpBlock wrapperContained; public KelpBlock(net.minecraft.block.KelpBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.KelpBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.KelpBlock.SHAPE = value.wrapperContained; }

// public double GROWTH_CHANCE() { return wrapperContained.GROWTH_CHANCE; }
// public void GROWTH_CHANCE(double value) { wrapperContained.GROWTH_CHANCE = value; }
// public static double GROWTH_CHANCE() { return net.minecraft.block.KelpBlock.GROWTH_CHANCE; }
// public static void GROWTH_CHANCE(double value, ) { net.minecraft.block.KelpBlock.GROWTH_CHANCE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.KelpBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.KelpBlock.CODEC = value; }


}