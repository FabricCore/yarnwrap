package yarnwrap.entity.ai.pathing;
public class PathNodeMaker { public net.minecraft.entity.ai.pathing.PathNodeMaker wrapperContained; public PathNodeMaker(net.minecraft.entity.ai.pathing.PathNodeMaker wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canSwim() { return wrapperContained.canSwim; }
// public boolean canOpenDoors() { return wrapperContained.canOpenDoors; }
// public int entityBlockZSize() { return wrapperContained.entityBlockZSize; }
// public boolean canEnterOpenDoors() { return wrapperContained.canEnterOpenDoors; }
// public int entityBlockYSize() { return wrapperContained.entityBlockYSize; }
// public int entityBlockXSize() { return wrapperContained.entityBlockXSize; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap pathNodeCache() { return wrapperContained.pathNodeCache; }
// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public boolean canWalkOverFences() { return wrapperContained.canWalkOverFences; }
// public yarnwrap.entity.ai.pathing.PathContext context() { return new yarnwrap.entity.ai.pathing.PathContext(wrapperContained.context); }
public void init(yarnwrap.world.chunk.ChunkCache cachedWorld,yarnwrap.entity.mob.MobEntity entity) { wrapperContained.init(cachedWorld.wrapperContained,entity.wrapperContained); }
public yarnwrap.entity.ai.pathing.PathNode getNode(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNode(x,y,z)); }
public void setCanSwim(boolean canSwim) { wrapperContained.setCanSwim(canSwim); }
public void setCanEnterOpenDoors(boolean canEnterOpenDoors) { wrapperContained.setCanEnterOpenDoors(canEnterOpenDoors); }
public yarnwrap.entity.ai.pathing.TargetPathNode getNode(double x,double y,double z) { return new yarnwrap.entity.ai.pathing.TargetPathNode(wrapperContained.getNode(x,y,z)); }
public yarnwrap.entity.ai.pathing.PathNodeType getDefaultNodeType(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getDefaultNodeType(context.wrapperContained,x,y,z)); }
public int getSuccessors(net.minecraft.entity.ai.pathing.PathNode[] successors,yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getSuccessors(successors,node.wrapperContained); }
public void clear() { wrapperContained.clear(); }
public void setCanOpenDoors(boolean canOpenDoors) { wrapperContained.setCanOpenDoors(canOpenDoors); }
public yarnwrap.entity.ai.pathing.PathNode getStart() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getStart()); }
// public boolean canSwim() { return wrapperContained.canSwim(); }
// public boolean canEnterOpenDoors() { return wrapperContained.canEnterOpenDoors(); }
// public boolean canOpenDoors() { return wrapperContained.canOpenDoors(); }
public yarnwrap.entity.ai.pathing.PathNodeType getNodeType(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z,yarnwrap.entity.mob.MobEntity mob) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getNodeType(context.wrapperContained,x,y,z,mob.wrapperContained)); }
// public yarnwrap.entity.ai.pathing.PathNode getNode(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNode(pos.wrapperContained)); }
public void setCanWalkOverFences(boolean canWalkOverFences) { wrapperContained.setCanWalkOverFences(canWalkOverFences); }
// public boolean canWalkOverFences() { return wrapperContained.canWalkOverFences(); }
public boolean isFireDamaging(yarnwrap.block.BlockState state) { return wrapperContained.isFireDamaging(state.wrapperContained); }
// public yarnwrap.entity.ai.pathing.TargetPathNode createNode(double x,double y,double z) { return new yarnwrap.entity.ai.pathing.TargetPathNode(wrapperContained.createNode(x,y,z)); }
public yarnwrap.entity.ai.pathing.PathNodeType getDefaultNodeType(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getDefaultNodeType(entity.wrapperContained,pos.wrapperContained)); }

}