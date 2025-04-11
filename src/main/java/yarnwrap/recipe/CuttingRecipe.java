package yarnwrap.recipe;
public class CuttingRecipe { public net.minecraft.recipe.CuttingRecipe wrapperContained; public CuttingRecipe(net.minecraft.recipe.CuttingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient ingredient() { return new yarnwrap.recipe.Ingredient(wrapperContained.ingredient); }
// public void ingredient(yarnwrap.recipe.Ingredient value) { wrapperContained.ingredient = value.wrapperContained; }
// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public void result(yarnwrap.item.ItemStack value) { wrapperContained.result = value.wrapperContained; }
// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public yarnwrap.recipe.RecipeType type() { return new yarnwrap.recipe.RecipeType(wrapperContained.type); }
// public void type(yarnwrap.recipe.RecipeType value) { wrapperContained.type = value.wrapperContained; }
// public yarnwrap.recipe.RecipeSerializer serializer() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.serializer); }
// public void serializer(yarnwrap.recipe.RecipeSerializer value) { wrapperContained.serializer = value.wrapperContained; }
// public CuttingRecipe(yarnwrap.recipe.RecipeType type,yarnwrap.recipe.RecipeSerializer serializer,java.lang.String group,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result) { this.wrapperContained = new net.minecraft.recipe.CuttingRecipe(type.wrapperContained,serializer.wrapperContained,group,ingredient.wrapperContained,result.wrapperContained); }

}