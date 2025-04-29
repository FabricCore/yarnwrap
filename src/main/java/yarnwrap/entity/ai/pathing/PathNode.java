package yarnwrap.entity.ai.pathing;
public class PathNode { public net.minecraft.entity.ai.pathing.PathNode wrapperContained; public PathNode(net.minecraft.entity.ai.pathing.PathNode wrapperContained) { this.wrapperContained = wrapperContained; }

public float distanceToNearestTarget() { return wrapperContained.distanceToNearestTarget; }
public void distanceToNearestTarget(float value) { wrapperContained.distanceToNearestTarget = value; }
// public static float distanceToNearestTarget() { return net.minecraft.entity.ai.pathing.PathNode.distanceToNearestTarget; }
// public static void distanceToNearestTarget(float value, ) { net.minecraft.entity.ai.pathing.PathNode.distanceToNearestTarget = value; }

public yarnwrap.entity.ai.pathing.PathNode previous() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.previous); }
public void previous(yarnwrap.entity.ai.pathing.PathNode value) { wrapperContained.previous = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.PathNode previous() { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.PathNode.previous); }
// public static void previous(yarnwrap.entity.ai.pathing.PathNode value, ) { net.minecraft.entity.ai.pathing.PathNode.previous = value.wrapperContained; }

public float penalizedPathLength() { return wrapperContained.penalizedPathLength; }
public void penalizedPathLength(float value) { wrapperContained.penalizedPathLength = value; }
// public static float penalizedPathLength() { return net.minecraft.entity.ai.pathing.PathNode.penalizedPathLength; }
// public static void penalizedPathLength(float value, ) { net.minecraft.entity.ai.pathing.PathNode.penalizedPathLength = value; }

public int heapIndex() { return wrapperContained.heapIndex; }
public void heapIndex(int value) { wrapperContained.heapIndex = value; }
// public static int heapIndex() { return net.minecraft.entity.ai.pathing.PathNode.heapIndex; }
// public static void heapIndex(int value, ) { net.minecraft.entity.ai.pathing.PathNode.heapIndex = value; }

public int z() { return wrapperContained.z; }
// public void z(int value) { wrapperContained.z = value; }
// public static int z() { return net.minecraft.entity.ai.pathing.PathNode.z; }
// public static void z(int value, ) { net.minecraft.entity.ai.pathing.PathNode.z = value; }

public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.entity.ai.pathing.PathNode.y; }
// public static void y(int value, ) { net.minecraft.entity.ai.pathing.PathNode.y = value; }

public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.entity.ai.pathing.PathNode.x; }
// public static void x(int value, ) { net.minecraft.entity.ai.pathing.PathNode.x = value; }

