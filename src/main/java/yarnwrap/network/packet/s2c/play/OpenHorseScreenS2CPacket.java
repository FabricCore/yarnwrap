package yarnwrap.network.packet.s2c.play;
public class OpenHorseScreenS2CPacket { public net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket wrapperContained; public OpenHorseScreenS2CPacket(net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int horseId() { return wrapperContained.horseId; }
// public void horseId(int value) { wrapperContained.horseId = value; }
// public int slotColumnCount() { return wrapperContained.slotColumnCount; }
// public void slotColumnCount(int value) { wrapperContained.slotColumnCount = value; }
// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getSyncId() { return wrapperContained.getSyncId(); }
public int getHorseId() { return wrapperContained.getHorseId(); }
public int getSlotColumnCount() { return wrapperContained.getSlotColumnCount(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}