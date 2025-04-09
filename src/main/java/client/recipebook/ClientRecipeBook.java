package yarnwrap.client.recipebook;
public class ClientRecipeBook { public net.minecraft.client.recipebook.ClientRecipeBook wrapperContained; public ClientRecipeBook(net.minecraft.client.recipebook.ClientRecipeBook wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map resultsByGroup() { return wrapperContained.resultsByGroup; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.List orderedResults() { return wrapperContained.orderedResults; }
public java.util.List getOrderedResults() { return wrapperContained.getOrderedResults(); }
public java.util.List getResultsForGroup(yarnwrap.client.recipebook.RecipeBookGroup category) { return wrapperContained.getResultsForGroup(category.wrapperContained); }
// public yarnwrap.client.recipebook.RecipeBookGroup getGroupForRecipe(yarnwrap.recipe.RecipeEntry recipe) { return new yarnwrap.client.recipebook.RecipeBookGroup(wrapperContained.getGroupForRecipe(recipe.wrapperContained)); }
public void reload(java.lang.Iterable recipes,yarnwrap.registry.DynamicRegistryManager registryManager) { wrapperContained.reload(recipes,registryManager.wrapperContained); }
// public java.util.Map toGroupedMap(java.lang.Iterable recipes) { return wrapperContained.toGroupedMap(recipes); }

}