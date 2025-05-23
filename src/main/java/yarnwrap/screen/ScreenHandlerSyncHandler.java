package yarnwrap.screen;
public class ScreenHandlerSyncHandler { public net.minecraft.screen.ScreenHandlerSyncHandler wrapperContained; public ScreenHandlerSyncHandler(net.minecraft.screen.ScreenHandlerSyncHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void updateProperty(yarnwrap.screen.ScreenHandler handler,int property,int value) { wrapperContained.updateProperty(handler.wrapperContained,property,value); }
// public static void updateProperty(yarnwrap.screen.ScreenHandler handler,int property,int value, ) { net.minecraft.screen.ScreenHandlerSyncHandler.updateProperty(handler.wrapperContained,property,value); }
public void updateSlot(yarnwrap.screen.ScreenHandler handler,int slot,yarnwrap.item.ItemStack stack) { wrapperContained.updateSlot(handler.wrapperContained,slot,stack.wrapperContained); }
// public static void updateSlot(yarnwrap.screen.ScreenHandler handler,int slot,yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.ScreenHandlerSyncHandler.updateSlot(handler.wrapperContained,slot,stack.wrapperContained); }
public void updateCursorStack(yarnwrap.screen.ScreenHandler handler,yarnwrap.item.ItemStack stack) { wrapperContained.updateCursorStack(handler.wrapperContained,stack.wrapperContained); }
// public static void updateCursorStack(yarnwrap.screen.ScreenHandler handler,yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.ScreenHandlerSyncHandler.updateCursorStack(handler.wrapperContained,stack.wrapperContained); }
// public void updateState(yarnwrap.screen.ScreenHandler handler,java.util.List stacks,yarnwrap.item.ItemStack cursorStack,int properties) { wrapperContained.updateState(handler.wrapperContained,stacks,cursorStack.wrapperContained,properties); }
// public static void updateState(yarnwrap.screen.ScreenHandler handler,java.util.List stacks,yarnwrap.item.ItemStack cursorStack,int properties, ) { net.minecraft.screen.ScreenHandlerSyncHandler.updateState(handler.wrapperContained,stacks,cursorStack.wrapperContained,properties); }
public yarnwrap.screen.sync.TrackedSlot createTrackedSlot() { return new yarnwrap.screen.sync.TrackedSlot(wrapperContained.createTrackedSlot()); }
// public static yarnwrap.screen.sync.TrackedSlot createTrackedSlot() { return new yarnwrap.screen.sync.TrackedSlot(net.minecraft.screen.ScreenHandlerSyncHandler.createTrackedSlot()); }

}