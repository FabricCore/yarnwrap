package yarnwrap.client.gui.screen.ingame;
public class ForgingScreen { public net.minecraft.client.gui.screen.ingame.ForgingScreen wrapperContained; public ForgingScreen(net.minecraft.client.gui.screen.ingame.ForgingScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.ForgingScreen.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.ForgingScreen.texture = value.wrapperContained; }

// public ForgingScreen(yarnwrap.screen.ForgingScreenHandler handler,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.text.Text title,yarnwrap.util.Identifier texture) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.ForgingScreen(handler.wrapperContained,playerInventory.wrapperContained,title.wrapperContained,texture.wrapperContained); }
// public void renderForeground(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta) { wrapperContained.renderForeground(context.wrapperContained,mouseX,mouseY,delta); }
// public static void renderForeground(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta, ) { net.minecraft.client.gui.screen.ingame.ForgingScreen.renderForeground(context.wrapperContained,mouseX,mouseY,delta); }
// public void setup() { wrapperContained.setup(); }
// public static void setup() { net.minecraft.client.gui.screen.ingame.ForgingScreen.setup(); }
// public void drawInvalidRecipeArrow(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawInvalidRecipeArrow(context.wrapperContained,x,y); }
// public static void drawInvalidRecipeArrow(yarnwrap.client.gui.DrawContext context,int x,int y, ) { net.minecraft.client.gui.screen.ingame.ForgingScreen.drawInvalidRecipeArrow(context.wrapperContained,x,y); }

}