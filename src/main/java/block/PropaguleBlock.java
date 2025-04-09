package yarnwrap.block;
public class PropaguleBlock { public net.minecraft.block.PropaguleBlock wrapperContained; public PropaguleBlock(net.minecraft.block.PropaguleBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public yarnwrap.state.property.BooleanProperty HANGING() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.HANGING); }
// public net.minecraft.util.shape.VoxelShape[] SHAPES() { return wrapperContained.SHAPES; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.block.BlockState getDefaultHangingState() { return new yarnwrap.block.BlockState(wrapperContained.getDefaultHangingState()); }
// public boolean isHanging(yarnwrap.block.BlockState state) { return wrapperContained.isHanging(state.wrapperContained); }
// public boolean isFullyGrown(yarnwrap.block.BlockState state) { return wrapperContained.isFullyGrown(state.wrapperContained); }
public yarnwrap.block.BlockState getHangingState(int age) { return new yarnwrap.block.BlockState(wrapperContained.getHangingState(age)); }

}