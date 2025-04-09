package yarnwrap.screen;
public class ScreenHandlerSyncHandler { public net.minecraft.screen.ScreenHandlerSyncHandler wrapperContained; public ScreenHandlerSyncHandler(net.minecraft.screen.ScreenHandlerSyncHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void updateProperty(yarnwrap.screen.ScreenHandler handler,int property,int value) { wrapperContained.updateProperty(handler.wrapperContained,property,value); }
public void updateSlot(yarnwrap.screen.ScreenHandler handler,int slot,yarnwrap.item.ItemStack stack) { wrapperContained.updateSlot(handler.wrapperContained,slot,stack.wrapperContained); }
public void updateCursorStack(yarnwrap.screen.ScreenHandler handler,yarnwrap.item.ItemStack stack) { wrapperContained.updateCursorStack(handler.wrapperContained,stack.wrapperContained); }
// public void updateState(yarnwrap.screen.ScreenHandler handler,yarnwrap.util.collection.DefaultedList stacks,yarnwrap.item.ItemStack cursorStack,int properties) { wrapperContained.updateState(handler.wrapperContained,stacks.wrapperContained,cursorStack.wrapperContained,properties); }

}