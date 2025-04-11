package yarnwrap.world.chunk;
public class PalettedContainer { public net.minecraft.world.chunk.PalettedContainer wrapperContained; public PalettedContainer(net.minecraft.world.chunk.PalettedContainer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.PaletteResizeListener dummyListener() { return new yarnwrap.world.chunk.PaletteResizeListener(wrapperContained.dummyListener); }
// public void dummyListener(yarnwrap.world.chunk.PaletteResizeListener value) { wrapperContained.dummyListener = value.wrapperContained; }
// public yarnwrap.util.collection.IndexedIterable idList() { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.idList); }
// public void idList(yarnwrap.util.collection.IndexedIterable value) { wrapperContained.idList = value.wrapperContained; }
// public Object data() { return wrapperContained.data; }
// // public void data(Object value) { wrapperContained.data = value; }
// public Object paletteProvider() { return wrapperContained.paletteProvider; }
// // public void paletteProvider(Object value) { wrapperContained.paletteProvider = value; }
// public yarnwrap.util.thread.LockHelper lockHelper() { return new yarnwrap.util.thread.LockHelper(wrapperContained.lockHelper); }
// public void lockHelper(yarnwrap.util.thread.LockHelper value) { wrapperContained.lockHelper = value.wrapperContained; }
// public PalettedContainer(yarnwrap.util.collection.IndexedIterable idList,java.lang.Object object,Object paletteProvider) { this.wrapperContained = new net.minecraft.world.chunk.PalettedContainer(idList.wrapperContained,object,paletteProvider); }
// public PalettedContainer(yarnwrap.util.collection.IndexedIterable idList,Object paletteProvider,Object dataProvider,yarnwrap.util.collection.PaletteStorage storage,java.util.List paletteEntries) { this.wrapperContained = new net.minecraft.world.chunk.PalettedContainer(idList.wrapperContained,paletteProvider,dataProvider,storage.wrapperContained,paletteEntries); }
// // public PalettedContainer(yarnwrap.util.collection.IndexedIterable idList,Object paletteProvider,Object data) { this.wrapperContained = new net.minecraft.world.chunk.PalettedContainer(idList.wrapperContained,paletteProvider,data); }
// public void set(int index,java.lang.Object value) { wrapperContained.set(index,value); }
public void readPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.readPacket(buf.wrapperContained); }
public java.lang.Object swap(int x,int y,int z,java.lang.Object value) { return wrapperContained.swap(x,y,z,value); }
// public java.lang.Object get(int index) { return wrapperContained.get(index); }
// public int method_12333(int newSize,java.lang.Object added) { return wrapperContained.method_12333(newSize,added); }
public void lock() { wrapperContained.lock(); }
public void unlock() { wrapperContained.unlock(); }
// public java.lang.Object swap(int index,java.lang.Object value) { return wrapperContained.swap(index,value); }
public java.lang.Object swapUnsafe(int x,int y,int z,java.lang.Object value) { return wrapperContained.swapUnsafe(x,y,z,value); }
// public void method_21733(Object entry) { wrapperContained.method_21733(entry); }
// public void increment(it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap key) { wrapperContained.increment(key); }
public void set(int x,int y,int z,java.lang.Object value) { wrapperContained.set(x,y,z,value); }
// public com.mojang.datafixers.kinds.App method_38296(com.mojang.serialization.Codec instance) { return wrapperContained.method_38296(instance); }
// public Object getCompatibleData(Object previousData,int bits) { return wrapperContained.getCompatibleData(previousData,bits); }
// public com.mojang.serialization.Codec createCodec(yarnwrap.util.collection.IndexedIterable idList,com.mojang.serialization.Codec entryCodec,Object provider,java.lang.Object defaultValue,Object reader) { return wrapperContained.createCodec(idList.wrapperContained,entryCodec,provider,defaultValue,reader); }
// public Object method_38302(yarnwrap.util.collection.IndexedIterable container) { return wrapperContained.method_38302(container.wrapperContained); }
// public void method_39794(java.util.function.Consumer id) { wrapperContained.method_39794(id); }
// public void applyEach(int is,java.util.function.IntUnaryOperator[] applier) { wrapperContained.applyEach(is,applier); }
public yarnwrap.world.chunk.PalettedContainer copy() { return new yarnwrap.world.chunk.PalettedContainer(wrapperContained.copy()); }
// public int method_44340(yarnwrap.world.chunk.BiMapPalette id) { return wrapperContained.method_44340(id.wrapperContained); }
// public yarnwrap.world.chunk.ReadableContainer method_44341(yarnwrap.world.chunk.PalettedContainer result) { return new yarnwrap.world.chunk.ReadableContainer(wrapperContained.method_44341(result.wrapperContained)); }
// public com.mojang.serialization.DataResult method_44342(Object serialized) { return wrapperContained.method_44342(serialized); }
// public com.mojang.serialization.Codec createPalettedContainerCodec(yarnwrap.util.collection.IndexedIterable idList,com.mojang.serialization.Codec entryCodec,Object paletteProvider,java.lang.Object defaultValue) { return wrapperContained.createPalettedContainerCodec(idList.wrapperContained,entryCodec,paletteProvider,defaultValue); }
// public int method_44344(yarnwrap.util.collection.IndexedIterable id) { return wrapperContained.method_44344(id.wrapperContained); }
// public com.mojang.serialization.DataResult read(yarnwrap.util.collection.IndexedIterable idList,Object paletteProvider,Object serialized) { return wrapperContained.read(idList.wrapperContained,paletteProvider,serialized); }
// public com.mojang.serialization.Codec createReadableContainerCodec(yarnwrap.util.collection.IndexedIterable idList,com.mojang.serialization.Codec entryCodec,Object paletteProvider,java.lang.Object defaultValue) { return wrapperContained.createReadableContainerCodec(idList.wrapperContained,entryCodec,paletteProvider,defaultValue); }
// public com.mojang.serialization.DataResult method_44348(yarnwrap.util.collection.IndexedIterable idListx,Object paletteProviderx,Object serialized) { return wrapperContained.method_44348(idListx.wrapperContained,paletteProviderx,serialized); }
// public int method_44349(int id,java.lang.Object value) { return wrapperContained.method_44349(id,value); }

}