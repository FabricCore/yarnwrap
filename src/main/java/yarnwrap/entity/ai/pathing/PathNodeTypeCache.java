package yarnwrap.entity.ai.pathing;
public class PathNodeTypeCache { public net.minecraft.entity.ai.pathing.PathNodeTypeCache wrapperContained; public PathNodeTypeCache(net.minecraft.entity.ai.pathing.PathNodeTypeCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] positions() { return wrapperContained.positions; }
// public void positions(long[] value) { wrapperContained.positions = value; }
// public net.minecraft.entity.ai.pathing.PathNodeType[] cache() { return wrapperContained.cache; }
// public void cache(net.minecraft.entity.ai.pathing.PathNodeType[] value) { wrapperContained.cache = value; }
// public yarnwrap.entity.ai.pathing.PathNodeType get(int index,long pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.get(index,pos)); }
// public int hash(long pos) { return wrapperContained.hash(pos); }
public yarnwrap.entity.ai.pathing.PathNodeType add(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.add(world.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.entity.ai.pathing.PathNodeType compute(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int index,long longPos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.compute(world.wrapperContained,pos.wrapperContained,index,longPos)); }
public void invalidate(yarnwrap.util.math.BlockPos pos) { wrapperContained.invalidate(pos.wrapperContained); }

}