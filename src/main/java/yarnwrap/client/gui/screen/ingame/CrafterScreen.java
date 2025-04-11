package yarnwrap.client.gui.screen.ingame;
public class CrafterScreen { public net.minecraft.client.gui.screen.ingame.CrafterScreen wrapperContained; public CrafterScreen(net.minecraft.client.gui.screen.ingame.CrafterScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.text.Text TOGGLEABLE_SLOT_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOGGLEABLE_SLOT_TEXT); }
// public void TOGGLEABLE_SLOT_TEXT(yarnwrap.text.Text value) { wrapperContained.TOGGLEABLE_SLOT_TEXT = value.wrapperContained; }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public yarnwrap.util.Identifier DISABLED_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DISABLED_SLOT_TEXTURE); }
// public void DISABLED_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.DISABLED_SLOT_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier POWERED_REDSTONE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.POWERED_REDSTONE_TEXTURE); }
// public void POWERED_REDSTONE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.POWERED_REDSTONE_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier UNPOWERED_REDSTONE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.UNPOWERED_REDSTONE_TEXTURE); }
// public void UNPOWERED_REDSTONE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.UNPOWERED_REDSTONE_TEXTURE = value.wrapperContained; }
public CrafterScreen(yarnwrap.screen.CrafterScreenHandler handler,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.CrafterScreen(handler.wrapperContained,playerInventory.wrapperContained,title.wrapperContained); }
// public void drawDisabledSlot(yarnwrap.client.gui.DrawContext context,yarnwrap.screen.slot.CrafterInputSlot slot) { wrapperContained.drawDisabledSlot(context.wrapperContained,slot.wrapperContained); }
// public void drawArrowTexture(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawArrowTexture(context.wrapperContained); }
// public void enableSlot(int slotId) { wrapperContained.enableSlot(slotId); }
// public void setSlotEnabled(int slotId,boolean enabled) { wrapperContained.setSlotEnabled(slotId,enabled); }
// public void disableSlot(int slotId) { wrapperContained.disableSlot(slotId); }

}