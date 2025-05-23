package yarnwrap.entity.mob;
public class ZombieVillagerEntity { public net.minecraft.entity.mob.ZombieVillagerEntity wrapperContained; public ZombieVillagerEntity(net.minecraft.entity.mob.ZombieVillagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData VILLAGER_DATA() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VILLAGER_DATA); }
// public void VILLAGER_DATA(yarnwrap.entity.data.TrackedData value) { wrapperContained.VILLAGER_DATA = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VILLAGER_DATA() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.ZombieVillagerEntity.VILLAGER_DATA); }
// public static void VILLAGER_DATA(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.VILLAGER_DATA = value.wrapperContained; }

// public java.util.UUID converter() { return wrapperContained.converter; }
// public void converter(java.util.UUID value) { wrapperContained.converter = value; }
// public static java.util.UUID converter() { return net.minecraft.entity.mob.ZombieVillagerEntity.converter; }
// public static void converter(java.util.UUID value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.converter = value; }

// public int conversionTimer() { return wrapperContained.conversionTimer; }
// public void conversionTimer(int value) { wrapperContained.conversionTimer = value; }
// public static int conversionTimer() { return net.minecraft.entity.mob.ZombieVillagerEntity.conversionTimer; }
// public static void conversionTimer(int value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.conversionTimer = value; }

// public yarnwrap.entity.data.TrackedData CONVERTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CONVERTING); }
// public void CONVERTING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CONVERTING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CONVERTING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.ZombieVillagerEntity.CONVERTING); }
// public static void CONVERTING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.CONVERTING = value.wrapperContained; }

// public yarnwrap.village.TradeOfferList offerData() { return new yarnwrap.village.TradeOfferList(wrapperContained.offerData); }
// public void offerData(yarnwrap.village.TradeOfferList value) { wrapperContained.offerData = value.wrapperContained; }
// public static yarnwrap.village.TradeOfferList offerData() { return new yarnwrap.village.TradeOfferList(net.minecraft.entity.mob.ZombieVillagerEntity.offerData); }
// public static void offerData(yarnwrap.village.TradeOfferList value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.offerData = value.wrapperContained; }

// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public static int experience() { return net.minecraft.entity.mob.ZombieVillagerEntity.experience; }
// public static void experience(int value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.experience = value; }

// public yarnwrap.village.VillagerGossips gossip() { return new yarnwrap.village.VillagerGossips(wrapperContained.gossip); }
// public void gossip(yarnwrap.village.VillagerGossips value) { wrapperContained.gossip = value.wrapperContained; }
// public static yarnwrap.village.VillagerGossips gossip() { return new yarnwrap.village.VillagerGossips(net.minecraft.entity.mob.ZombieVillagerEntity.gossip); }
// public static void gossip(yarnwrap.village.VillagerGossips value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.gossip = value.wrapperContained; }

// public int BASE_CONVERSION_DELAY() { return wrapperContained.BASE_CONVERSION_DELAY; }
// public void BASE_CONVERSION_DELAY(int value) { wrapperContained.BASE_CONVERSION_DELAY = value; }
// public static int BASE_CONVERSION_DELAY() { return net.minecraft.entity.mob.ZombieVillagerEntity.BASE_CONVERSION_DELAY; }
// public static void BASE_CONVERSION_DELAY(int value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.BASE_CONVERSION_DELAY = value; }

// public int DEFAULT_CONVERSION_TIME() { return wrapperContained.DEFAULT_CONVERSION_TIME; }
// public void DEFAULT_CONVERSION_TIME(int value) { wrapperContained.DEFAULT_CONVERSION_TIME = value; }
// public static int DEFAULT_CONVERSION_TIME() { return net.minecraft.entity.mob.ZombieVillagerEntity.DEFAULT_CONVERSION_TIME; }
// public static void DEFAULT_CONVERSION_TIME(int value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.DEFAULT_CONVERSION_TIME = value; }

// public int DEFAULT_EXPERIENCE() { return wrapperContained.DEFAULT_EXPERIENCE; }
// public void DEFAULT_EXPERIENCE(int value) { wrapperContained.DEFAULT_EXPERIENCE = value; }
// public static int DEFAULT_EXPERIENCE() { return net.minecraft.entity.mob.ZombieVillagerEntity.DEFAULT_EXPERIENCE; }
// public static void DEFAULT_EXPERIENCE(int value, ) { net.minecraft.entity.mob.ZombieVillagerEntity.DEFAULT_EXPERIENCE = value; }

// public int getConversionRate() { return wrapperContained.getConversionRate(); }
// public static int getConversionRate() { return net.minecraft.entity.mob.ZombieVillagerEntity.getConversionRate(); }
// public void finishConversion(yarnwrap.server.world.ServerWorld world) { wrapperContained.finishConversion(world.wrapperContained); }
// public static void finishConversion(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.mob.ZombieVillagerEntity.finishConversion(world.wrapperContained); }
public boolean isConverting() { return wrapperContained.isConverting(); }
// public static boolean isConverting() { return net.minecraft.entity.mob.ZombieVillagerEntity.isConverting(); }
// public void setConverting(java.util.UUID uuid,int delay) { wrapperContained.setConverting(uuid,delay); }
// public static void setConverting(java.util.UUID uuid,int delay, ) { net.minecraft.entity.mob.ZombieVillagerEntity.setConverting(uuid,delay); }
public void setOfferData(yarnwrap.village.TradeOfferList offerData) { wrapperContained.setOfferData(offerData.wrapperContained); }
// public static void setOfferData(yarnwrap.village.TradeOfferList offerData, ) { net.minecraft.entity.mob.ZombieVillagerEntity.setOfferData(offerData.wrapperContained); }
public void setExperience(int experience) { wrapperContained.setExperience(experience); }
// public static void setExperience(int experience, ) { net.minecraft.entity.mob.ZombieVillagerEntity.setExperience(experience); }
public void setGossip(yarnwrap.village.VillagerGossips gossip) { wrapperContained.setGossip(gossip.wrapperContained); }
// public static void setGossip(yarnwrap.village.VillagerGossips gossip, ) { net.minecraft.entity.mob.ZombieVillagerEntity.setGossip(gossip.wrapperContained); }
public int getExperience() { return wrapperContained.getExperience(); }
// public static int getExperience() { return net.minecraft.entity.mob.ZombieVillagerEntity.getExperience(); }
// public boolean method_60978(yarnwrap.item.ItemStack stack) { return wrapperContained.method_60978(stack.wrapperContained); }
// public static boolean method_60978(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.mob.ZombieVillagerEntity.method_60978(stack.wrapperContained); }
// public void method_63659(yarnwrap.server.world.ServerWorld villager) { wrapperContained.method_63659(villager.wrapperContained); }
// public static void method_63659(yarnwrap.server.world.ServerWorld villager, ) { net.minecraft.entity.mob.ZombieVillagerEntity.method_63659(villager.wrapperContained); }
public void setConversionTimer(int conversionTimer) { wrapperContained.setConversionTimer(conversionTimer); }
// public static void setConversionTimer(int conversionTimer, ) { net.minecraft.entity.mob.ZombieVillagerEntity.setConversionTimer(conversionTimer); }

}