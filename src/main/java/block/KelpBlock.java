package yarnwrap.block;
public class KelpBlock { public net.minecraft.block.KelpBlock wrapperContained; public KelpBlock(net.minecraft.block.KelpBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public double GROWTH_CHANCE() { return wrapperContained.GROWTH_CHANCE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}