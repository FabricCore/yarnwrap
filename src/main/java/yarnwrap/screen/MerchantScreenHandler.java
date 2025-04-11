package yarnwrap.screen;
public class MerchantScreenHandler { public net.minecraft.screen.MerchantScreenHandler wrapperContained; public MerchantScreenHandler(net.minecraft.screen.MerchantScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int levelProgress() { return wrapperContained.levelProgress; }
// public void levelProgress(int value) { wrapperContained.levelProgress = value; }
// public boolean leveled() { return wrapperContained.leveled; }
// public void leveled(boolean value) { wrapperContained.leveled = value; }
// public boolean canRefreshTrades() { return wrapperContained.canRefreshTrades; }
// public void canRefreshTrades(boolean value) { wrapperContained.canRefreshTrades = value; }
// public int INPUT_1_ID() { return wrapperContained.INPUT_1_ID; }
// public void INPUT_1_ID(int value) { wrapperContained.INPUT_1_ID = value; }
// public int INPUT_2_ID() { return wrapperContained.INPUT_2_ID; }
// public void INPUT_2_ID(int value) { wrapperContained.INPUT_2_ID = value; }
// public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public void OUTPUT_ID(int value) { wrapperContained.OUTPUT_ID = value; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public int INPUT_1_X() { return wrapperContained.INPUT_1_X; }
// public void INPUT_1_X(int value) { wrapperContained.INPUT_1_X = value; }
// public int INPUT_2_X() { return wrapperContained.INPUT_2_X; }
// public void INPUT_2_X(int value) { wrapperContained.INPUT_2_X = value; }
// public int OUTPUT_X() { return wrapperContained.OUTPUT_X; }
// public void OUTPUT_X(int value) { wrapperContained.OUTPUT_X = value; }
// public int SLOT_Y() { return wrapperContained.SLOT_Y; }
// public void SLOT_Y(int value) { wrapperContained.SLOT_Y = value; }
// public yarnwrap.village.MerchantInventory merchantInventory() { return new yarnwrap.village.MerchantInventory(wrapperContained.merchantInventory); }
// public void merchantInventory(yarnwrap.village.MerchantInventory value) { wrapperContained.merchantInventory = value.wrapperContained; }
// public yarnwrap.village.Merchant merchant() { return new yarnwrap.village.Merchant(wrapperContained.merchant); }
// public void merchant(yarnwrap.village.Merchant value) { wrapperContained.merchant = value.wrapperContained; }
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