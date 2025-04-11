package yarnwrap.util.collection;
public class LinkedBlockPosHashSet { public net.minecraft.util.collection.LinkedBlockPosHashSet wrapperContained; public LinkedBlockPosHashSet(net.minecraft.util.collection.LinkedBlockPosHashSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object buffer() { return wrapperContained.buffer; }
// // public void buffer(Object value) { wrapperContained.buffer = value; }
public LinkedBlockPosHashSet(int expectedSize,float loadFactor) { this.wrapperContained = new net.minecraft.util.collection.LinkedBlockPosHashSet(expectedSize,loadFactor); }
public boolean add(long posLong) { return wrapperContained.add(posLong); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public boolean rem(long posLong) { return wrapperContained.rem(posLong); }
public long removeFirstLong() { return wrapperContained.removeFirstLong(); }
public int size() { return wrapperContained.size(); }

}