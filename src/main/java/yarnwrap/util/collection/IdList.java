package yarnwrap.util.collection;
public class IdList { public net.minecraft.util.collection.IdList wrapperContained; public IdList(net.minecraft.util.collection.IdList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List list() { return wrapperContained.list; }
// public void list(java.util.List value) { wrapperContained.list = value; }
// public static java.util.List list() { return net.minecraft.util.collection.IdList.list; }
// public static void list(java.util.List value, ) { net.minecraft.util.collection.IdList.list = value; }

// public int nextId() { return wrapperContained.nextId; }
// public void nextId(int value) { wrapperContained.nextId = value; }
// public static int nextId() { return net.minecraft.util.collection.IdList.nextId; }
// public static void nextId(int value, ) { net.minecraft.util.collection.IdList.nextId = value; }

// public it.unimi.dsi.fastutil.objects.Reference2IntMap idMap() { return wrapperContained.idMap; }
// public void idMap(it.unimi.dsi.fastutil.objects.Reference2IntMap value) { wrapperContained.idMap = value; }
// public static it.unimi.dsi.fastutil.objects.Reference2IntMap idMap() { return net.minecraft.util.collection.IdList.idMap; }
// public static void idMap(it.unimi.dsi.fastutil.objects.Reference2IntMap value, ) { net.minecraft.util.collection.IdList.idMap = value; }

public IdList(int initialSize) { this.wrapperContained = new net.minecraft.util.collection.IdList(initialSize); }
public void set(java.lang.Object value,int id) { wrapperContained.set(value,id); }
// public static void set(java.lang.Object value,int id, ) { net.minecraft.util.collection.IdList.set(value,id); }
public void add(java.lang.Object value) { wrapperContained.add(value); }
// public static void add(java.lang.Object value, ) { net.minecraft.util.collection.IdList.add(value); }
public boolean containsKey(int index) { return wrapperContained.containsKey(index); }
// public static boolean containsKey(int index, ) { return net.minecraft.util.collection.IdList.containsKey(index); }

}