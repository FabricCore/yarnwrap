package yarnwrap.block;
public class BrewingStandBlock { public net.minecraft.block.BrewingStandBlock wrapperContained; public BrewingStandBlock(net.minecraft.block.BrewingStandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public net.minecraft.state.property.BooleanProperty[] BOTTLE_PROPERTIES() { return wrapperContained.BOTTLE_PROPERTIES; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}