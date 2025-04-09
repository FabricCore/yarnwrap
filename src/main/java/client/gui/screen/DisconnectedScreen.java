package yarnwrap.client.gui.screen;
public class DisconnectedScreen { public net.minecraft.client.gui.screen.DisconnectedScreen wrapperContained; public DisconnectedScreen(net.minecraft.client.gui.screen.DisconnectedScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.text.Text TO_MENU_TEXT() { return new yarnwrap.text.Text(wrapperContained.TO_MENU_TEXT); }
// public yarnwrap.text.Text TO_TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TO_TITLE_TEXT); }
// public yarnwrap.text.Text buttonLabel() { return new yarnwrap.text.Text(wrapperContained.buttonLabel); }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget grid() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.grid); }
// public yarnwrap.text.Text REPORT_TO_SERVER_TEXT() { return new yarnwrap.text.Text(wrapperContained.REPORT_TO_SERVER_TEXT); }
// public yarnwrap.text.Text OPEN_REPORT_DIR_TEXT() { return new yarnwrap.text.Text(wrapperContained.OPEN_REPORT_DIR_TEXT); }
// public yarnwrap.network.DisconnectionInfo info() { return new yarnwrap.network.DisconnectionInfo(wrapperContained.info); }

}