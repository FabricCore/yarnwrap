package yarnwrap.village;
public class MerchantInventory { public net.minecraft.village.MerchantInventory wrapperContained; public MerchantInventory(net.minecraft.village.MerchantInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public int merchantRewardedExperience() { return wrapperContained.merchantRewardedExperience; }
// public void merchantRewardedExperience(int value) { wrapperContained.merchantRewardedExperience = value; }
// public static int merchantRewardedExperience() { return net.minecraft.village.MerchantInventory.merchantRewardedExperience; }
// public static void merchantRewardedExperience(int value, ) { net.minecraft.village.MerchantInventory.merchantRewardedExperience = value; }

// public int offerIndex() { return wrapperContained.offerIndex; }
// public void offerIndex(int value) { wrapperContained.offerIndex = value; }
// public static int offerIndex() { return net.minecraft.village.MerchantInventory.offerIndex; }
// public static void offerIndex(int value, ) { net.minecraft.village.MerchantInventory.offerIndex = value; }

// public yarnwrap.village.TradeOffer tradeOffer() { return new yarnwrap.village.TradeOffer(wrapperContained.tradeOffer); }
// public void tradeOffer(yarnwrap.village.TradeOffer value) { wrapperContained.tradeOffer = value.wrapperContained; }
// public static yarnwrap.village.TradeOffer tradeOffer() { return new yarnwrap.village.TradeOffer(net.minecraft.village.MerchantInventory.tradeOffer); }
// public static void tradeOffer(yarnwrap.village.TradeOffer value, ) { net.minecraft.village.MerchantInventory.tradeOffer = value.wrapperContained; }

// public yarnwrap.village.Merchant merchant() { return new yarnwrap.village.Merchant(wrapperContained.merchant); }
// public void merchant(yarnwrap.village.Merchant value) { wrapperContained.merchant = value.wrapperContained; }
// public static yarnwrap.village.Merchant merchant() { return new yarnwrap.village.Merchant(net.minecraft.village.MerchantInventory.merchant); }
// public static void merchant(yarnwrap.village.Merchant value, ) { net.minecraft.village.MerchantInventory.merchant = value.wrapperContained; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.village.MerchantInventory.inventory); }
// public static void inventory(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.village.MerchantInventory.inventory = value.wrapperContained; }

public MerchantInventory(yarnwrap.village.Merchant merchant) { this.wrapperContained = new net.minecraft.village.MerchantInventory(merchant.wrapperContained); }
public int getMerchantRewardedExperience() { return wrapperContained.getMerchantRewardedExperience(); }
// public static int getMerchantRewardedExperience() { return net.minecraft.village.MerchantInventory.getMerchantRewardedExperience(); }
public yarnwrap.village.TradeOffer getTradeOffer() { return new yarnwrap.village.TradeOffer(wrapperContained.getTradeOffer()); }
// public static yarnwrap.village.TradeOffer getTradeOffer() { return new yarnwrap.village.TradeOffer(net.minecraft.village.MerchantInventory.getTradeOffer()); }
public void setOfferIndex(int index) { wrapperContained.setOfferIndex(index); }
// public static void setOfferIndex(int index, ) { net.minecraft.village.MerchantInventory.setOfferIndex(index); }
// public boolean needsOfferUpdate(int slot) { return wrapperContained.needsOfferUpdate(slot); }
// public static boolean needsOfferUpdate(int slot, ) { return net.minecraft.village.MerchantInventory.needsOfferUpdate(slot); }
public void updateOffers() { wrapperContained.updateOffers(); }
// public static void updateOffers() { net.minecraft.village.MerchantInventory.updateOffers(); }

}