package yarnwrap.util.thread;
public class TaskQueue { public net.minecraft.util.thread.TaskQueue wrapperContained; public TaskQueue(net.minecraft.util.thread.TaskQueue wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object poll() { return wrapperContained.poll(); }
public boolean add(java.lang.Object message) { return wrapperContained.add(message); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public int getSize() { return wrapperContained.getSize(); }

}