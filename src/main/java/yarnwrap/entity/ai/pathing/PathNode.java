package yarnwrap.entity.ai.pathing;
public class PathNode { public net.minecraft.entity.ai.pathing.PathNode wrapperContained; public PathNode(net.minecraft.entity.ai.pathing.PathNode wrapperContained) { this.wrapperContained = wrapperContained; }

public float distanceToNearestTarget() { return wrapperContained.distanceToNearestTarget; }
public void distanceToNearestTarget(float value) { wrapperContained.distanceToNearestTarget = value; }
public yarnwrap.entity.ai.pathing.PathNode previous() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.previous); }
public void previous(yarnwrap.entity.ai.pathing.PathNode value) { wrapperContained.previous = value.wrapperContained; }
public float penalizedPathLength() { return wrapperContained.penalizedPathLength; }
public void penalizedPathLength(float value) { wrapperContained.penalizedPathLength = value; }
public int heapIndex() { return wrapperContained.heapIndex; }
public void heapIndex(int value) { wrapperContained.heapIndex = value; }
public int z() { return wrapperContained.z; }
// public void z(int value) { wrapperContained.z = value; }
public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
public yarnwrap.entity.ai.pathing.PathNodeType type() { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.type); }
public void type(yarnwrap.entity.ai.pathing.PathNodeType value) { wrapperContained.type = value.wrapperContained; }
public boolean visited() { return wrapperContained.visited; }
public void visited(boolean value) { wrapperContained.visited = value; }
public float penalty() { return wrapperContained.penalty; }
public void penalty(float value) { wrapperContained.penalty = value; }
// public int hashCode() { return wrapperContained.hashCode; }
// public void hashCode(int value) { wrapperContained.hashCode = value; }
public float pathLength() { return wrapperContained.pathLength; }
public void pathLength(float value) { wrapperContained.pathLength = value; }
public float heapWeight() { return wrapperContained.heapWeight; }
public void heapWeight(float value) { wrapperContained.heapWeight = value; }
public float getManhattanDistance(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getManhattanDistance(node.wrapperContained); }
public float getManhattanDistance(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getManhattanDistance(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
public yarnwrap.entity.ai.pathing.PathNode copyWithNewPosition(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.copyWithNewPosition(x,y,z)); }
public boolean isInHeap() { return wrapperContained.isInHeap(); }
public yarnwrap.entity.ai.pathing.PathNode fromBuf(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.fromBuf(buf.wrapperContained)); }
public int hash(int x,int y,int z) { return wrapperContained.hash(x,y,z); }
public float getDistance(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getDistance(node.wrapperContained); }
public float getSquaredDistance(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getSquaredDistance(node.wrapperContained); }
public float getDistance(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getDistance(pos.wrapperContained); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
public float getSquaredDistance(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getSquaredDistance(pos.wrapperContained); }
public float getHorizontalDistance(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getHorizontalDistance(node.wrapperContained); }
// public void readFromBuf(yarnwrap.network.PacketByteBuf buf,yarnwrap.entity.ai.pathing.PathNode target) { wrapperContained.readFromBuf(buf.wrapperContained,target.wrapperContained); }

}