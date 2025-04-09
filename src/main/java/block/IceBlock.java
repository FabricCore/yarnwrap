package yarnwrap.block;
public class IceBlock { public net.minecraft.block.IceBlock wrapperContained; public IceBlock(net.minecraft.block.IceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void melt(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.melt(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public yarnwrap.block.BlockState getMeltedState() { return new yarnwrap.block.BlockState(wrapperContained.getMeltedState()); }

}