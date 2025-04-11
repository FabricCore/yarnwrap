package yarnwrap.block;
public class SpreadableBlock { public net.minecraft.block.SpreadableBlock wrapperContained; public SpreadableBlock(net.minecraft.block.SpreadableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canSpread(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canSpread(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean canSurvive(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canSurvive(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}