package yarnwrap.village;
public class TradeOffer { public net.minecraft.village.TradeOffer wrapperContained; public TradeOffer(net.minecraft.village.TradeOffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int specialPrice() { return wrapperContained.specialPrice; }
// public void specialPrice(int value) { wrapperContained.specialPrice = value; }
// public int demandBonus() { return wrapperContained.demandBonus; }
// public void demandBonus(int value) { wrapperContained.demandBonus = value; }
// public float priceMultiplier() { return wrapperContained.priceMultiplier; }
// public void priceMultiplier(float value) { wrapperContained.priceMultiplier = value; }
// public int merchantExperience() { return wrapperContained.merchantExperience; }
// public void merchantExperience(int value) { wrapperContained.merchantExperience = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.Optional secondBuyItem() { return wrapperContained.secondBuyItem; }
// public void secondBuyItem(java.util.Optional value) { wrapperContained.secondBuyItem = value; }
// public int maxUses() { return wrapperContained.maxUses; }
// public void maxUses(int value) { wrapperContained.maxUses = value; }
// public boolean rewardingPlayerExperience() { return wrapperContained.rewardingPlayerExperience; }
// public void rewardingPlayerExperience(boolean value) { wrapperContained.rewardingPlayerExperience = value; }
// public yarnwrap.village.TradedItem firstBuyItem() { return new yarnwrap.village.TradedItem(wrapperContained.firstBuyItem); }
// public void firstBuyItem(yarnwrap.village.TradedItem value) { wrapperContained.firstBuyItem = value.wrapperContained; }
// public int uses() { return wrapperContained.uses; }
// public void uses(int value) { wrapperContained.uses = value; }
// public yarnwrap.item.ItemStack sellItem() { return new yarnwrap.item.ItemStack(wrapperContained.sellItem); }
// public void sellItem(yarnwrap.item.ItemStack value) { wrapperContained.sellItem = value.wrapperContained; }
public boolean matchesBuyItems(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack buyItem) { return wrapperContained.matchesBuyItems(stack.wrapperContained,buyItem.wrapperContained); }
public boolean depleteBuyItems(yarnwrap.item.ItemStack firstBuyStack,yarnwrap.item.ItemStack secondBuyStack) { return wrapperContained.depleteBuyItems(firstBuyStack.wrapperContained,secondBuyStack.wrapperContained); }
public yarnwrap.item.ItemStack copySellItem() { return new yarnwrap.item.ItemStack(wrapperContained.copySellItem()); }
public yarnwrap.item.ItemStack getDisplayedFirstBuyItem() { return new yarnwrap.item.ItemStack(wrapperContained.getDisplayedFirstBuyItem()); }
public void setSpecialPrice(int specialPrice) { wrapperContained.setSpecialPrice(specialPrice); }
public void updateDemandBonus() { wrapperContained.updateDemandBonus(); }
public void resetUses() { wrapperContained.resetUses(); }
public void clearSpecialPrice() { wrapperContained.clearSpecialPrice(); }
public int getSpecialPrice() { return wrapperContained.getSpecialPrice(); }
public float getPriceMultiplier() { return wrapperContained.getPriceMultiplier(); }
public int getMerchantExperience() { return wrapperContained.getMerchantExperience(); }
public int getDemandBonus() { return wrapperContained.getDemandBonus(); }
public boolean hasBeenUsed() { return wrapperContained.hasBeenUsed(); }
public yarnwrap.village.TradeOffer copy() { return new yarnwrap.village.TradeOffer(wrapperContained.copy()); }
public yarnwrap.village.TradeOffer read(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.village.TradeOffer(wrapperContained.read(buf.wrapperContained)); }
// public void write(yarnwrap.network.RegistryByteBuf buf,yarnwrap.village.TradeOffer offer) { wrapperContained.write(buf.wrapperContained,offer.wrapperContained); }
// public int getFirstBuyItemCount(yarnwrap.village.TradedItem firstBuyItem) { return wrapperContained.getFirstBuyItemCount(firstBuyItem.wrapperContained); }
public yarnwrap.village.TradedItem getFirstBuyItem() { return new yarnwrap.village.TradedItem(wrapperContained.getFirstBuyItem()); }
public java.util.Optional getSecondBuyItem() { return wrapperContained.getSecondBuyItem(); }
public void use() { wrapperContained.use(); }
public void increaseSpecialPrice(int increment) { wrapperContained.increaseSpecialPrice(increment); }
public yarnwrap.item.ItemStack getOriginalFirstBuyItem() { return new yarnwrap.item.ItemStack(wrapperContained.getOriginalFirstBuyItem()); }
public yarnwrap.item.ItemStack getDisplayedSecondBuyItem() { return new yarnwrap.item.ItemStack(wrapperContained.getDisplayedSecondBuyItem()); }
public int getMaxUses() { return wrapperContained.getMaxUses(); }
public int getUses() { return wrapperContained.getUses(); }
public yarnwrap.item.ItemStack getSellItem() { return new yarnwrap.item.ItemStack(wrapperContained.getSellItem()); }
public void disable() { wrapperContained.disable(); }
public boolean isDisabled() { return wrapperContained.isDisabled(); }
public boolean shouldRewardPlayerExperience() { return wrapperContained.shouldRewardPlayerExperience(); }

}