package yarnwrap.recipe;
public class StonecuttingRecipe { public net.minecraft.recipe.StonecuttingRecipe wrapperContained; public StonecuttingRecipe(net.minecraft.recipe.StonecuttingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public StonecuttingRecipe(java.lang.String group,yarnwrap.recipe.Ingredient ingredient,yarnwrap.item.ItemStack result) { this.wrapperContained = new net.minecraft.recipe.StonecuttingRecipe(group,ingredient.wrapperContained,result.wrapperContained); }

}