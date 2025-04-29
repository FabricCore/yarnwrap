package yarnwrap.client.gui.screen.ingame;
public class CyclingSlotIcon { public net.minecraft.client.gui.screen.ingame.CyclingSlotIcon wrapperContained; public CyclingSlotIcon(net.minecraft.client.gui.screen.ingame.CyclingSlotIcon wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slotId() { return wrapperContained.slotId; }
// public void slotId(int value) { wrapperContained.slotId = value; }
// public static int slotId() { return net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.slotId; }
// public static void slotId(int value, ) { net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.slotId = value; }

// public java.util.List textures() { return wrapperContained.textures; }
// public void textures(java.util.List value) { wrapperContained.textures = value; }
// public static java.util.List textures() { return net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.textures; }
// public static void textures(java.util.List value, ) { net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.textures = value; }

// public int timer() { return wrapperContained.timer; }
// public void timer(int value) { wrapperContained.timer = value; }
// public static int timer() { return net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.timer; }
// public static void timer(int value, ) { net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.timer = value; }

// public int currentIndex() { return wrapperContained.currentIndex; }
// public void currentIndex(int value) { wrapperContained.currentIndex = value; }
// public static int currentIndex() { return net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.currentIndex; }
// public static void currentIndex(int value, ) { net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.currentIndex = value; }

public CyclingSlotIcon(int slotId) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.CyclingSlotIcon(slotId); }
// public float computeAlpha(float delta) { return wrapperContained.computeAlpha(delta); }
// public static float computeAlpha(float delta, ) { return net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.computeAlpha(delta); }
public void render(yarnwrap.screen.ScreenHandler screenHandler,yarnwrap.client.gui.DrawContext context,float delta,int x,int y) { wrapperContained.render(screenHandler.wrapperContained,context.wrapperContained,delta,x,y); }
// public static void render(yarnwrap.screen.ScreenHandler screenHandler,yarnwrap.client.gui.DrawContext context,float delta,int x,int y, ) { net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.render(screenHandler.wrapperContained,context.wrapperContained,delta,x,y); }
// public void drawIcon(yarnwrap.screen.slot.Slot slot,yarnwrap.util.Identifier texture,float alpha,yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawIcon(slot.wrapperContained,texture.wrapperContained,alpha,context.wrapperContained,x,y); }
// public static void drawIcon(yarnwrap.screen.slot.Slot slot,yarnwrap.util.Identifier texture,float alpha,yarnwrap.client.gui.DrawContext context,int x,int y, ) { net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.drawIcon(slot.wrapperContained,texture.wrapperContained,alpha,context.wrapperContained,x,y); }
public void updateTexture(java.util.List textures) { wrapperContained.updateTexture(textures); }
// public static void updateTexture(java.util.List textures, ) { net.minecraft.client.gui.screen.ingame.CyclingSlotIcon.updateTexture(textures); }

}