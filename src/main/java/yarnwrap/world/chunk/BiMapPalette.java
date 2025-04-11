package yarnwrap.world.chunk;
public class BiMapPalette { public net.minecraft.world.chunk.BiMapPalette wrapperContained; public BiMapPalette(net.minecraft.world.chunk.BiMapPalette wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IndexedIterable idList() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.idList); }
// public void idList(yarnwrap.util.collection.IndexedIterable value) { wrapperContained.idList = value.wrapperContained; }
// public int indexBits() { return wrapperContained.indexBits; }
// public void indexBits(int value) { wrapperContained.indexBits = value; }
// public yarnwrap.util.collection.Int2ObjectBiMap map() { return new yarnwrap.util.collection.Int2ObjectBiMap(wrapperContained.map); }
// public void map(yarnwrap.util.collection.Int2ObjectBiMap value) { wrapperContained.map = value.wrapperContained; }
// public yarnwrap.world.chunk.PaletteResizeListener listener() { return new yarnwrap.world.chunk.PaletteResizeListener(wrapperContained.listener); }
// public void listener(yarnwrap.world.chunk.PaletteResizeListener value) { wrapperContained.listener = value.wrapperContained; }
// public yarnwrap.world.chunk.Palette create(int bits,yarnwrap.util.collection.IndexedIterable idList,yarnwrap.world.chunk.PaletteResizeListener listener,java.util.List entries) { return new yarnwrap.world.chunk.Palette(wrapperContained.create(bits,idList.wrapperContained,listener.wrapperContained,entries)); }
public java.util.List getElements() { return wrapperContained.getElements(); }

}