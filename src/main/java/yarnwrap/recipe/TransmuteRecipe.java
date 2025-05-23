package yarnwrap.recipe;
public class TransmuteRecipe { public net.minecraft.recipe.TransmuteRecipe wrapperContained; public TransmuteRecipe(net.minecraft.recipe.TransmuteRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.recipe.TransmuteRecipe.group; }
// public static void group(java.lang.String value, ) { net.minecraft.recipe.TransmuteRecipe.group = value; }

// public yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.CraftingRecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(net.minecraft.recipe.TransmuteRecipe.category); }
// public static void category(yarnwrap.recipe.book.CraftingRecipeCategory value, ) { net.minecraft.recipe.TransmuteRecipe.category = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient input() { return new yarnwrap.recipe.Ingredient(wrapperContained.input); }
// public void input(yarnwrap.recipe.Ingredient value) { wrapperContained.input = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient input() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.TransmuteRecipe.input); }
// public static void input(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.TransmuteRecipe.input = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient material() { return new yarnwrap.recipe.Ingredient(wrapperContained.material); }
// public void material(yarnwrap.recipe.Ingredient value) { wrapperContained.material = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient material() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.TransmuteRecipe.material); }
// public static void material(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.TransmuteRecipe.material = value.wrapperContained; }

// public yarnwrap.recipe.TransmuteRecipeResult result() { return new yarnwrap.recipe.TransmuteRecipeResult(wrapperContained.result); }
// public void result(yarnwrap.recipe.TransmuteRecipeResult value) { wrapperContained.result = value.wrapperContained; }
// public static yarnwrap.recipe.TransmuteRecipeResult result() { return new yarnwrap.recipe.TransmuteRecipeResult(net.minecraft.recipe.TransmuteRecipe.result); }
// public static void result(yarnwrap.recipe.TransmuteRecipeResult value, ) { net.minecraft.recipe.TransmuteRecipe.result = value.wrapperContained; }

// public yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.ingredientPlacement); }
// public void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value) { wrapperContained.ingredientPlacement = value.wrapperContained; }
// public static yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.TransmuteRecipe.ingredientPlacement); }
// public static void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value, ) { net.minecraft.recipe.TransmuteRecipe.ingredientPlacement = value.wrapperContained; }

public TransmuteRecipe(java.lang.String group,yarnwrap.recipe.book.CraftingRecipeCategory category,yarnwrap.recipe.Ingredient input,yarnwrap.recipe.Ingredient material,yarnwrap.recipe.TransmuteRecipeResult result) { this.wrapperContained = new net.minecraft.recipe.TransmuteRecipe(group,category.wrapperContained,input.wrapperContained,material.wrapperContained,result.wrapperContained); }

}