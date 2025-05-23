package yarnwrap.recipe;
public class RecipeManager { public net.minecraft.recipe.RecipeManager wrapperContained; public RecipeManager(net.minecraft.recipe.RecipeManager wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getStonecutterRecipes() { return wrapperContained.getStonecutterRecipes(); }
// public static Object getStonecutterRecipes() { return net.minecraft.recipe.RecipeManager.getStonecutterRecipes(); }
public yarnwrap.recipe.RecipePropertySet getPropertySet(yarnwrap.registry.RegistryKey key) { return new yarnwrap.recipe.RecipePropertySet(wrapperContained.getPropertySet(key.wrapperContained)); }
// public static yarnwrap.recipe.RecipePropertySet getPropertySet(yarnwrap.registry.RegistryKey key, ) { return new yarnwrap.recipe.RecipePropertySet(net.minecraft.recipe.RecipeManager.getPropertySet(key.wrapperContained)); }

}