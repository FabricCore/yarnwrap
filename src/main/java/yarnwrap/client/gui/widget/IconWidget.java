package yarnwrap.client.gui.widget;
public class IconWidget { public net.minecraft.client.gui.widget.IconWidget wrapperContained; public IconWidget(net.minecraft.client.gui.widget.IconWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public IconWidget(int x,int y,int width,int height) { this.wrapperContained = new net.minecraft.client.gui.widget.IconWidget(x,y,width,height); }
// public yarnwrap.client.gui.widget.IconWidget create(int width,int height,yarnwrap.util.Identifier texture) { return new yarnwrap.client.gui.widget.IconWidget(wrapperContained.create(width,height,texture.wrapperContained)); }
// public static yarnwrap.client.gui.widget.IconWidget create(int width,int height,yarnwrap.util.Identifier texture, ) { return new yarnwrap.client.gui.widget.IconWidget(net.minecraft.client.gui.widget.IconWidget.create(width,height,texture.wrapperContained)); }
// public yarnwrap.client.gui.widget.IconWidget create(int width,int height,yarnwrap.util.Identifier texture,int textureWidth,int textureHeight) { return new yarnwrap.client.gui.widget.IconWidget(wrapperContained.create(width,height,texture.wrapperContained,textureWidth,textureHeight)); }
// public static yarnwrap.client.gui.widget.IconWidget create(int width,int height,yarnwrap.util.Identifier texture,int textureWidth,int textureHeight, ) { return new yarnwrap.client.gui.widget.IconWidget(net.minecraft.client.gui.widget.IconWidget.create(width,height,texture.wrapperContained,textureWidth,textureHeight)); }
// public void setTexture(yarnwrap.util.Identifier texture) { wrapperContained.setTexture(texture.wrapperContained); }
// public static void setTexture(yarnwrap.util.Identifier texture, ) { net.minecraft.client.gui.widget.IconWidget.setTexture(texture.wrapperContained); }

}