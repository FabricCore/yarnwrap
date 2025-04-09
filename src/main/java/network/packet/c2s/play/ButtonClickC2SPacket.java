package yarnwrap.network.packet.c2s.play;
public class ButtonClickC2SPacket { public net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket wrapperContained; public ButtonClickC2SPacket(net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public int syncId() { return wrapperContained.syncId(); }

}