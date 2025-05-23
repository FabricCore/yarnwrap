package yarnwrap.block;
public class ShortPlantBlock { public net.minecraft.block.ShortPlantBlock wrapperContained; public ShortPlantBlock(net.minecraft.block.ShortPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ShortPlantBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.ShortPlantBlock.SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ShortPlantBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ShortPlantBlock.CODEC = value; }

// public yarnwrap.block.TallPlantBlock getLargeVariant(yarnwrap.block.BlockState state) { return new yarnwrap.block.TallPlantBlock(wrapperContained.getLargeVariant(state.wrapperContained)); }
// public static yarnwrap.block.TallPlantBlock getLargeVariant(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.TallPlantBlock(net.minecraft.block.ShortPlantBlock.getLargeVariant(state.wrapperContained)); }

}