package yarnwrap.entity.ai.pathing;
public class PathContext { public net.minecraft.entity.ai.pathing.PathContext wrapperContained; public PathContext(net.minecraft.entity.ai.pathing.PathContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.CollisionView world() { return new yarnwrap.world.CollisionView(wrapperContained.world); }
// public void world(yarnwrap.world.CollisionView value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.CollisionView world() { return new yarnwrap.world.CollisionView(net.minecraft.entity.ai.pathing.PathContext.world); }
// public static void world(yarnwrap.world.CollisionView value, ) { net.minecraft.entity.ai.pathing.PathContext.world = value.wrapperContained; }

// public yarnwrap.entity.ai.pathing.PathNodeTypeCache nodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(wrapperContained.nodeTypeCache); }
// public void nodeTypeCache(yarnwrap.entity.ai.pathing.PathNodeTypeCache value) { wrapperContained.nodeTypeCache = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.PathNodeTypeCache nodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(net.minecraft.entity.ai.pathing.PathContext.nodeTypeCache); }
// public static void nodeTypeCache(yarnwrap.entity.ai.pathing.PathNodeTypeCache value, ) { net.minecraft.entity.ai.pathing.PathContext.nodeTypeCache = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos entityPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.entityPos); }
// public void entityPos(yarnwrap.util.math.BlockPos value) { wrapperContained.entityPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos entityPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.pathing.PathContext.entityPos); }
// public static void entityPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.ai.pathing.PathContext.entityPos = value.wrapperContained; }

// public Object lastNodePos() { return wrapperContained.lastNodePos; }
// // public void lastNodePos(Object value) { wrapperContained.lastNodePos = value; }
// // public static Object lastNodePos() { return net.minecraft.entity.ai.pathing.PathContext.lastNodePos; }
// // public static void lastNodePos(Object value, ) { net.minecraft.entity.ai.pathing.PathContext.lastNodePos = value; }

public PathContext(yarnwrap.world.CollisionView world,yarnwrap.entity.mob.MobEntity entity) { this.wrapperContained = new net.minecraft.entity.ai.pathing.PathContext(world.wrapperContained,entity.wrapperContained); }
public yarnwrap.world.CollisionView getWorld() { return new yarnwrap.world.CollisionView(wrapperContained.getWorld()); }
// public static yarnwrap.world.CollisionView getWorld() { return new yarnwrap.world.CollisionView(net.minecraft.entity.ai.pathing.PathContext.getWorld()); }
public yarnwrap.entity.ai.pathing.PathNodeType getNodeType(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getNodeType(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getNodeType(int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.PathContext.getNodeType(x,y,z)); }
public yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(pos.wrapperContained)); }
// public static yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.entity.ai.pathing.PathContext.getBlockState(pos.wrapperContained)); }
public yarnwrap.util.math.BlockPos getEntityPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getEntityPos()); }
// public static yarnwrap.util.math.BlockPos getEntityPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.pathing.PathContext.getEntityPos()); }

}