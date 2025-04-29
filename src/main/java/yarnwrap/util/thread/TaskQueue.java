package yarnwrap.util.thread;
public class TaskQueue { public net.minecraft.util.thread.TaskQueue wrapperContained; public TaskQueue(net.minecraft.util.thread.TaskQueue wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object poll() { return wrapperContained.poll(); }
// public static java.lang.Object poll() { return net.minecraft.util.thread.TaskQueue.poll(); }
public boolean add(java.lang.Object message) { return wrapperContained.add(message); }
// public static boolean add(java.lang.Object message, ) { return net.minecraft.util.thread.TaskQueue.add(message); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.util.thread.TaskQueue.isEmpty(); }
public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.util.thread.TaskQueue.getSize(); }

}