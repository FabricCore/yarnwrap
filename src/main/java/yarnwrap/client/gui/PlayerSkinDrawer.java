package yarnwrap.client.gui;
public class PlayerSkinDrawer { public net.minecraft.client.gui.PlayerSkinDrawer wrapperContained; public PlayerSkinDrawer(net.minecraft.client.gui.PlayerSkinDrawer wrapperContained) { this.wrapperContained = wrapperContained; }

public int FACE_WIDTH() { return wrapperContained.FACE_WIDTH; }
// public void FACE_WIDTH(int value) { wrapperContained.FACE_WIDTH = value; }
public int FACE_HEIGHT() { return wrapperContained.FACE_HEIGHT; }
// public void FACE_HEIGHT(int value) { wrapperContained.FACE_HEIGHT = value; }
public int FACE_X() { return wrapperContained.FACE_X; }
// public void FACE_X(int value) { wrapperContained.FACE_X = value; }
public int FACE_Y() { return wrapperContained.FACE_Y; }
// public void FACE_Y(int value) { wrapperContained.FACE_Y = value; }
public int FACE_OVERLAY_X() { return wrapperContained.FACE_OVERLAY_X; }
// public void FACE_OVERLAY_X(int value) { wrapperContained.FACE_OVERLAY_X = value; }
public int FACE_OVERLAY_Y() { return wrapperContained.FACE_OVERLAY_Y; }
// public void FACE_OVERLAY_Y(int value) { wrapperContained.FACE_OVERLAY_Y = value; }
public int SKIN_TEXTURE_WIDTH() { return wrapperContained.SKIN_TEXTURE_WIDTH; }
// public void SKIN_TEXTURE_WIDTH(int value) { wrapperContained.SKIN_TEXTURE_WIDTH = value; }
public int SKIN_TEXTURE_HEIGHT() { return wrapperContained.SKIN_TEXTURE_HEIGHT; }
// public void SKIN_TEXTURE_HEIGHT(int value) { wrapperContained.SKIN_TEXTURE_HEIGHT = value; }
public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,int x,int y,int size) { wrapperContained.draw(context.wrapperContained,texture.wrapperContained,x,y,size); }
// public void drawHat(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,int x,int y,int size,boolean upsideDown) { wrapperContained.drawHat(context.wrapperContained,texture.wrapperContained,x,y,size,upsideDown); }
public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,int x,int y,int size,boolean hatVisible,boolean upsideDown) { wrapperContained.draw(context.wrapperContained,texture.wrapperContained,x,y,size,hatVisible,upsideDown); }
public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.util.SkinTextures textures,int x,int y,int size) { wrapperContained.draw(context.wrapperContained,textures.wrapperContained,x,y,size); }

}