package yarnwrap.client.color.block;
public class BlockColorProvider { public net.minecraft.client.color.block.BlockColorProvider wrapperContained; public BlockColorProvider(net.minecraft.client.color.block.BlockColorProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public int getColor(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.getColor(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public static int getColor(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex, ) { return net.minecraft.client.color.block.BlockColorProvider.getColor(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }

}