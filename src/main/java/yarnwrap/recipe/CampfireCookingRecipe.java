package yarnwrap.recipe;
public class CampfireCookingRecipe { public net.minecraft.recipe.CampfireCookingRecipe wrapperContained; public CampfireCookingRecipe(net.minecraft.recipe.CampfireCookingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public CampfireCookingRecipe(java.lang.String group,yarnwrap.recipe.book.CookingRecipeCategory category,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result,float experience,int cookingTime) { this.wrapperContained = new net.minecraft.recipe.CampfireCookingRecipe(group,category.wrapperContained,ingredient.wrapperContained,result.wrapperContained,experience,cookingTime); }

}