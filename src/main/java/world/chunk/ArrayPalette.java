package yarnwrap.world.chunk;
public class ArrayPalette { public net.minecraft.world.chunk.ArrayPalette wrapperContained; public ArrayPalette(net.minecraft.world.chunk.ArrayPalette wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IndexedIterable idList() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.idList); }
// public int size() { return wrapperContained.size; }
// public int indexBits() { return wrapperContained.indexBits; }
// public java.lang.Object[] array() { return wrapperContained.array; }
// public yarnwrap.world.chunk.PaletteResizeListener listener() { return new yarnwrap.world.chunk.PaletteResizeListener(wrapperContained.listener); }
// public yarnwrap.world.chunk.Palette create(int bits,yarnwrap.util.collection.IndexedIterable idList,yarnwrap.world.chunk.PaletteResizeListener listener,java.util.List list) { return new yarnwrap.world.chunk.Palette(wrapperContained.create(bits,idList.wrapperContained,listener.wrapperContained,list)); }

}