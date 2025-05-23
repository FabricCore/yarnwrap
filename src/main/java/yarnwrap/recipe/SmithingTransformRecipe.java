package yarnwrap.recipe;
public class SmithingTransformRecipe { public net.minecraft.recipe.SmithingTransformRecipe wrapperContained; public SmithingTransformRecipe(net.minecraft.recipe.SmithingTransformRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional template() { return wrapperContained.template; }
// public void template(java.util.Optional value) { wrapperContained.template = value; }
// public static java.util.Optional template() { return net.minecraft.recipe.SmithingTransformRecipe.template; }
// public static void template(java.util.Optional value, ) { net.minecraft.recipe.SmithingTransformRecipe.template = value; }

// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public void base(yarnwrap.recipe.Ingredient value) { wrapperContained.base = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SmithingTransformRecipe.base); }
// public static void base(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.SmithingTransformRecipe.base = value.wrapperContained; }

// public java.util.Optional addition() { return wrapperContained.addition; }
// public void addition(java.util.Optional value) { wrapperContained.addition = value; }
// public static java.util.Optional addition() { return net.minecraft.recipe.SmithingTransformRecipe.addition; }
// public static void addition(java.util.Optional value, ) { net.minecraft.recipe.SmithingTransformRecipe.addition = value; }

// public yarnwrap.recipe.TransmuteRecipeResult result() { return new yarnwrap.recipe.TransmuteRecipeResult(wrapperContained.result); }
// public void result(yarnwrap.recipe.TransmuteRecipeResult value) { wrapperContained.result = value.wrapperContained; }
// public static yarnwrap.recipe.TransmuteRecipeResult result() { return new yarnwrap.recipe.TransmuteRecipeResult(net.minecraft.recipe.SmithingTransformRecipe.result); }
// public static void result(yarnwrap.recipe.TransmuteRecipeResult value, ) { net.minecraft.recipe.SmithingTransformRecipe.result = value.wrapperContained; }

// public yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.ingredientPlacement); }
// public void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value) { wrapperContained.ingredientPlacement = value.wrapperContained; }
// public static yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.SmithingTransformRecipe.ingredientPlacement); }
// public static void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value, ) { net.minecraft.recipe.SmithingTransformRecipe.ingredientPlacement = value.wrapperContained; }

public SmithingTransformRecipe(java.util.Optional template,yarnwrap.recipe.Ingredient base,java.util.Optional addition,yarnwrap.recipe.TransmuteRecipeResult result) { this.wrapperContained = new net.minecraft.recipe.SmithingTransformRecipe(template,base.wrapperContained,addition,result.wrapperContained); }

}