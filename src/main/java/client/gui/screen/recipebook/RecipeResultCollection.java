package yarnwrap.client.gui.screen.recipebook;
public class RecipeResultCollection { public net.minecraft.client.gui.screen.recipebook.RecipeResultCollection wrapperContained; public RecipeResultCollection(net.minecraft.client.gui.screen.recipebook.RecipeResultCollection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List recipes() { return wrapperContained.recipes; }
// public java.util.Set fittingRecipes() { return wrapperContained.fittingRecipes; }
// public java.util.Set craftableRecipes() { return wrapperContained.craftableRecipes; }
// public java.util.Set unlockedRecipes() { return wrapperContained.unlockedRecipes; }
// public boolean singleOutput() { return wrapperContained.singleOutput; }
// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
public void initialize(yarnwrap.recipe.book.RecipeBook recipeBook) { wrapperContained.initialize(recipeBook.wrapperContained); }
public java.util.List getRecipes(boolean craftable) { return wrapperContained.getRecipes(craftable); }
public void computeCraftables(yarnwrap.recipe.RecipeMatcher recipeFinder,int gridWidth,int gridHeight,yarnwrap.recipe.book.RecipeBook recipeBook) { wrapperContained.computeCraftables(recipeFinder.wrapperContained,gridWidth,gridHeight,recipeBook.wrapperContained); }
public java.util.List getAllRecipes() { return wrapperContained.getAllRecipes(); }
public java.util.List getResults(boolean craftableOnly) { return wrapperContained.getResults(craftableOnly); }
public boolean isInitialized() { return wrapperContained.isInitialized(); }
public boolean isCraftable(yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.isCraftable(recipe.wrapperContained); }
public boolean hasCraftableRecipes() { return wrapperContained.hasCraftableRecipes(); }
public boolean hasSingleOutput() { return wrapperContained.hasSingleOutput(); }
public boolean hasFittingRecipes() { return wrapperContained.hasFittingRecipes(); }
// public boolean shouldHaveSingleOutput(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List recipes) { return wrapperContained.shouldHaveSingleOutput(registryManager.wrapperContained,recipes); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }

}