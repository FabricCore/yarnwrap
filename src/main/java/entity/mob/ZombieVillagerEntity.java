package yarnwrap.entity.mob;
public class ZombieVillagerEntity { public net.minecraft.entity.mob.ZombieVillagerEntity wrapperContained; public ZombieVillagerEntity(net.minecraft.entity.mob.ZombieVillagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.TradeOfferList offerData() { return new yarnwrap.village.TradeOfferList(wrapperContained.offerData); }
// public int xp() { return wrapperContained.xp; }
// public yarnwrap.nbt.NbtElement gossipData() { return new yarnwrap.nbt.NbtElement(wrapperContained.gossipData); }
// public int BASE_CONVERSION_DELAY() { return wrapperContained.BASE_CONVERSION_DELAY; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.entity.data.TrackedData VILLAGER_DATA() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VILLAGER_DATA); }
// public java.util.UUID converter() { return wrapperContained.converter; }
// public int conversionTimer() { return wrapperContained.conversionTimer; }
// public yarnwrap.entity.data.TrackedData CONVERTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CONVERTING); }
public void setOfferData(yarnwrap.village.TradeOfferList offerData) { wrapperContained.setOfferData(offerData.wrapperContained); }
public void setXp(int xp) { wrapperContained.setXp(xp); }
public void setGossipData(yarnwrap.nbt.NbtElement gossipData) { wrapperContained.setGossipData(gossipData.wrapperContained); }
public int getXp() { return wrapperContained.getXp(); }
// public int getConversionRate() { return wrapperContained.getConversionRate(); }
// public void finishConversion(yarnwrap.server.world.ServerWorld world) { wrapperContained.finishConversion(world.wrapperContained); }
public boolean isConverting() { return wrapperContained.isConverting(); }
// public void setConverting(java.util.UUID uuid,int delay) { wrapperContained.setConverting(uuid,delay); }

}