package yarnwrap.entity.ai.pathing;
public class BirdPathNodeMaker { public net.minecraft.entity.ai.pathing.BirdPathNodeMaker wrapperContained; public BirdPathNodeMaker(net.minecraft.entity.ai.pathing.BirdPathNodeMaker wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap pathNodes() { return wrapperContained.pathNodes; }
// public void pathNodes(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.pathNodes = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap pathNodes() { return net.minecraft.entity.ai.pathing.BirdPathNodeMaker.pathNodes; }
// public static void pathNodes(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.entity.ai.pathing.BirdPathNodeMaker.pathNodes = value; }

// public boolean isPassable(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.isPassable(node.wrapperContained); }
// public static boolean isPassable(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.BirdPathNodeMaker.isPassable(node.wrapperContained); }
// public boolean unvisited(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.unvisited(node.wrapperContained); }
// public static boolean unvisited(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.BirdPathNodeMaker.unvisited(node.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNode getPassableNode(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getPassableNode(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNode getPassableNode(int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.BirdPathNodeMaker.getPassableNode(x,y,z)); }
// public java.lang.Iterable getPotentialEscapePositions(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.getPotentialEscapePositions(entity.wrapperContained); }
// public static java.lang.Iterable getPotentialEscapePositions(yarnwrap.entity.mob.MobEntity entity, ) { return net.minecraft.entity.ai.pathing.BirdPathNodeMaker.getPotentialEscapePositions(entity.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNodeType getNodeType(int pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getNodeType(pos)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType getNodeType(int pos, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.BirdPathNodeMaker.getNodeType(pos)); }

}