package yarnwrap.entity.ai.pathing;
public class WaterPathNodeMaker { public net.minecraft.entity.ai.pathing.WaterPathNodeMaker wrapperContained; public WaterPathNodeMaker(net.minecraft.entity.ai.pathing.WaterPathNodeMaker wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap nodePosToType() { return wrapperContained.nodePosToType; }
// public void nodePosToType(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.nodePosToType = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap nodePosToType() { return net.minecraft.entity.ai.pathing.WaterPathNodeMaker.nodePosToType; }
// public static void nodePosToType(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.entity.ai.pathing.WaterPathNodeMaker.nodePosToType = value; }

// public boolean canJumpOutOfWater() { return wrapperContained.canJumpOutOfWater; }
// public void canJumpOutOfWater(boolean value) { wrapperContained.canJumpOutOfWater = value; }
// public static boolean canJumpOutOfWater() { return net.minecraft.entity.ai.pathing.WaterPathNodeMaker.canJumpOutOfWater; }
// public static void canJumpOutOfWater(boolean value, ) { net.minecraft.entity.ai.pathing.WaterPathNodeMaker.canJumpOutOfWater = value; }

public WaterPathNodeMaker(boolean canJumpOutOfWater) { this.wrapperContained = new net.minecraft.entity.ai.pathing.WaterPathNodeMaker(canJumpOutOfWater); }
// public yarnwrap.entity.ai.pathing.PathNodeType method_38486(int pos) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.method_38486(pos)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType method_38486(int pos, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.WaterPathNodeMaker.method_38486(pos)); }
// public boolean hasNotVisited(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.hasNotVisited(node.wrapperContained); }
// public static boolean hasNotVisited(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.WaterPathNodeMaker.hasNotVisited(node.wrapperContained); }
// public yarnwrap.entity.ai.pathing.PathNodeType addPathNodePos(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.addPathNodePos(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNodeType addPathNodePos(int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.WaterPathNodeMaker.addPathNodePos(x,y,z)); }
// public yarnwrap.entity.ai.pathing.PathNode getPassableNode(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getPassableNode(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNode getPassableNode(int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.WaterPathNodeMaker.getPassableNode(x,y,z)); }
// public boolean hasPenalty(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.hasPenalty(node.wrapperContained); }
// public static boolean hasPenalty(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.WaterPathNodeMaker.hasPenalty(node.wrapperContained); }

}