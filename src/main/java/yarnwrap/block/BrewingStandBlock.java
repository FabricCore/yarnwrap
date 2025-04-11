package yarnwrap.block;
public class BrewingStandBlock { public net.minecraft.block.BrewingStandBlock wrapperContained; public BrewingStandBlock(net.minecraft.block.BrewingStandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public net.minecraft.state.property.BooleanProperty[] BOTTLE_PROPERTIES() { return wrapperContained.BOTTLE_PROPERTIES; }
// public void BOTTLE_PROPERTIES(net.minecraft.state.property.BooleanProperty[] value) { wrapperContained.BOTTLE_PROPERTIES = value; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}