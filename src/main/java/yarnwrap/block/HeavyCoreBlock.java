package yarnwrap.block;
public class HeavyCoreBlock { public net.minecraft.block.HeavyCoreBlock wrapperContained; public HeavyCoreBlock(net.minecraft.block.HeavyCoreBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.HeavyCoreBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.HeavyCoreBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }
// public void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.OUTLINE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.HeavyCoreBlock.OUTLINE_SHAPE); }
// public static void OUTLINE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.HeavyCoreBlock.OUTLINE_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.HeavyCoreBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.HeavyCoreBlock.WATERLOGGED = value.wrapperContained; }


}