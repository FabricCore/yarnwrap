package yarnwrap.client.gui.screen.ingame;
public class HandledScreen { public net.minecraft.client.gui.screen.ingame.HandledScreen wrapperContained; public HandledScreen(net.minecraft.client.gui.screen.ingame.HandledScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public int titleX() { return wrapperContained.titleX; }
// public int titleY() { return wrapperContained.titleY; }
// public int playerInventoryTitleX() { return wrapperContained.playerInventoryTitleX; }
// public int playerInventoryTitleY() { return wrapperContained.playerInventoryTitleY; }
// public int x() { return wrapperContained.x; }
// public yarnwrap.screen.slot.Slot touchDragSlotStart() { return new yarnwrap.screen.slot.Slot(wrapperContained.touchDragSlotStart); }
// public int heldButtonCode() { return wrapperContained.heldButtonCode; }
// public int backgroundHeight() { return wrapperContained.backgroundHeight; }
// public yarnwrap.screen.slot.Slot touchHoveredSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.touchHoveredSlot); }
// public long touchDropTimer() { return wrapperContained.touchDropTimer; }
// public yarnwrap.item.ItemStack touchDragStack() { return new yarnwrap.item.ItemStack(wrapperContained.touchDragStack); }
// public boolean doubleClicking() { return wrapperContained.doubleClicking; }
// public int touchDropX() { return wrapperContained.touchDropX; }
// public yarnwrap.item.ItemStack touchDropReturningStack() { return new yarnwrap.item.ItemStack(wrapperContained.touchDropReturningStack); }
// public int lastClickedButton() { return wrapperContained.lastClickedButton; }
// public yarnwrap.screen.slot.Slot focusedSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.focusedSlot); }
// public long lastButtonClickTime() { return wrapperContained.lastButtonClickTime; }
// public boolean touchIsRightClickDrag() { return wrapperContained.touchIsRightClickDrag; }
// public int heldButtonType() { return wrapperContained.heldButtonType; }
// public yarnwrap.item.ItemStack quickMovingStack() { return new yarnwrap.item.ItemStack(wrapperContained.quickMovingStack); }
// public int backgroundWidth() { return wrapperContained.backgroundWidth; }
// public java.util.Set cursorDragSlots() { return wrapperContained.cursorDragSlots; }
// public boolean cursorDragging() { return wrapperContained.cursorDragging; }
// public long touchDropTime() { return wrapperContained.touchDropTime; }
// public int touchDropY() { return wrapperContained.touchDropY; }
// public yarnwrap.screen.ScreenHandler handler() { return new yarnwrap.screen.ScreenHandler(wrapperContained.handler); }
// public boolean cancelNextRelease() { return wrapperContained.cancelNextRelease; }
// public yarnwrap.screen.slot.Slot lastClickedSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.lastClickedSlot); }
// public int y() { return wrapperContained.y; }
public yarnwrap.util.Identifier BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BACKGROUND_TEXTURE); }
// public yarnwrap.screen.slot.Slot touchDropOriginSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.touchDropOriginSlot); }
// public int draggedStackRemainder() { return wrapperContained.draggedStackRemainder; }
// public yarnwrap.text.Text playerInventoryTitle() { return new yarnwrap.text.Text(wrapperContained.playerInventoryTitle); }
// public boolean isPointWithinBounds(int x,int y,int width,int height,double pointX,double pointY) { return wrapperContained.isPointWithinBounds(x,y,width,height,pointX,pointY); }
// public void calculateOffset() { wrapperContained.calculateOffset(); }
// public void drawMouseoverTooltip(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawMouseoverTooltip(context.wrapperContained,x,y); }
// public boolean isClickOutsideBounds(double mouseX,double mouseY,int left,int top,int button) { return wrapperContained.isClickOutsideBounds(mouseX,mouseY,left,top,button); }
// public void drawItem(yarnwrap.client.gui.DrawContext context,yarnwrap.item.ItemStack stack,int x,int y,java.lang.String amountText) { wrapperContained.drawItem(context.wrapperContained,stack.wrapperContained,x,y,amountText); }
// public void onMouseClick(yarnwrap.screen.slot.Slot slot,int slotId,int button,yarnwrap.screen.slot.SlotActionType actionType) { wrapperContained.onMouseClick(slot.wrapperContained,slotId,button,actionType.wrapperContained); }
// public boolean handleHotbarKeyPressed(int keyCode,int scanCode) { return wrapperContained.handleHotbarKeyPressed(keyCode,scanCode); }
// public void drawSlot(yarnwrap.client.gui.DrawContext context,yarnwrap.screen.slot.Slot slot) { wrapperContained.drawSlot(context.wrapperContained,slot.wrapperContained); }
// public yarnwrap.screen.slot.Slot getSlotAt(double x,double y) { return new yarnwrap.screen.slot.Slot(wrapperContained.getSlotAt(x,y)); }
// public boolean isPointOverSlot(yarnwrap.screen.slot.Slot slot,double pointX,double pointY) { return wrapperContained.isPointOverSlot(slot.wrapperContained,pointX,pointY); }
// public void drawForeground(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY) { wrapperContained.drawForeground(context.wrapperContained,mouseX,mouseY); }
// public void drawBackground(yarnwrap.client.gui.DrawContext context,float delta,int mouseX,int mouseY) { wrapperContained.drawBackground(context.wrapperContained,delta,mouseX,mouseY); }
// public void onMouseClick(int button) { wrapperContained.onMouseClick(button); }
public void drawSlotHighlight(yarnwrap.client.gui.DrawContext context,int x,int y,int z) { wrapperContained.drawSlotHighlight(context.wrapperContained,x,y,z); }
// public void handledScreenTick() { wrapperContained.handledScreenTick(); }
public void endTouchDrag() { wrapperContained.endTouchDrag(); }
// public java.util.List getTooltipFromItem(yarnwrap.item.ItemStack stack) { return wrapperContained.getTooltipFromItem(stack.wrapperContained); }
// public void onSlotChangedState(int slotId,int handlerId,boolean newState) { wrapperContained.onSlotChangedState(slotId,handlerId,newState); }

}