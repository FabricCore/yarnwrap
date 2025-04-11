package yarnwrap.recipe;
public class SmeltingRecipe { public net.minecraft.recipe.SmeltingRecipe wrapperContained; public SmeltingRecipe(net.minecraft.recipe.SmeltingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public SmeltingRecipe(java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime) { this.wrapperContained = new net.minecraft.recipe.SmeltingRecipe(group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime); }

}