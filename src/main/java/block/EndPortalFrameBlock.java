package yarnwrap.block;
public class EndPortalFrameBlock { public net.minecraft.block.EndPortalFrameBlock wrapperContained; public EndPortalFrameBlock(net.minecraft.block.EndPortalFrameBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EYE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EYE_SHAPE); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape FRAME_WITH_EYE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FRAME_WITH_EYE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape FRAME_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FRAME_SHAPE); }
// public yarnwrap.block.pattern.BlockPattern COMPLETED_FRAME() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.COMPLETED_FRAME); }
public yarnwrap.state.property.BooleanProperty EYE() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EYE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.block.pattern.BlockPattern getCompletedFramePattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getCompletedFramePattern()); }

}