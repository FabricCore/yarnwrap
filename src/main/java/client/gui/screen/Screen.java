package yarnwrap.client.gui.screen;
public class Screen { public net.minecraft.client.gui.screen.Screen wrapperContained; public Screen(net.minecraft.client.gui.screen.Screen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public java.util.List children() { return wrapperContained.children; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
public int width() { return wrapperContained.width; }
public int height() { return wrapperContained.height; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public yarnwrap.client.gui.Selectable selected() { return new yarnwrap.client.gui.Selectable(wrapperContained.selected); }
// public yarnwrap.text.Text SCREEN_USAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.SCREEN_USAGE_TEXT); }
// public java.util.List selectables() { return wrapperContained.selectables; }
// public java.util.List drawables() { return wrapperContained.drawables; }
// public long SCREEN_INIT_NARRATION_DELAY() { return wrapperContained.SCREEN_INIT_NARRATION_DELAY; }
// public long NARRATOR_MODE_CHANGE_DELAY() { return wrapperContained.NARRATOR_MODE_CHANGE_DELAY; }
// public long MOUSE_MOVE_NARRATION_DELAY() { return wrapperContained.MOUSE_MOVE_NARRATION_DELAY; }
// public long MOUSE_PRESS_SCROLL_NARRATION_DELAY() { return wrapperContained.MOUSE_PRESS_SCROLL_NARRATION_DELAY; }
// public long KEY_PRESS_NARRATION_DELAY() { return wrapperContained.KEY_PRESS_NARRATION_DELAY; }
// public yarnwrap.client.gui.screen.narration.ScreenNarrator narrator() { return new yarnwrap.client.gui.screen.narration.ScreenNarrator(wrapperContained.narrator); }
// public long elementNarrationStartTime() { return wrapperContained.elementNarrationStartTime; }
// public long screenNarrationStartTime() { return wrapperContained.screenNarrationStartTime; }
// public Object tooltip() { return wrapperContained.tooltip; }
// public boolean screenInitialized() { return wrapperContained.screenInitialized; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public yarnwrap.client.gui.CubeMapRenderer PANORAMA_RENDERER() { return new yarnwrap.client.gui.CubeMapRenderer(wrapperContained.PANORAMA_RENDERER); }
// public yarnwrap.client.gui.RotatingCubeMapRenderer ROTATING_PANORAMA_RENDERER() { return new yarnwrap.client.gui.RotatingCubeMapRenderer(wrapperContained.ROTATING_PANORAMA_RENDERER); }
public yarnwrap.util.Identifier MENU_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MENU_BACKGROUND_TEXTURE); }
// public yarnwrap.util.Identifier INWORLD_MENU_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INWORLD_MENU_BACKGROUND_TEXTURE); }
public yarnwrap.util.Identifier HEADER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HEADER_SEPARATOR_TEXTURE); }
public yarnwrap.util.Identifier FOOTER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOTER_SEPARATOR_TEXTURE); }
public yarnwrap.util.Identifier INWORLD_HEADER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INWORLD_HEADER_SEPARATOR_TEXTURE); }
public yarnwrap.util.Identifier INWORLD_FOOTER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INWORLD_FOOTER_SEPARATOR_TEXTURE); }
// public yarnwrap.client.gui.widget.CyclingButtonWidget narratorToggleButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.narratorToggleButton); }
public void tick() { wrapperContained.tick(); }
public java.util.List getTooltipFromItem(yarnwrap.client.MinecraftClient client,yarnwrap.item.ItemStack stack) { return wrapperContained.getTooltipFromItem(client.wrapperContained,stack.wrapperContained); }
public void resize(yarnwrap.client.MinecraftClient client,int width,int height) { wrapperContained.resize(client.wrapperContained,width,height); }
public void wrapScreenError(java.lang.Runnable task,java.lang.String errorTitle,java.lang.String screenName) { wrapperContained.wrapScreenError(task,errorTitle,screenName); }
// public boolean isValidCharacterForName(java.lang.String name,char character,int cursorPos) { return wrapperContained.isValidCharacterForName(name,character,cursorPos); }
// public void insertText(java.lang.String text,boolean override) { wrapperContained.insertText(text,override); }
public void close() { wrapperContained.close(); }
public void renderBackground(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta) { wrapperContained.renderBackground(context.wrapperContained,mouseX,mouseY,delta); }
public boolean shouldPause() { return wrapperContained.shouldPause(); }
public boolean shouldCloseOnEsc() { return wrapperContained.shouldCloseOnEsc(); }
public void init(yarnwrap.client.MinecraftClient client,int width,int height) { wrapperContained.init(client.wrapperContained,width,height); }
// public void init() { wrapperContained.init(); }
// public yarnwrap.client.gui.Element addSelectableChild(yarnwrap.client.gui.Element child) { return new yarnwrap.client.gui.Element(wrapperContained.addSelectableChild(child.wrapperContained)); }
public boolean handleTextClick(yarnwrap.text.Style style) { return wrapperContained.handleTextClick(style.wrapperContained); }
public void removed() { wrapperContained.removed(); }
public yarnwrap.text.Text getNarratedTitle() { return new yarnwrap.text.Text(wrapperContained.getNarratedTitle()); }
public boolean isCut(int code) { return wrapperContained.isCut(code); }
public boolean isPaste(int code) { return wrapperContained.isPaste(code); }
public boolean isCopy(int code) { return wrapperContained.isCopy(code); }
public boolean isSelectAll(int code) { return wrapperContained.isSelectAll(code); }
public yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(wrapperContained.getTitle()); }
public boolean hasControlDown() { return wrapperContained.hasControlDown(); }
public boolean hasShiftDown() { return wrapperContained.hasShiftDown(); }
public boolean hasAltDown() { return wrapperContained.hasAltDown(); }
public void filesDragged(java.util.List paths) { wrapperContained.filesDragged(paths); }
// public void addElementNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder) { wrapperContained.addElementNarrations(builder.wrapperContained); }
// public void setElementNarrationDelay(long delayMs) { wrapperContained.setElementNarrationDelay(delayMs); }
// public void setScreenNarrationDelay(long delayMs,boolean restartElementNarration) { wrapperContained.setScreenNarrationDelay(delayMs,restartElementNarration); }
// public yarnwrap.client.gui.Drawable addDrawable(yarnwrap.client.gui.Drawable drawable) { return new yarnwrap.client.gui.Drawable(wrapperContained.addDrawable(drawable.wrapperContained)); }
public Object findSelectedElementData(java.util.List selectables,yarnwrap.client.gui.Selectable selectable) { return wrapperContained.findSelectedElementData(selectables,selectable.wrapperContained); }
// public void addScreenNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder messageBuilder) { wrapperContained.addScreenNarrations(messageBuilder.wrapperContained); }
// public yarnwrap.client.gui.Element addDrawableChild(yarnwrap.client.gui.Element drawableElement) { return new yarnwrap.client.gui.Element(wrapperContained.addDrawableChild(drawableElement.wrapperContained)); }
public void narrateScreenIfNarrationEnabled(boolean onlyChangedNarrations) { wrapperContained.narrateScreenIfNarrationEnabled(onlyChangedNarrations); }
// public void narrateScreen(boolean onlyChangedNarrations) { wrapperContained.narrateScreen(onlyChangedNarrations); }
// public void remove(yarnwrap.client.gui.Element child) { wrapperContained.remove(child.wrapperContained); }
// public void clearChildren() { wrapperContained.clearChildren(); }
public void applyMouseMoveNarratorDelay() { wrapperContained.applyMouseMoveNarratorDelay(); }
public void applyMousePressScrollNarratorDelay() { wrapperContained.applyMousePressScrollNarratorDelay(); }
public void applyKeyPressNarratorDelay() { wrapperContained.applyKeyPressNarratorDelay(); }
public void updateNarrator() { wrapperContained.updateNarrator(); }
// public boolean isNarratorActive() { return wrapperContained.isNarratorActive(); }
// public void clearAndInit() { wrapperContained.clearAndInit(); }
public void setTooltip(yarnwrap.client.gui.tooltip.Tooltip tooltip,yarnwrap.client.gui.tooltip.TooltipPositioner positioner,boolean focused) { wrapperContained.setTooltip(tooltip.wrapperContained,positioner.wrapperContained,focused); }
public void renderWithTooltip(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta) { wrapperContained.renderWithTooltip(context.wrapperContained,mouseX,mouseY,delta); }
public void setTooltip(java.util.List tooltip) { wrapperContained.setTooltip(tooltip); }
public void setTooltip(yarnwrap.text.Text tooltip) { wrapperContained.setTooltip(tooltip.wrapperContained); }
public void setTooltip(java.util.List tooltip,yarnwrap.client.gui.tooltip.TooltipPositioner positioner,boolean focused) { wrapperContained.setTooltip(tooltip,positioner.wrapperContained,focused); }
// public boolean hasUsageText() { return wrapperContained.hasUsageText(); }
// public void switchFocus(yarnwrap.client.gui.navigation.GuiNavigationPath path) { wrapperContained.switchFocus(path.wrapperContained); }
// public Object getArrowNavigation(yarnwrap.client.gui.navigation.NavigationDirection direction) { return wrapperContained.getArrowNavigation(direction.wrapperContained); }
// public void setInitialFocus(yarnwrap.client.gui.Element element) { wrapperContained.setInitialFocus(element.wrapperContained); }
// public Object getTabNavigation() { return wrapperContained.getTabNavigation(); }
public void blur() { wrapperContained.blur(); }
// public void initTabNavigation() { wrapperContained.initTabNavigation(); }
public void onDisplayed() { wrapperContained.onDisplayed(); }
public yarnwrap.sound.MusicSound getMusic() { return new yarnwrap.sound.MusicSound(wrapperContained.getMusic()); }
public void renderInGameBackground(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderInGameBackground(context.wrapperContained); }
// public yarnwrap.text.Text getUsageNarrationText() { return new yarnwrap.text.Text(wrapperContained.getUsageNarrationText()); }
// public void setInitialFocus() { wrapperContained.setInitialFocus(); }
// public void renderPanoramaBackground(yarnwrap.client.gui.DrawContext context,float delta) { wrapperContained.renderPanoramaBackground(context.wrapperContained,delta); }
// public void applyBlur(float delta) { wrapperContained.applyBlur(delta); }
// public void renderDarkening(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderDarkening(context.wrapperContained); }
// public void renderDarkening(yarnwrap.client.gui.DrawContext context,int x,int y,int width,int height) { wrapperContained.renderDarkening(context.wrapperContained,x,y,width,height); }
public void renderBackgroundTexture(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,int x,int y,float u,float v,int width,int height) { wrapperContained.renderBackgroundTexture(context.wrapperContained,texture.wrapperContained,x,y,u,v,width,height); }
// public void clearTooltip() { wrapperContained.clearTooltip(); }
public void refreshNarrator(boolean previouslyDisabled) { wrapperContained.refreshNarrator(previouslyDisabled); }

}