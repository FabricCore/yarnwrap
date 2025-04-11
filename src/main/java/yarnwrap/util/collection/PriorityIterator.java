package yarnwrap.util.collection;
public class PriorityIterator { public net.minecraft.util.collection.PriorityIterator wrapperContained; public PriorityIterator(net.minecraft.util.collection.PriorityIterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LOWEST_PRIORITY() { return wrapperContained.LOWEST_PRIORITY; }
// public void LOWEST_PRIORITY(int value) { wrapperContained.LOWEST_PRIORITY = value; }
// public java.util.Deque maxPriorityQueue() { return wrapperContained.maxPriorityQueue; }
// public void maxPriorityQueue(java.util.Deque value) { wrapperContained.maxPriorityQueue = value; }
// public int maxPriority() { return wrapperContained.maxPriority; }
// public void maxPriority(int value) { wrapperContained.maxPriority = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap queuesByPriority() { return wrapperContained.queuesByPriority; }
// public void queuesByPriority(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.queuesByPriority = value; }
// public java.util.Deque method_54723(int p) { return wrapperContained.method_54723(p); }
public void enqueue(java.lang.Object value,int priority) { wrapperContained.enqueue(value,priority); }
// public void refreshMaxPriority() { wrapperContained.refreshMaxPriority(); }

}