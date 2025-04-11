package yarnwrap.network.packet.c2s.play;
public class PickFromInventoryC2SPacket { public net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket wrapperContained; public PickFromInventoryC2SPacket(net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slot() { return wrapperContained.slot; }
// public void slot(int value) { wrapperContained.slot = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getSlot() { return wrapperContained.getSlot(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}