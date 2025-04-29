package yarnwrap.entity.ai.pathing;
public class PathNodeMaker { public net.minecraft.entity.ai.pathing.PathNodeMaker wrapperContained; public PathNodeMaker(net.minecraft.entity.ai.pathing.PathNodeMaker wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canSwim() { return wrapperContained.canSwim; }
// public void canSwim(boolean value) { wrapperContained.canSwim = value; }
// public static boolean canSwim() { return net.minecraft.entity.ai.pathing.PathNodeMaker.canSwim; }
// public static void canSwim(boolean value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.canSwim = value; }

// public boolean canOpenDoors() { return wrapperContained.canOpenDoors; }
// public void canOpenDoors(boolean value) { wrapperContained.canOpenDoors = value; }
// public static boolean canOpenDoors() { return net.minecraft.entity.ai.pathing.PathNodeMaker.canOpenDoors; }
// public static void canOpenDoors(boolean value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.canOpenDoors = value; }

// public int entityBlockZSize() { return wrapperContained.entityBlockZSize; }
// public void entityBlockZSize(int value) { wrapperContained.entityBlockZSize = value; }
// public static int entityBlockZSize() { return net.minecraft.entity.ai.pathing.PathNodeMaker.entityBlockZSize; }
// public static void entityBlockZSize(int value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.entityBlockZSize = value; }

// public boolean canEnterOpenDoors() { return wrapperContained.canEnterOpenDoors; }
// public void canEnterOpenDoors(boolean value) { wrapperContained.canEnterOpenDoors = value; }
// public static boolean canEnterOpenDoors() { return net.minecraft.entity.ai.pathing.PathNodeMaker.canEnterOpenDoors; }
// public static void canEnterOpenDoors(boolean value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.canEnterOpenDoors = value; }

// public int entityBlockYSize() { return wrapperContained.entityBlockYSize; }
// public void entityBlockYSize(int value) { wrapperContained.entityBlockYSize = value; }
// public static int entityBlockYSize() { return net.minecraft.entity.ai.pathing.PathNodeMaker.entityBlockYSize; }
// public static void entityBlockYSize(int value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.entityBlockYSize = value; }

// public int entityBlockXSize() { return wrapperContained.entityBlockXSize; }
// public void entityBlockXSize(int value) { wrapperContained.entityBlockXSize = value; }
// public static int entityBlockXSize() { return net.minecraft.entity.ai.pathing.PathNodeMaker.entityBlockXSize; }
// public static void entityBlockXSize(int value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.entityBlockXSize = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap pathNodeCache() { return wrapperContained.pathNodeCache; }
// public void pathNodeCache(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.pathNodeCache = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap pathNodeCache() { return net.minecraft.entity.ai.pathing.PathNodeMaker.pathNodeCache; }
// public static void pathNodeCache(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.pathNodeCache = value; }

// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.pathing.PathNodeMaker.entity); }
// public static void entity(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.entity = value.wrapperContained; }

// public boolean canWalkOverFences() { return wrapperContained.canWalkOverFences; }
// public void canWalkOverFences(boolean value) { wrapperContained.canWalkOverFences = value; }
// public static boolean canWalkOverFences() { return net.minecraft.entity.ai.pathing.PathNodeMaker.canWalkOverFences; }
// public static void canWalkOverFences(boolean value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.canWalkOverFences = value; }

// public yarnwrap.entity.ai.pathing.PathContext context() { return new yarnwrap.entity.ai.pathing.PathContext(wrapperContained.context); }
// public void context(yarnwrap.entity.ai.pathing.PathContext value) { wrapperContained.context = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.PathContext context() { return new yarnwrap.entity.ai.pathing.PathContext(net.minecraft.entity.ai.pathing.PathNodeMaker.context); }
// public static void context(yarnwrap.entity.ai.pathing.PathContext value, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.context = value.wrapperContained; }

public void init(yarnwrap.world.chunk.ChunkCache cachedWorld,yarnwrap.entity.mob.MobEntity entity) { wrapperContained.init(cachedWorld.wrapperContained,entity.wrapperContained); }
// public static void init(yarnwrap.world.chunk.ChunkCache cachedWorld,yarnwrap.entity.mob.MobEntity entity, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.init(cachedWorld.wrapperContained,entity.wrapperContained); }
public yarnwrap.entity.ai.pathing.PathNode getNode(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNode(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNode getNode(int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.PathNodeMaker.getNode(x,y,z)); }
public void setCanSwim(boolean canSwim) { wrapperContained.setCanSwim(canSwim); }
// public static void setCanSwim(boolean canSwim, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.setCanSwim(canSwim); }
public void setCanEnterOpenDoors(boolean canEnterOpenDoors) { wrapperContained.setCanEnterOpenDoors(canEnterOpenDoors); }
// public static void setCanEnterOpenDoors(boolean canEnterOpenDoors, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.setCanEnterOpenDoors(canEnterOpenDoors); }
public yarnwrap.entity.ai.pathing.TargetPathNode getNode(double x,double y,double z) { return new yarnwrap.entity.ai.pathing.TargetPathNode(wrapperContained.getNode(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.TargetPathNode getNode(double x,double y,double z, ) { return new yarnwrap.entity.ai.pathing.TargetPathNode(net.minecraft.entity.ai.pathing.PathNodeMaker.getNode(x,y,z)); }
public yarnwrap.entity.ai.pathing.PathNodeType getDefaultNodeType(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getDefaultNodeType(context.wrapperContained,x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getDefaultNodeType(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.PathNodeMaker.getDefaultNodeType(context.wrapperContained,x,y,z)); }
public int getSuccessors(net.minecraft.entity.ai.pathing.PathNode[] successors,yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getSuccessors(successors,node.wrapperContained); }
// public static int getSuccessors(net.minecraft.entity.ai.pathing.PathNode[] successors,yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.PathNodeMaker.getSuccessors(successors,node.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.entity.ai.pathing.PathNodeMaker.clear(); }
public void setCanOpenDoors(boolean canOpenDoors) { wrapperContained.setCanOpenDoors(canOpenDoors); }
// public static void setCanOpenDoors(boolean canOpenDoors, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.setCanOpenDoors(canOpenDoors); }
public yarnwrap.entity.ai.pathing.PathNode getStart() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getStart()); }
// public static yarnwrap.entity.ai.pathing.PathNode getStart() { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.PathNodeMaker.getStart()); }
// public boolean canSwim() { return wrapperContained.canSwim(); }
// // public static boolean canSwim() { return net.minecraft.entity.ai.pathing.PathNodeMaker.canSwim(); }
// public boolean canEnterOpenDoors() { return wrapperContained.canEnterOpenDoors(); }
// // public static boolean canEnterOpenDoors() { return net.minecraft.entity.ai.pathing.PathNodeMaker.canEnterOpenDoors(); }
// public boolean canOpenDoors() { return wrapperContained.canOpenDoors(); }
// // public static boolean canOpenDoors() { return net.minecraft.entity.ai.pathing.PathNodeMaker.canOpenDoors(); }
public yarnwrap.entity.ai.pathing.PathNodeType getNodeType(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z,yarnwrap.entity.mob.MobEntity mob) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getNodeType(context.wrapperContained,x,y,z,mob.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getNodeType(yarnwrap.entity.ai.pathing.PathContext context,int x,int y,int z,yarnwrap.entity.mob.MobEntity mob, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.PathNodeMaker.getNodeType(context.wrapperContained,x,y,z,mob.wrapperContained)); }
// public yarnwrap.entity.ai.pathing.PathNode getNode(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNode(pos.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNode getNode(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.PathNodeMaker.getNode(pos.wrapperContained)); }
public void setCanWalkOverFences(boolean canWalkOverFences) { wrapperContained.setCanWalkOverFences(canWalkOverFences); }
// public static void setCanWalkOverFences(boolean canWalkOverFences, ) { net.minecraft.entity.ai.pathing.PathNodeMaker.setCanWalkOverFences(canWalkOverFences); }
// public boolean canWalkOverFences() { return wrapperContained.canWalkOverFences(); }
// // public static boolean canWalkOverFences() { return net.minecraft.entity.ai.pathing.PathNodeMaker.canWalkOverFences(); }
// public boolean isFireDamaging(yarnwrap.block.BlockState state) { return wrapperContained.isFireDamaging(state.wrapperContained); }
// public static boolean isFireDamaging(yarnwrap.block.BlockState state, ) { return net.minecraft.entity.ai.pathing.PathNodeMaker.isFireDamaging(state.wrapperContained); }
// public yarnwrap.entity.ai.pathing.TargetPathNode createNode(double x,double y,double z) { return new yarnwrap.entity.ai.pathing.TargetPathNode(wrapperContained.createNode(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.TargetPathNode createNode(double x,double y,double z, ) { return new yarnwrap.entity.ai.pathing.TargetPathNode(net.minecraft.entity.ai.pathing.PathNodeMaker.createNode(x,y,z)); }
public yarnwrap.entity.ai.pathing.PathNodeType getDefaultNodeType(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getDefaultNodeType(entity.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getDefaultNodeType(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.PathNodeMaker.getDefaultNodeType(entity.wrapperContained,pos.wrapperContained)); }

}