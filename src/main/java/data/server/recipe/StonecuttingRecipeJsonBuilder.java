package yarnwrap.data.server.recipe;
public class StonecuttingRecipeJsonBuilder { public net.minecraft.data.server.recipe.StonecuttingRecipeJsonBuilder wrapperContained; public StonecuttingRecipeJsonBuilder(net.minecraft.data.server.recipe.StonecuttingRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.Item output() { return new yarnwrap.item.Item(wrapperContained.output); }
// public yarnwrap.recipe.Ingredient input() { return new yarnwrap.recipe.Ingredient(wrapperContained.input); }
// public int count() { return wrapperContained.count; }
// public java.lang.String group() { return wrapperContained.group; }
// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public java.util.Map criteria() { return wrapperContained.criteria; }
// public Object recipeFactory() { return wrapperContained.recipeFactory; }
public yarnwrap.data.server.recipe.StonecuttingRecipeJsonBuilder createStonecutting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output) { return new yarnwrap.data.server.recipe.StonecuttingRecipeJsonBuilder(wrapperContained.createStonecutting(input.wrapperContained,category.wrapperContained,output.wrapperContained)); }
public yarnwrap.data.server.recipe.StonecuttingRecipeJsonBuilder createStonecutting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { return new yarnwrap.data.server.recipe.StonecuttingRecipeJsonBuilder(wrapperContained.createStonecutting(input.wrapperContained,category.wrapperContained,output.wrapperContained,count)); }
// public void validate(yarnwrap.util.Identifier recipeId) { wrapperContained.validate(recipeId.wrapperContained); }

}