package yarnwrap.client.gui.screen.ingame;
public class InventoryScreen { public net.minecraft.client.gui.screen.ingame.InventoryScreen wrapperContained; public InventoryScreen(net.minecraft.client.gui.screen.ingame.InventoryScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.recipebook.RecipeBookWidget recipeBook() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookWidget(wrapperContained.recipeBook); }
// public boolean mouseDown() { return wrapperContained.mouseDown; }
// public boolean narrow() { return wrapperContained.narrow; }
// public float mouseY() { return wrapperContained.mouseY; }
// public float mouseX() { return wrapperContained.mouseX; }
// public void drawEntity(yarnwrap.client.gui.DrawContext context,int x1,int y1,int x2,int y2,int size,float mouseX,float mouseY,float entity) { wrapperContained.drawEntity(context.wrapperContained,x1,y1,x2,y2,size,mouseX,mouseY,entity); }
// public void drawEntity(yarnwrap.client.gui.DrawContext context,float x,float y,float size,org.joml.Vector3f entity) { wrapperContained.drawEntity(context.wrapperContained,x,y,size,entity); }

}