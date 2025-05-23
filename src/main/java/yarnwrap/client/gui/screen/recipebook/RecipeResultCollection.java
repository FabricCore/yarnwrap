package yarnwrap.client.gui.screen.recipebook;
public class RecipeResultCollection { public net.minecraft.client.gui.screen.recipebook.RecipeResultCollection wrapperContained; public RecipeResultCollection(net.minecraft.client.gui.screen.recipebook.RecipeResultCollection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set craftableRecipes() { return wrapperContained.craftableRecipes; }
// public void craftableRecipes(java.util.Set value) { wrapperContained.craftableRecipes = value; }
// public static java.util.Set craftableRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.craftableRecipes; }
// public static void craftableRecipes(java.util.Set value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.craftableRecipes = value; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public static java.util.List entries() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.entries; }
// public static void entries(java.util.List value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.entries = value; }

// public java.util.Set displayableRecipes() { return wrapperContained.displayableRecipes; }
// public void displayableRecipes(java.util.Set value) { wrapperContained.displayableRecipes = value; }
// public static java.util.Set displayableRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.displayableRecipes; }
// public static void displayableRecipes(java.util.Set value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.displayableRecipes = value; }

// public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection EMPTY() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.gui.screen.recipebook.RecipeResultCollection EMPTY() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.EMPTY); }
// public static void EMPTY(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection value, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.EMPTY = value.wrapperContained; }

public RecipeResultCollection(java.util.List entries) { this.wrapperContained = new net.minecraft.client.gui.screen.recipebook.RecipeResultCollection(entries); }
public java.util.List getAllRecipes() { return wrapperContained.getAllRecipes(); }
// public static java.util.List getAllRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.getAllRecipes(); }
public boolean isCraftable(yarnwrap.recipe.NetworkRecipeId recipeId) { return wrapperContained.isCraftable(recipeId.wrapperContained); }
// public static boolean isCraftable(yarnwrap.recipe.NetworkRecipeId recipeId, ) { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.isCraftable(recipeId.wrapperContained); }
public boolean hasCraftableRecipes() { return wrapperContained.hasCraftableRecipes(); }
// public static boolean hasCraftableRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.hasCraftableRecipes(); }
public void populateRecipes(yarnwrap.recipe.RecipeFinder finder,java.util.function.Predicate displayablePredicate) { wrapperContained.populateRecipes(finder.wrapperContained,displayablePredicate); }
// public static void populateRecipes(yarnwrap.recipe.RecipeFinder finder,java.util.function.Predicate displayablePredicate, ) { net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.populateRecipes(finder.wrapperContained,displayablePredicate); }
// public java.util.List filter(Object filterMode) { return wrapperContained.filter(filterMode); }
// public static java.util.List filter(Object filterMode, ) { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.filter(filterMode); }
public boolean hasDisplayableRecipes() { return wrapperContained.hasDisplayableRecipes(); }
// public static boolean hasDisplayableRecipes() { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.hasDisplayableRecipes(); }
// public boolean method_64887(yarnwrap.recipe.NetworkRecipeId recipeId) { return wrapperContained.method_64887(recipeId.wrapperContained); }
// public static boolean method_64887(yarnwrap.recipe.NetworkRecipeId recipeId, ) { return net.minecraft.client.gui.screen.recipebook.RecipeResultCollection.method_64887(recipeId.wrapperContained); }

}