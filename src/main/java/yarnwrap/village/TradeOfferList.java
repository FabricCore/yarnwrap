package yarnwrap.village;
public class TradeOfferList { public net.minecraft.village.TradeOfferList wrapperContained; public TradeOfferList(net.minecraft.village.TradeOfferList wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.village.TradeOfferList.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.village.TradeOfferList.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.village.TradeOfferList.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.village.TradeOfferList.CODEC = value; }

// public TradeOfferList(int size) { this.wrapperContained = new net.minecraft.village.TradeOfferList(size); }
// public TradeOfferList(java.util.Collection tradeOffers) { this.wrapperContained = new net.minecraft.village.TradeOfferList(tradeOffers); }
public yarnwrap.village.TradeOfferList copy() { return new yarnwrap.village.TradeOfferList(wrapperContained.copy()); }
// public static yarnwrap.village.TradeOfferList copy() { return new yarnwrap.village.TradeOfferList(net.minecraft.village.TradeOfferList.copy()); }
public yarnwrap.village.TradeOffer getValidOffer(yarnwrap.item.ItemStack firstBuyItem,yarnwrap.item.ItemStack secondBuyItem,int index) { return new yarnwrap.village.TradeOffer(wrapperContained.getValidOffer(firstBuyItem.wrapperContained,secondBuyItem.wrapperContained,index)); }
// public static yarnwrap.village.TradeOffer getValidOffer(yarnwrap.item.ItemStack firstBuyItem,yarnwrap.item.ItemStack secondBuyItem,int index, ) { return new yarnwrap.village.TradeOffer(net.minecraft.village.TradeOfferList.getValidOffer(firstBuyItem.wrapperContained,secondBuyItem.wrapperContained,index)); }

}