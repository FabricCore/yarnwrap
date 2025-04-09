package yarnwrap.client.gui.screen.ingame;
public class ForgingScreen { public net.minecraft.client.gui.screen.ingame.ForgingScreen wrapperContained; public ForgingScreen(net.minecraft.client.gui.screen.ingame.ForgingScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void renderForeground(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta) { wrapperContained.renderForeground(context.wrapperContained,mouseX,mouseY,delta); }
// public void setup() { wrapperContained.setup(); }
// public void drawInvalidRecipeArrow(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawInvalidRecipeArrow(context.wrapperContained,x,y); }

}