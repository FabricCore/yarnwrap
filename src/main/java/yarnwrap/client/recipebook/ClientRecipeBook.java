package yarnwrap.client.recipebook;
public class ClientRecipeBook { public net.minecraft.client.recipebook.ClientRecipeBook wrapperContained; public ClientRecipeBook(net.minecraft.client.recipebook.ClientRecipeBook wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map resultsByCategory() { return wrapperContained.resultsByCategory; }
// public void resultsByCategory(java.util.Map value) { wrapperContained.resultsByCategory = value; }
// public static java.util.Map resultsByCategory() { return net.minecraft.client.recipebook.ClientRecipeBook.resultsByCategory; }
// public static void resultsByCategory(java.util.Map value, ) { net.minecraft.client.recipebook.ClientRecipeBook.resultsByCategory = value; }

// public java.util.List orderedResults() { return wrapperContained.orderedResults; }
// public void orderedResults(java.util.List value) { wrapperContained.orderedResults = value; }
// public static java.util.List orderedResults() { return net.minecraft.client.recipebook.ClientRecipeBook.orderedResults; }
// public static void orderedResults(java.util.List value, ) { net.minecraft.client.recipebook.ClientRecipeBook.orderedResults = value; }

// public java.util.Map recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.Map value) { wrapperContained.recipes = value; }
// public static java.util.Map recipes() { return net.minecraft.client.recipebook.ClientRecipeBook.recipes; }
// public static void recipes(java.util.Map value, ) { net.minecraft.client.recipebook.ClientRecipeBook.recipes = value; }

// public java.util.Set highlightedRecipes() { return wrapperContained.highlightedRecipes; }
// public void highlightedRecipes(java.util.Set value) { wrapperContained.highlightedRecipes = value; }
// public static java.util.Set highlightedRecipes() { return net.minecraft.client.recipebook.ClientRecipeBook.highlightedRecipes; }
// public static void highlightedRecipes(java.util.Set value, ) { net.minecraft.client.recipebook.ClientRecipeBook.highlightedRecipes = value; }

public java.util.List getOrderedResults() { return wrapperContained.getOrderedResults(); }
// public static java.util.List getOrderedResults() { return net.minecraft.client.recipebook.ClientRecipeBook.getOrderedResults(); }
public java.util.List getResultsForCategory(yarnwrap.recipe.book.RecipeBookGroup category) { return wrapperContained.getResultsForCategory(category.wrapperContained); }
// public static java.util.List getResultsForCategory(yarnwrap.recipe.book.RecipeBookGroup category, ) { return net.minecraft.client.recipebook.ClientRecipeBook.getResultsForCategory(category.wrapperContained); }
// public java.util.Map toGroupedMap(java.lang.Iterable recipes) { return wrapperContained.toGroupedMap(recipes); }
// public static java.util.Map toGroupedMap(java.lang.Iterable recipes, ) { return net.minecraft.client.recipebook.ClientRecipeBook.toGroupedMap(recipes); }
// public java.util.List method_64848(yarnwrap.recipe.book.RecipeBookCategory group) { return wrapperContained.method_64848(group.wrapperContained); }
// public static java.util.List method_64848(yarnwrap.recipe.book.RecipeBookCategory group, ) { return net.minecraft.client.recipebook.ClientRecipeBook.method_64848(group.wrapperContained); }
public void add(yarnwrap.recipe.RecipeDisplayEntry entry) { wrapperContained.add(entry.wrapperContained); }
// public static void add(yarnwrap.recipe.RecipeDisplayEntry entry, ) { net.minecraft.client.recipebook.ClientRecipeBook.add(entry.wrapperContained); }
public void remove(yarnwrap.recipe.NetworkRecipeId recipeId) { wrapperContained.remove(recipeId.wrapperContained); }
// public static void remove(yarnwrap.recipe.NetworkRecipeId recipeId, ) { net.minecraft.client.recipebook.ClientRecipeBook.remove(recipeId.wrapperContained); }
// public void method_64851(java.util.Map group,Object resultCollections) { wrapperContained.method_64851(group,resultCollections); }
// public static void method_64851(java.util.Map group,Object resultCollections, ) { net.minecraft.client.recipebook.ClientRecipeBook.method_64851(group,resultCollections); }
// public java.util.stream.Stream method_64852(java.util.Map group) { return wrapperContained.method_64852(group); }
// public static java.util.stream.Stream method_64852(java.util.Map group, ) { return net.minecraft.client.recipebook.ClientRecipeBook.method_64852(group); }
public void refresh() { wrapperContained.refresh(); }
// public static void refresh() { net.minecraft.client.recipebook.ClientRecipeBook.refresh(); }
// public java.util.List method_64854(yarnwrap.recipe.book.RecipeBookCategory group) { return wrapperContained.method_64854(group.wrapperContained); }
// public static java.util.List method_64854(yarnwrap.recipe.book.RecipeBookCategory group, ) { return net.minecraft.client.recipebook.ClientRecipeBook.method_64854(group.wrapperContained); }
public boolean isHighlighted(yarnwrap.recipe.NetworkRecipeId recipeId) { return wrapperContained.isHighlighted(recipeId.wrapperContained); }
// public static boolean isHighlighted(yarnwrap.recipe.NetworkRecipeId recipeId, ) { return net.minecraft.client.recipebook.ClientRecipeBook.isHighlighted(recipeId.wrapperContained); }
public void unmarkHighlighted(yarnwrap.recipe.NetworkRecipeId recipeId) { wrapperContained.unmarkHighlighted(recipeId.wrapperContained); }
// public static void unmarkHighlighted(yarnwrap.recipe.NetworkRecipeId recipeId, ) { net.minecraft.client.recipebook.ClientRecipeBook.unmarkHighlighted(recipeId.wrapperContained); }
public void markHighlighted(yarnwrap.recipe.NetworkRecipeId recipeId) { wrapperContained.markHighlighted(recipeId.wrapperContained); }
// public static void markHighlighted(yarnwrap.recipe.NetworkRecipeId recipeId, ) { net.minecraft.client.recipebook.ClientRecipeBook.markHighlighted(recipeId.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.recipebook.ClientRecipeBook.clear(); }

}