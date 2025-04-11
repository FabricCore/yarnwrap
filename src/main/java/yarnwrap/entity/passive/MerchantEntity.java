package yarnwrap.entity.passive;
public class MerchantEntity { public net.minecraft.entity.passive.MerchantEntity wrapperContained; public MerchantEntity(net.minecraft.entity.passive.MerchantEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.TradeOfferList offers() { return new yarnwrap.village.TradeOfferList(wrapperContained.offers); }
// public void offers(yarnwrap.village.TradeOfferList value) { wrapperContained.offers = value.wrapperContained; }
// public yarnwrap.entity.player.PlayerEntity customer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.customer); }
// public void customer(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.customer = value.wrapperContained; }
// public yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.SimpleInventory value) { wrapperContained.inventory = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData HEAD_ROLLING_TIME_LEFT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HEAD_ROLLING_TIME_LEFT); }
// public void HEAD_ROLLING_TIME_LEFT(yarnwrap.entity.data.TrackedData value) { wrapperContained.HEAD_ROLLING_TIME_LEFT = value.wrapperContained; }
// public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public void INVENTORY_SIZE(int value) { wrapperContained.INVENTORY_SIZE = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public void produceParticles(yarnwrap.particle.ParticleEffect parameters) { wrapperContained.produceParticles(parameters.wrapperContained); }
// public void afterUsing(yarnwrap.village.TradeOffer offer) { wrapperContained.afterUsing(offer.wrapperContained); }
public boolean hasCustomer() { return wrapperContained.hasCustomer(); }
// public yarnwrap.sound.SoundEvent getTradingSound(boolean sold) { return new yarnwrap.sound.SoundEvent(wrapperContained.getTradingSound(sold)); }
// public void fillRecipesFromPool(yarnwrap.village.TradeOfferList recipeList,Object[] pool,int count) { wrapperContained.fillRecipesFromPool(recipeList.wrapperContained,pool,count); }
// public void resetCustomer() { wrapperContained.resetCustomer(); }
public void playCelebrateSound() { wrapperContained.playCelebrateSound(); }
public int getHeadRollingTimeLeft() { return wrapperContained.getHeadRollingTimeLeft(); }
public void setHeadRollingTimeLeft(int ticks) { wrapperContained.setHeadRollingTimeLeft(ticks); }
// public void fillRecipes() { wrapperContained.fillRecipes(); }

}