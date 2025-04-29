package yarnwrap.screen;
public class ScreenHandlerListener { public net.minecraft.screen.ScreenHandlerListener wrapperContained; public ScreenHandlerListener(net.minecraft.screen.ScreenHandlerListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onPropertyUpdate(yarnwrap.screen.ScreenHandler handler,int property,int value) { wrapperContained.onPropertyUpdate(handler.wrapperContained,property,value); }
// public static void onPropertyUpdate(yarnwrap.screen.ScreenHandler handler,int property,int value, ) { net.minecraft.screen.ScreenHandlerListener.onPropertyUpdate(handler.wrapperContained,property,value); }
public void onSlotUpdate(yarnwrap.screen.ScreenHandler handler,int slotId,yarnwrap.item.ItemStack stack) { wrapperContained.onSlotUpdate(handler.wrapperContained,slotId,stack.wrapperContained); }
// public static void onSlotUpdate(yarnwrap.screen.ScreenHandler handler,int slotId,yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.ScreenHandlerListener.onSlotUpdate(handler.wrapperContained,slotId,stack.wrapperContained); }

}