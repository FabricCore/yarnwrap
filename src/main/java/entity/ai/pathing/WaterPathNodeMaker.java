package yarnwrap.entity.ai.pathing;
public class WaterPathNodeMaker { public net.minecraft.entity.ai.pathing.WaterPathNodeMaker wrapperContained; public WaterPathNodeMaker(net.minecraft.entity.ai.pathing.WaterPathNodeMaker wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap nodePosToType() { return wrapperContained.nodePosToType; }
// public boolean canJumpOutOfWater() { return wrapperContained.canJumpOutOfWater; }
// public boolean hasNotVisited(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.hasNotVisited(node.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNodeType addPathNodePos(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.addPathNodePos(x,y,z)); }
// public yarnwrap.entity.ai.pathing.PathNode getPassableNode(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getPassableNode(x,y,z)); }
// public boolean hasPenalty(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.hasPenalty(node.wrapperContained); }

}