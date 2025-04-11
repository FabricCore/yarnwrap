package yarnwrap.recipe;
public class MapExtendingRecipe { public net.minecraft.recipe.MapExtendingRecipe wrapperContained; public MapExtendingRecipe(net.minecraft.recipe.MapExtendingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack findFilledMap() { return new yarnwrap.item.ItemStack(wrapperContained.findFilledMap()); }

}