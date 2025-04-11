package yarnwrap.util.collection;
public class ListDeque { public net.minecraft.util.collection.ListDeque wrapperContained; public ListDeque(net.minecraft.util.collection.ListDeque wrapperContained) { this.wrapperContained = wrapperContained; }

public void addFirst(java.lang.Object value) { wrapperContained.addFirst(value); }
public void addLast(java.lang.Object value) { wrapperContained.addLast(value); }

}