package yarnwrap.entity.passive;
public class VillagerEntity { public net.minecraft.entity.passive.VillagerEntity wrapperContained; public VillagerEntity(net.minecraft.entity.passive.VillagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map ITEM_FOOD_VALUES() { return wrapperContained.ITEM_FOOD_VALUES; }
// public java.util.Set GATHERABLE_ITEMS() { return wrapperContained.GATHERABLE_ITEMS; }
// public int levelUpTimer() { return wrapperContained.levelUpTimer; }
// public boolean levelingUp() { return wrapperContained.levelingUp; }
// public yarnwrap.entity.player.PlayerEntity lastCustomer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.lastCustomer); }
// public int foodLevel() { return wrapperContained.foodLevel; }
// public yarnwrap.village.VillagerGossips gossip() { return new yarnwrap.village.VillagerGossips(wrapperContained.gossip); }
// public long gossipStartTime() { return wrapperContained.gossipStartTime; }
// public int experience() { return wrapperContained.experience; }
// public long lastRestockTime() { return wrapperContained.lastRestockTime; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
public java.util.Map POINTS_OF_INTEREST() { return wrapperContained.POINTS_OF_INTEREST; }
// public long lastGossipDecayTime() { return wrapperContained.lastGossipDecayTime; }
// public int restocksToday() { return wrapperContained.restocksToday; }
// public long lastRestockCheckTime() { return wrapperContained.lastRestockCheckTime; }
// public boolean natural() { return wrapperContained.natural; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.entity.data.TrackedData VILLAGER_DATA() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VILLAGER_DATA); }
public void setOffers(yarnwrap.village.TradeOfferList offers) { wrapperContained.setOffers(offers.wrapperContained); }
// public void levelUp() { wrapperContained.levelUp(); }
// public void initBrain(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.initBrain(brain.wrapperContained); }
public void releaseTicketFor(yarnwrap.entity.ai.brain.MemoryModuleType pos) { wrapperContained.releaseTicketFor(pos.wrapperContained); }
public void talkWithVillager(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.VillagerEntity villager,long time) { wrapperContained.talkWithVillager(world.wrapperContained,villager.wrapperContained,time); }
public void reinitializeBrain(yarnwrap.server.world.ServerWorld world) { wrapperContained.reinitializeBrain(world.wrapperContained); }
public void restock() { wrapperContained.restock(); }
public void playWorkSound() { wrapperContained.playWorkSound(); }
// public void consumeAvailableFood() { wrapperContained.consumeAvailableFood(); }
// public void clearSpecialPrices() { wrapperContained.clearSpecialPrices(); }
// public boolean canLevelUp() { return wrapperContained.canLevelUp(); }
// public int getAvailableFood() { return wrapperContained.getAvailableFood(); }
// public void beginTradeWith(yarnwrap.entity.player.PlayerEntity customer) { wrapperContained.beginTradeWith(customer.wrapperContained); }
// public void prepareOffersFor(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.prepareOffersFor(player.wrapperContained); }
// public void depleteFood(int amount) { wrapperContained.depleteFood(amount); }
public boolean hasSeedToPlant() { return wrapperContained.hasSeedToPlant(); }
public void setExperience(int experience) { wrapperContained.setExperience(experience); }
// public void sayNo() { wrapperContained.sayNo(); }
public int getReputation(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.getReputation(player.wrapperContained); }
public boolean canSummonGolem(long time) { return wrapperContained.canSummonGolem(time); }
public void summonGolem(yarnwrap.server.world.ServerWorld world,long time,int requiredCount) { wrapperContained.summonGolem(world.wrapperContained,time,requiredCount); }
// public void notifyDeath(yarnwrap.entity.Entity killer) { wrapperContained.notifyDeath(killer.wrapperContained); }
// public void decayGossip() { wrapperContained.decayGossip(); }
public void eatForBreeding() { wrapperContained.eatForBreeding(); }
// public boolean lacksFood() { return wrapperContained.lacksFood(); }
// public boolean hasRecentlySlept(long worldTime) { return wrapperContained.hasRecentlySlept(worldTime); }
// public void clearDailyRestockCount() { wrapperContained.clearDailyRestockCount(); }
public boolean shouldRestock() { return wrapperContained.shouldRestock(); }
// public boolean needsRestock() { return wrapperContained.needsRestock(); }
// public boolean canRestock() { return wrapperContained.canRestock(); }
public void readGossipDataNbt(yarnwrap.nbt.NbtElement nbt) { wrapperContained.readGossipDataNbt(nbt.wrapperContained); }
public yarnwrap.village.VillagerGossips getGossip() { return new yarnwrap.village.VillagerGossips(wrapperContained.getGossip()); }
// public void restockAndUpdateDemandBonus() { wrapperContained.restockAndUpdateDemandBonus(); }
// public void updateDemandBonus() { wrapperContained.updateDemandBonus(); }
public Object createVillagerAttributes() { return wrapperContained.createVillagerAttributes(); }
public boolean isNatural() { return wrapperContained.isNatural(); }
// public void releaseAllTickets() { wrapperContained.releaseAllTickets(); }
// public void sendOffersToCustomer() { wrapperContained.sendOffersToCustomer(); }
public boolean wantsToStartBreeding() { return wrapperContained.wantsToStartBreeding(); }
public boolean canBreed() { return wrapperContained.canBreed(); }

}