package yarnwrap.recipe;
public class RecipeCache { public net.minecraft.recipe.RecipeCache wrapperContained; public RecipeCache(net.minecraft.recipe.RecipeCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object cache() { return wrapperContained.cache; }
// public java.lang.ref.WeakReference recipeManagerRef() { return wrapperContained.recipeManagerRef; }
// public void sendToFront(int index) { wrapperContained.sendToFront(index); }
// public java.util.Optional getAndCacheRecipe(yarnwrap.recipe.input.CraftingRecipeInput input,yarnwrap.world.World world) { return wrapperContained.getAndCacheRecipe(input.wrapperContained,world.wrapperContained); }
// public void validateRecipeManager(yarnwrap.world.World world) { wrapperContained.validateRecipeManager(world.wrapperContained); }
public java.util.Optional getRecipe(yarnwrap.world.World world,yarnwrap.recipe.input.CraftingRecipeInput input) { return wrapperContained.getRecipe(world.wrapperContained,input.wrapperContained); }
// public void cache(yarnwrap.recipe.input.CraftingRecipeInput input,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.cache(input.wrapperContained,recipe.wrapperContained); }

}