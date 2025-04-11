package yarnwrap.data.server.recipe;
public class ShapelessRecipeJsonBuilder { public net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder wrapperContained; public ShapelessRecipeJsonBuilder(net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map advancementBuilder() { return wrapperContained.advancementBuilder; }
// public void advancementBuilder(java.util.Map value) { wrapperContained.advancementBuilder = value; }
// public yarnwrap.util.collection.DefaultedList inputs() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inputs); }
// public void inputs(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inputs = value.wrapperContained; }
// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public yarnwrap.item.Item output() { return new yarnwrap.item.Item(wrapperContained.output); }
// public void output(yarnwrap.item.Item value) { wrapperContained.output = value.wrapperContained; }
// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public void validate(yarnwrap.util.Identifier recipeId) { wrapperContained.validate(recipeId.wrapperContained); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(tag.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.create(category.wrapperContained,output.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.create(category.wrapperContained,output.wrapperContained,count)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible itemProvider,int size) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(itemProvider.wrapperContained,size)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(ingredient.wrapperContained)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient,int size) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(ingredient.wrapperContained,size)); }
public yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible itemProvider) { return new yarnwrap.data.server.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(itemProvider.wrapperContained)); }

}