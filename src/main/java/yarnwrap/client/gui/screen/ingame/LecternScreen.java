package yarnwrap.client.gui.screen.ingame;
public class LecternScreen { public net.minecraft.client.gui.screen.ingame.LecternScreen wrapperContained; public LecternScreen(net.minecraft.client.gui.screen.ingame.LecternScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.LecternScreenHandler handler() { return new yarnwrap.screen.LecternScreenHandler(wrapperContained.handler); }
// public void handler(yarnwrap.screen.LecternScreenHandler value) { wrapperContained.handler = value.wrapperContained; }
// public yarnwrap.screen.ScreenHandlerListener listener() { return new yarnwrap.screen.ScreenHandlerListener(wrapperContained.listener); }
// public void listener(yarnwrap.screen.ScreenHandlerListener value) { wrapperContained.listener = value.wrapperContained; }
public LecternScreen(yarnwrap.screen.LecternScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.LecternScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }
// public void sendButtonPressPacket(int id) { wrapperContained.sendButtonPressPacket(id); }
// public void updatePageProvider() { wrapperContained.updatePageProvider(); }
// public void updatePage() { wrapperContained.updatePage(); }
// public void method_19894(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19894(button.wrapperContained); }
// public void method_19895(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19895(button.wrapperContained); }

}