package yarnwrap.entity.ai.pathing;
public class TargetPathNode { public net.minecraft.entity.ai.pathing.TargetPathNode wrapperContained; public TargetPathNode(net.minecraft.entity.ai.pathing.TargetPathNode wrapperContained) { this.wrapperContained = wrapperContained; }

// public float nearestNodeDistance() { return wrapperContained.nearestNodeDistance; }
// public void nearestNodeDistance(float value) { wrapperContained.nearestNodeDistance = value; }
// public static float nearestNodeDistance() { return net.minecraft.entity.ai.pathing.TargetPathNode.nearestNodeDistance; }
// public static void nearestNodeDistance(float value, ) { net.minecraft.entity.ai.pathing.TargetPathNode.nearestNodeDistance = value; }

// public yarnwrap.entity.ai.pathing.PathNode nearestNode() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.nearestNode); }
// public void nearestNode(yarnwrap.entity.ai.pathing.PathNode value) { wrapperContained.nearestNode = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.PathNode nearestNode() { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.TargetPathNode.nearestNode); }
// public static void nearestNode(yarnwrap.entity.ai.pathing.PathNode value, ) { net.minecraft.entity.ai.pathing.TargetPathNode.nearestNode = value.wrapperContained; }

// public boolean reached() { return wrapperContained.reached; }
// public void reached(boolean value) { wrapperContained.reached = value; }
// public static boolean reached() { return net.minecraft.entity.ai.pathing.TargetPathNode.reached; }
// public static void reached(boolean value, ) { net.minecraft.entity.ai.pathing.TargetPathNode.reached = value; }

public TargetPathNode(yarnwrap.entity.ai.pathing.PathNode node) { this.wrapperContained = new net.minecraft.entity.ai.pathing.TargetPathNode(node.wrapperContained); }
public void updateNearestNode(float distance,yarnwrap.entity.ai.pathing.PathNode node) { wrapperContained.updateNearestNode(distance,node.wrapperContained); }
// public static void updateNearestNode(float distance,yarnwrap.entity.ai.pathing.PathNode node, ) { net.minecraft.entity.ai.pathing.TargetPathNode.updateNearestNode(distance,node.wrapperContained); }
// public yarnwrap.entity.ai.pathing.TargetPathNode fromBuffer(yarnwrap.network.PacketByteBuf buffer) { return new yarnwrap.entity.ai.pathing.TargetPathNode(wrapperContained.fromBuffer(buffer.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.TargetPathNode fromBuffer(yarnwrap.network.PacketByteBuf buffer, ) { return new yarnwrap.entity.ai.pathing.TargetPathNode(net.minecraft.entity.ai.pathing.TargetPathNode.fromBuffer(buffer.wrapperContained)); }
public yarnwrap.entity.ai.pathing.PathNode getNearestNode() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNearestNode()); }
// public static yarnwrap.entity.ai.pathing.PathNode getNearestNode() { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.TargetPathNode.getNearestNode()); }
public void markReached() { wrapperContained.markReached(); }
// public static void markReached() { net.minecraft.entity.ai.pathing.TargetPathNode.markReached(); }
public boolean isReached() { return wrapperContained.isReached(); }
// public static boolean isReached() { return net.minecraft.entity.ai.pathing.TargetPathNode.isReached(); }

}