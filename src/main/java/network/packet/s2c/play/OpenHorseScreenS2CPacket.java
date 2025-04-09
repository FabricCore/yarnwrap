package yarnwrap.network.packet.s2c.play;
public class OpenHorseScreenS2CPacket { public net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket wrapperContained; public OpenHorseScreenS2CPacket(net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int horseId() { return wrapperContained.horseId; }
// public int slotColumnCount() { return wrapperContained.slotColumnCount; }
// public int syncId() { return wrapperContained.syncId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getSyncId() { return wrapperContained.getSyncId(); }
public int getHorseId() { return wrapperContained.getHorseId(); }
public int getSlotColumnCount() { return wrapperContained.getSlotColumnCount(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}