package yarnwrap.util.collection;
public class PriorityIterator { public net.minecraft.util.collection.PriorityIterator wrapperContained; public PriorityIterator(net.minecraft.util.collection.PriorityIterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LOWEST_PRIORITY() { return wrapperContained.LOWEST_PRIORITY; }
// public java.util.Deque maxPriorityQueue() { return wrapperContained.maxPriorityQueue; }
// public int maxPriority() { return wrapperContained.maxPriority; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap queuesByPriority() { return wrapperContained.queuesByPriority; }
public void enqueue(java.lang.Object value,int priority) { wrapperContained.enqueue(value,priority); }
// public void refreshMaxPriority() { wrapperContained.refreshMaxPriority(); }

}