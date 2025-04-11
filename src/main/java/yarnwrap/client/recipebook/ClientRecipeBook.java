package yarnwrap.client.recipebook;
public class ClientRecipeBook { public net.minecraft.client.recipebook.ClientRecipeBook wrapperContained; public ClientRecipeBook(net.minecraft.client.recipebook.ClientRecipeBook wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map resultsByGroup() { return wrapperContained.resultsByGroup; }
// public void resultsByGroup(java.util.Map value) { wrapperContained.resultsByGroup = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.List orderedResults() { return wrapperContained.orderedResults; }
// public void orderedResults(java.util.List value) { wrapperContained.orderedResults = value; }
public java.util.List getOrderedResults() { return wrapperContained.getOrderedResults(); }
public java.util.List getResultsForGroup(yarnwrap.client.recipebook.RecipeBookGroup category) { return wrapperContained.getResultsForGroup(category.wrapperContained); }
// public yarnwrap.client.recipebook.RecipeBookGroup getGroupForRecipe(yarnwrap.recipe.RecipeEntry recipe) { return new yarnwrap.client.recipebook.RecipeBookGroup(wrapperContained.getGroupForRecipe(recipe.wrapperContained)); }
public void reload(java.lang.Iterable recipes,yarnwrap.registry.DynamicRegistryManager registryManager) { wrapperContained.reload(recipes,registryManager.wrapperContained); }
// public void method_30279(java.util.Map recipeBookGroup) { wrapperContained.method_30279(recipeBookGroup); }
// public java.util.stream.Stream method_30280(java.util.Map searchGroup) { return wrapperContained.method_30280(searchGroup); }
// public void method_30281(java.util.Map group,yarnwrap.client.recipebook.RecipeBookGroup searchGroups) { wrapperContained.method_30281(group,searchGroups.wrapperContained); }
// public java.util.List method_30282(yarnwrap.client.recipebook.RecipeBookGroup group) { return wrapperContained.method_30282(group.wrapperContained); }
// public java.util.Map toGroupedMap(java.lang.Iterable recipes) { return wrapperContained.toGroupedMap(recipes); }
// public java.util.List method_30284(yarnwrap.client.recipebook.RecipeBookGroup group) { return wrapperContained.method_30284(group.wrapperContained); }
// public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection method_48464(yarnwrap.registry.DynamicRegistryManager recipes) { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.method_48464(recipes.wrapperContained)); }

}