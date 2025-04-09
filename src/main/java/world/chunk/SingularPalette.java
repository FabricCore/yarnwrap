package yarnwrap.world.chunk;
public class SingularPalette { public net.minecraft.world.chunk.SingularPalette wrapperContained; public SingularPalette(net.minecraft.world.chunk.SingularPalette wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IndexedIterable idList() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.idList); }
// public java.lang.Object entry() { return wrapperContained.entry; }
// public yarnwrap.world.chunk.PaletteResizeListener listener() { return new yarnwrap.world.chunk.PaletteResizeListener(wrapperContained.listener); }
// public yarnwrap.world.chunk.Palette create(int bitSize,yarnwrap.util.collection.IndexedIterable idList,yarnwrap.world.chunk.PaletteResizeListener listener,java.util.List entries) { return new yarnwrap.world.chunk.Palette(wrapperContained.create(bitSize,idList.wrapperContained,listener.wrapperContained,entries)); }

}