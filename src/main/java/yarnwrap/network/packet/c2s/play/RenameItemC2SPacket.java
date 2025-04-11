package yarnwrap.network.packet.c2s.play;
public class RenameItemC2SPacket { public net.minecraft.network.packet.c2s.play.RenameItemC2SPacket wrapperContained; public RenameItemC2SPacket(net.minecraft.network.packet.c2s.play.RenameItemC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public RenameItemC2SPacket(java.lang.String name) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RenameItemC2SPacket(name); }
// public RenameItemC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.RenameItemC2SPacket(buf.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}