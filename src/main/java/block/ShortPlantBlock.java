package yarnwrap.block;
public class ShortPlantBlock { public net.minecraft.block.ShortPlantBlock wrapperContained; public ShortPlantBlock(net.minecraft.block.ShortPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}