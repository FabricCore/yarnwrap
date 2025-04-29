package yarnwrap.util.collection;
public class PaletteStorage { public net.minecraft.util.collection.PaletteStorage wrapperContained; public PaletteStorage(net.minecraft.util.collection.PaletteStorage wrapperContained) { this.wrapperContained = wrapperContained; }

public void set(int index,int value) { wrapperContained.set(index,value); }
// public static void set(int index,int value, ) { net.minecraft.util.collection.PaletteStorage.set(index,value); }
public int get(int index) { return wrapperContained.get(index); }
// public static int get(int index, ) { return net.minecraft.util.collection.PaletteStorage.get(index); }
public long[] getData() { return wrapperContained.getData(); }
// public static long[] getData() { return net.minecraft.util.collection.PaletteStorage.getData(); }
public int swap(int index,int value) { return wrapperContained.swap(index,value); }
// public static int swap(int index,int value, ) { return net.minecraft.util.collection.PaletteStorage.swap(index,value); }
public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.util.collection.PaletteStorage.getSize(); }
public void forEach(java.util.function.IntConsumer action) { wrapperContained.forEach(action); }
// public static void forEach(java.util.function.IntConsumer action, ) { net.minecraft.util.collection.PaletteStorage.forEach(action); }
public int getElementBits() { return wrapperContained.getElementBits(); }
// public static int getElementBits() { return net.minecraft.util.collection.PaletteStorage.getElementBits(); }
// public void writePaletteIndices(int out) { wrapperContained.writePaletteIndices(out); }
// public static void writePaletteIndices(int out, ) { net.minecraft.util.collection.PaletteStorage.writePaletteIndices(out); }
public yarnwrap.util.collection.PaletteStorage copy() { return new yarnwrap.util.collection.PaletteStorage(wrapperContained.copy()); }
// public static yarnwrap.util.collection.PaletteStorage copy() { return new yarnwrap.util.collection.PaletteStorage(net.minecraft.util.collection.PaletteStorage.copy()); }

}