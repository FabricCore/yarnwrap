package yarnwrap.world.chunk;
public class ReadableContainer { public net.minecraft.world.chunk.ReadableContainer wrapperContained; public ReadableContainer(net.minecraft.world.chunk.ReadableContainer wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object get(int x,int y,int z) { return wrapperContained.get(x,y,z); }
public void writePacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.writePacket(buf.wrapperContained); }
public int getPacketSize() { return wrapperContained.getPacketSize(); }
public boolean hasAny(java.util.function.Predicate predicate) { return wrapperContained.hasAny(predicate); }
// public void count(Object counter) { wrapperContained.count(counter); }
public void forEachValue(java.util.function.Consumer action) { wrapperContained.forEachValue(action); }
// public Object serialize(yarnwrap.util.collection.IndexedIterable idList,Object paletteProvider) { return wrapperContained.serialize(idList.wrapperContained,paletteProvider); }
public yarnwrap.world.chunk.PalettedContainer slice() { return new yarnwrap.world.chunk.PalettedContainer(wrapperContained.slice()); }

}