package yarnwrap.entity.ai.pathing;
public class PathContext { public net.minecraft.entity.ai.pathing.PathContext wrapperContained; public PathContext(net.minecraft.entity.ai.pathing.PathContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.CollisionView world() { return new yarnwrap.world.CollisionView(wrapperContained.world); }
// public yarnwrap.entity.ai.pathing.PathNodeTypeCache nodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(wrapperContained.nodeTypeCache); }
// public yarnwrap.util.math.BlockPos entityPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.entityPos); }
// public Object lastNodePos() { return wrapperContained.lastNodePos; }
public yarnwrap.world.CollisionView getWorld() { return new yarnwrap.world.CollisionView(wrapperContained.getWorld()); }
public yarnwrap.entity.ai.pathing.PathNodeType getNodeType(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getNodeType(x,y,z)); }
public yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(pos.wrapperContained)); }
public yarnwrap.util.math.BlockPos getEntityPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getEntityPos()); }

}