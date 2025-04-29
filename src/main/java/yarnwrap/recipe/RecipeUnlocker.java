package yarnwrap.recipe;
public class RecipeUnlocker { public net.minecraft.recipe.RecipeUnlocker wrapperContained; public RecipeUnlocker(net.minecraft.recipe.RecipeUnlocker wrapperContained) { this.wrapperContained = wrapperContained; }

public void setLastRecipe(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.setLastRecipe(recipe.wrapperContained); }
// public static void setLastRecipe(yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.recipe.RecipeUnlocker.setLastRecipe(recipe.wrapperContained); }
public yarnwrap.recipe.RecipeEntry getLastRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.getLastRecipe()); }
// public static yarnwrap.recipe.RecipeEntry getLastRecipe() { return new yarnwrap.recipe.RecipeEntry(net.minecraft.recipe.RecipeUnlocker.getLastRecipe()); }
public void unlockLastRecipe(yarnwrap.entity.player.PlayerEntity player,java.util.List ingredients) { wrapperContained.unlockLastRecipe(player.wrapperContained,ingredients); }
// public static void unlockLastRecipe(yarnwrap.entity.player.PlayerEntity player,java.util.List ingredients, ) { net.minecraft.recipe.RecipeUnlocker.unlockLastRecipe(player.wrapperContained,ingredients); }
public boolean shouldCraftRecipe(yarnwrap.world.World world,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.shouldCraftRecipe(world.wrapperContained,player.wrapperContained,recipe.wrapperContained); }
// public static boolean shouldCraftRecipe(yarnwrap.world.World world,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.recipe.RecipeEntry recipe, ) { return net.minecraft.recipe.RecipeUnlocker.shouldCraftRecipe(world.wrapperContained,player.wrapperContained,recipe.wrapperContained); }

}