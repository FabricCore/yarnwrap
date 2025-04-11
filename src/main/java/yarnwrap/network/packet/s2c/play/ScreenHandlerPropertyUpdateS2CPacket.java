package yarnwrap.network.packet.s2c.play;
public class ScreenHandlerPropertyUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket wrapperContained; public ScreenHandlerPropertyUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int value() { return wrapperContained.value; }
// public void value(int value) { wrapperContained.value = value; }
// public int propertyId() { return wrapperContained.propertyId; }
// public void propertyId(int value) { wrapperContained.propertyId = value; }
// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getPropertyId() { return wrapperContained.getPropertyId(); }
public int getValue() { return wrapperContained.getValue(); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}