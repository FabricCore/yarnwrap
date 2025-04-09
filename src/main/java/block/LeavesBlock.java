package yarnwrap.block;
public class LeavesBlock { public net.minecraft.block.LeavesBlock wrapperContained; public LeavesBlock(net.minecraft.block.LeavesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty DISTANCE() { return new yarnwrap.state.property.IntProperty(wrapperContained.DISTANCE); }
public yarnwrap.state.property.BooleanProperty PERSISTENT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.PERSISTENT); }
public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.block.BlockState updateDistanceFromLogs(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.updateDistanceFromLogs(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public int getDistanceFromLog(yarnwrap.block.BlockState state) { return wrapperContained.getDistanceFromLog(state.wrapperContained); }
// public boolean shouldDecay(yarnwrap.block.BlockState state) { return wrapperContained.shouldDecay(state.wrapperContained); }
public java.util.OptionalInt getOptionalDistanceFromLog(yarnwrap.block.BlockState state) { return wrapperContained.getOptionalDistanceFromLog(state.wrapperContained); }

}