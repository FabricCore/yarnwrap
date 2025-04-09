package yarnwrap.recipe;
public class ShapedRecipe { public net.minecraft.recipe.ShapedRecipe wrapperContained; public ShapedRecipe(net.minecraft.recipe.ShapedRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.category); }
// public boolean showNotification() { return wrapperContained.showNotification; }
// public yarnwrap.recipe.RawShapedRecipe raw() { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.raw); }
// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public java.lang.String group() { return wrapperContained.group; }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }

}