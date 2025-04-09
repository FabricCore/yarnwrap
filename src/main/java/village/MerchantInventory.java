package yarnwrap.village;
public class MerchantInventory { public net.minecraft.village.MerchantInventory wrapperContained; public MerchantInventory(net.minecraft.village.MerchantInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public int merchantRewardedExperience() { return wrapperContained.merchantRewardedExperience; }
// public int offerIndex() { return wrapperContained.offerIndex; }
// public yarnwrap.village.TradeOffer tradeOffer() { return new yarnwrap.village.TradeOffer(wrapperContained.tradeOffer); }
// public yarnwrap.village.Merchant merchant() { return new yarnwrap.village.Merchant(wrapperContained.merchant); }
// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
public int getMerchantRewardedExperience() { return wrapperContained.getMerchantRewardedExperience(); }
public yarnwrap.village.TradeOffer getTradeOffer() { return new yarnwrap.village.TradeOffer(wrapperContained.getTradeOffer()); }
public void setOfferIndex(int index) { wrapperContained.setOfferIndex(index); }
// public boolean needsOfferUpdate(int slot) { return wrapperContained.needsOfferUpdate(slot); }
public void updateOffers() { wrapperContained.updateOffers(); }

}