package yarnwrap.network.packet.c2s.play;
public class BookUpdateC2SPacket { public net.minecraft.network.packet.c2s.play.BookUpdateC2SPacket wrapperContained; public BookUpdateC2SPacket(net.minecraft.network.packet.c2s.play.BookUpdateC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_TITLE_LENGTH() { return wrapperContained.MAX_TITLE_LENGTH; }
// public void MAX_TITLE_LENGTH(int value) { wrapperContained.MAX_TITLE_LENGTH = value; }
// public int MAX_PAGE_LENGTH() { return wrapperContained.MAX_PAGE_LENGTH; }
// public void MAX_PAGE_LENGTH(int value) { wrapperContained.MAX_PAGE_LENGTH = value; }
// public int MAX_PAGES() { return wrapperContained.MAX_PAGES; }
// public void MAX_PAGES(int value) { wrapperContained.MAX_PAGES = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }

}