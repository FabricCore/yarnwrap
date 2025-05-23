package yarnwrap.entity.passive;
public class MerchantEntity { public net.minecraft.entity.passive.MerchantEntity wrapperContained; public MerchantEntity(net.minecraft.entity.passive.MerchantEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.TradeOfferList offers() { return new yarnwrap.village.TradeOfferList(wrapperContained.offers); }
// public void offers(yarnwrap.village.TradeOfferList value) { wrapperContained.offers = value.wrapperContained; }
// public static yarnwrap.village.TradeOfferList offers() { return new yarnwrap.village.TradeOfferList(net.minecraft.entity.passive.MerchantEntity.offers); }
// public static void offers(yarnwrap.village.TradeOfferList value, ) { net.minecraft.entity.passive.MerchantEntity.offers = value.wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity customer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.customer); }
// public void customer(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.customer = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity customer() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.entity.passive.MerchantEntity.customer); }
// public static void customer(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.entity.passive.MerchantEntity.customer = value.wrapperContained; }

// public yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.SimpleInventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(net.minecraft.entity.passive.MerchantEntity.inventory); }
// public static void inventory(yarnwrap.inventory.SimpleInventory value, ) { net.minecraft.entity.passive.MerchantEntity.inventory = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData HEAD_ROLLING_TIME_LEFT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HEAD_ROLLING_TIME_LEFT); }
// public void HEAD_ROLLING_TIME_LEFT(yarnwrap.entity.data.TrackedData value) { wrapperContained.HEAD_ROLLING_TIME_LEFT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData HEAD_ROLLING_TIME_LEFT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.MerchantEntity.HEAD_ROLLING_TIME_LEFT); }
// public static void HEAD_ROLLING_TIME_LEFT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.MerchantEntity.HEAD_ROLLING_TIME_LEFT = value.wrapperContained; }

// public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public void INVENTORY_SIZE(int value) { wrapperContained.INVENTORY_SIZE = value; }
// public static int INVENTORY_SIZE() { return net.minecraft.entity.passive.MerchantEntity.INVENTORY_SIZE; }
// public static void INVENTORY_SIZE(int value, ) { net.minecraft.entity.passive.MerchantEntity.INVENTORY_SIZE = value; }

// public void fillRecipes() { wrapperContained.fillRecipes(); }
// public static void fillRecipes() { net.minecraft.entity.passive.MerchantEntity.fillRecipes(); }
// public void produceParticles(yarnwrap.particle.ParticleEffect parameters) { wrapperContained.produceParticles(parameters.wrapperContained); }
// public static void produceParticles(yarnwrap.particle.ParticleEffect parameters, ) { net.minecraft.entity.passive.MerchantEntity.produceParticles(parameters.wrapperContained); }
// public void afterUsing(yarnwrap.village.TradeOffer offer) { wrapperContained.afterUsing(offer.wrapperContained); }
// public static void afterUsing(yarnwrap.village.TradeOffer offer, ) { net.minecraft.entity.passive.MerchantEntity.afterUsing(offer.wrapperContained); }
public boolean hasCustomer() { return wrapperContained.hasCustomer(); }
// public static boolean hasCustomer() { return net.minecraft.entity.passive.MerchantEntity.hasCustomer(); }
// public yarnwrap.sound.SoundEvent getTradingSound(boolean sold) { return new yarnwrap.sound.SoundEvent(wrapperContained.getTradingSound(sold)); }
// public static yarnwrap.sound.SoundEvent getTradingSound(boolean sold, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.MerchantEntity.getTradingSound(sold)); }
// public void fillRecipesFromPool(yarnwrap.village.TradeOfferList recipeList,Object[] pool,int count) { wrapperContained.fillRecipesFromPool(recipeList.wrapperContained,pool,count); }
// public static void fillRecipesFromPool(yarnwrap.village.TradeOfferList recipeList,Object[] pool,int count, ) { net.minecraft.entity.passive.MerchantEntity.fillRecipesFromPool(recipeList.wrapperContained,pool,count); }
// public void resetCustomer() { wrapperContained.resetCustomer(); }
// public static void resetCustomer() { net.minecraft.entity.passive.MerchantEntity.resetCustomer(); }
public void playCelebrateSound() { wrapperContained.playCelebrateSound(); }
// public static void playCelebrateSound() { net.minecraft.entity.passive.MerchantEntity.playCelebrateSound(); }
public int getHeadRollingTimeLeft() { return wrapperContained.getHeadRollingTimeLeft(); }
// public static int getHeadRollingTimeLeft() { return net.minecraft.entity.passive.MerchantEntity.getHeadRollingTimeLeft(); }
public void setHeadRollingTimeLeft(int ticks) { wrapperContained.setHeadRollingTimeLeft(ticks); }
// public static void setHeadRollingTimeLeft(int ticks, ) { net.minecraft.entity.passive.MerchantEntity.setHeadRollingTimeLeft(ticks); }

}