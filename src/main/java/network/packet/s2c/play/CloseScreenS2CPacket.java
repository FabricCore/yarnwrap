package yarnwrap.network.packet.s2c.play;
public class CloseScreenS2CPacket { public net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket wrapperContained; public CloseScreenS2CPacket(net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}