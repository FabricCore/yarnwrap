package yarnwrap.client.gui.screen;
public class DisconnectedScreen { public net.minecraft.client.gui.screen.DisconnectedScreen wrapperContained; public DisconnectedScreen(net.minecraft.client.gui.screen.DisconnectedScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.gui.screen.DisconnectedScreen.parent); }
// public static void parent(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.gui.screen.DisconnectedScreen.parent = value.wrapperContained; }

// public yarnwrap.text.Text TO_MENU_TEXT() { return new yarnwrap.text.Text(wrapperContained.TO_MENU_TEXT); }
// public void TO_MENU_TEXT(yarnwrap.text.Text value) { wrapperContained.TO_MENU_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TO_MENU_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.DisconnectedScreen.TO_MENU_TEXT); }
// public static void TO_MENU_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.DisconnectedScreen.TO_MENU_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text TO_TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TO_TITLE_TEXT); }
// public void TO_TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TO_TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TO_TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.DisconnectedScreen.TO_TITLE_TEXT); }
// public static void TO_TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.DisconnectedScreen.TO_TITLE_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text buttonLabel() { return new yarnwrap.text.Text(wrapperContained.buttonLabel); }
// public void buttonLabel(yarnwrap.text.Text value) { wrapperContained.buttonLabel = value.wrapperContained; }
// public static yarnwrap.text.Text buttonLabel() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.DisconnectedScreen.buttonLabel); }
// public static void buttonLabel(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.DisconnectedScreen.buttonLabel = value.wrapperContained; }

// public yarnwrap.client.gui.widget.DirectionalLayoutWidget grid() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.grid); }
// public void grid(yarnwrap.client.gui.widget.DirectionalLayoutWidget value) { wrapperContained.grid = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.DirectionalLayoutWidget grid() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(net.minecraft.client.gui.screen.DisconnectedScreen.grid); }
// public static void grid(yarnwrap.client.gui.widget.DirectionalLayoutWidget value, ) { net.minecraft.client.gui.screen.DisconnectedScreen.grid = value.wrapperContained; }

// public yarnwrap.text.Text REPORT_TO_SERVER_TEXT() { return new yarnwrap.text.Text(wrapperContained.REPORT_TO_SERVER_TEXT); }
// public void REPORT_TO_SERVER_TEXT(yarnwrap.text.Text value) { wrapperContained.REPORT_TO_SERVER_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text REPORT_TO_SERVER_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.DisconnectedScreen.REPORT_TO_SERVER_TEXT); }
// public static void REPORT_TO_SERVER_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.DisconnectedScreen.REPORT_TO_SERVER_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text OPEN_REPORT_DIR_TEXT() { return new yarnwrap.text.Text(wrapperContained.OPEN_REPORT_DIR_TEXT); }
// public void OPEN_REPORT_DIR_TEXT(yarnwrap.text.Text value) { wrapperContained.OPEN_REPORT_DIR_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text OPEN_REPORT_DIR_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.DisconnectedScreen.OPEN_REPORT_DIR_TEXT); }
// public static void OPEN_REPORT_DIR_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.DisconnectedScreen.OPEN_REPORT_DIR_TEXT = value.wrapperContained; }

// public yarnwrap.network.DisconnectionInfo info() { return new yarnwrap.network.DisconnectionInfo(wrapperContained.info); }
// public void info(yarnwrap.network.DisconnectionInfo value) { wrapperContained.info = value.wrapperContained; }
// public static yarnwrap.network.DisconnectionInfo info() { return new yarnwrap.network.DisconnectionInfo(net.minecraft.client.gui.screen.DisconnectedScreen.info); }
// public static void info(yarnwrap.network.DisconnectionInfo value, ) { net.minecraft.client.gui.screen.DisconnectedScreen.info = value.wrapperContained; }

public DisconnectedScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text title,yarnwrap.text.Text reason) { this.wrapperContained = new net.minecraft.client.gui.screen.DisconnectedScreen(parent.wrapperContained,title.wrapperContained,reason.wrapperContained); }
public DisconnectedScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text title,yarnwrap.text.Text reason,yarnwrap.text.Text buttonLabel) { this.wrapperContained = new net.minecraft.client.gui.screen.DisconnectedScreen(parent.wrapperContained,title.wrapperContained,reason.wrapperContained,buttonLabel.wrapperContained); }
public DisconnectedScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text title,yarnwrap.network.DisconnectionInfo info) { this.wrapperContained = new net.minecraft.client.gui.screen.DisconnectedScreen(parent.wrapperContained,title.wrapperContained,info.wrapperContained); }
public DisconnectedScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text title,yarnwrap.network.DisconnectionInfo info,yarnwrap.text.Text buttonLabel) { this.wrapperContained = new net.minecraft.client.gui.screen.DisconnectedScreen(parent.wrapperContained,title.wrapperContained,info.wrapperContained,buttonLabel.wrapperContained); }
// public void method_19814(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19814(button.wrapperContained); }
// public static void method_19814(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.DisconnectedScreen.method_19814(button.wrapperContained); }
// public void method_51256(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_51256(button.wrapperContained); }
// public static void method_51256(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.DisconnectedScreen.method_51256(button.wrapperContained); }
// public void method_60868(java.net.URI uri) { wrapperContained.method_60868(uri); }
// public static void method_60868(java.net.URI uri, ) { net.minecraft.client.gui.screen.DisconnectedScreen.method_60868(uri); }
// public void method_60869(java.nio.file.Path button) { wrapperContained.method_60869(button); }
// public static void method_60869(java.nio.file.Path button, ) { net.minecraft.client.gui.screen.DisconnectedScreen.method_60869(button); }
// public void method_60870(java.nio.file.Path path) { wrapperContained.method_60870(path); }
// public static void method_60870(java.nio.file.Path path, ) { net.minecraft.client.gui.screen.DisconnectedScreen.method_60870(path); }

}