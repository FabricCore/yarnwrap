package yarnwrap.client.gui.screen.ingame;
public class InventoryScreen { public net.minecraft.client.gui.screen.ingame.InventoryScreen wrapperContained; public InventoryScreen(net.minecraft.client.gui.screen.ingame.InventoryScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.recipebook.RecipeBookWidget recipeBook() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookWidget(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.client.gui.screen.recipebook.RecipeBookWidget value) { wrapperContained.recipeBook = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.recipebook.RecipeBookWidget recipeBook() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookWidget(net.minecraft.client.gui.screen.ingame.InventoryScreen.recipeBook); }
// public static void recipeBook(yarnwrap.client.gui.screen.recipebook.RecipeBookWidget value, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.recipeBook = value.wrapperContained; }

// public boolean mouseDown() { return wrapperContained.mouseDown; }
// public void mouseDown(boolean value) { wrapperContained.mouseDown = value; }
// public static boolean mouseDown() { return net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseDown; }
// public static void mouseDown(boolean value, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseDown = value; }

// public boolean narrow() { return wrapperContained.narrow; }
// public void narrow(boolean value) { wrapperContained.narrow = value; }
// public static boolean narrow() { return net.minecraft.client.gui.screen.ingame.InventoryScreen.narrow; }
// public static void narrow(boolean value, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.narrow = value; }

// public float mouseY() { return wrapperContained.mouseY; }
// public void mouseY(float value) { wrapperContained.mouseY = value; }
// public static float mouseY() { return net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseY; }
// public static void mouseY(float value, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseY = value; }

// public float mouseX() { return wrapperContained.mouseX; }
// public void mouseX(float value) { wrapperContained.mouseX = value; }
// public static float mouseX() { return net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseX; }
// public static void mouseX(float value, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.mouseX = value; }

public InventoryScreen(yarnwrap.entity.player.PlayerEntity player) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.InventoryScreen(player.wrapperContained); }
// public void method_19891(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19891(button.wrapperContained); }
// public static void method_19891(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.method_19891(button.wrapperContained); }
// public void drawEntity(yarnwrap.client.gui.DrawContext context,int x1,int y1,int x2,int y2,int size,float mouseX,float mouseY,float entity) { wrapperContained.drawEntity(context.wrapperContained,x1,y1,x2,y2,size,mouseX,mouseY,entity); }
// public static void drawEntity(yarnwrap.client.gui.DrawContext context,int x1,int y1,int x2,int y2,int size,float mouseX,float mouseY,float entity, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.drawEntity(context.wrapperContained,x1,y1,x2,y2,size,mouseX,mouseY,entity); }
// public void drawEntity(yarnwrap.client.gui.DrawContext context,float x,float y,float size,org.joml.Vector3f entity) { wrapperContained.drawEntity(context.wrapperContained,x,y,size,entity); }
// public static void drawEntity(yarnwrap.client.gui.DrawContext context,float x,float y,float size,org.joml.Vector3f entity, ) { net.minecraft.client.gui.screen.ingame.InventoryScreen.drawEntity(context.wrapperContained,x,y,size,entity); }

}