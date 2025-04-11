package yarnwrap.client.gui.screen;
public class ChatInputSuggestor { public net.minecraft.client.gui.screen.ChatInputSuggestor wrapperContained; public ChatInputSuggestor(net.minecraft.client.gui.screen.ChatInputSuggestor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern WHITESPACE_PATTERN() { return wrapperContained.WHITESPACE_PATTERN; }
// public void WHITESPACE_PATTERN(java.util.regex.Pattern value) { wrapperContained.WHITESPACE_PATTERN = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen owner() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.owner); }
// public void owner(yarnwrap.client.gui.screen.Screen value) { wrapperContained.owner = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget textField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.textField); }
// public void textField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.textField = value.wrapperContained; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public boolean slashOptional() { return wrapperContained.slashOptional; }
// public void slashOptional(boolean value) { wrapperContained.slashOptional = value; }
// public boolean suggestingWhenEmpty() { return wrapperContained.suggestingWhenEmpty; }
// public void suggestingWhenEmpty(boolean value) { wrapperContained.suggestingWhenEmpty = value; }
// public int inWindowIndexOffset() { return wrapperContained.inWindowIndexOffset; }
// public void inWindowIndexOffset(int value) { wrapperContained.inWindowIndexOffset = value; }
// public int maxSuggestionSize() { return wrapperContained.maxSuggestionSize; }
// public void maxSuggestionSize(int value) { wrapperContained.maxSuggestionSize = value; }
// public boolean chatScreenSized() { return wrapperContained.chatScreenSized; }
// public void chatScreenSized(boolean value) { wrapperContained.chatScreenSized = value; }
// public int color() { return wrapperContained.color; }
// public void color(int value) { wrapperContained.color = value; }
// public java.util.List messages() { return wrapperContained.messages; }
// public void messages(java.util.List value) { wrapperContained.messages = value; }
// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public com.mojang.brigadier.ParseResults parse() { return wrapperContained.parse; }
// public void parse(com.mojang.brigadier.ParseResults value) { wrapperContained.parse = value; }
// public java.util.concurrent.CompletableFuture pendingSuggestions() { return wrapperContained.pendingSuggestions; }
// public void pendingSuggestions(java.util.concurrent.CompletableFuture value) { wrapperContained.pendingSuggestions = value; }
// public Object window() { return wrapperContained.window; }
// // public void window(Object value) { wrapperContained.window = value; }
// public boolean windowActive() { return wrapperContained.windowActive; }
// public void windowActive(boolean value) { wrapperContained.windowActive = value; }
// public boolean completingSuggestions() { return wrapperContained.completingSuggestions; }
// public void completingSuggestions(boolean value) { wrapperContained.completingSuggestions = value; }
// public yarnwrap.text.Style ERROR_STYLE() { return new yarnwrap.text.Style(wrapperContained.ERROR_STYLE); }
// public void ERROR_STYLE(yarnwrap.text.Style value) { wrapperContained.ERROR_STYLE = value.wrapperContained; }
// public yarnwrap.text.Style INFO_STYLE() { return new yarnwrap.text.Style(wrapperContained.INFO_STYLE); }
// public void INFO_STYLE(yarnwrap.text.Style value) { wrapperContained.INFO_STYLE = value.wrapperContained; }
// public java.util.List HIGHLIGHT_STYLES() { return wrapperContained.HIGHLIGHT_STYLES; }
// public void HIGHLIGHT_STYLES(java.util.List value) { wrapperContained.HIGHLIGHT_STYLES = value; }
// public boolean canLeave() { return wrapperContained.canLeave; }
// public void canLeave(boolean value) { wrapperContained.canLeave = value; }
public void show(boolean narrateFirstSuggestion) { wrapperContained.show(narrateFirstSuggestion); }
public boolean mouseScrolled(double amount) { return wrapperContained.mouseScrolled(amount); }
public boolean mouseClicked(double mouseX,double mouseY,int button) { return wrapperContained.mouseClicked(mouseX,mouseY,button); }
public void render(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY) { wrapperContained.render(context.wrapperContained,mouseX,mouseY); }
public boolean keyPressed(int keyCode,int scanCode,int modifiers) { return wrapperContained.keyPressed(keyCode,scanCode,modifiers); }
// public yarnwrap.text.OrderedText highlight(com.mojang.brigadier.ParseResults parse,java.lang.String original,int firstCharacterIndex) { return new yarnwrap.text.OrderedText(wrapperContained.highlight(parse,original,firstCharacterIndex)); }
// public boolean showUsages(yarnwrap.util.Formatting formatting) { return wrapperContained.showUsages(formatting.wrapperContained); }
// public int getStartOfCurrentWord(java.lang.String input) { return wrapperContained.getStartOfCurrentWord(input); }
// public yarnwrap.text.OrderedText provideRenderText(java.lang.String original,int firstCharacterIndex) { return new yarnwrap.text.OrderedText(wrapperContained.provideRenderText(original,firstCharacterIndex)); }
public void setWindowActive(boolean windowActive) { wrapperContained.setWindowActive(windowActive); }
public void refresh() { wrapperContained.refresh(); }
// public java.lang.String getSuggestionSuffix(java.lang.String original,java.lang.String suggestion) { return wrapperContained.getSuggestionSuffix(original,suggestion); }
// public void showCommandSuggestions() { wrapperContained.showCommandSuggestions(); }
public yarnwrap.text.Text getNarration() { return new yarnwrap.text.Text(wrapperContained.getNarration()); }
// public java.util.List sortSuggestions(com.mojang.brigadier.suggestion.Suggestions suggestions) { return wrapperContained.sortSuggestions(suggestions); }
// public yarnwrap.text.OrderedText formatException(com.mojang.brigadier.exceptions.CommandSyntaxException exception) { return new yarnwrap.text.OrderedText(wrapperContained.formatException(exception)); }
public void clearWindow() { wrapperContained.clearWindow(); }
public void renderMessages(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderMessages(context.wrapperContained); }
public boolean tryRenderWindow(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY) { return wrapperContained.tryRenderWindow(context.wrapperContained,mouseX,mouseY); }
public boolean isOpen() { return wrapperContained.isOpen(); }
public yarnwrap.text.Text getSuggestionUsageNarrationText() { return new yarnwrap.text.Text(wrapperContained.getSuggestionUsageNarrationText()); }
public void setCanLeave(boolean canLeave) { wrapperContained.setCanLeave(canLeave); }

}