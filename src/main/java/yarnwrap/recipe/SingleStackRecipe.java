package yarnwrap.recipe;
public class SingleStackRecipe { public net.minecraft.recipe.SingleStackRecipe wrapperContained; public SingleStackRecipe(net.minecraft.recipe.SingleStackRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient ingredient() { return new yarnwrap.recipe.Ingredient(wrapperContained.ingredient); }
// public void ingredient(yarnwrap.recipe.Ingredient value) { wrapperContained.ingredient = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient ingredient() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SingleStackRecipe.ingredient); }
// public static void ingredient(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.SingleStackRecipe.ingredient = value.wrapperContained; }

// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public void result(yarnwrap.item.ItemStack value) { wrapperContained.result = value.wrapperContained; }
// public static yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(net.minecraft.recipe.SingleStackRecipe.result); }
// public static void result(yarnwrap.item.ItemStack value, ) { net.minecraft.recipe.SingleStackRecipe.result = value.wrapperContained; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.recipe.SingleStackRecipe.group; }
// public static void group(java.lang.String value, ) { net.minecraft.recipe.SingleStackRecipe.group = value; }

// public yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.ingredientPlacement); }
// public void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value) { wrapperContained.ingredientPlacement = value.wrapperContained; }
// public static yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.SingleStackRecipe.ingredientPlacement); }
// public static void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value, ) { net.minecraft.recipe.SingleStackRecipe.ingredientPlacement = value.wrapperContained; }

// public SingleStackRecipe(java.lang.String group,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result) { this.wrapperContained = new net.minecraft.recipe.SingleStackRecipe(group,ingredient.wrapperContained,result.wrapperContained); }
// public yarnwrap.recipe.Ingredient ingredient() { return new yarnwrap.recipe.Ingredient(wrapperContained.ingredient()); }
// // public static yarnwrap.recipe.Ingredient ingredient() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SingleStackRecipe.ingredient()); }
// // public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result()); }
// // public static yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(net.minecraft.recipe.SingleStackRecipe.result()); }

}