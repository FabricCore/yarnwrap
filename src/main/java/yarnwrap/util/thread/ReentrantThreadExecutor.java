package yarnwrap.util.thread;
public class ReentrantThreadExecutor { public net.minecraft.util.thread.ReentrantThreadExecutor wrapperContained; public ReentrantThreadExecutor(net.minecraft.util.thread.ReentrantThreadExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int runningTasks() { return wrapperContained.runningTasks; }
// public void runningTasks(int value) { wrapperContained.runningTasks = value; }
// public boolean hasRunningTasks() { return wrapperContained.hasRunningTasks(); }

}