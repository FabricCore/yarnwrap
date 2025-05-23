package yarnwrap.recipe;
public class RecipeCache { public net.minecraft.recipe.RecipeCache wrapperContained; public RecipeCache(net.minecraft.recipe.RecipeCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object cache() { return wrapperContained.cache; }
// // public void cache(Object value) { wrapperContained.cache = value; }
// // public static Object cache() { return net.minecraft.recipe.RecipeCache.cache; }
// // public static void cache(Object value, ) { net.minecraft.recipe.RecipeCache.cache = value; }

// public java.lang.ref.WeakReference recipeManagerRef() { return wrapperContained.recipeManagerRef; }
// public void recipeManagerRef(java.lang.ref.WeakReference value) { wrapperContained.recipeManagerRef = value; }
// public static java.lang.ref.WeakReference recipeManagerRef() { return net.minecraft.recipe.RecipeCache.recipeManagerRef; }
// public static void recipeManagerRef(java.lang.ref.WeakReference value, ) { net.minecraft.recipe.RecipeCache.recipeManagerRef = value; }

public RecipeCache(int size) { this.wrapperContained = new net.minecraft.recipe.RecipeCache(size); }
// public void sendToFront(int index) { wrapperContained.sendToFront(index); }
// public static void sendToFront(int index, ) { net.minecraft.recipe.RecipeCache.sendToFront(index); }
// public java.util.Optional getAndCacheRecipe(yarnwrap.recipe.input.CraftingRecipeInput input,yarnwrap.server.world.ServerWorld world) { return wrapperContained.getAndCacheRecipe(input.wrapperContained,world.wrapperContained); }
// public static java.util.Optional getAndCacheRecipe(yarnwrap.recipe.input.CraftingRecipeInput input,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.recipe.RecipeCache.getAndCacheRecipe(input.wrapperContained,world.wrapperContained); }
// public void validateRecipeManager(yarnwrap.server.world.ServerWorld world) { wrapperContained.validateRecipeManager(world.wrapperContained); }
// public static void validateRecipeManager(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.recipe.RecipeCache.validateRecipeManager(world.wrapperContained); }
public java.util.Optional getRecipe(yarnwrap.server.world.ServerWorld world,yarnwrap.recipe.input.CraftingRecipeInput input) { return wrapperContained.getRecipe(world.wrapperContained,input.wrapperContained); }
// public static java.util.Optional getRecipe(yarnwrap.server.world.ServerWorld world,yarnwrap.recipe.input.CraftingRecipeInput input, ) { return net.minecraft.recipe.RecipeCache.getRecipe(world.wrapperContained,input.wrapperContained); }
// public void cache(yarnwrap.recipe.input.CraftingRecipeInput input,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.cache(input.wrapperContained,recipe.wrapperContained); }
// public static void cache(yarnwrap.recipe.input.CraftingRecipeInput input,yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.recipe.RecipeCache.cache(input.wrapperContained,recipe.wrapperContained); }

}