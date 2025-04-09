package yarnwrap.block;
public class LanternBlock { public net.minecraft.block.LanternBlock wrapperContained; public LanternBlock(net.minecraft.block.LanternBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape HANGING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.HANGING_SHAPE); }
public yarnwrap.state.property.BooleanProperty HANGING() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.HANGING); }
// public yarnwrap.util.shape.VoxelShape STANDING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.STANDING_SHAPE); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.Direction attachedDirection(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.attachedDirection(state.wrapperContained)); }

}