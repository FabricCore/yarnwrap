package yarnwrap.village;
public class Merchant { public net.minecraft.village.Merchant wrapperContained; public Merchant(net.minecraft.village.Merchant wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.ScreenHandler method_17448(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.entity.player.PlayerEntity playerx) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_17448(syncId,playerInventory.wrapperContained,playerx.wrapperContained)); }
// public static yarnwrap.screen.ScreenHandler method_17448(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.entity.player.PlayerEntity playerx, ) { return new yarnwrap.screen.ScreenHandler(net.minecraft.village.Merchant.method_17448(syncId,playerInventory.wrapperContained,playerx.wrapperContained)); }
public void sendOffers(yarnwrap.entity.player.PlayerEntity player,yarnwrap.text.Text name,int levelProgress) { wrapperContained.sendOffers(player.wrapperContained,name.wrapperContained,levelProgress); }
// public static void sendOffers(yarnwrap.entity.player.PlayerEntity player,yarnwrap.text.Text name,int levelProgress, ) { net.minecraft.village.Merchant.sendOffers(player.wrapperContained,name.wrapperContained,levelProgress); }
public yarnwrap.sound.SoundEvent getYesSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getYesSound()); }
// public static yarnwrap.sound.SoundEvent getYesSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.village.Merchant.getYesSound()); }
public int getExperience() { return wrapperContained.getExperience(); }
// public static int getExperience() { return net.minecraft.village.Merchant.getExperience(); }
public boolean isLeveledMerchant() { return wrapperContained.isLeveledMerchant(); }
// public static boolean isLeveledMerchant() { return net.minecraft.village.Merchant.isLeveledMerchant(); }
public void setExperienceFromServer(int experience) { wrapperContained.setExperienceFromServer(experience); }
// public static void setExperienceFromServer(int experience, ) { net.minecraft.village.Merchant.setExperienceFromServer(experience); }
public boolean canRefreshTrades() { return wrapperContained.canRefreshTrades(); }
// public static boolean canRefreshTrades() { return net.minecraft.village.Merchant.canRefreshTrades(); }
public boolean isClient() { return wrapperContained.isClient(); }
// public static boolean isClient() { return net.minecraft.village.Merchant.isClient(); }
public yarnwrap.entity.player.PlayerEntity getCustomer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getCustomer()); }
// public static yarnwrap.entity.player.PlayerEntity getCustomer() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.village.Merchant.getCustomer()); }
public void onSellingItem(yarnwrap.item.ItemStack stack) { wrapperContained.onSellingItem(stack.wrapperContained); }
// public static void onSellingItem(yarnwrap.item.ItemStack stack, ) { net.minecraft.village.Merchant.onSellingItem(stack.wrapperContained); }
public void setCustomer(yarnwrap.entity.player.PlayerEntity customer) { wrapperContained.setCustomer(customer.wrapperContained); }
// public static void setCustomer(yarnwrap.entity.player.PlayerEntity customer, ) { net.minecraft.village.Merchant.setCustomer(customer.wrapperContained); }
public void setOffersFromServer(yarnwrap.village.TradeOfferList offers) { wrapperContained.setOffersFromServer(offers.wrapperContained); }
// public static void setOffersFromServer(yarnwrap.village.TradeOfferList offers, ) { net.minecraft.village.Merchant.setOffersFromServer(offers.wrapperContained); }
public void trade(yarnwrap.village.TradeOffer offer) { wrapperContained.trade(offer.wrapperContained); }
// public static void trade(yarnwrap.village.TradeOffer offer, ) { net.minecraft.village.Merchant.trade(offer.wrapperContained); }
public yarnwrap.village.TradeOfferList getOffers() { return new yarnwrap.village.TradeOfferList(wrapperContained.getOffers()); }
// public static yarnwrap.village.TradeOfferList getOffers() { return new yarnwrap.village.TradeOfferList(net.minecraft.village.Merchant.getOffers()); }

}