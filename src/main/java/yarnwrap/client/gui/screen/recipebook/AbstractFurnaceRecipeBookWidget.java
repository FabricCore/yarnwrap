package yarnwrap.client.gui.screen.recipebook;
public class AbstractFurnaceRecipeBookWidget { public net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookWidget wrapperContained; public AbstractFurnaceRecipeBookWidget(net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TEXTURES); }
// public void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.TEXTURES = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookWidget.TEXTURES); }
// public static void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value, ) { net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookWidget.TEXTURES = value.wrapperContained; }

// public yarnwrap.text.Text toggleCraftableButtonText() { return new yarnwrap.text.Text(wrapperContained.toggleCraftableButtonText); }
// public void toggleCraftableButtonText(yarnwrap.text.Text value) { wrapperContained.toggleCraftableButtonText = value.wrapperContained; }
// public static yarnwrap.text.Text toggleCraftableButtonText() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookWidget.toggleCraftableButtonText); }
// public static void toggleCraftableButtonText(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookWidget.toggleCraftableButtonText = value.wrapperContained; }

public AbstractFurnaceRecipeBookWidget(yarnwrap.screen.AbstractFurnaceScreenHandler screenHandler,yarnwrap.text.Text toggleCraftableButtonText,java.util.List tabs) { this.wrapperContained = new net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookWidget(screenHandler.wrapperContained,toggleCraftableButtonText.wrapperContained,tabs); }
// public boolean method_64871(yarnwrap.recipe.display.RecipeDisplay display) { return wrapperContained.method_64871(display.wrapperContained); }
// public static boolean method_64871(yarnwrap.recipe.display.RecipeDisplay display, ) { return net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookWidget.method_64871(display.wrapperContained); }

}