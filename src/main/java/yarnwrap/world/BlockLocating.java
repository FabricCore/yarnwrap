package yarnwrap.world;
public class BlockLocating { public net.minecraft.world.BlockLocating wrapperContained; public BlockLocating(net.minecraft.world.BlockLocating wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object getLargestRectangle(yarnwrap.util.math.BlockPos center,Object primaryAxis,int primaryMaxBlocks,Object secondaryAxis,int secondaryMaxBlocks,java.util.function.Predicate predicate) { return wrapperContained.getLargestRectangle(center.wrapperContained,primaryAxis,primaryMaxBlocks,secondaryAxis,secondaryMaxBlocks,predicate); }
// public int moveWhile(java.util.function.Predicate predicate,Object pos,yarnwrap.util.math.Direction direction,int max) { return wrapperContained.moveWhile(predicate,pos,direction.wrapperContained,max); }
// public com.mojang.datafixers.util.Pair findLargestRectangle(int heights) { return wrapperContained.findLargestRectangle(heights); }
public java.util.Optional findColumnEnd(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block intermediateBlock,yarnwrap.util.math.Direction direction,yarnwrap.block.Block endBlock) { return wrapperContained.findColumnEnd(world.wrapperContained,pos.wrapperContained,intermediateBlock.wrapperContained,direction.wrapperContained,endBlock.wrapperContained); }

}