public yarnwrap.entity.ai.pathing.PathNodeType type() { return new yarnwrap.entity.ai.pathing.PathNodeType(wrapperContained.type); }
public void type(yarnwrap.entity.ai.pathing.PathNodeType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.PathNodeType type() { return new yarnwrap.entity.ai.pathing.PathNodeType(net.minecraft.entity.ai.pathing.PathNode.type); }
// public static void type(yarnwrap.entity.ai.pathing.PathNodeType value, ) { net.minecraft.entity.ai.pathing.PathNode.type = value.wrapperContained; }

public boolean visited() { return wrapperContained.visited; }
public void visited(boolean value) { wrapperContained.visited = value; }
// public static boolean visited() { return net.minecraft.entity.ai.pathing.PathNode.visited; }
// public static void visited(boolean value, ) { net.minecraft.entity.ai.pathing.PathNode.visited = value; }

public float penalty() { return wrapperContained.penalty; }
public void penalty(float value) { wrapperContained.penalty = value; }
// public static float penalty() { return net.minecraft.entity.ai.pathing.PathNode.penalty; }
// public static void penalty(float value, ) { net.minecraft.entity.ai.pathing.PathNode.penalty = value; }

// public int hashCode() { return wrapperContained.hashCode; }
// public void hashCode(int value) { wrapperContained.hashCode = value; }
// public static int hashCode() { return net.minecraft.entity.ai.pathing.PathNode.hashCode; }
// public static void hashCode(int value, ) { net.minecraft.entity.ai.pathing.PathNode.hashCode = value; }

public float pathLength() { return wrapperContained.pathLength; }
public void pathLength(float value) { wrapperContained.pathLength = value; }
// public static float pathLength() { return net.minecraft.entity.ai.pathing.PathNode.pathLength; }
// public static void pathLength(float value, ) { net.minecraft.entity.ai.pathing.PathNode.pathLength = value; }

public float heapWeight() { return wrapperContained.heapWeight; }
public void heapWeight(float value) { wrapperContained.heapWeight = value; }
// public static float heapWeight() { return net.minecraft.entity.ai.pathing.PathNode.heapWeight; }
// public static void heapWeight(float value, ) { net.minecraft.entity.ai.pathing.PathNode.heapWeight = value; }

public PathNode(int x,int y,int z) { this.wrapperContained = new net.minecraft.entity.ai.pathing.PathNode(x,y,z); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.entity.ai.pathing.PathNode.equals(o); }
public float getManhattanDistance(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getManhattanDistance(node.wrapperContained); }
// public static float getManhattanDistance(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.PathNode.getManhattanDistance(node.wrapperContained); }
public float getManhattanDistance(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getManhattanDistance(pos.wrapperContained); }
// public static float getManhattanDistance(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.pathing.PathNode.getManhattanDistance(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
// public static yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.pathing.PathNode.getBlockPos()); }
public yarnwrap.entity.ai.pathing.PathNode copyWithNewPosition(int x,int y,int z) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.copyWithNewPosition(x,y,z)); }
// public static yarnwrap.entity.ai.pathing.PathNode copyWithNewPosition(int x,int y,int z, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.PathNode.copyWithNewPosition(x,y,z)); }
public boolean isInHeap() { return wrapperContained.isInHeap(); }
// public static boolean isInHeap() { return net.minecraft.entity.ai.pathing.PathNode.isInHeap(); }
// public yarnwrap.entity.ai.pathing.PathNode fromBuf(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.fromBuf(buf.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNode fromBuf(yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.PathNode.fromBuf(buf.wrapperContained)); }
// public int hash(int x,int y,int z) { return wrapperContained.hash(x,y,z); }
// public static int hash(int x,int y,int z, ) { return net.minecraft.entity.ai.pathing.PathNode.hash(x,y,z); }
public float getDistance(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getDistance(node.wrapperContained); }
// public static float getDistance(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.PathNode.getDistance(node.wrapperContained); }
public float getSquaredDistance(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getSquaredDistance(node.wrapperContained); }
// public static float getSquaredDistance(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.PathNode.getSquaredDistance(node.wrapperContained); }
public float getDistance(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getDistance(pos.wrapperContained); }
// public static float getDistance(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.pathing.PathNode.getDistance(pos.wrapperContained); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.entity.ai.pathing.PathNode.write(buf.wrapperContained); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public static yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.pathing.PathNode.getPos()); }
public float getSquaredDistance(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getSquaredDistance(pos.wrapperContained); }
// public static float getSquaredDistance(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.pathing.PathNode.getSquaredDistance(pos.wrapperContained); }
public float getHorizontalDistance(yarnwrap.entity.ai.pathing.PathNode node) { return wrapperContained.getHorizontalDistance(node.wrapperContained); }
// public static float getHorizontalDistance(yarnwrap.entity.ai.pathing.PathNode node, ) { return net.minecraft.entity.ai.pathing.PathNode.getHorizontalDistance(node.wrapperContained); }
// public void readFromBuf(yarnwrap.network.PacketByteBuf buf,yarnwrap.entity.ai.pathing.PathNode target) { wrapperContained.readFromBuf(buf.wrapperContained,target.wrapperContained); }
// public static void readFromBuf(yarnwrap.network.PacketByteBuf buf,yarnwrap.entity.ai.pathing.PathNode target, ) { net.minecraft.entity.ai.pathing.PathNode.readFromBuf(buf.wrapperContained,target.wrapperContained); }

}