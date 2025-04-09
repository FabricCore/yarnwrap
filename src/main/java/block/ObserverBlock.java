package yarnwrap.block;
public class ObserverBlock { public net.minecraft.block.ObserverBlock wrapperContained; public ObserverBlock(net.minecraft.block.ObserverBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateNeighbors(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void scheduleTick(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.scheduleTick(world.wrapperContained,pos.wrapperContained); }

}