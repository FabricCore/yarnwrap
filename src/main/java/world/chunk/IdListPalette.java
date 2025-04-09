package yarnwrap.world.chunk;
public class IdListPalette { public net.minecraft.world.chunk.IdListPalette wrapperContained; public IdListPalette(net.minecraft.world.chunk.IdListPalette wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IndexedIterable idList() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.idList); }
// public yarnwrap.world.chunk.Palette create(int bits,yarnwrap.util.collection.IndexedIterable idList,yarnwrap.world.chunk.PaletteResizeListener listener) { return new yarnwrap.world.chunk.Palette(wrapperContained.create(bits,idList.wrapperContained,listener.wrapperContained)); }

}