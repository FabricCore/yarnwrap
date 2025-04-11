package yarnwrap.util.collection;
public class PaletteStorage { public net.minecraft.util.collection.PaletteStorage wrapperContained; public PaletteStorage(net.minecraft.util.collection.PaletteStorage wrapperContained) { this.wrapperContained = wrapperContained; }

public void set(int index,int value) { wrapperContained.set(index,value); }
public int get(int index) { return wrapperContained.get(index); }
public long[] getData() { return wrapperContained.getData(); }
public int swap(int index,int value) { return wrapperContained.swap(index,value); }
public int getSize() { return wrapperContained.getSize(); }
public void forEach(java.util.function.IntConsumer action) { wrapperContained.forEach(action); }
public int getElementBits() { return wrapperContained.getElementBits(); }
// public void writePaletteIndices(int out) { wrapperContained.writePaletteIndices(out); }
public yarnwrap.util.collection.PaletteStorage copy() { return new yarnwrap.util.collection.PaletteStorage(wrapperContained.copy()); }

}