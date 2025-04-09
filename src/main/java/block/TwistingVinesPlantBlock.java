package yarnwrap.block;
public class TwistingVinesPlantBlock { public net.minecraft.block.TwistingVinesPlantBlock wrapperContained; public TwistingVinesPlantBlock(net.minecraft.block.TwistingVinesPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}