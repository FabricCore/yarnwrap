package yarnwrap.client.gui.widget;
public class TexturedButtonWidget { public net.minecraft.client.gui.widget.TexturedButtonWidget wrapperContained; public TexturedButtonWidget(net.minecraft.client.gui.widget.TexturedButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.ButtonTextures textures() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.textures); }
// public void textures(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.textures = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.ButtonTextures textures() { return new yarnwrap.client.gui.screen.ButtonTextures(net.minecraft.client.gui.widget.TexturedButtonWidget.textures); }
// public static void textures(yarnwrap.client.gui.screen.ButtonTextures value, ) { net.minecraft.client.gui.widget.TexturedButtonWidget.textures = value.wrapperContained; }

// public TexturedButtonWidget(int x,int y,int width,int height,yarnwrap.client.gui.screen.ButtonTextures textures,Object pressAction) { this.wrapperContained = new net.minecraft.client.gui.widget.TexturedButtonWidget(x,y,width,height,textures.wrapperContained,pressAction); }
// public TexturedButtonWidget(int x,int y,int width,int height,yarnwrap.client.gui.screen.ButtonTextures textures,Object pressAction,yarnwrap.text.Text text) { this.wrapperContained = new net.minecraft.client.gui.widget.TexturedButtonWidget(x,y,width,height,textures.wrapperContained,pressAction,text.wrapperContained); }
// public TexturedButtonWidget(int width,int height,yarnwrap.client.gui.screen.ButtonTextures textures,Object pressAction,yarnwrap.text.Text text) { this.wrapperContained = new net.minecraft.client.gui.widget.TexturedButtonWidget(width,height,textures.wrapperContained,pressAction,text.wrapperContained); }

}