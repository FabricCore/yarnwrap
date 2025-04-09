package yarnwrap.client.gui;
public class PlayerSkinDrawer { public net.minecraft.client.gui.PlayerSkinDrawer wrapperContained; public PlayerSkinDrawer(net.minecraft.client.gui.PlayerSkinDrawer wrapperContained) { this.wrapperContained = wrapperContained; }

public int FACE_WIDTH() { return wrapperContained.FACE_WIDTH; }
public int FACE_HEIGHT() { return wrapperContained.FACE_HEIGHT; }
public int FACE_X() { return wrapperContained.FACE_X; }
public int FACE_Y() { return wrapperContained.FACE_Y; }
public int FACE_OVERLAY_X() { return wrapperContained.FACE_OVERLAY_X; }
public int FACE_OVERLAY_Y() { return wrapperContained.FACE_OVERLAY_Y; }
public int SKIN_TEXTURE_WIDTH() { return wrapperContained.SKIN_TEXTURE_WIDTH; }
public int SKIN_TEXTURE_HEIGHT() { return wrapperContained.SKIN_TEXTURE_HEIGHT; }
public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,int x,int y,int size) { wrapperContained.draw(context.wrapperContained,texture.wrapperContained,x,y,size); }
// public void drawHat(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,int x,int y,int size,boolean upsideDown) { wrapperContained.drawHat(context.wrapperContained,texture.wrapperContained,x,y,size,upsideDown); }
public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,int x,int y,int size,boolean hatVisible,boolean upsideDown) { wrapperContained.draw(context.wrapperContained,texture.wrapperContained,x,y,size,hatVisible,upsideDown); }
public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.util.SkinTextures textures,int x,int y,int size) { wrapperContained.draw(context.wrapperContained,textures.wrapperContained,x,y,size); }

}