package yarnwrap.entity.ai.pathing;
public class Path { public net.minecraft.entity.ai.pathing.Path wrapperContained; public Path(net.minecraft.entity.ai.pathing.Path wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos target() { return new yarnwrap.util.math.BlockPos(wrapperContained.target); }
// public void target(yarnwrap.util.math.BlockPos value) { wrapperContained.target = value.wrapperContained; }
// public float manhattanDistanceFromTarget() { return wrapperContained.manhattanDistanceFromTarget; }
// public void manhattanDistanceFromTarget(float value) { wrapperContained.manhattanDistanceFromTarget = value; }
// public boolean reachesTarget() { return wrapperContained.reachesTarget; }
// public void reachesTarget(boolean value) { wrapperContained.reachesTarget = value; }
// public Object debugNodeInfos() { return wrapperContained.debugNodeInfos; }
// // public void debugNodeInfos(Object value) { wrapperContained.debugNodeInfos = value; }
// public java.util.List nodes() { return wrapperContained.nodes; }
// public void nodes(java.util.List value) { wrapperContained.nodes = value; }
// public int currentNodeIndex() { return wrapperContained.currentNodeIndex; }
// public void currentNodeIndex(int value) { wrapperContained.currentNodeIndex = value; }
public Path(java.util.List nodes,yarnwrap.util.math.BlockPos target,boolean reachesTarget) { this.wrapperContained = new net.minecraft.entity.ai.pathing.Path(nodes,target.wrapperContained,reachesTarget); }
// public boolean reachesTarget() { return wrapperContained.reachesTarget(); }
public float getManhattanDistanceFromTarget() { return wrapperContained.getManhattanDistanceFromTarget(); }
public yarnwrap.entity.ai.pathing.PathNode getCurrentNode() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getCurrentNode()); }
public boolean isStart() { return wrapperContained.isStart(); }
public yarnwrap.entity.ai.pathing.PathNode getLastNode() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getLastNode()); }
public yarnwrap.util.math.BlockPos getNodePos(int index) { return new yarnwrap.util.math.BlockPos(wrapperContained.getNodePos(index)); }
public yarnwrap.util.math.BlockPos getCurrentNodePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getCurrentNodePos()); }
public void setNode(int index,yarnwrap.entity.ai.pathing.PathNode node) { wrapperContained.setNode(index,node.wrapperContained); }
public yarnwrap.entity.ai.pathing.Path fromBuf(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.fromBuf(buf.wrapperContained)); }
public void toBuf(yarnwrap.network.PacketByteBuf buf) { wrapperContained.toBuf(buf.wrapperContained); }
// public void method_35499(yarnwrap.network.PacketByteBuf buf,yarnwrap.entity.ai.pathing.PathNode node) { wrapperContained.method_35499(buf.wrapperContained,node.wrapperContained); }
// public void setDebugInfo(net.minecraft.entity.ai.pathing.PathNode[] debugNodes,net.minecraft.entity.ai.pathing.PathNode[] debugSecondNodes,java.util.Set debugTargetNodes) { wrapperContained.setDebugInfo(debugNodes,debugSecondNodes,debugTargetNodes); }
public void setLength(int length) { wrapperContained.setLength(length); }
public int getLength() { return wrapperContained.getLength(); }
public int getCurrentNodeIndex() { return wrapperContained.getCurrentNodeIndex(); }
public yarnwrap.entity.ai.pathing.PathNode getNode(int index) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getNode(index)); }
public boolean equalsPath(yarnwrap.entity.ai.pathing.Path o) { return wrapperContained.equalsPath(o.wrapperContained); }
public void setCurrentNodeIndex(int nodeIndex) { wrapperContained.setCurrentNodeIndex(nodeIndex); }
public void next() { wrapperContained.next(); }
public yarnwrap.entity.ai.pathing.PathNode getEnd() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getEnd()); }
public boolean isFinished() { return wrapperContained.isFinished(); }
public yarnwrap.util.math.Vec3d getNodePosition(yarnwrap.entity.Entity entity,int index) { return new yarnwrap.util.math.Vec3d(wrapperContained.getNodePosition(entity.wrapperContained,index)); }
public yarnwrap.util.math.BlockPos getTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getTarget()); }
public yarnwrap.util.math.Vec3d getNodePosition(yarnwrap.entity.Entity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.getNodePosition(entity.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf,net.minecraft.entity.ai.pathing.PathNode[] nodes) { wrapperContained.write(buf.wrapperContained,nodes); }
// public net.minecraft.entity.ai.pathing.PathNode[] nodesFromBuf(yarnwrap.network.PacketByteBuf buf) { return wrapperContained.nodesFromBuf(buf.wrapperContained); }
public Object getDebugNodeInfos() { return wrapperContained.getDebugNodeInfos(); }
public yarnwrap.entity.ai.pathing.Path copy() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.copy()); }

}