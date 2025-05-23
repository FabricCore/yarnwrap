package yarnwrap.entity.ai.pathing;
public class Path { public net.minecraft.entity.ai.pathing.Path wrapperContained; public Path(net.minecraft.entity.ai.pathing.Path wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List nodes() { return wrapperContained.nodes; }
// public void nodes(java.util.List value) { wrapperContained.nodes = value; }
// public static java.util.List nodes() { return net.minecraft.entity.ai.pathing.Path.nodes; }
// public static void nodes(java.util.List value, ) { net.minecraft.entity.ai.pathing.Path.nodes = value; }

// public int currentNodeIndex() { return wrapperContained.currentNodeIndex; }
// public void currentNodeIndex(int value) { wrapperContained.currentNodeIndex = value; }
// public static int currentNodeIndex() { return net.minecraft.entity.ai.pathing.Path.currentNodeIndex; }
// public static void currentNodeIndex(int value, ) { net.minecraft.entity.ai.pathing.Path.currentNodeIndex = value; }

// public yarnwrap.util.math.BlockPos target() { return new yarnwrap.util.math.BlockPos(wrapperContained.target); }
// public void target(yarnwrap.util.math.BlockPos value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos target() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.pathing.Path.target); }
// public static void target(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.ai.pathing.Path.target = value.wrapperContained; }

// public float manhattanDistanceFromTarget() { return wrapperContained.manhattanDistanceFromTarget; }
// public void manhattanDistanceFromTarget(float value) { wrapperContained.manhattanDistanceFromTarget = value; }
// public static float manhattanDistanceFromTarget() { return net.minecraft.entity.ai.pathing.Path.manhattanDistanceFromTarget; }
// public static void manhattanDistanceFromTarget(float value, ) { net.minecraft.entity.ai.pathing.Path.manhattanDistanceFromTarget = value; }

// public boolean reachesTarget() { return wrapperContained.reachesTarget; }
// public void reachesTarget(boolean value) { wrapperContained.reachesTarget = value; }
// public static boolean reachesTarget() { return net.minecraft.entity.ai.pathing.Path.reachesTarget; }
// public static void reachesTarget(boolean value, ) { net.minecraft.entity.ai.pathing.Path.reachesTarget = value; }

// public Object debugNodeInfos() { return wrapperContained.debugNodeInfos; }
// // public void debugNodeInfos(Object value) { wrapperContained.debugNodeInfos = value; }
// // public static Object debugNodeInfos() { return net.minecraft.entity.ai.pathing.Path.debugNodeInfos; }
// // public static void debugNodeInfos(Object value, ) { net.minecraft.entity.ai.pathing.Path.debugNodeInfos = value; }

public Path(java.util.List nodes,yarnwrap.util.math.BlockPos target,boolean reachesTarget) { this.wrapperContained = new net.minecraft.entity.ai.pathing.Path(nodes,target.wrapperContained,reachesTarget); }
public void setNode(int index,yarnwrap.entity.ai.pathing.PathNode node) { wrapperContained.setNode(index,node.wrapperContained); }
// public static void setNode(int index,yarnwrap.entity.ai.pathing.PathNode node, ) { net.minecraft.entity.ai.pathing.Path.setNode(index,node.wrapperContained); }
// public yarnwrap.entity.ai.pathing.Path fromBuf(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.fromBuf(buf.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.Path fromBuf(yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.entity.ai.pathing.Path(net.minecraft.entity.ai.pathing.Path.fromBuf(buf.wrapperContained)); }
public void setLength(int length) { wrapperContained.setLength(length); }
// public static void setLength(int length, ) { net.minecraft.entity.ai.pathing.Path.setLength(length); }
public int getLength() { return wrapperContained.getLength(); }
// public static int getLength() { return net.minecraft.entity.ai.pathing.Path.getLength(); }
public int getCurrentNodeIndex() { return wrapperContained.getCurrentNodeIndex(); }
// public static int getCurrentNodeIndex() { return net.minecraft.entity.ai.pathing.Path.getCurrentNodeIndex(); }
public yarnwrap.entity.ai.pathing.PathNode getNode(int index) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNode(index)); }
// public static yarnwrap.entity.ai.pathing.PathNode getNode(int index, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.Path.getNode(index)); }
public boolean equalsPath(yarnwrap.entity.ai.pathing.Path o) { return wrapperContained.equalsPath(o.wrapperContained); }
// public static boolean equalsPath(yarnwrap.entity.ai.pathing.Path o, ) { return net.minecraft.entity.ai.pathing.Path.equalsPath(o.wrapperContained); }
public void setCurrentNodeIndex(int nodeIndex) { wrapperContained.setCurrentNodeIndex(nodeIndex); }
// public static void setCurrentNodeIndex(int nodeIndex, ) { net.minecraft.entity.ai.pathing.Path.setCurrentNodeIndex(nodeIndex); }
public void next() { wrapperContained.next(); }
// public static void next() { net.minecraft.entity.ai.pathing.Path.next(); }
public yarnwrap.entity.ai.pathing.PathNode getEnd() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getEnd()); }
// public static yarnwrap.entity.ai.pathing.PathNode getEnd() { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.Path.getEnd()); }
public boolean isFinished() { return wrapperContained.isFinished(); }
// public static boolean isFinished() { return net.minecraft.entity.ai.pathing.Path.isFinished(); }
public yarnwrap.util.math.Vec3d getNodePosition(yarnwrap.entity.Entity entity,int index) { return new yarnwrap.util.math.Vec3d(wrapperContained.getNodePosition(entity.wrapperContained,index)); }
// public static yarnwrap.util.math.Vec3d getNodePosition(yarnwrap.entity.Entity entity,int index, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.pathing.Path.getNodePosition(entity.wrapperContained,index)); }
public yarnwrap.util.math.BlockPos getTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getTarget()); }
// public static yarnwrap.util.math.BlockPos getTarget() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.pathing.Path.getTarget()); }
public yarnwrap.util.math.Vec3d getNodePosition(yarnwrap.entity.Entity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.getNodePosition(entity.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getNodePosition(yarnwrap.entity.Entity entity, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.pathing.Path.getNodePosition(entity.wrapperContained)); }
// public boolean reachesTarget() { return wrapperContained.reachesTarget(); }
// // public static boolean reachesTarget() { return net.minecraft.entity.ai.pathing.Path.reachesTarget(); }
public float getManhattanDistanceFromTarget() { return wrapperContained.getManhattanDistanceFromTarget(); }
// public static float getManhattanDistanceFromTarget() { return net.minecraft.entity.ai.pathing.Path.getManhattanDistanceFromTarget(); }
public yarnwrap.entity.ai.pathing.PathNode getCurrentNode() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getCurrentNode()); }
// public static yarnwrap.entity.ai.pathing.PathNode getCurrentNode() { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.Path.getCurrentNode()); }
public boolean isStart() { return wrapperContained.isStart(); }
// public static boolean isStart() { return net.minecraft.entity.ai.pathing.Path.isStart(); }
public yarnwrap.entity.ai.pathing.PathNode getLastNode() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getLastNode()); }
// public static yarnwrap.entity.ai.pathing.PathNode getLastNode() { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.Path.getLastNode()); }
public yarnwrap.util.math.BlockPos getNodePos(int index) { return new yarnwrap.util.math.BlockPos(wrapperContained.getNodePos(index)); }
// public static yarnwrap.util.math.BlockPos getNodePos(int index, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.pathing.Path.getNodePos(index)); }
public yarnwrap.util.math.BlockPos getCurrentNodePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getCurrentNodePos()); }
// public static yarnwrap.util.math.BlockPos getCurrentNodePos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.pathing.Path.getCurrentNodePos()); }
public void toBuf(yarnwrap.network.PacketByteBuf buf) { wrapperContained.toBuf(buf.wrapperContained); }
// public static void toBuf(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.entity.ai.pathing.Path.toBuf(buf.wrapperContained); }
// public void method_35499(yarnwrap.network.PacketByteBuf buf,yarnwrap.entity.ai.pathing.PathNode node) { wrapperContained.method_35499(buf.wrapperContained,node.wrapperContained); }
// public static void method_35499(yarnwrap.network.PacketByteBuf buf,yarnwrap.entity.ai.pathing.PathNode node, ) { net.minecraft.entity.ai.pathing.Path.method_35499(buf.wrapperContained,node.wrapperContained); }
// public void setDebugInfo(net.minecraft.entity.ai.pathing.PathNode[] debugNodes,net.minecraft.entity.ai.pathing.PathNode[] debugSecondNodes,java.util.Set debugTargetNodes) { wrapperContained.setDebugInfo(debugNodes,debugSecondNodes,debugTargetNodes); }
// public static void setDebugInfo(net.minecraft.entity.ai.pathing.PathNode[] debugNodes,net.minecraft.entity.ai.pathing.PathNode[] debugSecondNodes,java.util.Set debugTargetNodes, ) { net.minecraft.entity.ai.pathing.Path.setDebugInfo(debugNodes,debugSecondNodes,debugTargetNodes); }
// public void write(yarnwrap.network.PacketByteBuf buf,net.minecraft.entity.ai.pathing.PathNode[] nodes) { wrapperContained.write(buf.wrapperContained,nodes); }
// public static void write(yarnwrap.network.PacketByteBuf buf,net.minecraft.entity.ai.pathing.PathNode[] nodes, ) { net.minecraft.entity.ai.pathing.Path.write(buf.wrapperContained,nodes); }
// public net.minecraft.entity.ai.pathing.PathNode[] nodesFromBuf(yarnwrap.network.PacketByteBuf buf) { return wrapperContained.nodesFromBuf(buf.wrapperContained); }
// public static net.minecraft.entity.ai.pathing.PathNode[] nodesFromBuf(yarnwrap.network.PacketByteBuf buf, ) { return net.minecraft.entity.ai.pathing.Path.nodesFromBuf(buf.wrapperContained); }
public Object getDebugNodeInfos() { return wrapperContained.getDebugNodeInfos(); }
// public static Object getDebugNodeInfos() { return net.minecraft.entity.ai.pathing.Path.getDebugNodeInfos(); }
public yarnwrap.entity.ai.pathing.Path copy() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.copy()); }
// public static yarnwrap.entity.ai.pathing.Path copy() { return new yarnwrap.entity.ai.pathing.Path(net.minecraft.entity.ai.pathing.Path.copy()); }

}