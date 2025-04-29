package yarnwrap.client.gui.screen.recipebook;
public class RecipeResultCollection { public net.minecraft.client.gui.screen.recipebook.RecipeResultCollection wrapperContained; public RecipeResultCollection(net.minecraft.client.gui.screen.recipebook.RecipeResultCollection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.List value) { wrapperContained.recipes = value; }
// public static java.util.List recipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.recipes; }
// public static void recipes(java.util.List value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.recipes = value; }

// public java.util.Set fittingRecipes() { return wrapperContained.fittingRecipes; }
// public void fittingRecipes(java.util.Set value) { wrapperContained.fittingRecipes = value; }
// public static java.util.Set fittingRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.fittingRecipes; }
// public static void fittingRecipes(java.util.Set value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.fittingRecipes = value; }

// public java.util.Set craftableRecipes() { return wrapperContained.craftableRecipes; }
// public void craftableRecipes(java.util.Set value) { wrapperContained.craftableRecipes = value; }
// public static java.util.Set craftableRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.craftableRecipes; }
// public static void craftableRecipes(java.util.Set value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.craftableRecipes = value; }

// public java.util.Set unlockedRecipes() { return wrapperContained.unlockedRecipes; }
// public void unlockedRecipes(java.util.Set value) { wrapperContained.unlockedRecipes = value; }
// public static java.util.Set unlockedRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.unlockedRecipes; }
// public static void unlockedRecipes(java.util.Set value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.unlockedRecipes = value; }

// public boolean singleOutput() { return wrapperContained.singleOutput; }
// public void singleOutput(boolean value) { wrapperContained.singleOutput = value; }
// public static boolean singleOutput() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.singleOutput; }
// public static void singleOutput(boolean value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.singleOutput = value; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public static yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.registryManager); }
// public static void registryManager(yarnwrap.registry.DynamicRegistryManager value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.registryManager = value.wrapperContained; }

public RecipeResultCollection(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List recipes) { this.wrapperContained = new net.minecraft.client.gui.screen.recipebook.RecipeResultCollection(registryManager.wrapperContained,recipes); }
public void initialize(yarnwrap.recipe.book.RecipeBook recipeBook) { wrapperContained.initialize(recipeBook.wrapperContained); }
// public static void initialize(yarnwrap.recipe.book.RecipeBook recipeBook, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.initialize(recipeBook.wrapperContained); }
public java.util.List getRecipes(boolean craftable) { return wrapperContained.getRecipes(craftable); }
// public static java.util.List getRecipes(boolean craftable, ) { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.getRecipes(craftable); }
public void computeCraftables(yarnwrap.recipe.RecipeMatcher recipeFinder,int gridWidth,int gridHeight,yarnwrap.recipe.book.RecipeBook recipeBook) { wrapperContained.computeCraftables(recipeFinder.wrapperContained,gridWidth,gridHeight,recipeBook.wrapperContained); }
// public static void computeCraftables(yarnwrap.recipe.RecipeMatcher recipeFinder,int gridWidth,int gridHeight,yarnwrap.recipe.book.RecipeBook recipeBook, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.computeCraftables(recipeFinder.wrapperContained,gridWidth,gridHeight,recipeBook.wrapperContained); }
public java.util.List getAllRecipes() { return wrapperContained.getAllRecipes(); }
// public static java.util.List getAllRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.getAllRecipes(); }
public java.util.List getResults(boolean craftableOnly) { return wrapperContained.getResults(craftableOnly); }
// public static java.util.List getResults(boolean craftableOnly, ) { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.getResults(craftableOnly); }
public boolean isInitialized() { return wrapperContained.isInitialized(); }
// public static boolean isInitialized() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.isInitialized(); }
public boolean isCraftable(yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.isCraftable(recipe.wrapperContained); }
// public static boolean isCraftable(yarnwrap.recipe.RecipeEntry recipe, ) { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.isCraftable(recipe.wrapperContained); }
public boolean hasCraftableRecipes() { return wrapperContained.hasCraftableRecipes(); }
// public static boolean hasCraftableRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.hasCraftableRecipes(); }
public boolean hasSingleOutput() { return wrapperContained.hasSingleOutput(); }
// public static boolean hasSingleOutput() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.hasSingleOutput(); }
public boolean hasFittingRecipes() { return wrapperContained.hasFittingRecipes(); }
// public static boolean hasFittingRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.hasFittingRecipes(); }
// public boolean shouldHaveSingleOutput(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List recipes) { return wrapperContained.shouldHaveSingleOutput(registryManager.wrapperContained,recipes); }
// public static boolean shouldHaveSingleOutput(yarnwrap.registry.DynamicRegistryManager registryManager,java.util.List recipes, ) { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.shouldHaveSingleOutput(registryManager.wrapperContained,recipes); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
// public static yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.getRegistryManager()); }

}