package yarnwrap.screen;
public class AbstractRecipeScreenHandler { public net.minecraft.screen.AbstractRecipeScreenHandler wrapperContained; public AbstractRecipeScreenHandler(net.minecraft.screen.AbstractRecipeScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void fillInputSlots(boolean craftAll,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.fillInputSlots(craftAll,recipe.wrapperContained,player.wrapperContained); }
public yarnwrap.recipe.book.RecipeBookCategory getCategory() { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.getCategory()); }
public boolean canInsertIntoSlot(int index) { return wrapperContained.canInsertIntoSlot(index); }
// public void onInputSlotFillStart() { wrapperContained.onInputSlotFillStart(); }
// public void onInputSlotFillFinish(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.onInputSlotFillFinish(recipe.wrapperContained); }
public boolean matches(yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.matches(recipe.wrapperContained); }
public int getCraftingWidth() { return wrapperContained.getCraftingWidth(); }
public void populateRecipeFinder(yarnwrap.recipe.RecipeMatcher finder) { wrapperContained.populateRecipeFinder(finder.wrapperContained); }
public int getCraftingResultSlotIndex() { return wrapperContained.getCraftingResultSlotIndex(); }
public int getCraftingHeight() { return wrapperContained.getCraftingHeight(); }
public void clearCraftingSlots() { wrapperContained.clearCraftingSlots(); }
public int getCraftingSlotCount() { return wrapperContained.getCraftingSlotCount(); }

}