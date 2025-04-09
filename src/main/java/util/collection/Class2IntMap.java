package yarnwrap.util.collection;
public class Class2IntMap { public net.minecraft.util.collection.Class2IntMap wrapperContained; public Class2IntMap(net.minecraft.util.collection.Class2IntMap wrapperContained) { this.wrapperContained = wrapperContained; }

public int MISSING() { return wrapperContained.MISSING; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap backingMap() { return wrapperContained.backingMap; }
public int get(java.lang.Class clazz) { return wrapperContained.get(clazz); }
public int getNext(java.lang.Class clazz) { return wrapperContained.getNext(clazz); }
public int put(java.lang.Class clazz) { return wrapperContained.put(clazz); }

}