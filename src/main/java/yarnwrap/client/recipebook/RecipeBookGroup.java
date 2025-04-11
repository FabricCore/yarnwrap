package yarnwrap.client.recipebook;
public class RecipeBookGroup { public net.minecraft.client.recipebook.RecipeBookGroup wrapperContained; public RecipeBookGroup(net.minecraft.client.recipebook.RecipeBookGroup wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List icons() { return wrapperContained.icons; }
// public void icons(java.util.List value) { wrapperContained.icons = value; }
public java.util.List SMOKER() { return wrapperContained.SMOKER; }
// public void SMOKER(java.util.List value) { wrapperContained.SMOKER = value; }
public java.util.List BLAST_FURNACE() { return wrapperContained.BLAST_FURNACE; }
// public void BLAST_FURNACE(java.util.List value) { wrapperContained.BLAST_FURNACE = value; }
public java.util.List FURNACE() { return wrapperContained.FURNACE; }
// public void FURNACE(java.util.List value) { wrapperContained.FURNACE = value; }
public java.util.List CRAFTING() { return wrapperContained.CRAFTING; }
// public void CRAFTING(java.util.List value) { wrapperContained.CRAFTING = value; }
public java.util.Map SEARCH_MAP() { return wrapperContained.SEARCH_MAP; }
// public void SEARCH_MAP(java.util.Map value) { wrapperContained.SEARCH_MAP = value; }
public java.util.List getIcons() { return wrapperContained.getIcons(); }
public java.util.List getGroups(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.getGroups(category.wrapperContained); }

}