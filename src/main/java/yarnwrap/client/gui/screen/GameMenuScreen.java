package yarnwrap.client.gui.screen;
public class GameMenuScreen { public net.minecraft.client.gui.screen.GameMenuScreen wrapperContained; public GameMenuScreen(net.minecraft.client.gui.screen.GameMenuScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean showMenu() { return wrapperContained.showMenu; }
// public void showMenu(boolean value) { wrapperContained.showMenu = value; }
// public yarnwrap.client.gui.widget.ButtonWidget exitButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.exitButton); }
// public void exitButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.exitButton = value.wrapperContained; }
// public yarnwrap.text.Text RETURN_TO_MENU_TEXT() { return new yarnwrap.text.Text(wrapperContained.RETURN_TO_MENU_TEXT); }
// public void RETURN_TO_MENU_TEXT(yarnwrap.text.Text value) { wrapperContained.RETURN_TO_MENU_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SAVING_LEVEL_TEXT() { return new yarnwrap.text.Text(wrapperContained.SAVING_LEVEL_TEXT); }
// public void SAVING_LEVEL_TEXT(yarnwrap.text.Text value) { wrapperContained.SAVING_LEVEL_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text GAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.GAME_TEXT); }
// public void GAME_TEXT(yarnwrap.text.Text value) { wrapperContained.GAME_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text PAUSED_TEXT() { return new yarnwrap.text.Text(wrapperContained.PAUSED_TEXT); }
// public void PAUSED_TEXT(yarnwrap.text.Text value) { wrapperContained.PAUSED_TEXT = value.wrapperContained; }
// public int GRID_COLUMNS() { return wrapperContained.GRID_COLUMNS; }
// public void GRID_COLUMNS(int value) { wrapperContained.GRID_COLUMNS = value; }
// public int BUTTONS_TOP_MARGIN() { return wrapperContained.BUTTONS_TOP_MARGIN; }
// public void BUTTONS_TOP_MARGIN(int value) { wrapperContained.BUTTONS_TOP_MARGIN = value; }
// public int GRID_MARGIN() { return wrapperContained.GRID_MARGIN; }
// public void GRID_MARGIN(int value) { wrapperContained.GRID_MARGIN = value; }
// public int WIDE_BUTTON_WIDTH() { return wrapperContained.WIDE_BUTTON_WIDTH; }
// public void WIDE_BUTTON_WIDTH(int value) { wrapperContained.WIDE_BUTTON_WIDTH = value; }
// public int NORMAL_BUTTON_WIDTH() { return wrapperContained.NORMAL_BUTTON_WIDTH; }
// public void NORMAL_BUTTON_WIDTH(int value) { wrapperContained.NORMAL_BUTTON_WIDTH = value; }
// public yarnwrap.text.Text RETURN_TO_GAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.RETURN_TO_GAME_TEXT); }
// public void RETURN_TO_GAME_TEXT(yarnwrap.text.Text value) { wrapperContained.RETURN_TO_GAME_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text ADVANCEMENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.ADVANCEMENTS_TEXT); }
// public void ADVANCEMENTS_TEXT(yarnwrap.text.Text value) { wrapperContained.ADVANCEMENTS_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text STATS_TEXT() { return new yarnwrap.text.Text(wrapperContained.STATS_TEXT); }
// public void STATS_TEXT(yarnwrap.text.Text value) { wrapperContained.STATS_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SEND_FEEDBACK_TEXT() { return new yarnwrap.text.Text(wrapperContained.SEND_FEEDBACK_TEXT); }
// public void SEND_FEEDBACK_TEXT(yarnwrap.text.Text value) { wrapperContained.SEND_FEEDBACK_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text REPORT_BUGS_TEXT() { return new yarnwrap.text.Text(wrapperContained.REPORT_BUGS_TEXT); }
// public void REPORT_BUGS_TEXT(yarnwrap.text.Text value) { wrapperContained.REPORT_BUGS_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text OPTIONS_TEXT() { return new yarnwrap.text.Text(wrapperContained.OPTIONS_TEXT); }
// public void OPTIONS_TEXT(yarnwrap.text.Text value) { wrapperContained.OPTIONS_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SHARE_TO_LAN_TEXT() { return new yarnwrap.text.Text(wrapperContained.SHARE_TO_LAN_TEXT); }
// public void SHARE_TO_LAN_TEXT(yarnwrap.text.Text value) { wrapperContained.SHARE_TO_LAN_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text PLAYER_REPORTING_TEXT() { return new yarnwrap.text.Text(wrapperContained.PLAYER_REPORTING_TEXT); }
// public void PLAYER_REPORTING_TEXT(yarnwrap.text.Text value) { wrapperContained.PLAYER_REPORTING_TEXT = value.wrapperContained; }
// public yarnwrap.util.Identifier DRAFT_REPORT_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DRAFT_REPORT_ICON_TEXTURE); }
// public void DRAFT_REPORT_ICON_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.DRAFT_REPORT_ICON_TEXTURE = value.wrapperContained; }
// public yarnwrap.text.Text SERVER_LINKS_TEXT() { return new yarnwrap.text.Text(wrapperContained.SERVER_LINKS_TEXT); }
// public void SERVER_LINKS_TEXT(yarnwrap.text.Text value) { wrapperContained.SERVER_LINKS_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text FEEDBACK_TEXT() { return new yarnwrap.text.Text(wrapperContained.FEEDBACK_TEXT); }
// public void FEEDBACK_TEXT(yarnwrap.text.Text value) { wrapperContained.FEEDBACK_TEXT = value.wrapperContained; }
public GameMenuScreen(boolean showMenu) { this.wrapperContained = new net.minecraft.client.gui.screen.GameMenuScreen(showMenu); }
// public void method_19836(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19836(button.wrapperContained); }
// public void method_19845(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19845(button.wrapperContained); }
// public void initWidgets() { wrapperContained.initWidgets(); }
// public void disconnect() { wrapperContained.disconnect(); }
// public void method_47898(java.util.function.Supplier button) { wrapperContained.method_47898(button); }
// public yarnwrap.client.gui.widget.ButtonWidget createUrlButton(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text text,java.net.URI uri) { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.createUrlButton(parent.wrapperContained,text.wrapperContained,uri)); }
// public yarnwrap.client.gui.widget.ButtonWidget createButton(yarnwrap.text.Text text,java.util.function.Supplier screenSupplier) { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.createButton(text.wrapperContained,screenSupplier)); }
public boolean shouldShowMenu() { return wrapperContained.shouldShowMenu(); }
// public void addFeedbackAndBugsButtons(yarnwrap.client.gui.screen.Screen parentScreen,Object gridAdder) { wrapperContained.addFeedbackAndBugsButtons(parentScreen.wrapperContained,gridAdder); }

}