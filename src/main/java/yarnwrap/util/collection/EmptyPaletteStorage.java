package yarnwrap.util.collection;
public class EmptyPaletteStorage { public net.minecraft.util.collection.EmptyPaletteStorage wrapperContained; public EmptyPaletteStorage(net.minecraft.util.collection.EmptyPaletteStorage wrapperContained) { this.wrapperContained = wrapperContained; }

public long[] EMPTY_DATA() { return wrapperContained.EMPTY_DATA; }
// public void EMPTY_DATA(long[] value) { wrapperContained.EMPTY_DATA = value; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
public EmptyPaletteStorage(int size) { this.wrapperContained = new net.minecraft.util.collection.EmptyPaletteStorage(size); }

}