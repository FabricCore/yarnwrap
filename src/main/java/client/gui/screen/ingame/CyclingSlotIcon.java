package yarnwrap.client.gui.screen.ingame;
public class CyclingSlotIcon { public net.minecraft.client.gui.screen.ingame.CyclingSlotIcon wrapperContained; public CyclingSlotIcon(net.minecraft.client.gui.screen.ingame.CyclingSlotIcon wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slotId() { return wrapperContained.slotId; }
// public java.util.List textures() { return wrapperContained.textures; }
// public int timer() { return wrapperContained.timer; }
// public int currentIndex() { return wrapperContained.currentIndex; }
// public float computeAlpha(float delta) { return wrapperContained.computeAlpha(delta); }
public void render(yarnwrap.screen.ScreenHandler screenHandler,yarnwrap.client.gui.DrawContext context,float delta,int x,int y) { wrapperContained.render(screenHandler.wrapperContained,context.wrapperContained,delta,x,y); }
// public void drawIcon(yarnwrap.screen.slot.Slot slot,yarnwrap.util.Identifier texture,float alpha,yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawIcon(slot.wrapperContained,texture.wrapperContained,alpha,context.wrapperContained,x,y); }
public void updateTexture(java.util.List textures) { wrapperContained.updateTexture(textures); }

}