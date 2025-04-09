package yarnwrap.util.collection;
public class IndexedIterable { public net.minecraft.util.collection.IndexedIterable wrapperContained; public IndexedIterable(net.minecraft.util.collection.IndexedIterable wrapperContained) { this.wrapperContained = wrapperContained; }

public int ABSENT_RAW_ID() { return wrapperContained.ABSENT_RAW_ID; }
public java.lang.Object get(int index) { return wrapperContained.get(index); }
public int size() { return wrapperContained.size(); }
public int getRawId(java.lang.Object value) { return wrapperContained.getRawId(value); }
public java.lang.Object getOrThrow(int index) { return wrapperContained.getOrThrow(index); }
public int getRawIdOrThrow(java.lang.Object value) { return wrapperContained.getRawIdOrThrow(value); }

}