package yarnwrap.world.chunk;
public class SingularPalette { public net.minecraft.world.chunk.SingularPalette wrapperContained; public SingularPalette(net.minecraft.world.chunk.SingularPalette wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IndexedIterable idList() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.idList); }
// public void idList(yarnwrap.util.collection.IndexedIterable value) { wrapperContained.idList = value.wrapperContained; }
// public java.lang.Object entry() { return wrapperContained.entry; }
// public void entry(java.lang.Object value) { wrapperContained.entry = value; }
// public yarnwrap.world.chunk.PaletteResizeListener listener() { return new yarnwrap.world.chunk.PaletteResizeListener(wrapperContained.listener); }
// public void listener(yarnwrap.world.chunk.PaletteResizeListener value) { wrapperContained.listener = value.wrapperContained; }
// public yarnwrap.world.chunk.Palette create(int bitSize,yarnwrap.util.collection.IndexedIterable idList,yarnwrap.world.chunk.PaletteResizeListener listener,java.util.List entries) { return new yarnwrap.world.chunk.Palette(wrapperContained.create(bitSize,idList.wrapperContained,listener.wrapperContained,entries)); }

}