package yarnwrap.entity.ai.pathing;
public class PathMinHeap { public net.minecraft.entity.ai.pathing.PathMinHeap wrapperContained; public PathMinHeap(net.minecraft.entity.ai.pathing.PathMinHeap wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.entity.ai.pathing.PathNode[] pathNodes() { return wrapperContained.pathNodes; }
// public void pathNodes(net.minecraft.entity.ai.pathing.PathNode[] value) { wrapperContained.pathNodes = value; }
// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
public yarnwrap.entity.ai.pathing.PathNode push(yarnwrap.entity.ai.pathing.PathNode node) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.push(node.wrapperContained)); }
public void setNodeWeight(yarnwrap.entity.ai.pathing.PathNode node,float weight) { wrapperContained.setNodeWeight(node.wrapperContained,weight); }
public yarnwrap.entity.ai.pathing.PathNode getStart() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getStart()); }
public void popNode(yarnwrap.entity.ai.pathing.PathNode node) { wrapperContained.popNode(node.wrapperContained); }
public int getCount() { return wrapperContained.getCount(); }
public net.minecraft.entity.ai.pathing.PathNode[] getNodes() { return wrapperContained.getNodes(); }
// public void shiftUp(int index) { wrapperContained.shiftUp(index); }
public void clear() { wrapperContained.clear(); }
public yarnwrap.entity.ai.pathing.PathNode pop() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.pop()); }
// public void shiftDown(int index) { wrapperContained.shiftDown(index); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }

}