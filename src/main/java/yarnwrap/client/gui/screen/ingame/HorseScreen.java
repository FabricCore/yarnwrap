package yarnwrap.client.gui.screen.ingame;
public class HorseScreen { public net.minecraft.client.gui.screen.ingame.HorseScreen wrapperContained; public HorseScreen(net.minecraft.client.gui.screen.ingame.HorseScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.HorseScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.HorseScreen.TEXTURE = value.wrapperContained; }

// public float mouseY() { return wrapperContained.mouseY; }
// public void mouseY(float value) { wrapperContained.mouseY = value; }
// public static float mouseY() { return net.minecraft.client.gui.screen.ingame.HorseScreen.mouseY; }
// public static void mouseY(float value, ) { net.minecraft.client.gui.screen.ingame.HorseScreen.mouseY = value; }

// public float mouseX() { return wrapperContained.mouseX; }
// public void mouseX(float value) { wrapperContained.mouseX = value; }
// public static float mouseX() { return net.minecraft.client.gui.screen.ingame.HorseScreen.mouseX; }
// public static void mouseX(float value, ) { net.minecraft.client.gui.screen.ingame.HorseScreen.mouseX = value; }

// public yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.passive.AbstractHorseEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.passive.AbstractHorseEntity entity() { return new yarnwrap.entity.passive.AbstractHorseEntity(net.minecraft.client.gui.screen.ingame.HorseScreen.entity); }
// public static void entity(yarnwrap.entity.passive.AbstractHorseEntity value, ) { net.minecraft.client.gui.screen.ingame.HorseScreen.entity = value.wrapperContained; }

// public yarnwrap.util.Identifier CHEST_SLOTS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CHEST_SLOTS_TEXTURE); }
// public void CHEST_SLOTS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CHEST_SLOTS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier CHEST_SLOTS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.HorseScreen.CHEST_SLOTS_TEXTURE); }
// public static void CHEST_SLOTS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.HorseScreen.CHEST_SLOTS_TEXTURE = value.wrapperContained; }

// public int slotColumnCount() { return wrapperContained.slotColumnCount; }
// public void slotColumnCount(int value) { wrapperContained.slotColumnCount = value; }
// public static int slotColumnCount() { return net.minecraft.client.gui.screen.ingame.HorseScreen.slotColumnCount; }
// public static void slotColumnCount(int value, ) { net.minecraft.client.gui.screen.ingame.HorseScreen.slotColumnCount = value; }

// public yarnwrap.util.Identifier SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_TEXTURE); }
// public void SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SLOT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.HorseScreen.SLOT_TEXTURE); }
// public static void SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.HorseScreen.SLOT_TEXTURE = value.wrapperContained; }

public HorseScreen(yarnwrap.screen.HorseScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.entity.passive.AbstractHorseEntity entity,int slotColumnCount) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.HorseScreen(handler.wrapperContained,inventory.wrapperContained,entity.wrapperContained,slotColumnCount); }
// public void drawSlot(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawSlot(context.wrapperContained,x,y); }
// public static void drawSlot(yarnwrap.client.gui.DrawContext context,int x,int y, ) { net.minecraft.client.gui.screen.ingame.HorseScreen.drawSlot(context.wrapperContained,x,y); }

}