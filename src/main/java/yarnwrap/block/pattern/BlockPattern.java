package yarnwrap.block.pattern;
public class BlockPattern { public net.minecraft.block.pattern.BlockPattern wrapperContained; public BlockPattern(net.minecraft.block.pattern.BlockPattern wrapperContained) { this.wrapperContained = wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.block.pattern.BlockPattern.width; }
// public static void width(int value, ) { net.minecraft.block.pattern.BlockPattern.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.block.pattern.BlockPattern.height; }
// public static void height(int value, ) { net.minecraft.block.pattern.BlockPattern.height = value; }

// public int depth() { return wrapperContained.depth; }
// public void depth(int value) { wrapperContained.depth = value; }
// public static int depth() { return net.minecraft.block.pattern.BlockPattern.depth; }
// public static void depth(int value, ) { net.minecraft.block.pattern.BlockPattern.depth = value; }

// public java.util.function.Predicate[][][] pattern() { return wrapperContained.pattern; }
// public void pattern(java.util.function.Predicate[][][] value) { wrapperContained.pattern = value; }
// public static java.util.function.Predicate[][][] pattern() { return net.minecraft.block.pattern.BlockPattern.pattern; }
// public static void pattern(java.util.function.Predicate[][][] value, ) { net.minecraft.block.pattern.BlockPattern.pattern = value; }

public BlockPattern(java.util.function.Predicate[][][] pattern) { this.wrapperContained = new net.minecraft.block.pattern.BlockPattern(pattern); }
// public yarnwrap.util.math.BlockPos translate(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction forwards,yarnwrap.util.math.Direction up,int offsetLeft,int offsetDown,int offsetForwards) { return new yarnwrap.util.math.BlockPos(wrapperContained.translate(pos.wrapperContained,forwards.wrapperContained,up.wrapperContained,offsetLeft,offsetDown,offsetForwards)); }
// public static yarnwrap.util.math.BlockPos translate(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction forwards,yarnwrap.util.math.Direction up,int offsetLeft,int offsetDown,int offsetForwards, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.pattern.BlockPattern.translate(pos.wrapperContained,forwards.wrapperContained,up.wrapperContained,offsetLeft,offsetDown,offsetForwards)); }
public Object searchAround(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.searchAround(world.wrapperContained,pos.wrapperContained); }
// public static Object searchAround(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.pattern.BlockPattern.searchAround(world.wrapperContained,pos.wrapperContained); }
// public com.google.common.cache.LoadingCache makeCache(yarnwrap.world.WorldView world,boolean forceLoad) { return wrapperContained.makeCache(world.wrapperContained,forceLoad); }
// public static com.google.common.cache.LoadingCache makeCache(yarnwrap.world.WorldView world,boolean forceLoad, ) { return net.minecraft.block.pattern.BlockPattern.makeCache(world.wrapperContained,forceLoad); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.block.pattern.BlockPattern.getWidth(); }
// public Object testTransform(yarnwrap.util.math.BlockPos frontTopLeft,yarnwrap.util.math.Direction forwards,yarnwrap.util.math.Direction up,com.google.common.cache.LoadingCache cache) { return wrapperContained.testTransform(frontTopLeft.wrapperContained,forwards.wrapperContained,up.wrapperContained,cache); }
// public static Object testTransform(yarnwrap.util.math.BlockPos frontTopLeft,yarnwrap.util.math.Direction forwards,yarnwrap.util.math.Direction up,com.google.common.cache.LoadingCache cache, ) { return net.minecraft.block.pattern.BlockPattern.testTransform(frontTopLeft.wrapperContained,forwards.wrapperContained,up.wrapperContained,cache); }
public int getDepth() { return wrapperContained.getDepth(); }
// public static int getDepth() { return net.minecraft.block.pattern.BlockPattern.getDepth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.block.pattern.BlockPattern.getHeight(); }
public Object testTransform(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos frontTopLeft,yarnwrap.util.math.Direction forwards,yarnwrap.util.math.Direction up) { return wrapperContained.testTransform(world.wrapperContained,frontTopLeft.wrapperContained,forwards.wrapperContained,up.wrapperContained); }
// public static Object testTransform(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos frontTopLeft,yarnwrap.util.math.Direction forwards,yarnwrap.util.math.Direction up, ) { return net.minecraft.block.pattern.BlockPattern.testTransform(world.wrapperContained,frontTopLeft.wrapperContained,forwards.wrapperContained,up.wrapperContained); }
public java.util.function.Predicate[][][] getPattern() { return wrapperContained.getPattern(); }
// public static java.util.function.Predicate[][][] getPattern() { return net.minecraft.block.pattern.BlockPattern.getPattern(); }

}