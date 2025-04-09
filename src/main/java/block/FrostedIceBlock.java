package yarnwrap.block;
public class FrostedIceBlock { public net.minecraft.block.FrostedIceBlock wrapperContained; public FrostedIceBlock(net.minecraft.block.FrostedIceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public int NEIGHBORS_CHECKED_ON_SCHEDULED_TICK() { return wrapperContained.NEIGHBORS_CHECKED_ON_SCHEDULED_TICK; }
// public int NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE() { return wrapperContained.NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean increaseAge(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.increaseAge(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean canMelt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int maxNeighbors) { return wrapperContained.canMelt(world.wrapperContained,pos.wrapperContained,maxNeighbors); }

}