package yarnwrap.data.server.recipe;
public class StonecuttingRecipeJsonBuilder { public net.minecraft.data.server.recipe.StonecuttingRecipeJsonBuilder wrapperContained; public StonecuttingRecipeJsonBuilder(net.minecraft.data.server.recipe.StonecuttingRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.Item output() { return new yarnwrap.item.Item(wrapperContained.output); }
// public void output(yarnwrap.item.Item value) { wrapperContained.output = value.wrapperContained; }
// public yarnwrap.recipe.Ingredient input() { return new yarnwrap.recipe.Ingredient(wrapperContained.input); }
// public void input(yarnwrap.recipe.Ingredient value) { wrapperContained.input = value.wrapperContained; }
// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public java.util.Map criteria() { return wrapperContained.criteria; }
// public void criteria(java.util.Map value) { wrapperContained.criteria = value; }
// public Object recipeFactory() { return wrapperContained.recipeFactory; }
// // public void recipeFactory(Object value) { wrapperContained.recipeFactory = value; }
public yarnwrap.data.server.recipe.StonecuttingRecipeJsonBuilder createStonecutting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output) { return new yarnwrap.data.server.recipe.StonecuttingRecipeJsonBuilder(wrapperContained.createStonecutting(input.wrapperContained,category.wrapperContained,output.wrapperContained)); }
public yarnwrap.data.server.recipe.StonecuttingRecipeJsonBuilder createStonecutting(yarnwrap.recipe.Ingredient input,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { return new yarnwrap.data.server.recipe.StonecuttingRecipeJsonBuilder(wrapperContained.createStonecutting(input.wrapperContained,category.wrapperContained,output.wrapperContained,count)); }
// public void validate(yarnwrap.util.Identifier recipeId) { wrapperContained.validate(recipeId.wrapperContained); }

}