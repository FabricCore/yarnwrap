package yarnwrap.network.packet.c2s.play;
public class PickFromInventoryC2SPacket { public net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket wrapperContained; public PickFromInventoryC2SPacket(net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slot() { return wrapperContained.slot; }
// public void slot(int value) { wrapperContained.slot = value; }
// public static int slot() { return net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket.slot; }
// public static void slot(int value, ) { net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket.slot = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket.CODEC = value.wrapperContained; }

public PickFromInventoryC2SPacket(int slot) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket(slot); }
// public PickFromInventoryC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket(buf.wrapperContained); }
public int getSlot() { return wrapperContained.getSlot(); }
// public static int getSlot() { return net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket.getSlot(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket.write(buf.wrapperContained); }

}