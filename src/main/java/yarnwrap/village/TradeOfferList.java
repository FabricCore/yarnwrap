package yarnwrap.village;
public class TradeOfferList { public net.minecraft.village.TradeOfferList wrapperContained; public TradeOfferList(net.minecraft.village.TradeOfferList wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.village.TradeOfferList copy() { return new yarnwrap.village.TradeOfferList(wrapperContained.copy()); }
public yarnwrap.village.TradeOffer getValidOffer(yarnwrap.item.ItemStack firstBuyItem,yarnwrap.item.ItemStack secondBuyItem,int index) { return new yarnwrap.village.TradeOffer(wrapperContained.getValidOffer(firstBuyItem.wrapperContained,secondBuyItem.wrapperContained,index)); }

}