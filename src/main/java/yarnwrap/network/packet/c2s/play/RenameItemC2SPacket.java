package yarnwrap.network.packet.c2s.play;
public class RenameItemC2SPacket { public net.minecraft.network.packet.c2s.play.RenameItemC2SPacket wrapperContained; public RenameItemC2SPacket(net.minecraft.network.packet.c2s.play.RenameItemC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.network.packet.c2s.play.RenameItemC2SPacket.name; }
// public static void name(java.lang.String value, ) { net.minecraft.network.packet.c2s.play.RenameItemC2SPacket.name = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.RenameItemC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.RenameItemC2SPacket.CODEC = value.wrapperContained; }

public RenameItemC2SPacket(java.lang.String name) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RenameItemC2SPacket(name); }
// public RenameItemC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RenameItemC2SPacket(buf.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.network.packet.c2s.play.RenameItemC2SPacket.getName(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.RenameItemC2SPacket.write(buf.wrapperContained); }

}