package yarnwrap.entity.ai.brain.task;
public class WaitTask { public net.minecraft.entity.ai.brain.task.WaitTask wrapperContained; public WaitTask(net.minecraft.entity.ai.brain.task.WaitTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int minRunTime() { return wrapperContained.minRunTime; }
// public void minRunTime(int value) { wrapperContained.minRunTime = value; }
// public static int minRunTime() { return net.minecraft.entity.ai.brain.task.WaitTask.minRunTime; }
// public static void minRunTime(int value, ) { net.minecraft.entity.ai.brain.task.WaitTask.minRunTime = value; }

// public int maxRunTime() { return wrapperContained.maxRunTime; }
// public void maxRunTime(int value) { wrapperContained.maxRunTime = value; }
// public static int maxRunTime() { return net.minecraft.entity.ai.brain.task.WaitTask.maxRunTime; }
// public static void maxRunTime(int value, ) { net.minecraft.entity.ai.brain.task.WaitTask.maxRunTime = value; }

// public Object status() { return wrapperContained.status; }
// // public void status(Object value) { wrapperContained.status = value; }
// // public static Object status() { return net.minecraft.entity.ai.brain.task.WaitTask.status; }
// // public static void status(Object value, ) { net.minecraft.entity.ai.brain.task.WaitTask.status = value; }

// public long waitUntil() { return wrapperContained.waitUntil; }
// public void waitUntil(long value) { wrapperContained.waitUntil = value; }
// public static long waitUntil() { return net.minecraft.entity.ai.brain.task.WaitTask.waitUntil; }
// public static void waitUntil(long value, ) { net.minecraft.entity.ai.brain.task.WaitTask.waitUntil = value; }

public WaitTask(int minRunTime,int maxRunTime) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.WaitTask(minRunTime,maxRunTime); }

}