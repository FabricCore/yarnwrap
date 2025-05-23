package yarnwrap.client.render;
public class FrameGraphBuilder { public net.minecraft.client.render.FrameGraphBuilder wrapperContained; public FrameGraphBuilder(net.minecraft.client.render.FrameGraphBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List resourceNodes() { return wrapperContained.resourceNodes; }
// public void resourceNodes(java.util.List value) { wrapperContained.resourceNodes = value; }
// public static java.util.List resourceNodes() { return net.minecraft.client.render.FrameGraphBuilder.resourceNodes; }
// public static void resourceNodes(java.util.List value, ) { net.minecraft.client.render.FrameGraphBuilder.resourceNodes = value; }

// public java.util.List objectNodes() { return wrapperContained.objectNodes; }
// public void objectNodes(java.util.List value) { wrapperContained.objectNodes = value; }
// public static java.util.List objectNodes() { return net.minecraft.client.render.FrameGraphBuilder.objectNodes; }
// public static void objectNodes(java.util.List value, ) { net.minecraft.client.render.FrameGraphBuilder.objectNodes = value; }

// public java.util.List passes() { return wrapperContained.passes; }
// public void passes(java.util.List value) { wrapperContained.passes = value; }
// public static java.util.List passes() { return net.minecraft.client.render.FrameGraphBuilder.passes; }
// public static void passes(java.util.List value, ) { net.minecraft.client.render.FrameGraphBuilder.passes = value; }

// public java.util.BitSet collectPassesToVisit() { return wrapperContained.collectPassesToVisit(); }
// public static java.util.BitSet collectPassesToVisit() { return net.minecraft.client.render.FrameGraphBuilder.collectPassesToVisit(); }
// public java.lang.String method_61906(int id) { return wrapperContained.method_61906(id); }
// public static java.lang.String method_61906(int id, ) { return net.minecraft.client.render.FrameGraphBuilder.method_61906(id); }
// public void visit(Object node,java.util.BitSet unvisited,java.util.BitSet visiting,java.util.List topologicalOrderOut) { wrapperContained.visit(node,unvisited,visiting,topologicalOrderOut); }
// public static void visit(Object node,java.util.BitSet unvisited,java.util.BitSet visiting,java.util.List topologicalOrderOut, ) { net.minecraft.client.render.FrameGraphBuilder.visit(node,unvisited,visiting,topologicalOrderOut); }
// public void markForVisit(Object pass,java.util.BitSet result,java.util.Deque deque) { wrapperContained.markForVisit(pass,result,deque); }
// public static void markForVisit(Object pass,java.util.BitSet result,java.util.Deque deque, ) { net.minecraft.client.render.FrameGraphBuilder.markForVisit(pass,result,deque); }
public void run(yarnwrap.client.util.ObjectAllocator allocator) { wrapperContained.run(allocator.wrapperContained); }
// public static void run(yarnwrap.client.util.ObjectAllocator allocator, ) { net.minecraft.client.render.FrameGraphBuilder.run(allocator.wrapperContained); }
// // public void run(yarnwrap.client.util.ObjectAllocator allocator,Object profiler) { wrapperContained.run(allocator.wrapperContained,profiler); }
// public static void run(yarnwrap.client.util.ObjectAllocator allocator,Object profiler, ) { net.minecraft.client.render.FrameGraphBuilder.run(allocator.wrapperContained,profiler); }
public yarnwrap.client.render.FramePass createPass(java.lang.String name) { return new yarnwrap.client.render.FramePass(wrapperContained.createPass(name)); }
// public static yarnwrap.client.render.FramePass createPass(java.lang.String name, ) { return new yarnwrap.client.render.FramePass(net.minecraft.client.render.FrameGraphBuilder.createPass(name)); }
public yarnwrap.client.util.Handle createResourceHandle(java.lang.String name,yarnwrap.client.util.ClosableFactory factory) { return new yarnwrap.client.util.Handle(wrapperContained.createResourceHandle(name,factory.wrapperContained)); }
// public static yarnwrap.client.util.Handle createResourceHandle(java.lang.String name,yarnwrap.client.util.ClosableFactory factory, ) { return new yarnwrap.client.util.Handle(net.minecraft.client.render.FrameGraphBuilder.createResourceHandle(name,factory.wrapperContained)); }
// public Object createResourceNode(java.lang.String name,yarnwrap.client.util.ClosableFactory factory,Object stageNode) { return wrapperContained.createResourceNode(name,factory.wrapperContained,stageNode); }
// public static Object createResourceNode(java.lang.String name,yarnwrap.client.util.ClosableFactory factory,Object stageNode, ) { return net.minecraft.client.render.FrameGraphBuilder.createResourceNode(name,factory.wrapperContained,stageNode); }
public yarnwrap.client.util.Handle createObjectNode(java.lang.String name,java.lang.Object object) { return new yarnwrap.client.util.Handle(wrapperContained.createObjectNode(name,object)); }
// public static yarnwrap.client.util.Handle createObjectNode(java.lang.String name,java.lang.Object object, ) { return new yarnwrap.client.util.Handle(net.minecraft.client.render.FrameGraphBuilder.createObjectNode(name,object)); }
// public void checkResources(java.util.Collection passes) { wrapperContained.checkResources(passes); }
// public static void checkResources(java.util.Collection passes, ) { net.minecraft.client.render.FrameGraphBuilder.checkResources(passes); }

}