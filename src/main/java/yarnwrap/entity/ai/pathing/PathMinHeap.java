package yarnwrap.entity.ai.pathing;
public class PathMinHeap { public net.minecraft.entity.ai.pathing.PathMinHeap wrapperContained; public PathMinHeap(net.minecraft.entity.ai.pathing.PathMinHeap wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.entity.ai.pathing.PathNode[] pathNodes() { return wrapperContained.pathNodes; }
// public void pathNodes(net.minecraft.entity.ai.pathing.PathNode[] value) { wrapperContained.pathNodes = value; }
// public static net.minecraft.entity.ai.pathing.PathNode[] pathNodes() { return net.minecraft.entity.ai.pathing.PathMinHeap.pathNodes; }
// public static void pathNodes(net.minecraft.entity.ai.pathing.PathNode[] value, ) { net.minecraft.entity.ai.pathing.PathMinHeap.pathNodes = value; }

// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public static int count() { return net.minecraft.entity.ai.pathing.PathMinHeap.count; }
// public static void count(int value, ) { net.minecraft.entity.ai.pathing.PathMinHeap.count = value; }

public yarnwrap.entity.ai.pathing.PathNode push(yarnwrap.entity.ai.pathing.PathNode node) { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.push(node.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.PathNode push(yarnwrap.entity.ai.pathing.PathNode node, ) { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.PathMinHeap.push(node.wrapperContained)); }
public void setNodeWeight(yarnwrap.entity.ai.pathing.PathNode node,float weight) { wrapperContained.setNodeWeight(node.wrapperContained,weight); }
// public static void setNodeWeight(yarnwrap.entity.ai.pathing.PathNode node,float weight, ) { net.minecraft.entity.ai.pathing.PathMinHeap.setNodeWeight(node.wrapperContained,weight); }
// public void shiftUp(int index) { wrapperContained.shiftUp(index); }
// public static void shiftUp(int index, ) { net.minecraft.entity.ai.pathing.PathMinHeap.shiftUp(index); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.entity.ai.pathing.PathMinHeap.clear(); }
public yarnwrap.entity.ai.pathing.PathNode pop() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.pop()); }
// public static yarnwrap.entity.ai.pathing.PathNode pop() { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.PathMinHeap.pop()); }
// public void shiftDown(int index) { wrapperContained.shiftDown(index); }
// public static void shiftDown(int index, ) { net.minecraft.entity.ai.pathing.PathMinHeap.shiftDown(index); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.entity.ai.pathing.PathMinHeap.isEmpty(); }
public yarnwrap.entity.ai.pathing.PathNode getStart() { return new yarnwrap.entity.ai.pathing.PathNode(wrapperContained.getStart()); }
// public static yarnwrap.entity.ai.pathing.PathNode getStart() { return new yarnwrap.entity.ai.pathing.PathNode(net.minecraft.entity.ai.pathing.PathMinHeap.getStart()); }
public void popNode(yarnwrap.entity.ai.pathing.PathNode node) { wrapperContained.popNode(node.wrapperContained); }
// public static void popNode(yarnwrap.entity.ai.pathing.PathNode node, ) { net.minecraft.entity.ai.pathing.PathMinHeap.popNode(node.wrapperContained); }
public int getCount() { return wrapperContained.getCount(); }
// public static int getCount() { return net.minecraft.entity.ai.pathing.PathMinHeap.getCount(); }
public net.minecraft.entity.ai.pathing.PathNode[] getNodes() { return wrapperContained.getNodes(); }
// public static net.minecraft.entity.ai.pathing.PathNode[] getNodes() { return net.minecraft.entity.ai.pathing.PathMinHeap.getNodes(); }

}