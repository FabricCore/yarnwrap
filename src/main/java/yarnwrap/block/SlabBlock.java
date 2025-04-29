package yarnwrap.block;
public class SlabBlock { public net.minecraft.block.SlabBlock wrapperContained; public SlabBlock(net.minecraft.block.SlabBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape TOP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_SHAPE); }
// public void TOP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TOP_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape TOP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.SlabBlock.TOP_SHAPE); }
// public static void TOP_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.SlabBlock.TOP_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape BOTTOM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BOTTOM_SHAPE); }
// public void BOTTOM_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BOTTOM_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape BOTTOM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.SlabBlock.BOTTOM_SHAPE); }
// public static void BOTTOM_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.SlabBlock.BOTTOM_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty TYPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty TYPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.SlabBlock.TYPE); }
// public static void TYPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.SlabBlock.TYPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.SlabBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.SlabBlock.WATERLOGGED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SlabBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SlabBlock.CODEC = value; }


}