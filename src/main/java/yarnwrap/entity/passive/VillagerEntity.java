package yarnwrap.entity.passive;
public class VillagerEntity { public net.minecraft.entity.passive.VillagerEntity wrapperContained; public VillagerEntity(net.minecraft.entity.passive.VillagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map ITEM_FOOD_VALUES() { return wrapperContained.ITEM_FOOD_VALUES; }
// public void ITEM_FOOD_VALUES(java.util.Map value) { wrapperContained.ITEM_FOOD_VALUES = value; }
// public java.util.Set GATHERABLE_ITEMS() { return wrapperContained.GATHERABLE_ITEMS; }
// public void GATHERABLE_ITEMS(java.util.Set value) { wrapperContained.GATHERABLE_ITEMS = value; }
// public int levelUpTimer() { return wrapperContained.levelUpTimer; }
// public void levelUpTimer(int value) { wrapperContained.levelUpTimer = value; }
// public boolean levelingUp() { return wrapperContained.levelingUp; }
// public void levelingUp(boolean value) { wrapperContained.levelingUp = value; }
// public yarnwrap.entity.player.PlayerEntity lastCustomer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.lastCustomer); }
// public void lastCustomer(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.lastCustomer = value.wrapperContained; }
// public int foodLevel() { return wrapperContained.foodLevel; }
// public void foodLevel(int value) { wrapperContained.foodLevel = value; }
// public yarnwrap.village.VillagerGossips gossip() { return new yarnwrap.village.VillagerGossips(wrapperContained.gossip); }
// public void gossip(yarnwrap.village.VillagerGossips value) { wrapperContained.gossip = value.wrapperContained; }
// public long gossipStartTime() { return wrapperContained.gossipStartTime; }
// public void gossipStartTime(long value) { wrapperContained.gossipStartTime = value; }
// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public long lastRestockTime() { return wrapperContained.lastRestockTime; }
// public void lastRestockTime(long value) { wrapperContained.lastRestockTime = value; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULES = value; }
// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(com.google.common.collect.ImmutableList value) { wrapperContained.SENSORS = value; }
public java.util.Map POINTS_OF_INTEREST() { return wrapperContained.POINTS_OF_INTEREST; }
// public void POINTS_OF_INTEREST(java.util.Map value) { wrapperContained.POINTS_OF_INTEREST = value; }
// public long lastGossipDecayTime() { return wrapperContained.lastGossipDecayTime; }
// public void lastGossipDecayTime(long value) { wrapperContained.lastGossipDecayTime = value; }
// public int restocksToday() { return wrapperContained.restocksToday; }
// public void restocksToday(int value) { wrapperContained.restocksToday = value; }
// public long lastRestockCheckTime() { return wrapperContained.lastRestockCheckTime; }
// public void lastRestockCheckTime(long value) { wrapperContained.lastRestockCheckTime = value; }
// public boolean natural() { return wrapperContained.natural; }
// public void natural(boolean value) { wrapperContained.natural = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.entity.data.TrackedData VILLAGER_DATA() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VILLAGER_DATA); }
// public void VILLAGER_DATA(yarnwrap.entity.data.TrackedData value) { wrapperContained.VILLAGER_DATA = value.wrapperContained; }
public VillagerEntity(yarnwrap.entity.EntityType entityType,yarnwrap.world.World world,yarnwrap.village.VillagerType type) { this.wrapperContained = new net.minecraft.entity.passive.VillagerEntity(entityType.wrapperContained,world.wrapperContained,type.wrapperContained); }
public void setOffers(yarnwrap.village.TradeOfferList offers) { wrapperContained.setOffers(offers.wrapperContained); }
// public void levelUp() { wrapperContained.levelUp(); }
// public int method_19172(yarnwrap.inventory.SimpleInventory item) { return wrapperContained.method_19172(item.wrapperContained); }
// public void initBrain(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.initBrain(brain.wrapperContained); }
public void releaseTicketFor(yarnwrap.entity.ai.brain.MemoryModuleType pos) { wrapperContained.releaseTicketFor(pos.wrapperContained); }
public void talkWithVillager(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.VillagerEntity villager,long time) { wrapperContained.talkWithVillager(world.wrapperContained,villager.wrapperContained,time); }
// public void method_19178(yarnwrap.server.MinecraftServer posx) { wrapperContained.method_19178(posx.wrapperContained); }
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
// public boolean method_19520(yarnwrap.entity.passive.VillagerEntity villager) { return wrapperContained.method_19520(villager.wrapperContained); }
// public boolean method_19521(yarnwrap.entity.passive.VillagerEntity villager) { return wrapperContained.method_19521(villager.wrapperContained); }
// public boolean method_19522(yarnwrap.entity.passive.VillagerEntity villager) { return wrapperContained.method_19522(villager.wrapperContained); }
public boolean hasSeedToPlant() { return wrapperContained.hasSeedToPlant(); }
public void setExperience(int experience) { wrapperContained.setExperience(experience); }
// public void sayNo() { wrapperContained.sayNo(); }
// public boolean method_20593(yarnwrap.village.VillageGossipType gossipType) { return wrapperContained.method_20593(gossipType.wrapperContained); }
public int getReputation(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.getReputation(player.wrapperContained); }
public boolean canSummonGolem(long time) { return wrapperContained.canSummonGolem(time); }
public void summonGolem(yarnwrap.server.world.ServerWorld world,long time,int requiredCount) { wrapperContained.summonGolem(world.wrapperContained,time,requiredCount); }
// public void notifyDeath(yarnwrap.entity.Entity killer) { wrapperContained.notifyDeath(killer.wrapperContained); }
// public boolean method_20693(long villager) { return wrapperContained.method_20693(villager); }
// public void decayGossip() { wrapperContained.decayGossip(); }
public void eatForBreeding() { wrapperContained.eatForBreeding(); }
// public boolean lacksFood() { return wrapperContained.lacksFood(); }
// public void method_20699(yarnwrap.server.world.ServerWorld observer) { wrapperContained.method_20699(observer.wrapperContained); }
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
// public boolean method_29278(yarnwrap.entity.passive.VillagerEntity villager) { return wrapperContained.method_29278(villager.wrapperContained); }
public boolean isNatural() { return wrapperContained.isNatural(); }
// public void releaseAllTickets() { wrapperContained.releaseAllTickets(); }
// public void sendOffersToCustomer() { wrapperContained.sendOffersToCustomer(); }
// public boolean method_51304(yarnwrap.item.ItemStack stack) { return wrapperContained.method_51304(stack.wrapperContained); }
// public void method_56683(yarnwrap.village.VillagerData villagerData) { wrapperContained.method_56683(villagerData.wrapperContained); }
public boolean wantsToStartBreeding() { return wrapperContained.wantsToStartBreeding(); }
public boolean canBreed() { return wrapperContained.canBreed(); }

}