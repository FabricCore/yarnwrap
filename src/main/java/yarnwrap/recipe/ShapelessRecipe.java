package yarnwrap.recipe;
public class ShapelessRecipe { public net.minecraft.recipe.ShapelessRecipe wrapperContained; public ShapelessRecipe(net.minecraft.recipe.ShapelessRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List ingredients() { return wrapperContained.ingredients; }
// public void ingredients(java.util.List value) { wrapperContained.ingredients = value; }
// public static java.util.List ingredients() { return net.minecraft.recipe.ShapelessRecipe.ingredients; }
// public static void ingredients(java.util.List value, ) { net.minecraft.recipe.ShapelessRecipe.ingredients = value; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.recipe.ShapelessRecipe.group; }
// public static void group(java.lang.String value, ) { net.minecraft.recipe.ShapelessRecipe.group = value; }

// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public void result(yarnwrap.item.ItemStack value) { wrapperContained.result = value.wrapperContained; }
// public static yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(net.minecraft.recipe.ShapelessRecipe.result); }
// public static void result(yarnwrap.item.ItemStack value, ) { net.minecraft.recipe.ShapelessRecipe.result = value.wrapperContained; }

// public yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.CraftingRecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(net.minecraft.recipe.ShapelessRecipe.category); }
// public static void category(yarnwrap.recipe.book.CraftingRecipeCategory value, ) { net.minecraft.recipe.ShapelessRecipe.category = value.wrapperContained; }

// public yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.ingredientPlacement); }
// public void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value) { wrapperContained.ingredientPlacement = value.wrapperContained; }
// public static yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.ShapelessRecipe.ingredientPlacement); }
// public static void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value, ) { net.minecraft.recipe.ShapelessRecipe.ingredientPlacement = value.wrapperContained; }

public ShapelessRecipe(java.lang.String group,yarnwrap.recipe.book.CraftingRecipeCategory category,yarnwrap.item.ItemStack result,java.util.List ingredients) { this.wrapperContained = new net.minecraft.recipe.ShapelessRecipe(group,category.wrapperContained,result.wrapperContained,ingredients); }

}