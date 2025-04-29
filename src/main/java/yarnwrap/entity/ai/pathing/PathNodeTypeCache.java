package yarnwrap.entity.ai.pathing;
public class PathNodeTypeCache { public net.minecraft.entity.ai.pathing.PathNodeTypeCache wrapperContained; public PathNodeTypeCache(net.minecraft.entity.ai.pathing.PathNodeTypeCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] positions() { return wrapperContained.positions; }
// public void positions(long[] value) { wrapperContained.positions = value; }
// public static long[] positions() { return net.minecraft.entity.ai.pathing.PathNodeTypeCache.positions; }
// public static void positions(long[] value, ) { net.minecraft.entity.ai.pathing.PathNodeTypeCache.positions = value; }

// public net.minecraft.entity.ai.pathing.PathNodeType[] cache() { return wrapperContained.cache; }
// public void cache(net.minecraft.entity.ai.pathing.PathNodeType[] value) { wrapperContained.cache = value; }
// public static net.minecraft.entity.ai.pathing.PathNodeType[] cache() { return net.minecraft.entity.ai.pathing.PathNodeTypeCache.cache; }
// public static void cache(net.minecraft.entity.ai.pathing.PathNodeType[] value, ) { net.minecraft.entity.ai.pathing.PathNodeTypeCache.cache = value; }

// public yarnwrap.entity.ai.pathing.PathNodeType get(int index,long pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.get(index,pos)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType get(int index,long pos, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.PathNodeTypeCache.get(index,pos)); }
// public int hash(long pos) { return wrapperContained.hash(pos); }
// public static int hash(long pos, ) { return net.minecraft.entity.ai.pathing.PathNodeTypeCache.hash(pos); }
public yarnwrap.entity.ai.pathing.PathNodeType add(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.add(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType add(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.PathNodeTypeCache.add(world.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.entity.ai.pathing.PathNodeType compute(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int index,long longPos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.compute(world.wrapperContained,pos.wrapperContained,index,longPos)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType compute(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int index,long longPos, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.PathNodeTypeCache.compute(world.wrapperContained,pos.wrapperContained,index,longPos)); }
public void invalidate(yarnwrap.util.math.BlockPos pos) { wrapperContained.invalidate(pos.wrapperContained); }
// public static void invalidate(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.ai.pathing.PathNodeTypeCache.invalidate(pos.wrapperContained); }

}