package yarnwrap.recipe;
public class CuttingRecipe { public net.minecraft.recipe.CuttingRecipe wrapperContained; public CuttingRecipe(net.minecraft.recipe.CuttingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient ingredient() { return new yarnwrap.recipe.Ingredient(wrapperContained.ingredient); }
// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public java.lang.String group() { return wrapperContained.group; }
// public yarnwrap.recipe.RecipeType type() { return new yarnwrap.recipe.RecipeType(wrapperContained.type); }
// public yarnwrap.recipe.RecipeSerializer serializer() { return new yarnwrap.recipe.RecipeSerializer(wrapperContained.serializer); }

}