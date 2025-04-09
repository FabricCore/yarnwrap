package yarnwrap.screen;
public class MerchantScreenHandler { public net.minecraft.screen.MerchantScreenHandler wrapperContained; public MerchantScreenHandler(net.minecraft.screen.MerchantScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int levelProgress() { return wrapperContained.levelProgress; }
// public boolean leveled() { return wrapperContained.leveled; }
// public boolean canRefreshTrades() { return wrapperContained.canRefreshTrades; }
// public int INPUT_1_ID() { return wrapperContained.INPUT_1_ID; }
// public int INPUT_2_ID() { return wrapperContained.INPUT_2_ID; }
// public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public int INPUT_1_X() { return wrapperContained.INPUT_1_X; }
// public int INPUT_2_X() { return wrapperContained.INPUT_2_X; }
// public int OUTPUT_X() { return wrapperContained.OUTPUT_X; }
// public int SLOT_Y() { return wrapperContained.SLOT_Y; }
// public yarnwrap.village.MerchantInventory merchantInventory() { return new yarnwrap.village.MerchantInventory(wrapperContained.merchantInventory); }
// public yarnwrap.village.Merchant merchant() { return new yarnwrap.village.Merchant(wrapperContained.merchant); }
public void setOffers(yarnwrap.village.TradeOfferList offers) { wrapperContained.setOffers(offers.wrapperContained); }
public yarnwrap.village.TradeOfferList getRecipes() { return new yarnwrap.village.TradeOfferList(wrapperContained.getRecipes()); }
public void setLeveled(boolean leveled) { wrapperContained.setLeveled(leveled); }
public int getExperience() { return wrapperContained.getExperience(); }
public void setExperienceFromServer(int experience) { wrapperContained.setExperienceFromServer(experience); }
public int getMerchantRewardedExperience() { return wrapperContained.getMerchantRewardedExperience(); }
public void setLevelProgress(int levelProgress) { wrapperContained.setLevelProgress(levelProgress); }
public int getLevelProgress() { return wrapperContained.getLevelProgress(); }
public boolean isLeveled() { return wrapperContained.isLeveled(); }
// public void autofill(int slot,yarnwrap.village.TradedItem stack) { wrapperContained.autofill(slot,stack.wrapperContained); }
public void switchTo(int recipeIndex) { wrapperContained.switchTo(recipeIndex); }
// public void playYesSound() { wrapperContained.playYesSound(); }
public void setCanRefreshTrades(boolean canRefreshTrades) { wrapperContained.setCanRefreshTrades(canRefreshTrades); }
// public boolean canRefreshTrades() { return wrapperContained.canRefreshTrades(); }
public void setRecipeIndex(int index) { wrapperContained.setRecipeIndex(index); }

}