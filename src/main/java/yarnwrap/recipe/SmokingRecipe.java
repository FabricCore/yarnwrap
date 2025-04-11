package yarnwrap.recipe;
public class SmokingRecipe { public net.minecraft.recipe.SmokingRecipe wrapperContained; public SmokingRecipe(net.minecraft.recipe.SmokingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public SmokingRecipe(java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime) { this.wrapperContained = new net.minecraft.recipe.SmokingRecipe(group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime); }

}