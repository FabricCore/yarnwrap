package yarnwrap.world.chunk;
public class BiMapPalette { public net.minecraft.world.chunk.BiMapPalette wrapperContained; public BiMapPalette(net.minecraft.world.chunk.BiMapPalette wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IndexedIterable idList() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.idList); }
// public int indexBits() { return wrapperContained.indexBits; }
// public yarnwrap.util.collection.Int2ObjectBiMap map() { return new yarnwrap.util.collection.Int2ObjectBiMap(wrapperContained.map); }
// public yarnwrap.world.chunk.PaletteResizeListener listener() { return new yarnwrap.world.chunk.PaletteResizeListener(wrapperContained.listener); }
// public yarnwrap.world.chunk.Palette create(int bits,yarnwrap.util.collection.IndexedIterable idList,yarnwrap.world.chunk.PaletteResizeListener listener,java.util.List entries) { return new yarnwrap.world.chunk.Palette(wrapperContained.create(bits,idList.wrapperContained,listener.wrapperContained,entries)); }
public java.util.List getElements() { return wrapperContained.getElements(); }

}