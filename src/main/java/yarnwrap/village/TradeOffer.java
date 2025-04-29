package yarnwrap.village;
public class TradeOffer { public net.minecraft.village.TradeOffer wrapperContained; public TradeOffer(net.minecraft.village.TradeOffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int specialPrice() { return wrapperContained.specialPrice; }
// public void specialPrice(int value) { wrapperContained.specialPrice = value; }
// public static int specialPrice() { return net.minecraft.village.TradeOffer.specialPrice; }
// public static void specialPrice(int value, ) { net.minecraft.village.TradeOffer.specialPrice = value; }

// public int demandBonus() { return wrapperContained.demandBonus; }
// public void demandBonus(int value) { wrapperContained.demandBonus = value; }
// public static int demandBonus() { return net.minecraft.village.TradeOffer.demandBonus; }
// public static void demandBonus(int value, ) { net.minecraft.village.TradeOffer.demandBonus = value; }

// public float priceMultiplier() { return wrapperContained.priceMultiplier; }
// public void priceMultiplier(float value) { wrapperContained.priceMultiplier = value; }
// public static float priceMultiplier() { return net.minecraft.village.TradeOffer.priceMultiplier; }
// public static void priceMultiplier(float value, ) { net.minecraft.village.TradeOffer.priceMultiplier = value; }

// public int merchantExperience() { return wrapperContained.merchantExperience; }
// public void merchantExperience(int value) { wrapperContained.merchantExperience = value; }
// public static int merchantExperience() { return net.minecraft.village.TradeOffer.merchantExperience; }
// public static void merchantExperience(int value, ) { net.minecraft.village.TradeOffer.merchantExperience = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.village.TradeOffer.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.village.TradeOffer.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.village.TradeOffer.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.village.TradeOffer.CODEC = value; }

// public java.util.Optional secondBuyItem() { return wrapperContained.secondBuyItem; }
// public void secondBuyItem(java.util.Optional value) { wrapperContained.secondBuyItem = value; }
// public static java.util.Optional secondBuyItem() { return net.minecraft.village.TradeOffer.secondBuyItem; }
// public static void secondBuyItem(java.util.Optional value, ) { net.minecraft.village.TradeOffer.secondBuyItem = value; }

// public int maxUses() { return wrapperContained.maxUses; }
// public void maxUses(int value) { wrapperContained.maxUses = value; }
// public static int maxUses() { return net.minecraft.village.TradeOffer.maxUses; }
// public static void maxUses(int value, ) { net.minecraft.village.TradeOffer.maxUses = value; }

// public boolean rewardingPlayerExperience() { return wrapperContained.rewardingPlayerExperience; }
// public void rewardingPlayerExperience(boolean value) { wrapperContained.rewardingPlayerExperience = value; }
// public static boolean rewardingPlayerExperience() { return net.minecraft.village.TradeOffer.rewardingPlayerExperience; }
// public static void rewardingPlayerExperience(boolean value, ) { net.minecraft.village.TradeOffer.rewardingPlayerExperience = value; }

// public yarnwrap.village.TradedItem firstBuyItem() { return new yarnwrap.village.TradedItem(wrapperContained.firstBuyItem); }
// public void firstBuyItem(yarnwrap.village.TradedItem value) { wrapperContained.firstBuyItem = value.wrapperContained; }
// public static yarnwrap.village.TradedItem firstBuyItem() { return new yarnwrap.village.TradedItem(net.minecraft.village.TradeOffer.firstBuyItem); }
// public static void firstBuyItem(yarnwrap.village.TradedItem value, ) { net.minecraft.village.TradeOffer.firstBuyItem = value.wrapperContained; }

// public int uses() { return wrapperContained.uses; }
// public void uses(int value) { wrapperContained.uses = value; }
// public static int uses() { return net.minecraft.village.TradeOffer.uses; }
// public static void uses(int value, ) { net.minecraft.village.TradeOffer.uses = value; }

// public yarnwrap.item.ItemStack sellItem() { return new yarnwrap.item.ItemStack(wrapperContained.sellItem); }
// public void sellItem(yarnwrap.item.ItemStack value) { wrapperContained.sellItem = value.wrapperContained; }
// public static yarnwrap.item.ItemStack sellItem() { return new yarnwrap.item.ItemStack(net.minecraft.village.TradeOffer.sellItem); }
// public static void sellItem(yarnwrap.item.ItemStack value, ) { net.minecraft.village.TradeOffer.sellItem = value.wrapperContained; }

// public TradeOffer(yarnwrap.village.TradeOffer offer) { this.wrapperContained = new net.minecraft.village.TradeOffer(offer.wrapperContained); }
public TradeOffer(yarnwrap.village.TradedItem firstBuyItem,java.util.Optional secondBuyItem,yarnwrap.item.ItemStack sellItem,int maxUses,int merchantExperience,float priceMultiplier) { this.wrapperContained = new net.minecraft.village.TradeOffer(firstBuyItem.wrapperContained,secondBuyItem,sellItem.wrapperContained,maxUses,merchantExperience,priceMultiplier); }
public TradeOffer(yarnwrap.village.TradedItem firstBuyItem,java.util.Optional secondBuyItem,yarnwrap.item.ItemStack sellItem,int uses,int maxUses,int merchantExperience,float priceMultiplier) { this.wrapperContained = new net.minecraft.village.TradeOffer(firstBuyItem.wrapperContained,secondBuyItem,sellItem.wrapperContained,uses,maxUses,merchantExperience,priceMultiplier); }
public TradeOffer(yarnwrap.village.TradedItem firstBuyItem,java.util.Optional secondBuyItem,yarnwrap.item.ItemStack sellItem,int uses,int maxUses,int merchantExperience,float priceMultiplier,int demandBonus) { this.wrapperContained = new net.minecraft.village.TradeOffer(firstBuyItem.wrapperContained,secondBuyItem,sellItem.wrapperContained,uses,maxUses,merchantExperience,priceMultiplier,demandBonus); }
// public TradeOffer(yarnwrap.village.TradedItem firstBuyItem,java.util.Optional secondBuyItem,yarnwrap.item.ItemStack sellItem,int uses,int maxUses,boolean rewardingPlayerExperience,int specialPrice,int demandBonus,float priceMultiplier,int merchantExperience) { this.wrapperContained = new net.minecraft.village.TradeOffer(firstBuyItem.wrapperContained,secondBuyItem,sellItem.wrapperContained,uses,maxUses,rewardingPlayerExperience,specialPrice,demandBonus,priceMultiplier,merchantExperience); }
public TradeOffer(yarnwrap.village.TradedItem buyItem,yarnwrap.item.ItemStack sellItem,int maxUses,int merchantExperience,float priceMultiplier) { this.wrapperContained = new net.minecraft.village.TradeOffer(buyItem.wrapperContained,sellItem.wrapperContained,maxUses,merchantExperience,priceMultiplier); }
public boolean matchesBuyItems(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack buyItem) { return wrapperContained.matchesBuyItems(stack.wrapperContained,buyItem.wrapperContained); }
// public static boolean matchesBuyItems(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack buyItem, ) { return net.minecraft.village.TradeOffer.matchesBuyItems(stack.wrapperContained,buyItem.wrapperContained); }
public boolean depleteBuyItems(yarnwrap.item.ItemStack firstBuyStack,yarnwrap.item.ItemStack secondBuyStack) { return wrapperContained.depleteBuyItems(firstBuyStack.wrapperContained,secondBuyStack.wrapperContained); }
// public static boolean depleteBuyItems(yarnwrap.item.ItemStack firstBuyStack,yarnwrap.item.ItemStack secondBuyStack, ) { return net.minecraft.village.TradeOffer.depleteBuyItems(firstBuyStack.wrapperContained,secondBuyStack.wrapperContained); }
public yarnwrap.item.ItemStack copySellItem() { return new yarnwrap.item.ItemStack(wrapperContained.copySellItem()); }
// public static yarnwrap.item.ItemStack copySellItem() { return new yarnwrap.item.ItemStack(net.minecraft.village.TradeOffer.copySellItem()); }
public yarnwrap.item.ItemStack getDisplayedFirstBuyItem() { return new yarnwrap.item.ItemStack(wrapperContained.getDisplayedFirstBuyItem()); }
// public static yarnwrap.item.ItemStack getDisplayedFirstBuyItem() { return new yarnwrap.item.ItemStack(net.minecraft.village.TradeOffer.getDisplayedFirstBuyItem()); }
public void setSpecialPrice(int specialPrice) { wrapperContained.setSpecialPrice(specialPrice); }
// public static void setSpecialPrice(int specialPrice, ) { net.minecraft.village.TradeOffer.setSpecialPrice(specialPrice); }
public void updateDemandBonus() { wrapperContained.updateDemandBonus(); }
// public static void updateDemandBonus() { net.minecraft.village.TradeOffer.updateDemandBonus(); }
public void resetUses() { wrapperContained.resetUses(); }
// public static void resetUses() { net.minecraft.village.TradeOffer.resetUses(); }
public void clearSpecialPrice() { wrapperContained.clearSpecialPrice(); }
// public static void clearSpecialPrice() { net.minecraft.village.TradeOffer.clearSpecialPrice(); }
public int getSpecialPrice() { return wrapperContained.getSpecialPrice(); }
// public static int getSpecialPrice() { return net.minecraft.village.TradeOffer.getSpecialPrice(); }
public float getPriceMultiplier() { return wrapperContained.getPriceMultiplier(); }
// public static float getPriceMultiplier() { return net.minecraft.village.TradeOffer.getPriceMultiplier(); }
public int getMerchantExperience() { return wrapperContained.getMerchantExperience(); }
// public static int getMerchantExperience() { return net.minecraft.village.TradeOffer.getMerchantExperience(); }
public int getDemandBonus() { return wrapperContained.getDemandBonus(); }
// public static int getDemandBonus() { return net.minecraft.village.TradeOffer.getDemandBonus(); }
public boolean hasBeenUsed() { return wrapperContained.hasBeenUsed(); }
// public static boolean hasBeenUsed() { return net.minecraft.village.TradeOffer.hasBeenUsed(); }
public yarnwrap.village.TradeOffer copy() { return new yarnwrap.village.TradeOffer(wrapperContained.copy()); }
// public static yarnwrap.village.TradeOffer copy() { return new yarnwrap.village.TradeOffer(net.minecraft.village.TradeOffer.copy()); }
// public yarnwrap.village.TradeOffer read(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.village.TradeOffer(wrapperContained.read(buf.wrapperContained)); }
// public static yarnwrap.village.TradeOffer read(yarnwrap.network.RegistryByteBuf buf, ) { return new yarnwrap.village.TradeOffer(net.minecraft.village.TradeOffer.read(buf.wrapperContained)); }
// public void write(yarnwrap.network.RegistryByteBuf buf,yarnwrap.village.TradeOffer offer) { wrapperContained.write(buf.wrapperContained,offer.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf,yarnwrap.village.TradeOffer offer, ) { net.minecraft.village.TradeOffer.write(buf.wrapperContained,offer.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_56705(Object instance) { return wrapperContained.method_56705(instance); }
// public static com.mojang.datafixers.kinds.App method_56705(Object instance, ) { return net.minecraft.village.TradeOffer.method_56705(instance); }
// public java.lang.Integer method_56707(yarnwrap.village.TradeOffer tradeOffer) { return wrapperContained.method_56707(tradeOffer.wrapperContained); }
// public static java.lang.Integer method_56707(yarnwrap.village.TradeOffer tradeOffer, ) { return net.minecraft.village.TradeOffer.method_56707(tradeOffer.wrapperContained); }
// public java.lang.Float method_56708(yarnwrap.village.TradeOffer tradeOffer) { return wrapperContained.method_56708(tradeOffer.wrapperContained); }
// public static java.lang.Float method_56708(yarnwrap.village.TradeOffer tradeOffer, ) { return net.minecraft.village.TradeOffer.method_56708(tradeOffer.wrapperContained); }
// public java.lang.Integer method_56709(yarnwrap.village.TradeOffer tradeOffer) { return wrapperContained.method_56709(tradeOffer.wrapperContained); }
// public static java.lang.Integer method_56709(yarnwrap.village.TradeOffer tradeOffer, ) { return net.minecraft.village.TradeOffer.method_56709(tradeOffer.wrapperContained); }
// public java.lang.Integer method_56710(yarnwrap.village.TradeOffer tradeOffer) { return wrapperContained.method_56710(tradeOffer.wrapperContained); }
// public static java.lang.Integer method_56710(yarnwrap.village.TradeOffer tradeOffer, ) { return net.minecraft.village.TradeOffer.method_56710(tradeOffer.wrapperContained); }
// public java.lang.Boolean method_56711(yarnwrap.village.TradeOffer tradeOffer) { return wrapperContained.method_56711(tradeOffer.wrapperContained); }
// public static java.lang.Boolean method_56711(yarnwrap.village.TradeOffer tradeOffer, ) { return net.minecraft.village.TradeOffer.method_56711(tradeOffer.wrapperContained); }
// public java.lang.Integer method_56712(yarnwrap.village.TradeOffer tradeOffer) { return wrapperContained.method_56712(tradeOffer.wrapperContained); }
// public static java.lang.Integer method_56712(yarnwrap.village.TradeOffer tradeOffer, ) { return net.minecraft.village.TradeOffer.method_56712(tradeOffer.wrapperContained); }
// public java.lang.Integer method_56713(yarnwrap.village.TradeOffer tradeOffer) { return wrapperContained.method_56713(tradeOffer.wrapperContained); }
// public static java.lang.Integer method_56713(yarnwrap.village.TradeOffer tradeOffer, ) { return net.minecraft.village.TradeOffer.method_56713(tradeOffer.wrapperContained); }
// public yarnwrap.item.ItemStack method_56714(yarnwrap.village.TradeOffer tradeOffer) { return new yarnwrap.item.ItemStack(wrapperContained.method_56714(tradeOffer.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_56714(yarnwrap.village.TradeOffer tradeOffer, ) { return new yarnwrap.item.ItemStack(net.minecraft.village.TradeOffer.method_56714(tradeOffer.wrapperContained)); }
// public java.util.Optional method_56715(yarnwrap.village.TradeOffer tradeOffer) { return wrapperContained.method_56715(tradeOffer.wrapperContained); }
// public static java.util.Optional method_56715(yarnwrap.village.TradeOffer tradeOffer, ) { return net.minecraft.village.TradeOffer.method_56715(tradeOffer.wrapperContained); }
// public yarnwrap.village.TradedItem method_56716(yarnwrap.village.TradeOffer tradeOffer) { return new yarnwrap.village.TradedItem(wrapperContained.method_56716(tradeOffer.wrapperContained)); }
// public static yarnwrap.village.TradedItem method_56716(yarnwrap.village.TradeOffer tradeOffer, ) { return new yarnwrap.village.TradedItem(net.minecraft.village.TradeOffer.method_56716(tradeOffer.wrapperContained)); }
// public int getFirstBuyItemCount(yarnwrap.village.TradedItem firstBuyItem) { return wrapperContained.getFirstBuyItemCount(firstBuyItem.wrapperContained); }
// public static int getFirstBuyItemCount(yarnwrap.village.TradedItem firstBuyItem, ) { return net.minecraft.village.TradeOffer.getFirstBuyItemCount(firstBuyItem.wrapperContained); }
public yarnwrap.village.TradedItem getFirstBuyItem() { return new yarnwrap.village.TradedItem(wrapperContained.getFirstBuyItem()); }
// public static yarnwrap.village.TradedItem getFirstBuyItem() { return new yarnwrap.village.TradedItem(net.minecraft.village.TradeOffer.getFirstBuyItem()); }
public java.util.Optional getSecondBuyItem() { return wrapperContained.getSecondBuyItem(); }
// public static java.util.Optional getSecondBuyItem() { return net.minecraft.village.TradeOffer.getSecondBuyItem(); }
public void use() { wrapperContained.use(); }
// public static void use() { net.minecraft.village.TradeOffer.use(); }
public void increaseSpecialPrice(int increment) { wrapperContained.increaseSpecialPrice(increment); }
// public static void increaseSpecialPrice(int increment, ) { net.minecraft.village.TradeOffer.increaseSpecialPrice(increment); }
public yarnwrap.item.ItemStack getOriginalFirstBuyItem() { return new yarnwrap.item.ItemStack(wrapperContained.getOriginalFirstBuyItem()); }
// public static yarnwrap.item.ItemStack getOriginalFirstBuyItem() { return new yarnwrap.item.ItemStack(net.minecraft.village.TradeOffer.getOriginalFirstBuyItem()); }
public yarnwrap.item.ItemStack getDisplayedSecondBuyItem() { return new yarnwrap.item.ItemStack(wrapperContained.getDisplayedSecondBuyItem()); }
// public static yarnwrap.item.ItemStack getDisplayedSecondBuyItem() { return new yarnwrap.item.ItemStack(net.minecraft.village.TradeOffer.getDisplayedSecondBuyItem()); }
public int getMaxUses() { return wrapperContained.getMaxUses(); }
// public static int getMaxUses() { return net.minecraft.village.TradeOffer.getMaxUses(); }
public int getUses() { return wrapperContained.getUses(); }
// public static int getUses() { return net.minecraft.village.TradeOffer.getUses(); }
public yarnwrap.item.ItemStack getSellItem() { return new yarnwrap.item.ItemStack(wrapperContained.getSellItem()); }
// public static yarnwrap.item.ItemStack getSellItem() { return new yarnwrap.item.ItemStack(net.minecraft.village.TradeOffer.getSellItem()); }
public void disable() { wrapperContained.disable(); }
// public static void disable() { net.minecraft.village.TradeOffer.disable(); }
public boolean isDisabled() { return wrapperContained.isDisabled(); }
// public static boolean isDisabled() { return net.minecraft.village.TradeOffer.isDisabled(); }
public boolean shouldRewardPlayerExperience() { return wrapperContained.shouldRewardPlayerExperience(); }
// public static boolean shouldRewardPlayerExperience() { return net.minecraft.village.TradeOffer.shouldRewardPlayerExperience(); }

}