package yarnwrap.block;
public class WeepingVinesPlantBlock { public net.minecraft.block.WeepingVinesPlantBlock wrapperContained; public WeepingVinesPlantBlock(net.minecraft.block.WeepingVinesPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}