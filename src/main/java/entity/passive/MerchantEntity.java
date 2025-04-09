package yarnwrap.entity.passive;
public class MerchantEntity { public net.minecraft.entity.passive.MerchantEntity wrapperContained; public MerchantEntity(net.minecraft.entity.passive.MerchantEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.TradeOfferList offers() { return new yarnwrap.village.TradeOfferList(wrapperContained.offers); }
// public yarnwrap.entity.player.PlayerEntity customer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.customer); }
// public yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.inventory); }
// public yarnwrap.entity.data.TrackedData HEAD_ROLLING_TIME_LEFT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HEAD_ROLLING_TIME_LEFT); }
// public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
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