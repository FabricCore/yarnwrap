package yarnwrap.client.gui;
public class Drawable { public net.minecraft.client.gui.Drawable wrapperContained; public Drawable(net.minecraft.client.gui.Drawable wrapperContained) { this.wrapperContained = wrapperContained; }

public void render(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float deltaTicks) { wrapperContained.render(context.wrapperContained,mouseX,mouseY,deltaTicks); }
// public static void render(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float deltaTicks, ) { net.minecraft.client.gui.Drawable.render(context.wrapperContained,mouseX,mouseY,deltaTicks); }

}