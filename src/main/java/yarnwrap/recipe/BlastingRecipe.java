package yarnwrap.recipe;
public class BlastingRecipe { public net.minecraft.recipe.BlastingRecipe wrapperContained; public BlastingRecipe(net.minecraft.recipe.BlastingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public BlastingRecipe(java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime) { this.wrapperContained = new net.minecraft.recipe.BlastingRecipe(group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime); }

}