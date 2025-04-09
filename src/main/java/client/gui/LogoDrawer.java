package yarnwrap.client.gui;
public class LogoDrawer { public net.minecraft.client.gui.LogoDrawer wrapperContained; public LogoDrawer(net.minecraft.client.gui.LogoDrawer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier LOGO_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.LOGO_TEXTURE); }
public yarnwrap.util.Identifier EDITION_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EDITION_TEXTURE); }
public int LOGO_REGION_WIDTH() { return wrapperContained.LOGO_REGION_WIDTH; }
public int LOGO_REGION_HEIGHT() { return wrapperContained.LOGO_REGION_HEIGHT; }
public int LOGO_BASE_Y() { return wrapperContained.LOGO_BASE_Y; }
// public boolean minceraft() { return wrapperContained.minceraft; }
// public boolean ignoreAlpha() { return wrapperContained.ignoreAlpha; }
public yarnwrap.util.Identifier MINCERAFT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MINCERAFT_TEXTURE); }
// public int LOGO_TEXTURE_WIDTH() { return wrapperContained.LOGO_TEXTURE_WIDTH; }
// public int LOGO_TEXTURE_HEIGHT() { return wrapperContained.LOGO_TEXTURE_HEIGHT; }
// public int EDITION_REGION_WIDTH() { return wrapperContained.EDITION_REGION_WIDTH; }
// public int EDITION_REGION_HEIGHT() { return wrapperContained.EDITION_REGION_HEIGHT; }
// public int EDITION_TEXTURE_WIDTH() { return wrapperContained.EDITION_TEXTURE_WIDTH; }
// public int EDITION_TEXTURE_HEIGHT() { return wrapperContained.EDITION_TEXTURE_HEIGHT; }
// public int LOGO_AND_EDITION_OVERLAP() { return wrapperContained.LOGO_AND_EDITION_OVERLAP; }
public void draw(yarnwrap.client.gui.DrawContext context,int screenWidth,float alpha) { wrapperContained.draw(context.wrapperContained,screenWidth,alpha); }
public void draw(yarnwrap.client.gui.DrawContext context,int screenWidth,float alpha,int y) { wrapperContained.draw(context.wrapperContained,screenWidth,alpha,y); }

}