package yarnwrap.recipe;
public class ShapedRecipe { public net.minecraft.recipe.ShapedRecipe wrapperContained; public ShapedRecipe(net.minecraft.recipe.ShapedRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.CraftingRecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public boolean showNotification() { return wrapperContained.showNotification; }
// public void showNotification(boolean value) { wrapperContained.showNotification = value; }
// public yarnwrap.recipe.RawShapedRecipe raw() { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.raw); }
// public void raw(yarnwrap.recipe.RawShapedRecipe value) { wrapperContained.raw = value.wrapperContained; }
// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public void result(yarnwrap.item.ItemStack value) { wrapperContained.result = value.wrapperContained; }
// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
public int getWidth() { return wrapperContained.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }

}