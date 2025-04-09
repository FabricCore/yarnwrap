package yarnwrap.util.collection;
public class EmptyPaletteStorage { public net.minecraft.util.collection.EmptyPaletteStorage wrapperContained; public EmptyPaletteStorage(net.minecraft.util.collection.EmptyPaletteStorage wrapperContained) { this.wrapperContained = wrapperContained; }

public long[] EMPTY_DATA() { return wrapperContained.EMPTY_DATA; }
// public int size() { return wrapperContained.size; }

}