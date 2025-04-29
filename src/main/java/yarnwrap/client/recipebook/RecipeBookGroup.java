package yarnwrap.client.recipebook;
public class RecipeBookGroup { public net.minecraft.client.recipebook.RecipeBookGroup wrapperContained; public RecipeBookGroup(net.minecraft.client.recipebook.RecipeBookGroup wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List icons() { return wrapperContained.icons; }
// public void icons(java.util.List value) { wrapperContained.icons = value; }
// public static java.util.List icons() { return net.minecraft.client.recipebook.RecipeBookGroup.icons; }
// public static void icons(java.util.List value, ) { net.minecraft.client.recipebook.RecipeBookGroup.icons = value; }

// public java.util.List SMOKER() { return wrapperContained.SMOKER; }
// public void SMOKER(java.util.List value) { wrapperContained.SMOKER = value; }
public static java.util.List SMOKER() { return net.minecraft.client.recipebook.RecipeBookGroup.SMOKER; }
// public static void SMOKER(java.util.List value, ) { net.minecraft.client.recipebook.RecipeBookGroup.SMOKER = value; }

// public java.util.List BLAST_FURNACE() { return wrapperContained.BLAST_FURNACE; }
// public void BLAST_FURNACE(java.util.List value) { wrapperContained.BLAST_FURNACE = value; }
public static java.util.List BLAST_FURNACE() { return net.minecraft.client.recipebook.RecipeBookGroup.BLAST_FURNACE; }
// public static void BLAST_FURNACE(java.util.List value, ) { net.minecraft.client.recipebook.RecipeBookGroup.BLAST_FURNACE = value; }

// public java.util.List FURNACE() { return wrapperContained.FURNACE; }
// public void FURNACE(java.util.List value) { wrapperContained.FURNACE = value; }
public static java.util.List FURNACE() { return net.minecraft.client.recipebook.RecipeBookGroup.FURNACE; }
// public static void FURNACE(java.util.List value, ) { net.minecraft.client.recipebook.RecipeBookGroup.FURNACE = value; }

// public java.util.List CRAFTING() { return wrapperContained.CRAFTING; }
// public void CRAFTING(java.util.List value) { wrapperContained.CRAFTING = value; }
public static java.util.List CRAFTING() { return net.minecraft.client.recipebook.RecipeBookGroup.CRAFTING; }
// public static void CRAFTING(java.util.List value, ) { net.minecraft.client.recipebook.RecipeBookGroup.CRAFTING = value; }

// public java.util.Map SEARCH_MAP() { return wrapperContained.SEARCH_MAP; }
// public void SEARCH_MAP(java.util.Map value) { wrapperContained.SEARCH_MAP = value; }
public static java.util.Map SEARCH_MAP() { return net.minecraft.client.recipebook.RecipeBookGroup.SEARCH_MAP; }
// public static void SEARCH_MAP(java.util.Map value, ) { net.minecraft.client.recipebook.RecipeBookGroup.SEARCH_MAP = value; }

// public RecipeBookGroup(java.lang.String entries) { this.wrapperContained = new net.minecraft.client.recipebook.RecipeBookGroup(entries); }
public java.util.List getIcons() { return wrapperContained.getIcons(); }
// public static java.util.List getIcons() { return net.minecraft.client.recipebook.RecipeBookGroup.getIcons(); }
// public java.util.List getGroups(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.getGroups(category.wrapperContained); }
// public static java.util.List getGroups(yarnwrap.recipe.book.RecipeBookCategory category, ) { return net.minecraft.client.recipebook.RecipeBookGroup.getGroups(category.wrapperContained); }

}