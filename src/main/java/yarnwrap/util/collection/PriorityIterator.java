package yarnwrap.util.collection;
public class PriorityIterator { public net.minecraft.util.collection.PriorityIterator wrapperContained; public PriorityIterator(net.minecraft.util.collection.PriorityIterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LOWEST_PRIORITY() { return wrapperContained.LOWEST_PRIORITY; }
// public void LOWEST_PRIORITY(int value) { wrapperContained.LOWEST_PRIORITY = value; }
// public static int LOWEST_PRIORITY() { return net.minecraft.util.collection.PriorityIterator.LOWEST_PRIORITY; }
// public static void LOWEST_PRIORITY(int value, ) { net.minecraft.util.collection.PriorityIterator.LOWEST_PRIORITY = value; }

// public java.util.Deque maxPriorityQueue() { return wrapperContained.maxPriorityQueue; }
// public void maxPriorityQueue(java.util.Deque value) { wrapperContained.maxPriorityQueue = value; }
// public static java.util.Deque maxPriorityQueue() { return net.minecraft.util.collection.PriorityIterator.maxPriorityQueue; }
// public static void maxPriorityQueue(java.util.Deque value, ) { net.minecraft.util.collection.PriorityIterator.maxPriorityQueue = value; }

// public int maxPriority() { return wrapperContained.maxPriority; }
// public void maxPriority(int value) { wrapperContained.maxPriority = value; }
// public static int maxPriority() { return net.minecraft.util.collection.PriorityIterator.maxPriority; }
// public static void maxPriority(int value, ) { net.minecraft.util.collection.PriorityIterator.maxPriority = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap queuesByPriority() { return wrapperContained.queuesByPriority; }
// public void queuesByPriority(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.queuesByPriority = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap queuesByPriority() { return net.minecraft.util.collection.PriorityIterator.queuesByPriority; }
// public static void queuesByPriority(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.util.collection.PriorityIterator.queuesByPriority = value; }

// public java.util.Deque method_54723(int p) { return wrapperContained.method_54723(p); }
// public static java.util.Deque method_54723(int p, ) { return net.minecraft.util.collection.PriorityIterator.method_54723(p); }
public void enqueue(java.lang.Object value,int priority) { wrapperContained.enqueue(value,priority); }
// public static void enqueue(java.lang.Object value,int priority, ) { net.minecraft.util.collection.PriorityIterator.enqueue(value,priority); }
// public void refreshMaxPriority() { wrapperContained.refreshMaxPriority(); }
// public static void refreshMaxPriority() { net.minecraft.util.collection.PriorityIterator.refreshMaxPriority(); }

}