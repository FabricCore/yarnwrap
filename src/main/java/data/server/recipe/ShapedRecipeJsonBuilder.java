package yarnwrap.data.server.recipe;
public class ShapedRecipeJsonBuilder { public net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder wrapperContained; public ShapedRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map inputs() { return wrapperContained.inputs; }
// public java.util.List pattern() { return wrapperContained.pattern; }
// public int count() { return wrapperContained.count; }
// public yarnwrap.item.Item output() { return new yarnwrap.item.Item(wrapperContained.output); }
// public java.lang.String group() { return wrapperContained.group; }
// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public boolean showNotification() { return wrapperContained.showNotification; }
// public java.util.Map criteria() { return wrapperContained.criteria; }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.input(c,ingredient.wrapperContained)); }
// public yarnwrap.recipe.RawShapedRecipe validate(yarnwrap.util.Identifier recipeId) { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.validate(recipeId.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.input(c,tag.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.item.ItemConvertible itemProvider) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.input(c,itemProvider.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.create(category.wrapperContained,output.wrapperContained,count)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.create(category.wrapperContained,output.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder pattern(java.lang.String patternStr) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.pattern(patternStr)); }
public yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder showNotification(boolean showNotification) { return new yarnwrap.data.server.recipe.ShapedRecipeJsonBuilder(wrapperContained.showNotification(showNotification)); }

}