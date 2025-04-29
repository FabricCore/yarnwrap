package yarnwrap.recipe;
public class ShapedRecipe { public net.minecraft.recipe.ShapedRecipe wrapperContained; public ShapedRecipe(net.minecraft.recipe.ShapedRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.CraftingRecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(net.minecraft.recipe.ShapedRecipe.category); }
// public static void category(yarnwrap.recipe.book.CraftingRecipeCategory value, ) { net.minecraft.recipe.ShapedRecipe.category = value.wrapperContained; }

// public boolean showNotification() { return wrapperContained.showNotification; }
// public void showNotification(boolean value) { wrapperContained.showNotification = value; }
// public static boolean showNotification() { return net.minecraft.recipe.ShapedRecipe.showNotification; }
// public static void showNotification(boolean value, ) { net.minecraft.recipe.ShapedRecipe.showNotification = value; }

// public yarnwrap.recipe.RawShapedRecipe raw() { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.raw); }
// public void raw(yarnwrap.recipe.RawShapedRecipe value) { wrapperContained.raw = value.wrapperContained; }
// public static yarnwrap.recipe.RawShapedRecipe raw() { return new yarnwrap.recipe.RawShapedRecipe(net.minecraft.recipe.ShapedRecipe.raw); }
// public static void raw(yarnwrap.recipe.RawShapedRecipe value, ) { net.minecraft.recipe.ShapedRecipe.raw = value.wrapperContained; }

// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public void result(yarnwrap.item.ItemStack value) { wrapperContained.result = value.wrapperContained; }
// public static yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(net.minecraft.recipe.ShapedRecipe.result); }
// public static void result(yarnwrap.item.ItemStack value, ) { net.minecraft.recipe.ShapedRecipe.result = value.wrapperContained; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.recipe.ShapedRecipe.group; }
// public static void group(java.lang.String value, ) { net.minecraft.recipe.ShapedRecipe.group = value; }

public ShapedRecipe(java.lang.String group,yarnwrap.recipe.book.CraftingRecipeCategory category,yarnwrap.recipe.RawShapedRecipe raw,yarnwrap.item.ItemStack result) { this.wrapperContained = new net.minecraft.recipe.ShapedRecipe(group,category.wrapperContained,raw.wrapperContained,result.wrapperContained); }
public ShapedRecipe(java.lang.String group,yarnwrap.recipe.book.CraftingRecipeCategory category,yarnwrap.recipe.RawShapedRecipe raw,yarnwrap.item.ItemStack result,boolean showNotification) { this.wrapperContained = new net.minecraft.recipe.ShapedRecipe(group,category.wrapperContained,raw.wrapperContained,result.wrapperContained,showNotification); }
// public boolean method_31585(yarnwrap.recipe.Ingredient ingredient) { return wrapperContained.method_31585(ingredient.wrapperContained); }
// public static boolean method_31585(yarnwrap.recipe.Ingredient ingredient, ) { return net.minecraft.recipe.ShapedRecipe.method_31585(ingredient.wrapperContained); }
// public boolean method_31586(yarnwrap.recipe.Ingredient ingredient) { return wrapperContained.method_31586(ingredient.wrapperContained); }
// public static boolean method_31586(yarnwrap.recipe.Ingredient ingredient, ) { return net.minecraft.recipe.ShapedRecipe.method_31586(ingredient.wrapperContained); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.recipe.ShapedRecipe.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.recipe.ShapedRecipe.getHeight(); }

}