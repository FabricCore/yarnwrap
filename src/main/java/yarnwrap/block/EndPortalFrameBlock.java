package yarnwrap.block;
public class EndPortalFrameBlock { public net.minecraft.block.EndPortalFrameBlock wrapperContained; public EndPortalFrameBlock(net.minecraft.block.EndPortalFrameBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EYE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EYE_SHAPE); }
// public void EYE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EYE_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape FRAME_WITH_EYE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FRAME_WITH_EYE_SHAPE); }
// public void FRAME_WITH_EYE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.FRAME_WITH_EYE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape FRAME_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FRAME_SHAPE); }
// public void FRAME_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.FRAME_SHAPE = value.wrapperContained; }
// public yarnwrap.block.pattern.BlockPattern COMPLETED_FRAME() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.COMPLETED_FRAME); }
// public void COMPLETED_FRAME(yarnwrap.block.pattern.BlockPattern value) { wrapperContained.COMPLETED_FRAME = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty EYE() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EYE); }
// public void EYE(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EYE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.block.pattern.BlockPattern getCompletedFramePattern() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.getCompletedFramePattern()); }

}