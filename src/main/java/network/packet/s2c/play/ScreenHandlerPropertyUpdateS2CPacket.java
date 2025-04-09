package yarnwrap.network.packet.s2c.play;
public class ScreenHandlerPropertyUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket wrapperContained; public ScreenHandlerPropertyUpdateS2CPacket(net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int value() { return wrapperContained.value; }
// public int propertyId() { return wrapperContained.propertyId; }
// public int syncId() { return wrapperContained.syncId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getPropertyId() { return wrapperContained.getPropertyId(); }
public int getValue() { return wrapperContained.getValue(); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}