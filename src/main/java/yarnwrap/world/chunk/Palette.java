package yarnwrap.world.chunk;
public class Palette { public net.minecraft.world.chunk.Palette wrapperContained; public Palette(net.minecraft.world.chunk.Palette wrapperContained) { this.wrapperContained = wrapperContained; }

public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.world.chunk.Palette.getSize(); }
public void writePacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.writePacket(buf.wrapperContained); }
// public static void writePacket(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.world.chunk.Palette.writePacket(buf.wrapperContained); }
public java.lang.Object get(int id) { return wrapperContained.get(id); }
// public static java.lang.Object get(int id, ) { return net.minecraft.world.chunk.Palette.get(id); }
public void readPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.readPacket(buf.wrapperContained); }
// public static void readPacket(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.world.chunk.Palette.readPacket(buf.wrapperContained); }
public int getPacketSize() { return wrapperContained.getPacketSize(); }
// public static int getPacketSize() { return net.minecraft.world.chunk.Palette.getPacketSize(); }
public int index(java.lang.Object object) { return wrapperContained.index(object); }
// public static int index(java.lang.Object object, ) { return net.minecraft.world.chunk.Palette.index(object); }
public boolean hasAny(java.util.function.Predicate predicate) { return wrapperContained.hasAny(predicate); }
// public static boolean hasAny(java.util.function.Predicate predicate, ) { return net.minecraft.world.chunk.Palette.hasAny(predicate); }
public yarnwrap.world.chunk.Palette copy() { return new yarnwrap.world.chunk.Palette(wrapperContained.copy()); }
// public static yarnwrap.world.chunk.Palette copy() { return new yarnwrap.world.chunk.Palette(net.minecraft.world.chunk.Palette.copy()); }

}