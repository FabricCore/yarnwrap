package yarnwrap.world.chunk;
public class IdListPalette { public net.minecraft.world.chunk.IdListPalette wrapperContained; public IdListPalette(net.minecraft.world.chunk.IdListPalette wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IndexedIterable idList() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.idList); }
// public void idList(yarnwrap.util.collection.IndexedIterable value) { wrapperContained.idList = value.wrapperContained; }
// public static yarnwrap.util.collection.IndexedIterable idList() { return new yarnwrap.util.collection.IndexedIterable(net.minecraft.world.chunk.IdListPalette.idList); }
// public static void idList(yarnwrap.util.collection.IndexedIterable value, ) { net.minecraft.world.chunk.IdListPalette.idList = value.wrapperContained; }

public IdListPalette(yarnwrap.util.collection.IndexedIterable idList) { this.wrapperContained = new net.minecraft.world.chunk.IdListPalette(idList.wrapperContained); }
// public yarnwrap.world.chunk.Palette create(int bits,yarnwrap.util.collection.IndexedIterable idList,yarnwrap.world.chunk.PaletteResizeListener listener) { return new yarnwrap.world.chunk.Palette(wrapperContained.create(bits,idList.wrapperContained,listener.wrapperContained)); }
// public static yarnwrap.world.chunk.Palette create(int bits,yarnwrap.util.collection.IndexedIterable idList,yarnwrap.world.chunk.PaletteResizeListener listener, ) { return new yarnwrap.world.chunk.Palette(net.minecraft.world.chunk.IdListPalette.create(bits,idList.wrapperContained,listener.wrapperContained)); }

}