package yarnwrap.client.gui.widget;
public class ToggleButtonWidget { public net.minecraft.client.gui.widget.ToggleButtonWidget wrapperContained; public ToggleButtonWidget(net.minecraft.client.gui.widget.ToggleButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean toggled() { return wrapperContained.toggled; }
// public void toggled(boolean value) { wrapperContained.toggled = value; }
// public yarnwrap.client.gui.screen.ButtonTextures textures() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.textures); }
// public void textures(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.textures = value.wrapperContained; }
public ToggleButtonWidget(int x,int y,int width,int height,boolean toggled) { this.wrapperContained = new net.minecraft.client.gui.widget.ToggleButtonWidget(x,y,width,height,toggled); }
public void setTextures(yarnwrap.client.gui.screen.ButtonTextures textures) { wrapperContained.setTextures(textures.wrapperContained); }
public void setToggled(boolean toggled) { wrapperContained.setToggled(toggled); }
public boolean isToggled() { return wrapperContained.isToggled(); }

}