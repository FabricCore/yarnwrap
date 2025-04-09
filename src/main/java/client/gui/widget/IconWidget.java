package yarnwrap.client.gui.widget;
public class IconWidget { public net.minecraft.client.gui.widget.IconWidget wrapperContained; public IconWidget(net.minecraft.client.gui.widget.IconWidget wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.gui.widget.IconWidget create(int width,int height,yarnwrap.util.Identifier texture) { return new yarnwrap.client.gui.widget.IconWidget(wrapperContained.create(width,height,texture.wrapperContained)); }
public yarnwrap.client.gui.widget.IconWidget create(int width,int height,yarnwrap.util.Identifier texture,int textureWidth,int textureHeight) { return new yarnwrap.client.gui.widget.IconWidget(wrapperContained.create(width,height,texture.wrapperContained,textureWidth,textureHeight)); }

}