package yarnwrap.block;
public class StructureVoidBlock { public net.minecraft.block.StructureVoidBlock wrapperContained; public StructureVoidBlock(net.minecraft.block.StructureVoidBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public double SHAPE_MARGIN() { return wrapperContained.SHAPE_MARGIN; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}