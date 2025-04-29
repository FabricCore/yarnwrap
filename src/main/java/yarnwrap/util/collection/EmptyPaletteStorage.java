package yarnwrap.util.collection;
public class EmptyPaletteStorage { public net.minecraft.util.collection.EmptyPaletteStorage wrapperContained; public EmptyPaletteStorage(net.minecraft.util.collection.EmptyPaletteStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] EMPTY_DATA() { return wrapperContained.EMPTY_DATA; }
// public void EMPTY_DATA(long[] value) { wrapperContained.EMPTY_DATA = value; }
public static long[] EMPTY_DATA() { return net.minecraft.util.collection.EmptyPaletteStorage.EMPTY_DATA; }
// public static void EMPTY_DATA(long[] value, ) { net.minecraft.util.collection.EmptyPaletteStorage.EMPTY_DATA = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.util.collection.EmptyPaletteStorage.size; }
// public static void size(int value, ) { net.minecraft.util.collection.EmptyPaletteStorage.size = value; }

public EmptyPaletteStorage(int size) { this.wrapperContained = new net.minecraft.util.collection.EmptyPaletteStorage(size); }

}