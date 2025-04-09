package yarnwrap.client.gui.screen.ingame;
public class LecternScreen { public net.minecraft.client.gui.screen.ingame.LecternScreen wrapperContained; public LecternScreen(net.minecraft.client.gui.screen.ingame.LecternScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.LecternScreenHandler handler() { return new yarnwrap.screen.LecternScreenHandler(wrapperContained.handler); }
// public yarnwrap.screen.ScreenHandlerListener listener() { return new yarnwrap.screen.ScreenHandlerListener(wrapperContained.listener); }
// public void sendButtonPressPacket(int id) { wrapperContained.sendButtonPressPacket(id); }
// public void updatePageProvider() { wrapperContained.updatePageProvider(); }
// public void updatePage() { wrapperContained.updatePage(); }

}