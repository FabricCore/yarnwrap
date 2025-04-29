package yarnwrap.network.packet.c2s.play;
public class SelectMerchantTradeC2SPacket { public net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket wrapperContained; public SelectMerchantTradeC2SPacket(net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tradeId() { return wrapperContained.tradeId; }
// public void tradeId(int value) { wrapperContained.tradeId = value; }
// public static int tradeId() { return net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket.tradeId; }
// public static void tradeId(int value, ) { net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket.tradeId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket.CODEC = value.wrapperContained; }

public SelectMerchantTradeC2SPacket(int tradeId) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket(tradeId); }
// public SelectMerchantTradeC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket(buf.wrapperContained); }
public int getTradeId() { return wrapperContained.getTradeId(); }
// public static int getTradeId() { return net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket.getTradeId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket.write(buf.wrapperContained); }

}