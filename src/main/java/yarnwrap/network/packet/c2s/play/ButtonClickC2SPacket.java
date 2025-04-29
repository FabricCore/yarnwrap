package yarnwrap.network.packet.c2s.play;
public class ButtonClickC2SPacket { public net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket wrapperContained; public ButtonClickC2SPacket(net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket.syncId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket.CODEC = value.wrapperContained; }

// public int syncId() { return wrapperContained.syncId(); }
// // public static int syncId() { return net.minecraft.network.packet.c2s.play.ButtonClickC2SPacket.syncId(); }

}