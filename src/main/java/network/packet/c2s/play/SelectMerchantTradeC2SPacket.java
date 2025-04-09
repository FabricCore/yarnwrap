package yarnwrap.network.packet.c2s.play;
public class SelectMerchantTradeC2SPacket { public net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket wrapperContained; public SelectMerchantTradeC2SPacket(net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tradeId() { return wrapperContained.tradeId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getTradeId() { return wrapperContained.getTradeId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}