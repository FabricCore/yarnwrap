package yarnwrap.data.server.recipe;
public class SmithingTransformRecipeJsonBuilder { public net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder wrapperContained; public SmithingTransformRecipeJsonBuilder(net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(wrapperContained.template); }
// public void template(yarnwrap.recipe.Ingredient value) { wrapperContained.template = value.wrapperContained; }
// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public void base(yarnwrap.recipe.Ingredient value) { wrapperContained.base = value.wrapperContained; }
// public yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(wrapperContained.addition); }
// public void addition(yarnwrap.recipe.Ingredient value) { wrapperContained.addition = value.wrapperContained; }
// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public yarnwrap.item.Item result() { return new yarnwrap.item.Item(wrapperContained.result); }
// public void result(yarnwrap.item.Item value) { wrapperContained.result = value.wrapperContained; }
// public java.util.Map criteria() { return wrapperContained.criteria; }
// public void criteria(java.util.Map value) { wrapperContained.criteria = value; }
public SmithingTransformRecipeJsonBuilder(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.Item result) { this.wrapperContained = new net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder(template.wrapperContained,base.wrapperContained,addition.wrapperContained,category.wrapperContained,result.wrapperContained); }
// public void validate(yarnwrap.util.Identifier recipeId) { wrapperContained.validate(recipeId.wrapperContained); }
public yarnwrap.data.server.recipe.SmithingTransformRecipeJsonBuilder create(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.Item result) { return new yarnwrap.data.server.recipe.SmithingTransformRecipeJsonBuilder(wrapperContained.create(template.wrapperContained,base.wrapperContained,addition.wrapperContained,category.wrapperContained,result.wrapperContained)); }
public yarnwrap.data.server.recipe.SmithingTransformRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion) { return new yarnwrap.data.server.recipe.SmithingTransformRecipeJsonBuilder(wrapperContained.criterion(name,criterion.wrapperContained)); }
public void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,yarnwrap.util.Identifier recipeId) { wrapperContained.offerTo(exporter.wrapperContained,recipeId.wrapperContained); }
public void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,java.lang.String recipeId) { wrapperContained.offerTo(exporter.wrapperContained,recipeId); }

}