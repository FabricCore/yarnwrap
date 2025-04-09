package yarnwrap.recipe;
public class RecipeUnlocker { public net.minecraft.recipe.RecipeUnlocker wrapperContained; public RecipeUnlocker(net.minecraft.recipe.RecipeUnlocker wrapperContained) { this.wrapperContained = wrapperContained; }

public void setLastRecipe(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.setLastRecipe(recipe.wrapperContained); }
public yarnwrap.recipe.RecipeEntry getLastRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.getLastRecipe()); }
public void unlockLastRecipe(yarnwrap.entity.player.PlayerEntity player,java.util.List ingredients) { wrapperContained.unlockLastRecipe(player.wrapperContained,ingredients); }
public boolean shouldCraftRecipe(yarnwrap.world.World world,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.shouldCraftRecipe(world.wrapperContained,player.wrapperContained,recipe.wrapperContained); }

}