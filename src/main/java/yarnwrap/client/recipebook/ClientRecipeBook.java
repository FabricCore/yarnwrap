package yarnwrap.client.recipebook;
public class ClientRecipeBook { public net.minecraft.client.recipebook.ClientRecipeBook wrapperContained; public ClientRecipeBook(net.minecraft.client.recipebook.ClientRecipeBook wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map resultsByGroup() { return wrapperContained.resultsByGroup; }
// public void resultsByGroup(java.util.Map value) { wrapperContained.resultsByGroup = value; }
// public static java.util.Map resultsByGroup() { return net.minecraft.client.recipebook.ClientRecipeBook.resultsByGroup; }
// public static void resultsByGroup(java.util.Map value, ) { net.minecraft.client.recipebook.ClientRecipeBook.resultsByGroup = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.recipebook.ClientRecipeBook.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.recipebook.ClientRecipeBook.LOGGER = value; }

// public java.util.List orderedResults() { return wrapperContained.orderedResults; }
// public void orderedResults(java.util.List value) { wrapperContained.orderedResults = value; }
// public static java.util.List orderedResults() { return net.minecraft.client.recipebook.ClientRecipeBook.orderedResults; }
// public static void orderedResults(java.util.List value, ) { net.minecraft.client.recipebook.ClientRecipeBook.orderedResults = value; }

public java.util.List getOrderedResults() { return wrapperContained.getOrderedResults(); }
// public static java.util.List getOrderedResults() { return net.minecraft.client.recipebook.ClientRecipeBook.getOrderedResults(); }
public java.util.List getResultsForGroup(yarnwrap.client.recipebook.RecipeBookGroup category) { return wrapperContained.getResultsForGroup(category.wrapperContained); }
// public static java.util.List getResultsForGroup(yarnwrap.client.recipebook.RecipeBookGroup category, ) { return net.minecraft.client.recipebook.ClientRecipeBook.getResultsForGroup(category.wrapperContained); }
// public yarnwrap.client.recipebook.RecipeBookGroup getGroupForRecipe(yarnwrap.recipe.RecipeEntry recipe) { return new yarnwrap.client.recipebook.RecipeBookGroup(wrapperContained.getGroupForRecipe(recipe.wrapperContained)); }
// public static yarnwrap.client.recipebook.RecipeBookGroup getGroupForRecipe(yarnwrap.recipe.RecipeEntry recipe, ) { return new yarnwrap.client.recipebook.RecipeBookGroup(net.minecraft.client.recipebook.ClientRecipeBook.getGroupForRecipe(recipe.wrapperContained)); }
public void reload(java.lang.Iterable recipes,yarnwrap.registry.DynamicRegistryManager registryManager) { wrapperContained.reload(recipes,registryManager.wrapperContained); }
// public static void reload(java.lang.Iterable recipes,yarnwrap.registry.DynamicRegistryManager registryManager, ) { net.minecraft.client.recipebook.ClientRecipeBook.reload(recipes,registryManager.wrapperContained); }
// public void method_30279(java.util.Map recipeBookGroup) { wrapperContained.method_30279(recipeBookGroup); }
// public static void method_30279(java.util.Map recipeBookGroup, ) { net.minecraft.client.recipebook.ClientRecipeBook.method_30279(recipeBookGroup); }
// public java.util.stream.Stream method_30280(java.util.Map searchGroup) { return wrapperContained.method_30280(searchGroup); }
// public static java.util.stream.Stream method_30280(java.util.Map searchGroup, ) { return net.minecraft.client.recipebook.ClientRecipeBook.method_30280(searchGroup); }
// public void method_30281(java.util.Map group,yarnwrap.client.recipebook.RecipeBookGroup searchGroups) { wrapperContained.method_30281(group,searchGroups.wrapperContained); }
// public static void method_30281(java.util.Map group,yarnwrap.client.recipebook.RecipeBookGroup searchGroups, ) { net.minecraft.client.recipebook.ClientRecipeBook.method_30281(group,searchGroups.wrapperContained); }
// public java.util.List method_30282(yarnwrap.client.recipebook.RecipeBookGroup group) { return wrapperContained.method_30282(group.wrapperContained); }
// public static java.util.List method_30282(yarnwrap.client.recipebook.RecipeBookGroup group, ) { return net.minecraft.client.recipebook.ClientRecipeBook.method_30282(group.wrapperContained); }
// public java.util.Map toGroupedMap(java.lang.Iterable recipes) { return wrapperContained.toGroupedMap(recipes); }
// public static java.util.Map toGroupedMap(java.lang.Iterable recipes, ) { return net.minecraft.client.recipebook.ClientRecipeBook.toGroupedMap(recipes); }
// public java.util.List method_30284(yarnwrap.client.recipebook.RecipeBookGroup group) { return wrapperContained.method_30284(group.wrapperContained); }
// public static java.util.List method_30284(yarnwrap.client.recipebook.RecipeBookGroup group, ) { return net.minecraft.client.recipebook.ClientRecipeBook.method_30284(group.wrapperContained); }
// public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection method_48464(yarnwrap.registry.DynamicRegistryManager recipes) { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.method_48464(recipes.wrapperContained)); }
// public static yarnwrap.client.gui.screen.recipebook.RecipeResultCollection method_48464(yarnwrap.registry.DynamicRegistryManager recipes, ) { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(net.minecraft.client.recipebook.ClientRecipeBook.method_48464(recipes.wrapperContained)); }

}