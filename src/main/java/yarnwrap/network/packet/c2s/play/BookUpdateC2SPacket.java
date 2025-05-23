package yarnwrap.network.packet.c2s.play;
public class BookUpdateC2SPacket { public net.minecraft.network.packet.c2s.play.BookUpdateC2SPacket wrapperContained; public BookUpdateC2SPacket(net.minecraft.network.packet.c2s.play.BookUpdateC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.BookUpdateC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.BookUpdateC2SPacket.CODEC = value.wrapperContained; }

public BookUpdateC2SPacket(int slot,java.util.List pages,java.util.Optional title) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.BookUpdateC2SPacket(slot,pages,title); }

}