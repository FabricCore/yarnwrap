package yarnwrap.entity.ai.pathing;
public class TargetPathNode { public net.minecraft.entity.ai.pathing.TargetPathNode wrapperContained; public TargetPathNode(net.minecraft.entity.ai.pathing.TargetPathNode wrapperContained) { this.wrapperContained = wrapperContained; }

// public float nearestNodeDistance() { return wrapperContained.nearestNodeDistance; }
// public void nearestNodeDistance(float value) { wrapperContained.nearestNodeDistance = value; }
// public yarnwrap.entity.ai.pathing.PathNode nearestNode() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.nearestNode); }
// public void nearestNode(yarnwrap.entity.ai.pathing.PathNode value) { wrapperContained.nearestNode = value.wrapperContained; }
// public boolean reached() { return wrapperContained.reached; }
// public void reached(boolean value) { wrapperContained.reached = value; }
public void updateNearestNode(float distance,yarnwrap.entity.ai.pathing.PathNode node) { wrapperContained.updateNearestNode(distance,node.wrapperContained); }
public yarnwrap.entity.ai.pathing.TargetPathNode fromBuffer(yarnwrap.network.PacketByteBuf buffer) { return new yarnwrap.entity.ai.pathing.TargetPathNode(wrapperContained.fromBuffer(buffer.wrapperContained)); }
public yarnwrap.entity.ai.pathing.PathNode getNearestNode() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNearestNode()); }
public void markReached() { wrapperContained.markReached(); }
public boolean isReached() { return wrapperContained.isReached(); }

}