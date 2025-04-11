package yarnwrap.block;
public class KelpBlock { public net.minecraft.block.KelpBlock wrapperContained; public KelpBlock(net.minecraft.block.KelpBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public double GROWTH_CHANCE() { return wrapperContained.GROWTH_CHANCE; }
// public void GROWTH_CHANCE(double value) { wrapperContained.GROWTH_CHANCE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}