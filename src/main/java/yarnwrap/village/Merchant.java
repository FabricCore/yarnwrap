package yarnwrap.village;
public class Merchant { public net.minecraft.village.Merchant wrapperContained; public Merchant(net.minecraft.village.Merchant wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.ScreenHandler method_17448(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.entity.player.PlayerEntity playerx) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_17448(syncId,playerInventory.wrapperContained,playerx.wrapperContained)); }
public void sendOffers(yarnwrap.entity.player.PlayerEntity player,yarnwrap.text.Text name,int levelProgress) { wrapperContained.sendOffers(player.wrapperContained,name.wrapperContained,levelProgress); }
public yarnwrap.sound.SoundEvent getYesSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getYesSound()); }
public int getExperience() { return wrapperContained.getExperience(); }
public boolean isLeveledMerchant() { return wrapperContained.isLeveledMerchant(); }
public void setExperienceFromServer(int experience) { wrapperContained.setExperienceFromServer(experience); }
public boolean canRefreshTrades() { return wrapperContained.canRefreshTrades(); }
public boolean isClient() { return wrapperContained.isClient(); }
public yarnwrap.entity.player.PlayerEntity getCustomer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getCustomer()); }
public void onSellingItem(yarnwrap.item.ItemStack stack) { wrapperContained.onSellingItem(stack.wrapperContained); }
public void setCustomer(yarnwrap.entity.player.PlayerEntity customer) { wrapperContained.setCustomer(customer.wrapperContained); }
public void setOffersFromServer(yarnwrap.village.TradeOfferList offers) { wrapperContained.setOffersFromServer(offers.wrapperContained); }
public void trade(yarnwrap.village.TradeOffer offer) { wrapperContained.trade(offer.wrapperContained); }
public yarnwrap.village.TradeOfferList getOffers() { return new yarnwrap.village.TradeOfferList(wrapperContained.getOffers()); }

}