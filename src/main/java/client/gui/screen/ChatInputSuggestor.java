package yarnwrap.client.gui.screen;
public class ChatInputSuggestor { public net.minecraft.client.gui.screen.ChatInputSuggestor wrapperContained; public ChatInputSuggestor(net.minecraft.client.gui.screen.ChatInputSuggestor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern WHITESPACE_PATTERN() { return wrapperContained.WHITESPACE_PATTERN; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.client.gui.screen.Screen owner() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.owner); }
// public yarnwrap.client.gui.widget.TextFieldWidget textField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.textField); }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public boolean slashOptional() { return wrapperContained.slashOptional; }
// public boolean suggestingWhenEmpty() { return wrapperContained.suggestingWhenEmpty; }
// public int inWindowIndexOffset() { return wrapperContained.inWindowIndexOffset; }
// public int maxSuggestionSize() { return wrapperContained.maxSuggestionSize; }
// public boolean chatScreenSized() { return wrapperContained.chatScreenSized; }
// public int color() { return wrapperContained.color; }
// public java.util.List messages() { return wrapperContained.messages; }
// public int x() { return wrapperContained.x; }
// public int width() { return wrapperContained.width; }
// public com.mojang.brigadier.ParseResults parse() { return wrapperContained.parse; }
// public java.util.concurrent.CompletableFuture pendingSuggestions() { return wrapperContained.pendingSuggestions; }
// public Object window() { return wrapperContained.window; }
// public boolean windowActive() { return wrapperContained.windowActive; }
// public boolean completingSuggestions() { return wrapperContained.completingSuggestions; }
// public yarnwrap.text.Style ERROR_STYLE() { return new yarnwrap.text.Style(wrapperContained.ERROR_STYLE); }
// public yarnwrap.text.Style INFO_STYLE() { return new yarnwrap.text.Style(wrapperContained.INFO_STYLE); }
// public java.util.List HIGHLIGHT_STYLES() { return wrapperContained.HIGHLIGHT_STYLES; }
// public boolean canLeave() { return wrapperContained.canLeave; }
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