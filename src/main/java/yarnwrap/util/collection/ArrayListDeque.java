package yarnwrap.util.collection;
public class ArrayListDeque { public net.minecraft.util.collection.ArrayListDeque wrapperContained; public ArrayListDeque(net.minecraft.util.collection.ArrayListDeque wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MISSING() { return wrapperContained.MISSING; }
// public void MISSING(int value) { wrapperContained.MISSING = value; }
// public java.lang.Object[] array() { return wrapperContained.array; }
// public void array(java.lang.Object[] value) { wrapperContained.array = value; }
// public int startIndex() { return wrapperContained.startIndex; }
// public void startIndex(int value) { wrapperContained.startIndex = value; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
public int getArrayLength() { return wrapperContained.getArrayLength(); }
// public int wrap(int index) { return wrapperContained.wrap(index); }
// public void checkBounds(int start,int end) { wrapperContained.checkBounds(start,end); }
// public void copyTo(java.lang.Object[] array,int size) { wrapperContained.copyTo(array,size); }
// public void enlarge() { wrapperContained.enlarge(); }
// public void checkBounds(int index) { wrapperContained.checkBounds(index); }
// public java.lang.Object getRaw(int index) { return wrapperContained.getRaw(index); }

}