package yarnwrap.screen;
public class ScreenHandlerFactory { public net.minecraft.screen.ScreenHandlerFactory wrapperContained; public ScreenHandlerFactory(net.minecraft.screen.ScreenHandlerFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.screen.ScreenHandler createMenu(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.screen.ScreenHandler(wrapperContained.createMenu(syncId,playerInventory.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.screen.ScreenHandler createMenu(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.screen.ScreenHandler(net.minecraft.screen.ScreenHandlerFactory.createMenu(syncId,playerInventory.wrapperContained,player.wrapperContained)); }

}