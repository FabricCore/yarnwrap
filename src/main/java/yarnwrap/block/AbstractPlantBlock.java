package yarnwrap.block;
public class AbstractPlantBlock { public net.minecraft.block.AbstractPlantBlock wrapperContained; public AbstractPlantBlock(net.minecraft.block.AbstractPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional getStemHeadPos(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block) { return wrapperContained.getStemHeadPos(world.wrapperContained,pos.wrapperContained,block.wrapperContained); }
// public static java.util.Optional getStemHeadPos(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block, ) { return net.minecraft.block.AbstractPlantBlock.getStemHeadPos(world.wrapperContained,pos.wrapperContained,block.wrapperContained); }
// public yarnwrap.block.BlockState copyState(yarnwrap.block.BlockState from,yarnwrap.block.BlockState to) { return new yarnwrap.block.BlockState(wrapperContained.copyState(from.wrapperContained,to.wrapperContained)); }
// public static yarnwrap.block.BlockState copyState(yarnwrap.block.BlockState from,yarnwrap.block.BlockState to, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractPlantBlock.copyState(from.wrapperContained,to.wrapperContained)); }

}