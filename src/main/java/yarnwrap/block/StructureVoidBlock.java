package yarnwrap.block;
public class StructureVoidBlock { public net.minecraft.block.StructureVoidBlock wrapperContained; public StructureVoidBlock(net.minecraft.block.StructureVoidBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.StructureVoidBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.StructureVoidBlock.SHAPE = value.wrapperContained; }

// public double SHAPE_MARGIN() { return wrapperContained.SHAPE_MARGIN; }
// public void SHAPE_MARGIN(double value) { wrapperContained.SHAPE_MARGIN = value; }
// public static double SHAPE_MARGIN() { return net.minecraft.block.StructureVoidBlock.SHAPE_MARGIN; }
// public static void SHAPE_MARGIN(double value, ) { net.minecraft.block.StructureVoidBlock.SHAPE_MARGIN = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.StructureVoidBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.StructureVoidBlock.CODEC = value; }


}