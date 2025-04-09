package yarnwrap.data.server.recipe;
public class SmithingTrimRecipeJsonBuilder { public net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder wrapperContained; public SmithingTrimRecipeJsonBuilder(net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(wrapperContained.template); }
// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(wrapperContained.addition); }
// public java.util.Map criteria() { return wrapperContained.criteria; }
// public void validate(yarnwrap.util.Identifier recipeId) { wrapperContained.validate(recipeId.wrapperContained); }
public yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder create(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.recipe.book.RecipeCategory category) { return new yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder(wrapperContained.create(template.wrapperContained,base.wrapperContained,addition.wrapperContained,category.wrapperContained)); }
public yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion) { return new yarnwrap.data.server.recipe.SmithingTrimRecipeJsonBuilder(wrapperContained.criterion(name,criterion.wrapperContained)); }
public void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,yarnwrap.util.Identifier recipeId) { wrapperContained.offerTo(exporter.wrapperContained,recipeId.wrapperContained); }

}