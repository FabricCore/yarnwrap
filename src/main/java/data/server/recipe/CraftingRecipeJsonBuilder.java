package yarnwrap.data.server.recipe;
public class CraftingRecipeJsonBuilder { public net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder wrapperContained; public CraftingRecipeJsonBuilder(net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier ROOT() { return new yarnwrap.util.Identifier(wrapperContained.ROOT); }
public void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter) { wrapperContained.offerTo(exporter.wrapperContained); }
public void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,yarnwrap.util.Identifier recipeId) { wrapperContained.offerTo(exporter.wrapperContained,recipeId.wrapperContained); }
public yarnwrap.data.server.recipe.CraftingRecipeJsonBuilder group(java.lang.String group) { return new yarnwrap.data.server.recipe.CraftingRecipeJsonBuilder(wrapperContained.group(group)); }
public yarnwrap.data.server.recipe.CraftingRecipeJsonBuilder criterion(java.lang.String name,yarnwrap.advancement.AdvancementCriterion criterion) { return new yarnwrap.data.server.recipe.CraftingRecipeJsonBuilder(wrapperContained.criterion(name,criterion.wrapperContained)); }
public yarnwrap.item.Item getOutputItem() { return new yarnwrap.item.Item(wrapperContained.getOutputItem()); }
// public yarnwrap.util.Identifier getItemId(yarnwrap.item.ItemConvertible item) { return new yarnwrap.util.Identifier(wrapperContained.getItemId(item.wrapperContained)); }
public void offerTo(yarnwrap.data.server.recipe.RecipeExporter exporter,java.lang.String recipePath) { wrapperContained.offerTo(exporter.wrapperContained,recipePath); }
// public yarnwrap.recipe.book.CraftingRecipeCategory toCraftingCategory(yarnwrap.recipe.book.RecipeCategory category) { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.toCraftingCategory(category.wrapperContained)); }

}