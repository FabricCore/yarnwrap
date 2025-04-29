package yarnwrap.block;
public class LanternBlock { public net.minecraft.block.LanternBlock wrapperContained; public LanternBlock(net.minecraft.block.LanternBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape HANGING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.HANGING_SHAPE); }
// public void HANGING_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.HANGING_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape HANGING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.LanternBlock.HANGING_SHAPE); }
// public static void HANGING_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.LanternBlock.HANGING_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty HANGING() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.HANGING); }
// public void HANGING(yarnwrap.state.property.BooleanProperty value) { wrapperContained.HANGING = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty HANGING() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LanternBlock.HANGING); }
// public static void HANGING(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LanternBlock.HANGING = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape STANDING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.STANDING_SHAPE); }
// public void STANDING_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.STANDING_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape STANDING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.LanternBlock.STANDING_SHAPE); }
// public static void STANDING_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.LanternBlock.STANDING_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LanternBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LanternBlock.WATERLOGGED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LanternBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LanternBlock.CODEC = value; }

// public yarnwrap.util.math.Direction attachedDirection(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.attachedDirection(state.wrapperContained)); }
// public static yarnwrap.util.math.Direction attachedDirection(yarnwrap.block.BlockState state, ) { return new yarnwrap.util.math.Direction(net.minecraft.block.LanternBlock.attachedDirection(state.wrapperContained)); }

}