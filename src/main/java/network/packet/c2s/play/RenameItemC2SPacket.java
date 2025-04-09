package yarnwrap.network.packet.c2s.play;
public class RenameItemC2SPacket { public net.minecraft.network.packet.c2s.play.RenameItemC2SPacket wrapperContained; public RenameItemC2SPacket(net.minecraft.network.packet.c2s.play.RenameItemC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}