package yarnwrap.world.chunk;
public class ReadableContainer { public net.minecraft.world.chunk.ReadableContainer wrapperContained; public ReadableContainer(net.minecraft.world.chunk.ReadableContainer wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object get(int x,int y,int z) { return wrapperContained.get(x,y,z); }
// public static java.lang.Object get(int x,int y,int z, ) { return net.minecraft.world.chunk.ReadableContainer.get(x,y,z); }
public void writePacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.writePacket(buf.wrapperContained); }
// public static void writePacket(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.world.chunk.ReadableContainer.writePacket(buf.wrapperContained); }
public int getPacketSize() { return wrapperContained.getPacketSize(); }
// public static int getPacketSize() { return net.minecraft.world.chunk.ReadableContainer.getPacketSize(); }
public boolean hasAny(java.util.function.Predicate predicate) { return wrapperContained.hasAny(predicate); }
// public static boolean hasAny(java.util.function.Predicate predicate, ) { return net.minecraft.world.chunk.ReadableContainer.hasAny(predicate); }
// public void count(Object counter) { wrapperContained.count(counter); }
// public static void count(Object counter, ) { net.minecraft.world.chunk.ReadableContainer.count(counter); }
public void forEachValue(java.util.function.Consumer action) { wrapperContained.forEachValue(action); }
// public static void forEachValue(java.util.function.Consumer action, ) { net.minecraft.world.chunk.ReadableContainer.forEachValue(action); }
public yarnwrap.world.chunk.PalettedContainer copy() { return new yarnwrap.world.chunk.PalettedContainer(wrapperContained.copy()); }
// public static yarnwrap.world.chunk.PalettedContainer copy() { return new yarnwrap.world.chunk.PalettedContainer(net.minecraft.world.chunk.ReadableContainer.copy()); }
// public Object serialize(yarnwrap.util.collection.IndexedIterable idList,Object paletteProvider) { return wrapperContained.serialize(idList.wrapperContained,paletteProvider); }
// public static Object serialize(yarnwrap.util.collection.IndexedIterable idList,Object paletteProvider, ) { return net.minecraft.world.chunk.ReadableContainer.serialize(idList.wrapperContained,paletteProvider); }
public yarnwrap.world.chunk.PalettedContainer slice() { return new yarnwrap.world.chunk.PalettedContainer(wrapperContained.slice()); }
// public static yarnwrap.world.chunk.PalettedContainer slice() { return new yarnwrap.world.chunk.PalettedContainer(net.minecraft.world.chunk.ReadableContainer.slice()); }

}