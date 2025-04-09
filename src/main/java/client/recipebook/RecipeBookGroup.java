package yarnwrap.client.recipebook;
public class RecipeBookGroup { public net.minecraft.client.recipebook.RecipeBookGroup wrapperContained; public RecipeBookGroup(net.minecraft.client.recipebook.RecipeBookGroup wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List icons() { return wrapperContained.icons; }
public java.util.List SMOKER() { return wrapperContained.SMOKER; }
public java.util.List BLAST_FURNACE() { return wrapperContained.BLAST_FURNACE; }
public java.util.List FURNACE() { return wrapperContained.FURNACE; }
public java.util.List CRAFTING() { return wrapperContained.CRAFTING; }
public java.util.Map SEARCH_MAP() { return wrapperContained.SEARCH_MAP; }
public java.util.List getIcons() { return wrapperContained.getIcons(); }
public java.util.List getGroups(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.getGroups(category.wrapperContained); }

}