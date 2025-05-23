package yarnwrap.util.thread;
public class TaskQueue { public net.minecraft.util.thread.TaskQueue wrapperContained; public TaskQueue(net.minecraft.util.thread.TaskQueue wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Runnable poll() { return wrapperContained.poll(); }
// public static java.lang.Runnable poll() { return net.minecraft.util.thread.TaskQueue.poll(); }
// public boolean add() { return wrapperContained.add(); }
// public static boolean add() { return net.minecraft.util.thread.TaskQueue.add(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.util.thread.TaskQueue.isEmpty(); }
public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.util.thread.TaskQueue.getSize(); }

}