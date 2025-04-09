package yarnwrap.entity.ai.pathing;
public class BirdPathNodeMaker { public net.minecraft.entity.ai.pathing.BirdPathNodeMaker wrapperContained; public BirdPathNodeMaker(net.minecraft.entity.ai.pathing.BirdPathNodeMaker wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap pathNodes() { return wrapperContained.pathNodes; }
// public boolean isPassable(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.isPassable(node.wrapperContained); }
// public boolean unvisited(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.unvisited(node.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNode getPassableNode(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getPassableNode(x,y,z)); }
// public java.lang.Iterable getPotentialEscapePositions(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.getPotentialEscapePositions(entity.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNodeType getNodeType(int pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.getNodeType(pos)); }

}