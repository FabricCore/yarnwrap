package yarnwrap.entity.mob;
public class ZombieVillagerEntity { public net.minecraft.entity.mob.ZombieVillagerEntity wrapperContained; public ZombieVillagerEntity(net.minecraft.entity.mob.ZombieVillagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.TradeOfferList offerData() { return new yarnwrap.village.TradeOfferList(wrapperContained.offerData); }
// public void offerData(yarnwrap.village.TradeOfferList value) { wrapperContained.offerData = value.wrapperContained; }
// public int xp() { return wrapperContained.xp; }
// public void xp(int value) { wrapperContained.xp = value; }
// public yarnwrap.nbt.NbtElement gossipData() { return new yarnwrap.nbt.NbtElement(wrapperContained.gossipData); }
// public void gossipData(yarnwrap.nbt.NbtElement value) { wrapperContained.gossipData = value.wrapperContained; }
// public int BASE_CONVERSION_DELAY() { return wrapperContained.BASE_CONVERSION_DELAY; }
// public void BASE_CONVERSION_DELAY(int value) { wrapperContained.BASE_CONVERSION_DELAY = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.entity.data.TrackedData VILLAGER_DATA() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VILLAGER_DATA); }
// public void VILLAGER_DATA(yarnwrap.entity.data.TrackedData value) { wrapperContained.VILLAGER_DATA = value.wrapperContained; }
// public java.util.UUID converter() { return wrapperContained.converter; }
// public void converter(java.util.UUID value) { wrapperContained.converter = value; }
// public int conversionTimer() { return wrapperContained.conversionTimer; }
// public void conversionTimer(int value) { wrapperContained.conversionTimer = value; }
// public yarnwrap.entity.data.TrackedData CONVERTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CONVERTING); }
// public void CONVERTING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CONVERTING = value.wrapperContained; }
public void setOfferData(yarnwrap.village.TradeOfferList offerData) { wrapperContained.setOfferData(offerData.wrapperContained); }
public void setXp(int xp) { wrapperContained.setXp(xp); }
public void setGossipData(yarnwrap.nbt.NbtElement gossipData) { wrapperContained.setGossipData(gossipData.wrapperContained); }
public int getXp() { return wrapperContained.getXp(); }
// public void method_40125(Object profession) { wrapperContained.method_40125(profession); }
// public void method_56681(yarnwrap.village.TradeOfferList offerData) { wrapperContained.method_56681(offerData.wrapperContained); }
// public boolean method_60978(yarnwrap.item.ItemStack stack) { return wrapperContained.method_60978(stack.wrapperContained); }
// public int getConversionRate() { return wrapperContained.getConversionRate(); }
// public void finishConversion(yarnwrap.server.world.ServerWorld world) { wrapperContained.finishConversion(world.wrapperContained); }
public boolean isConverting() { return wrapperContained.isConverting(); }
// public void setConverting(java.util.UUID uuid,int delay) { wrapperContained.setConverting(uuid,delay); }

}