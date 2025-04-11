package yarnwrap.util.collection;
public class IdList { public net.minecraft.util.collection.IdList wrapperContained; public IdList(net.minecraft.util.collection.IdList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List list() { return wrapperContained.list; }
// public void list(java.util.List value) { wrapperContained.list = value; }
// public int nextId() { return wrapperContained.nextId; }
// public void nextId(int value) { wrapperContained.nextId = value; }
// public it.unimi.dsi.fastutil.objects.Reference2IntMap idMap() { return wrapperContained.idMap; }
// public void idMap(it.unimi.dsi.fastutil.objects.Reference2IntMap value) { wrapperContained.idMap = value; }
public void set(java.lang.Object value,int id) { wrapperContained.set(value,id); }
public void add(java.lang.Object value) { wrapperContained.add(value); }
public boolean containsKey(int index) { return wrapperContained.containsKey(index); }

}