package yarnwrap.data.server.recipe;
public class ShapedRecipeJsonBuilder { public net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder wrapperContained; public ShapedRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map inputs() { return wrapperContained.inputs; }
// public void inputs(java.util.Map value) { wrapperContained.inputs = value; }
// public java.util.List pattern() { return wrapperContained.pattern; }
// public void pattern(java.util.List value) { wrapperContained.pattern = value; }
// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public yarnwrap.item.Item output() { return new yarnwrap.item.Item(wrapperContained.output); }
// public void output(yarnwrap.item.Item value) { wrapperContained.output = value.wrapperContained; }
// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public boolean showNotification() { return wrapperContained.showNotification; }
// public void showNotification(boolean value) { wrapperContained.showNotification = value; }
// public java.util.Map criteria() { return wrapperContained.criteria; }
// public void criteria(java.util.Map value) { wrapperContained.criteria = value; }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.input(c,ingredient.wrapperContained)); }
// public yarnwrap.recipe.RawShapedRecipe validate(yarnwrap.util.Identifier recipeId) { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.validate(recipeId.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.input(c,tag.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.item.ItemConvertible itemProvider) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.input(c,itemProvider.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.create(category.wrapperContained,output.wrapperContained,count)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.create(category.wrapperContained,output.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder pattern(java.lang.String patternStr) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.pattern(patternStr)); }
// public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder showNotification(boolean showNotification) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.showNotification(showNotification)); }

}