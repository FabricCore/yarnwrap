package yarnwrap.client.gui.screen;
public class GameMenuScreen { public net.minecraft.client.gui.screen.GameMenuScreen wrapperContained; public GameMenuScreen(net.minecraft.client.gui.screen.GameMenuScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean showMenu() { return wrapperContained.showMenu; }
// public yarnwrap.client.gui.widget.ButtonWidget exitButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.exitButton); }
// public yarnwrap.text.Text RETURN_TO_MENU_TEXT() { return new yarnwrap.text.Text(wrapperContained.RETURN_TO_MENU_TEXT); }
// public yarnwrap.text.Text SAVING_LEVEL_TEXT() { return new yarnwrap.text.Text(wrapperContained.SAVING_LEVEL_TEXT); }
// public yarnwrap.text.Text GAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.GAME_TEXT); }
// public yarnwrap.text.Text PAUSED_TEXT() { return new yarnwrap.text.Text(wrapperContained.PAUSED_TEXT); }
// public int GRID_COLUMNS() { return wrapperContained.GRID_COLUMNS; }
// public int BUTTONS_TOP_MARGIN() { return wrapperContained.BUTTONS_TOP_MARGIN; }
// public int GRID_MARGIN() { return wrapperContained.GRID_MARGIN; }
// public int WIDE_BUTTON_WIDTH() { return wrapperContained.WIDE_BUTTON_WIDTH; }
// public int NORMAL_BUTTON_WIDTH() { return wrapperContained.NORMAL_BUTTON_WIDTH; }
// public yarnwrap.text.Text RETURN_TO_GAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.RETURN_TO_GAME_TEXT); }
// public yarnwrap.text.Text ADVANCEMENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.ADVANCEMENTS_TEXT); }
// public yarnwrap.text.Text STATS_TEXT() { return new yarnwrap.text.Text(wrapperContained.STATS_TEXT); }
// public yarnwrap.text.Text SEND_FEEDBACK_TEXT() { return new yarnwrap.text.Text(wrapperContained.SEND_FEEDBACK_TEXT); }
// public yarnwrap.text.Text REPORT_BUGS_TEXT() { return new yarnwrap.text.Text(wrapperContained.REPORT_BUGS_TEXT); }
// public yarnwrap.text.Text OPTIONS_TEXT() { return new yarnwrap.text.Text(wrapperContained.OPTIONS_TEXT); }
// public yarnwrap.text.Text SHARE_TO_LAN_TEXT() { return new yarnwrap.text.Text(wrapperContained.SHARE_TO_LAN_TEXT); }
// public yarnwrap.text.Text PLAYER_REPORTING_TEXT() { return new yarnwrap.text.Text(wrapperContained.PLAYER_REPORTING_TEXT); }
// public yarnwrap.util.Identifier DRAFT_REPORT_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DRAFT_REPORT_ICON_TEXTURE); }
// public yarnwrap.text.Text SERVER_LINKS_TEXT() { return new yarnwrap.text.Text(wrapperContained.SERVER_LINKS_TEXT); }
// public yarnwrap.text.Text FEEDBACK_TEXT() { return new yarnwrap.text.Text(wrapperContained.FEEDBACK_TEXT); }
// public void initWidgets() { wrapperContained.initWidgets(); }
// public void disconnect() { wrapperContained.disconnect(); }
// public yarnwrap.client.gui.widget.ButtonWidget createUrlButton(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text text,java.net.URI uri) { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.createUrlButton(parent.wrapperContained,text.wrapperContained,uri)); }
// public yarnwrap.client.gui.widget.ButtonWidget createButton(yarnwrap.text.Text text,java.util.function.Supplier screenSupplier) { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.createButton(text.wrapperContained,screenSupplier)); }
public boolean shouldShowMenu() { return wrapperContained.shouldShowMenu(); }
// public void addFeedbackAndBugsButtons(yarnwrap.client.gui.screen.Screen parentScreen,Object gridAdder) { wrapperContained.addFeedbackAndBugsButtons(parentScreen.wrapperContained,gridAdder); }

}