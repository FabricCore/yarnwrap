package yarnwrap.client.gui.screen.ingame;
public class CrafterScreen { public net.minecraft.client.gui.screen.ingame.CrafterScreen wrapperContained; public CrafterScreen(net.minecraft.client.gui.screen.ingame.CrafterScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.CrafterScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.TEXTURE = value.wrapperContained; }

// public yarnwrap.text.Text TOGGLEABLE_SLOT_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOGGLEABLE_SLOT_TEXT); }
// public void TOGGLEABLE_SLOT_TEXT(yarnwrap.text.Text value) { wrapperContained.TOGGLEABLE_SLOT_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TOGGLEABLE_SLOT_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.CrafterScreen.TOGGLEABLE_SLOT_TEXT); }
// public static void TOGGLEABLE_SLOT_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.TOGGLEABLE_SLOT_TEXT = value.wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.client.gui.screen.ingame.CrafterScreen.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.player = value.wrapperContained; }

// public yarnwrap.util.Identifier DISABLED_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DISABLED_SLOT_TEXTURE); }
// public void DISABLED_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.DISABLED_SLOT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier DISABLED_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.CrafterScreen.DISABLED_SLOT_TEXTURE); }
// public static void DISABLED_SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.DISABLED_SLOT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier POWERED_REDSTONE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.POWERED_REDSTONE_TEXTURE); }
// public void POWERED_REDSTONE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.POWERED_REDSTONE_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier POWERED_REDSTONE_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.CrafterScreen.POWERED_REDSTONE_TEXTURE); }
// public static void POWERED_REDSTONE_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.POWERED_REDSTONE_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier UNPOWERED_REDSTONE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.UNPOWERED_REDSTONE_TEXTURE); }
// public void UNPOWERED_REDSTONE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.UNPOWERED_REDSTONE_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier UNPOWERED_REDSTONE_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.CrafterScreen.UNPOWERED_REDSTONE_TEXTURE); }
// public static void UNPOWERED_REDSTONE_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.UNPOWERED_REDSTONE_TEXTURE = value.wrapperContained; }

public CrafterScreen(yarnwrap.screen.CrafterScreenHandler handler,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.CrafterScreen(handler.wrapperContained,playerInventory.wrapperContained,title.wrapperContained); }
// public void drawDisabledSlot(yarnwrap.client.gui.DrawContext context,yarnwrap.screen.slot.CrafterInputSlot slot) { wrapperContained.drawDisabledSlot(context.wrapperContained,slot.wrapperContained); }
// public static void drawDisabledSlot(yarnwrap.client.gui.DrawContext context,yarnwrap.screen.slot.CrafterInputSlot slot, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.drawDisabledSlot(context.wrapperContained,slot.wrapperContained); }
// public void drawArrowTexture(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawArrowTexture(context.wrapperContained); }
// public static void drawArrowTexture(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.drawArrowTexture(context.wrapperContained); }
// public void enableSlot(int slotId) { wrapperContained.enableSlot(slotId); }
// public static void enableSlot(int slotId, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.enableSlot(slotId); }
// public void setSlotEnabled(int slotId,boolean enabled) { wrapperContained.setSlotEnabled(slotId,enabled); }
// public static void setSlotEnabled(int slotId,boolean enabled, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.setSlotEnabled(slotId,enabled); }
// public void disableSlot(int slotId) { wrapperContained.disableSlot(slotId); }
// public static void disableSlot(int slotId, ) { net.minecraft.client.gui.screen.ingame.CrafterScreen.disableSlot(slotId); }

}