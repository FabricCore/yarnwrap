package yarnwrap.block;
public class FallingBlock { public net.minecraft.block.FallingBlock wrapperContained; public FallingBlock(net.minecraft.block.FallingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canFallThrough(yarnwrap.block.BlockState state) { return wrapperContained.canFallThrough(state.wrapperContained); }
public int getColor(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getColor(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void configureFallingBlockEntity(yarnwrap.entity.FallingBlockEntity entity) { wrapperContained.configureFallingBlockEntity(entity.wrapperContained); }
// public int getFallDelay() { return wrapperContained.getFallDelay(); }

}