package yarnwrap.block;
public class BrewingStandBlock { public net.minecraft.block.BrewingStandBlock wrapperContained; public BrewingStandBlock(net.minecraft.block.BrewingStandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.state.property.BooleanProperty[] BOTTLE_PROPERTIES() { return wrapperContained.BOTTLE_PROPERTIES; }
// public void BOTTLE_PROPERTIES(net.minecraft.state.property.BooleanProperty[] value) { wrapperContained.BOTTLE_PROPERTIES = value; }
public static net.minecraft.state.property.BooleanProperty[] BOTTLE_PROPERTIES() { return net.minecraft.block.BrewingStandBlock.BOTTLE_PROPERTIES; }
// public static void BOTTLE_PROPERTIES(net.minecraft.state.property.BooleanProperty[] value, ) { net.minecraft.block.BrewingStandBlock.BOTTLE_PROPERTIES = value; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BrewingStandBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.BrewingStandBlock.SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BrewingStandBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BrewingStandBlock.CODEC = value; }


}