package yarnwrap.world.chunk;
public class Palette { public net.minecraft.world.chunk.Palette wrapperContained; public Palette(net.minecraft.world.chunk.Palette wrapperContained) { this.wrapperContained = wrapperContained; }

public int getSize() { return wrapperContained.getSize(); }
public void writePacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.writePacket(buf.wrapperContained); }
public java.lang.Object get(int id) { return wrapperContained.get(id); }
public void readPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.readPacket(buf.wrapperContained); }
public int getPacketSize() { return wrapperContained.getPacketSize(); }
public int index(java.lang.Object object) { return wrapperContained.index(object); }
public boolean hasAny(java.util.function.Predicate predicate) { return wrapperContained.hasAny(predicate); }
public yarnwrap.world.chunk.Palette copy() { return new yarnwrap.world.chunk.Palette(wrapperContained.copy()); }

}