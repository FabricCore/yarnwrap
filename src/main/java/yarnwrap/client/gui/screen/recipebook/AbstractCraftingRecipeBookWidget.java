package yarnwrap.client.gui.screen.recipebook;
public class AbstractCraftingRecipeBookWidget { public net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget wrapperContained; public AbstractCraftingRecipeBookWidget(net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TEXTURES); }
// public void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.TEXTURES = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget.TEXTURES); }
// public static void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value, ) { net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget.TEXTURES = value.wrapperContained; }

// public yarnwrap.text.Text TOGGLE_CRAFTABLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOGGLE_CRAFTABLE_TEXT); }
// public void TOGGLE_CRAFTABLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TOGGLE_CRAFTABLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TOGGLE_CRAFTABLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget.TOGGLE_CRAFTABLE_TEXT); }
// public static void TOGGLE_CRAFTABLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget.TOGGLE_CRAFTABLE_TEXT = value.wrapperContained; }

// public java.util.List TABS() { return wrapperContained.TABS; }
// public void TABS(java.util.List value) { wrapperContained.TABS = value; }
// public static java.util.List TABS() { return net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget.TABS; }
// public static void TABS(java.util.List value, ) { net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget.TABS = value; }

public AbstractCraftingRecipeBookWidget(yarnwrap.screen.AbstractCraftingScreenHandler screenHandler) { this.wrapperContained = new net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget(screenHandler.wrapperContained); }
// public void method_64869(java.util.List slot,yarnwrap.client.gui.screen.recipebook.GhostRecipe index,yarnwrap.util.context.ContextParameterMap x,yarnwrap.recipe.display.SlotDisplay y) { wrapperContained.method_64869(slot,index.wrapperContained,x.wrapperContained,y.wrapperContained); }
// public static void method_64869(java.util.List slot,yarnwrap.client.gui.screen.recipebook.GhostRecipe index,yarnwrap.util.context.ContextParameterMap x,yarnwrap.recipe.display.SlotDisplay y, ) { net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget.method_64869(slot,index.wrapperContained,x.wrapperContained,y.wrapperContained); }
// public boolean canDisplay(yarnwrap.recipe.display.RecipeDisplay display) { return wrapperContained.canDisplay(display.wrapperContained); }
// public static boolean canDisplay(yarnwrap.recipe.display.RecipeDisplay display, ) { return net.minecraft.client.gui.screen.recipebook.AbstractCraftingRecipeBookWidget.canDisplay(display.wrapperContained); }

}