package yarnwrap.block.pattern;
public class BlockPattern { public net.minecraft.block.pattern.BlockPattern wrapperContained; public BlockPattern(net.minecraft.block.pattern.BlockPattern wrapperContained) { this.wrapperContained = wrapperContained; }

// public int width() { return wrapperContained.width; }
// public int height() { return wrapperContained.height; }
// public int depth() { return wrapperContained.depth; }
// public java.util.function.Predicate[][][] pattern() { return wrapperContained.pattern; }
// public yarnwrap.util.math.BlockPos translate(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction forwards,yarnwrap.util.math.Direction up,int offsetLeft,int offsetDown,int offsetForwards) { return new yarnwrap.util.math.BlockPos(wrapperContained.translate(pos.wrapperContained,forwards.wrapperContained,up.wrapperContained,offsetLeft,offsetDown,offsetForwards)); }
public Object searchAround(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.searchAround(world.wrapperContained,pos.wrapperContained); }
public com.google.common.cache.LoadingCache makeCache(yarnwrap.world.WorldView world,boolean forceLoad) { return wrapperContained.makeCache(world.wrapperContained,forceLoad); }
public int getWidth() { return wrapperContained.getWidth(); }
// public Object testTransform(yarnwrap.util.math.BlockPos frontTopLeft,yarnwrap.util.math.Direction forwards,yarnwrap.util.math.Direction up,com.google.common.cache.LoadingCache cache) { return wrapperContained.testTransform(frontTopLeft.wrapperContained,forwards.wrapperContained,up.wrapperContained,cache); }
public int getDepth() { return wrapperContained.getDepth(); }
public int getHeight() { return wrapperContained.getHeight(); }
public Object testTransform(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos frontTopLeft,yarnwrap.util.math.Direction forwards,yarnwrap.util.math.Direction up) { return wrapperContained.testTransform(world.wrapperContained,frontTopLeft.wrapperContained,forwards.wrapperContained,up.wrapperContained); }
public java.util.function.Predicate[][][] getPattern() { return wrapperContained.getPattern(); }

}