package yarnwrap.recipe;
public class MapExtendingRecipe { public net.minecraft.recipe.MapExtendingRecipe wrapperContained; public MapExtendingRecipe(net.minecraft.recipe.MapExtendingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public MapExtendingRecipe(yarnwrap.recipe.book.CraftingRecipeCategory category) { this.wrapperContained = new net.minecraft.recipe.MapExtendingRecipe(category.wrapperContained); }
// public yarnwrap.item.ItemStack findFilledMap() { return new yarnwrap.item.ItemStack(wrapperContained.findFilledMap()); }
// public static yarnwrap.item.ItemStack findFilledMap() { return new yarnwrap.item.ItemStack(net.minecraft.recipe.MapExtendingRecipe.findFilledMap()); }

}