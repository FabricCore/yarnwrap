package yarnwrap.util.collection;
public class IdList { public net.minecraft.util.collection.IdList wrapperContained; public IdList(net.minecraft.util.collection.IdList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List list() { return wrapperContained.list; }
// public int nextId() { return wrapperContained.nextId; }
// public it.unimi.dsi.fastutil.objects.Reference2IntMap idMap() { return wrapperContained.idMap; }
public void set(java.lang.Object value,int id) { wrapperContained.set(value,id); }
public void add(java.lang.Object value) { wrapperContained.add(value); }
public boolean containsKey(int index) { return wrapperContained.containsKey(index); }

}