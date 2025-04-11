package yarnwrap.network.packet.c2s.play;
public class CloseHandledScreenC2SPacket { public net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket wrapperContained; public CloseHandledScreenC2SPacket(net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}