package yarnwrap.entity.ai.pathing;
public class PathNode { public net.minecraft.entity.ai.pathing.PathNode wrapperContained; public PathNode(net.minecraft.entity.ai.pathing.PathNode wrapperContained) { this.wrapperContained = wrapperContained; }

public float distanceToNearestTarget() { return wrapperContained.distanceToNearestTarget; }
public yarnwrap.entity.ai.pathing.PathNode previous() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.previous); }
public float penalizedPathLength() { return wrapperContained.penalizedPathLength; }
public int heapIndex() { return wrapperContained.heapIndex; }
public int z() { return wrapperContained.z; }
public int y() { return wrapperContained.y; }
public int x() { return wrapperContained.x; }
public yarnwrap.entity.ai.pathing.PathNodeType type() { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.type); }
public boolean visited() { return wrapperContained.visited; }
public float penalty() { return wrapperContained.penalty; }
// public int hashCode() { return wrapperContained.hashCode; }
public float pathLength() { return wrapperContained.pathLength; }
public float heapWeight() { return wrapperContained.heapWeight; }
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