package yarnwrap.recipe;
public class ShapelessRecipe { public net.minecraft.recipe.ShapelessRecipe wrapperContained; public ShapelessRecipe(net.minecraft.recipe.ShapelessRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.CraftingRecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(net.minecraft.recipe.ShapelessRecipe.category); }
// public static void category(yarnwrap.recipe.book.CraftingRecipeCategory value, ) { net.minecraft.recipe.ShapelessRecipe.category = value.wrapperContained; }

// public yarnwrap.util.collection.DefaultedList ingredients() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.ingredients); }
// public void ingredients(yarnwrap.util.collection.DefaultedList value) { wrapperContained.ingredients = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList ingredients() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.recipe.ShapelessRecipe.ingredients); }
// public static void ingredients(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.recipe.ShapelessRecipe.ingredients = value.wrapperContained; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.recipe.ShapelessRecipe.group; }
// public static void group(java.lang.String value, ) { net.minecraft.recipe.ShapelessRecipe.group = value; }

// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public void result(yarnwrap.item.ItemStack value) { wrapperContained.result = value.wrapperContained; }
// public static yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(net.minecraft.recipe.ShapelessRecipe.result); }
// public static void result(yarnwrap.item.ItemStack value, ) { net.minecraft.recipe.ShapelessRecipe.result = value.wrapperContained; }

public ShapelessRecipe(java.lang.String group,yarnwrap.recipe.book.CraftingRecipeCategory category,yarnwrap.item.ItemStack result,yarnwrap.util.collection.DefaultedList ingredients) { this.wrapperContained = new net.minecraft.recipe.ShapelessRecipe(group,category.wrapperContained,result.wrapperContained,ingredients.wrapperContained); }

}