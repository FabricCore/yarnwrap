package yarnwrap.client.gui.screen;
public class Screen { public net.minecraft.client.gui.screen.Screen wrapperContained; public Screen(net.minecraft.client.gui.screen.Screen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gui.screen.Screen.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gui.screen.Screen.LOGGER = value; }

// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public static yarnwrap.text.Text title() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.Screen.title); }
// public static void title(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.Screen.title = value.wrapperContained; }

// public java.util.List children() { return wrapperContained.children; }
// public void children(java.util.List value) { wrapperContained.children = value; }
// public static java.util.List children() { return net.minecraft.client.gui.screen.Screen.children; }
// public static void children(java.util.List value, ) { net.minecraft.client.gui.screen.Screen.children = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.screen.Screen.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.screen.Screen.client = value.wrapperContained; }

public int width() { return wrapperContained.width; }
public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.gui.screen.Screen.width; }
// public static void width(int value, ) { net.minecraft.client.gui.screen.Screen.width = value; }

public int height() { return wrapperContained.height; }
public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.gui.screen.Screen.height; }
// public static void height(int value, ) { net.minecraft.client.gui.screen.Screen.height = value; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.gui.screen.Screen.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.gui.screen.Screen.textRenderer = value.wrapperContained; }

// public yarnwrap.client.gui.Selectable selected() { return new yarnwrap.client.gui.Selectable(wrapperContained.selected); }
// public void selected(yarnwrap.client.gui.Selectable value) { wrapperContained.selected = value.wrapperContained; }
// public static yarnwrap.client.gui.Selectable selected() { return new yarnwrap.client.gui.Selectable(net.minecraft.client.gui.screen.Screen.selected); }
// public static void selected(yarnwrap.client.gui.Selectable value, ) { net.minecraft.client.gui.screen.Screen.selected = value.wrapperContained; }

// public yarnwrap.text.Text SCREEN_USAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.SCREEN_USAGE_TEXT); }
// public void SCREEN_USAGE_TEXT(yarnwrap.text.Text value) { wrapperContained.SCREEN_USAGE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text SCREEN_USAGE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.Screen.SCREEN_USAGE_TEXT); }
// public static void SCREEN_USAGE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.Screen.SCREEN_USAGE_TEXT = value.wrapperContained; }

// public java.util.List selectables() { return wrapperContained.selectables; }
// public void selectables(java.util.List value) { wrapperContained.selectables = value; }
// public static java.util.List selectables() { return net.minecraft.client.gui.screen.Screen.selectables; }
// public static void selectables(java.util.List value, ) { net.minecraft.client.gui.screen.Screen.selectables = value; }

// public java.util.List drawables() { return wrapperContained.drawables; }
// public void drawables(java.util.List value) { wrapperContained.drawables = value; }
// public static java.util.List drawables() { return net.minecraft.client.gui.screen.Screen.drawables; }
// public static void drawables(java.util.List value, ) { net.minecraft.client.gui.screen.Screen.drawables = value; }

// public long SCREEN_INIT_NARRATION_DELAY() { return wrapperContained.SCREEN_INIT_NARRATION_DELAY; }
// public void SCREEN_INIT_NARRATION_DELAY(long value) { wrapperContained.SCREEN_INIT_NARRATION_DELAY = value; }
// public static long SCREEN_INIT_NARRATION_DELAY() { return net.minecraft.client.gui.screen.Screen.SCREEN_INIT_NARRATION_DELAY; }
// public static void SCREEN_INIT_NARRATION_DELAY(long value, ) { net.minecraft.client.gui.screen.Screen.SCREEN_INIT_NARRATION_DELAY = value; }

// public long NARRATOR_MODE_CHANGE_DELAY() { return wrapperContained.NARRATOR_MODE_CHANGE_DELAY; }
// public void NARRATOR_MODE_CHANGE_DELAY(long value) { wrapperContained.NARRATOR_MODE_CHANGE_DELAY = value; }
// public static long NARRATOR_MODE_CHANGE_DELAY() { return net.minecraft.client.gui.screen.Screen.NARRATOR_MODE_CHANGE_DELAY; }
// public static void NARRATOR_MODE_CHANGE_DELAY(long value, ) { net.minecraft.client.gui.screen.Screen.NARRATOR_MODE_CHANGE_DELAY = value; }

// public long MOUSE_MOVE_NARRATION_DELAY() { return wrapperContained.MOUSE_MOVE_NARRATION_DELAY; }
// public void MOUSE_MOVE_NARRATION_DELAY(long value) { wrapperContained.MOUSE_MOVE_NARRATION_DELAY = value; }
// public static long MOUSE_MOVE_NARRATION_DELAY() { return net.minecraft.client.gui.screen.Screen.MOUSE_MOVE_NARRATION_DELAY; }
// public static void MOUSE_MOVE_NARRATION_DELAY(long value, ) { net.minecraft.client.gui.screen.Screen.MOUSE_MOVE_NARRATION_DELAY = value; }

// public long MOUSE_PRESS_SCROLL_NARRATION_DELAY() { return wrapperContained.MOUSE_PRESS_SCROLL_NARRATION_DELAY; }
// public void MOUSE_PRESS_SCROLL_NARRATION_DELAY(long value) { wrapperContained.MOUSE_PRESS_SCROLL_NARRATION_DELAY = value; }
// public static long MOUSE_PRESS_SCROLL_NARRATION_DELAY() { return net.minecraft.client.gui.screen.Screen.MOUSE_PRESS_SCROLL_NARRATION_DELAY; }
// public static void MOUSE_PRESS_SCROLL_NARRATION_DELAY(long value, ) { net.minecraft.client.gui.screen.Screen.MOUSE_PRESS_SCROLL_NARRATION_DELAY = value; }

// public long KEY_PRESS_NARRATION_DELAY() { return wrapperContained.KEY_PRESS_NARRATION_DELAY; }
// public void KEY_PRESS_NARRATION_DELAY(long value) { wrapperContained.KEY_PRESS_NARRATION_DELAY = value; }
// public static long KEY_PRESS_NARRATION_DELAY() { return net.minecraft.client.gui.screen.Screen.KEY_PRESS_NARRATION_DELAY; }
// public static void KEY_PRESS_NARRATION_DELAY(long value, ) { net.minecraft.client.gui.screen.Screen.KEY_PRESS_NARRATION_DELAY = value; }

// public yarnwrap.client.gui.screen.narration.ScreenNarrator narrator() { return new yarnwrap.client.gui.screen.narration.ScreenNarrator(wrapperContained.narrator); }
// public void narrator(yarnwrap.client.gui.screen.narration.ScreenNarrator value) { wrapperContained.narrator = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.narration.ScreenNarrator narrator() { return new yarnwrap.client.gui.screen.narration.ScreenNarrator(net.minecraft.client.gui.screen.Screen.narrator); }
// public static void narrator(yarnwrap.client.gui.screen.narration.ScreenNarrator value, ) { net.minecraft.client.gui.screen.Screen.narrator = value.wrapperContained; }

// public long elementNarrationStartTime() { return wrapperContained.elementNarrationStartTime; }
// public void elementNarrationStartTime(long value) { wrapperContained.elementNarrationStartTime = value; }
// public static long elementNarrationStartTime() { return net.minecraft.client.gui.screen.Screen.elementNarrationStartTime; }
// public static void elementNarrationStartTime(long value, ) { net.minecraft.client.gui.screen.Screen.elementNarrationStartTime = value; }

// public long screenNarrationStartTime() { return wrapperContained.screenNarrationStartTime; }
// public void screenNarrationStartTime(long value) { wrapperContained.screenNarrationStartTime = value; }
// public static long screenNarrationStartTime() { return net.minecraft.client.gui.screen.Screen.screenNarrationStartTime; }
// public static void screenNarrationStartTime(long value, ) { net.minecraft.client.gui.screen.Screen.screenNarrationStartTime = value; }

// public Object tooltip() { return wrapperContained.tooltip; }
// // public void tooltip(Object value) { wrapperContained.tooltip = value; }
// // public static Object tooltip() { return net.minecraft.client.gui.screen.Screen.tooltip; }
// // public static void tooltip(Object value, ) { net.minecraft.client.gui.screen.Screen.tooltip = value; }

// public boolean screenInitialized() { return wrapperContained.screenInitialized; }
// public void screenInitialized(boolean value) { wrapperContained.screenInitialized = value; }
// public static boolean screenInitialized() { return net.minecraft.client.gui.screen.Screen.screenInitialized; }
// public static void screenInitialized(boolean value, ) { net.minecraft.client.gui.screen.Screen.screenInitialized = value; }

// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public static java.util.concurrent.Executor executor() { return net.minecraft.client.gui.screen.Screen.executor; }
// public static void executor(java.util.concurrent.Executor value, ) { net.minecraft.client.gui.screen.Screen.executor = value; }

// public yarnwrap.client.gui.CubeMapRenderer PANORAMA_RENDERER() { return new yarnwrap.client.gui.CubeMapRenderer(wrapperContained.PANORAMA_RENDERER); }
// public void PANORAMA_RENDERER(yarnwrap.client.gui.CubeMapRenderer value) { wrapperContained.PANORAMA_RENDERER = value.wrapperContained; }
// public static yarnwrap.client.gui.CubeMapRenderer PANORAMA_RENDERER() { return new yarnwrap.client.gui.CubeMapRenderer(net.minecraft.client.gui.screen.Screen.PANORAMA_RENDERER); }
// public static void PANORAMA_RENDERER(yarnwrap.client.gui.CubeMapRenderer value, ) { net.minecraft.client.gui.screen.Screen.PANORAMA_RENDERER = value.wrapperContained; }

// public yarnwrap.client.gui.RotatingCubeMapRenderer ROTATING_PANORAMA_RENDERER() { return new yarnwrap.client.gui.RotatingCubeMapRenderer(wrapperContained.ROTATING_PANORAMA_RENDERER); }
// public void ROTATING_PANORAMA_RENDERER(yarnwrap.client.gui.RotatingCubeMapRenderer value) { wrapperContained.ROTATING_PANORAMA_RENDERER = value.wrapperContained; }
// public static yarnwrap.client.gui.RotatingCubeMapRenderer ROTATING_PANORAMA_RENDERER() { return new yarnwrap.client.gui.RotatingCubeMapRenderer(net.minecraft.client.gui.screen.Screen.ROTATING_PANORAMA_RENDERER); }
// public static void ROTATING_PANORAMA_RENDERER(yarnwrap.client.gui.RotatingCubeMapRenderer value, ) { net.minecraft.client.gui.screen.Screen.ROTATING_PANORAMA_RENDERER = value.wrapperContained; }

// public yarnwrap.util.Identifier MENU_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MENU_BACKGROUND_TEXTURE); }
// public void MENU_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.MENU_BACKGROUND_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier MENU_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.Screen.MENU_BACKGROUND_TEXTURE); }
// public static void MENU_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.Screen.MENU_BACKGROUND_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier INWORLD_MENU_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INWORLD_MENU_BACKGROUND_TEXTURE); }
// public void INWORLD_MENU_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.INWORLD_MENU_BACKGROUND_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier INWORLD_MENU_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.Screen.INWORLD_MENU_BACKGROUND_TEXTURE); }
// public static void INWORLD_MENU_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.Screen.INWORLD_MENU_BACKGROUND_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier HEADER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HEADER_SEPARATOR_TEXTURE); }
// public void HEADER_SEPARATOR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HEADER_SEPARATOR_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier HEADER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.Screen.HEADER_SEPARATOR_TEXTURE); }
// public static void HEADER_SEPARATOR_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.Screen.HEADER_SEPARATOR_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier FOOTER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOTER_SEPARATOR_TEXTURE); }
// public void FOOTER_SEPARATOR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOTER_SEPARATOR_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier FOOTER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.Screen.FOOTER_SEPARATOR_TEXTURE); }
// public static void FOOTER_SEPARATOR_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.Screen.FOOTER_SEPARATOR_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier INWORLD_HEADER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INWORLD_HEADER_SEPARATOR_TEXTURE); }
// public void INWORLD_HEADER_SEPARATOR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.INWORLD_HEADER_SEPARATOR_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier INWORLD_HEADER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.Screen.INWORLD_HEADER_SEPARATOR_TEXTURE); }
// public static void INWORLD_HEADER_SEPARATOR_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.Screen.INWORLD_HEADER_SEPARATOR_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier INWORLD_FOOTER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INWORLD_FOOTER_SEPARATOR_TEXTURE); }
// public void INWORLD_FOOTER_SEPARATOR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.INWORLD_FOOTER_SEPARATOR_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier INWORLD_FOOTER_SEPARATOR_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.Screen.INWORLD_FOOTER_SEPARATOR_TEXTURE); }
// public static void INWORLD_FOOTER_SEPARATOR_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.Screen.INWORLD_FOOTER_SEPARATOR_TEXTURE = value.wrapperContained; }

// public yarnwrap.client.gui.widget.CyclingButtonWidget narratorToggleButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.narratorToggleButton); }
// public void narratorToggleButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.narratorToggleButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.CyclingButtonWidget narratorToggleButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(net.minecraft.client.gui.screen.Screen.narratorToggleButton); }
// public static void narratorToggleButton(yarnwrap.client.gui.widget.CyclingButtonWidget value, ) { net.minecraft.client.gui.screen.Screen.narratorToggleButton = value.wrapperContained; }

// public Screen(yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.Screen(title.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.gui.screen.Screen.tick(); }
// public java.util.List getTooltipFromItem(yarnwrap.client.MinecraftClient client,yarnwrap.item.ItemStack stack) { return wrapperContained.getTooltipFromItem(client.wrapperContained,stack.wrapperContained); }
// public static java.util.List getTooltipFromItem(yarnwrap.client.MinecraftClient client,yarnwrap.item.ItemStack stack, ) { return net.minecraft.client.gui.screen.Screen.getTooltipFromItem(client.wrapperContained,stack.wrapperContained); }
public void resize(yarnwrap.client.MinecraftClient client,int width,int height) { wrapperContained.resize(client.wrapperContained,width,height); }
// public static void resize(yarnwrap.client.MinecraftClient client,int width,int height, ) { net.minecraft.client.gui.screen.Screen.resize(client.wrapperContained,width,height); }
// public void wrapScreenError(java.lang.Runnable task,java.lang.String errorTitle,java.lang.String screenName) { wrapperContained.wrapScreenError(task,errorTitle,screenName); }
// public static void wrapScreenError(java.lang.Runnable task,java.lang.String errorTitle,java.lang.String screenName, ) { net.minecraft.client.gui.screen.Screen.wrapScreenError(task,errorTitle,screenName); }
// public boolean isValidCharacterForName(java.lang.String name,char character,int cursorPos) { return wrapperContained.isValidCharacterForName(name,character,cursorPos); }
// public static boolean isValidCharacterForName(java.lang.String name,char character,int cursorPos, ) { return net.minecraft.client.gui.screen.Screen.isValidCharacterForName(name,character,cursorPos); }
// public void insertText(java.lang.String text,boolean override) { wrapperContained.insertText(text,override); }
// public static void insertText(java.lang.String text,boolean override, ) { net.minecraft.client.gui.screen.Screen.insertText(text,override); }
public void close() { wrapperContained.close(); }
// public static void close() { net.minecraft.client.gui.screen.Screen.close(); }
public void renderBackground(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta) { wrapperContained.renderBackground(context.wrapperContained,mouseX,mouseY,delta); }
// public static void renderBackground(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta, ) { net.minecraft.client.gui.screen.Screen.renderBackground(context.wrapperContained,mouseX,mouseY,delta); }
public boolean shouldPause() { return wrapperContained.shouldPause(); }
// public static boolean shouldPause() { return net.minecraft.client.gui.screen.Screen.shouldPause(); }
public boolean shouldCloseOnEsc() { return wrapperContained.shouldCloseOnEsc(); }
// public static boolean shouldCloseOnEsc() { return net.minecraft.client.gui.screen.Screen.shouldCloseOnEsc(); }
public void init(yarnwrap.client.MinecraftClient client,int width,int height) { wrapperContained.init(client.wrapperContained,width,height); }
// public static void init(yarnwrap.client.MinecraftClient client,int width,int height, ) { net.minecraft.client.gui.screen.Screen.init(client.wrapperContained,width,height); }
// public void init() { wrapperContained.init(); }
// public static void init() { net.minecraft.client.gui.screen.Screen.init(); }
// public yarnwrap.client.gui.Element addSelectableChild(yarnwrap.client.gui.Element child) { return new yarnwrap.client.gui.Element(wrapperContained.addSelectableChild(child.wrapperContained)); }
// public static yarnwrap.client.gui.Element addSelectableChild(yarnwrap.client.gui.Element child, ) { return new yarnwrap.client.gui.Element(net.minecraft.client.gui.screen.Screen.addSelectableChild(child.wrapperContained)); }
public boolean handleTextClick(yarnwrap.text.Style style) { return wrapperContained.handleTextClick(style.wrapperContained); }
// public static boolean handleTextClick(yarnwrap.text.Style style, ) { return net.minecraft.client.gui.screen.Screen.handleTextClick(style.wrapperContained); }
public void removed() { wrapperContained.removed(); }
// public static void removed() { net.minecraft.client.gui.screen.Screen.removed(); }
public yarnwrap.text.Text getNarratedTitle() { return new yarnwrap.text.Text(wrapperContained.getNarratedTitle()); }
// public static yarnwrap.text.Text getNarratedTitle() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.Screen.getNarratedTitle()); }
// public boolean isCut(int code) { return wrapperContained.isCut(code); }
// public static boolean isCut(int code, ) { return net.minecraft.client.gui.screen.Screen.isCut(code); }
// public boolean isPaste(int code) { return wrapperContained.isPaste(code); }
// public static boolean isPaste(int code, ) { return net.minecraft.client.gui.screen.Screen.isPaste(code); }
// public boolean isCopy(int code) { return wrapperContained.isCopy(code); }
// public static boolean isCopy(int code, ) { return net.minecraft.client.gui.screen.Screen.isCopy(code); }
// public boolean isSelectAll(int code) { return wrapperContained.isSelectAll(code); }
// public static boolean isSelectAll(int code, ) { return net.minecraft.client.gui.screen.Screen.isSelectAll(code); }
public yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(wrapperContained.getTitle()); }
// public static yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.Screen.getTitle()); }
// public boolean hasControlDown() { return wrapperContained.hasControlDown(); }
public static boolean hasControlDown() { return net.minecraft.client.gui.screen.Screen.hasControlDown(); }
// public boolean hasShiftDown() { return wrapperContained.hasShiftDown(); }
public static boolean hasShiftDown() { return net.minecraft.client.gui.screen.Screen.hasShiftDown(); }
// public boolean hasAltDown() { return wrapperContained.hasAltDown(); }
public static boolean hasAltDown() { return net.minecraft.client.gui.screen.Screen.hasAltDown(); }
public void filesDragged(java.util.List paths) { wrapperContained.filesDragged(paths); }
// public static void filesDragged(java.util.List paths, ) { net.minecraft.client.gui.screen.Screen.filesDragged(paths); }
// public void addElementNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder) { wrapperContained.addElementNarrations(builder.wrapperContained); }
// public static void addElementNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder, ) { net.minecraft.client.gui.screen.Screen.addElementNarrations(builder.wrapperContained); }
// public void setElementNarrationDelay(long delayMs) { wrapperContained.setElementNarrationDelay(delayMs); }
// public static void setElementNarrationDelay(long delayMs, ) { net.minecraft.client.gui.screen.Screen.setElementNarrationDelay(delayMs); }
// public void setScreenNarrationDelay(long delayMs,boolean restartElementNarration) { wrapperContained.setScreenNarrationDelay(delayMs,restartElementNarration); }
// public static void setScreenNarrationDelay(long delayMs,boolean restartElementNarration, ) { net.minecraft.client.gui.screen.Screen.setScreenNarrationDelay(delayMs,restartElementNarration); }
// public yarnwrap.client.gui.Drawable addDrawable(yarnwrap.client.gui.Drawable drawable) { return new yarnwrap.client.gui.Drawable(wrapperContained.addDrawable(drawable.wrapperContained)); }
// public static yarnwrap.client.gui.Drawable addDrawable(yarnwrap.client.gui.Drawable drawable, ) { return new yarnwrap.client.gui.Drawable(net.minecraft.client.gui.screen.Screen.addDrawable(drawable.wrapperContained)); }
// public Object findSelectedElementData(java.util.List selectables,yarnwrap.client.gui.Selectable selectable) { return wrapperContained.findSelectedElementData(selectables,selectable.wrapperContained); }
// public static Object findSelectedElementData(java.util.List selectables,yarnwrap.client.gui.Selectable selectable, ) { return net.minecraft.client.gui.screen.Screen.findSelectedElementData(selectables,selectable.wrapperContained); }
// public void addScreenNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder messageBuilder) { wrapperContained.addScreenNarrations(messageBuilder.wrapperContained); }
// public static void addScreenNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder messageBuilder, ) { net.minecraft.client.gui.screen.Screen.addScreenNarrations(messageBuilder.wrapperContained); }
// public yarnwrap.client.gui.Element addDrawableChild(yarnwrap.client.gui.Element drawableElement) { return new yarnwrap.client.gui.Element(wrapperContained.addDrawableChild(drawableElement.wrapperContained)); }
// public static yarnwrap.client.gui.Element addDrawableChild(yarnwrap.client.gui.Element drawableElement, ) { return new yarnwrap.client.gui.Element(net.minecraft.client.gui.screen.Screen.addDrawableChild(drawableElement.wrapperContained)); }
public void narrateScreenIfNarrationEnabled(boolean onlyChangedNarrations) { wrapperContained.narrateScreenIfNarrationEnabled(onlyChangedNarrations); }
// public static void narrateScreenIfNarrationEnabled(boolean onlyChangedNarrations, ) { net.minecraft.client.gui.screen.Screen.narrateScreenIfNarrationEnabled(onlyChangedNarrations); }
// public void narrateScreen(boolean onlyChangedNarrations) { wrapperContained.narrateScreen(onlyChangedNarrations); }
// public static void narrateScreen(boolean onlyChangedNarrations, ) { net.minecraft.client.gui.screen.Screen.narrateScreen(onlyChangedNarrations); }
// public void remove(yarnwrap.client.gui.Element child) { wrapperContained.remove(child.wrapperContained); }
// public static void remove(yarnwrap.client.gui.Element child, ) { net.minecraft.client.gui.screen.Screen.remove(child.wrapperContained); }
// public void clearChildren() { wrapperContained.clearChildren(); }
// public static void clearChildren() { net.minecraft.client.gui.screen.Screen.clearChildren(); }
public void applyMouseMoveNarratorDelay() { wrapperContained.applyMouseMoveNarratorDelay(); }
// public static void applyMouseMoveNarratorDelay() { net.minecraft.client.gui.screen.Screen.applyMouseMoveNarratorDelay(); }
public void applyMousePressScrollNarratorDelay() { wrapperContained.applyMousePressScrollNarratorDelay(); }
// public static void applyMousePressScrollNarratorDelay() { net.minecraft.client.gui.screen.Screen.applyMousePressScrollNarratorDelay(); }
public void applyKeyPressNarratorDelay() { wrapperContained.applyKeyPressNarratorDelay(); }
// public static void applyKeyPressNarratorDelay() { net.minecraft.client.gui.screen.Screen.applyKeyPressNarratorDelay(); }
public void updateNarrator() { wrapperContained.updateNarrator(); }
// public static void updateNarrator() { net.minecraft.client.gui.screen.Screen.updateNarrator(); }
// public boolean isNarratorActive() { return wrapperContained.isNarratorActive(); }
// public static boolean isNarratorActive() { return net.minecraft.client.gui.screen.Screen.isNarratorActive(); }
// public void clearAndInit() { wrapperContained.clearAndInit(); }
// public static void clearAndInit() { net.minecraft.client.gui.screen.Screen.clearAndInit(); }
public void setTooltip(yarnwrap.client.gui.tooltip.Tooltip tooltip,yarnwrap.client.gui.tooltip.TooltipPositioner positioner,boolean focused) { wrapperContained.setTooltip(tooltip.wrapperContained,positioner.wrapperContained,focused); }
// public static void setTooltip(yarnwrap.client.gui.tooltip.Tooltip tooltip,yarnwrap.client.gui.tooltip.TooltipPositioner positioner,boolean focused, ) { net.minecraft.client.gui.screen.Screen.setTooltip(tooltip.wrapperContained,positioner.wrapperContained,focused); }
public void renderWithTooltip(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta) { wrapperContained.renderWithTooltip(context.wrapperContained,mouseX,mouseY,delta); }
// public static void renderWithTooltip(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta, ) { net.minecraft.client.gui.screen.Screen.renderWithTooltip(context.wrapperContained,mouseX,mouseY,delta); }
public void setTooltip(java.util.List tooltip) { wrapperContained.setTooltip(tooltip); }
// public static void setTooltip(java.util.List tooltip, ) { net.minecraft.client.gui.screen.Screen.setTooltip(tooltip); }
public void setTooltip(yarnwrap.text.Text tooltip) { wrapperContained.setTooltip(tooltip.wrapperContained); }
// public static void setTooltip(yarnwrap.text.Text tooltip, ) { net.minecraft.client.gui.screen.Screen.setTooltip(tooltip.wrapperContained); }
public void setTooltip(java.util.List tooltip,yarnwrap.client.gui.tooltip.TooltipPositioner positioner,boolean focused) { wrapperContained.setTooltip(tooltip,positioner.wrapperContained,focused); }
// public static void setTooltip(java.util.List tooltip,yarnwrap.client.gui.tooltip.TooltipPositioner positioner,boolean focused, ) { net.minecraft.client.gui.screen.Screen.setTooltip(tooltip,positioner.wrapperContained,focused); }
// public boolean hasUsageText() { return wrapperContained.hasUsageText(); }
// public static boolean hasUsageText() { return net.minecraft.client.gui.screen.Screen.hasUsageText(); }
// public void switchFocus(yarnwrap.client.gui.navigation.GuiNavigationPath path) { wrapperContained.switchFocus(path.wrapperContained); }
// public static void switchFocus(yarnwrap.client.gui.navigation.GuiNavigationPath path, ) { net.minecraft.client.gui.screen.Screen.switchFocus(path.wrapperContained); }
// public Object getArrowNavigation(yarnwrap.client.gui.navigation.NavigationDirection direction) { return wrapperContained.getArrowNavigation(direction.wrapperContained); }
// public static Object getArrowNavigation(yarnwrap.client.gui.navigation.NavigationDirection direction, ) { return net.minecraft.client.gui.screen.Screen.getArrowNavigation(direction.wrapperContained); }
// public void setInitialFocus(yarnwrap.client.gui.Element element) { wrapperContained.setInitialFocus(element.wrapperContained); }
// public static void setInitialFocus(yarnwrap.client.gui.Element element, ) { net.minecraft.client.gui.screen.Screen.setInitialFocus(element.wrapperContained); }
// public Object getTabNavigation() { return wrapperContained.getTabNavigation(); }
// public static Object getTabNavigation() { return net.minecraft.client.gui.screen.Screen.getTabNavigation(); }
public void blur() { wrapperContained.blur(); }
// public static void blur() { net.minecraft.client.gui.screen.Screen.blur(); }
// public void initTabNavigation() { wrapperContained.initTabNavigation(); }
// public static void initTabNavigation() { net.minecraft.client.gui.screen.Screen.initTabNavigation(); }
public void onDisplayed() { wrapperContained.onDisplayed(); }
// public static void onDisplayed() { net.minecraft.client.gui.screen.Screen.onDisplayed(); }
public yarnwrap.sound.MusicSound getMusic() { return new yarnwrap.sound.MusicSound(wrapperContained.getMusic()); }
// public static yarnwrap.sound.MusicSound getMusic() { return new yarnwrap.sound.MusicSound(net.minecraft.client.gui.screen.Screen.getMusic()); }
// public void method_52221(java.lang.Runnable runnable) { wrapperContained.method_52221(runnable); }
// public static void method_52221(java.lang.Runnable runnable, ) { net.minecraft.client.gui.screen.Screen.method_52221(runnable); }
public void renderInGameBackground(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderInGameBackground(context.wrapperContained); }
// public static void renderInGameBackground(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.screen.Screen.renderInGameBackground(context.wrapperContained); }
// public yarnwrap.text.Text getUsageNarrationText() { return new yarnwrap.text.Text(wrapperContained.getUsageNarrationText()); }
// public static yarnwrap.text.Text getUsageNarrationText() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.Screen.getUsageNarrationText()); }
// public void setInitialFocus() { wrapperContained.setInitialFocus(); }
// public static void setInitialFocus() { net.minecraft.client.gui.screen.Screen.setInitialFocus(); }
// public void renderPanoramaBackground(yarnwrap.client.gui.DrawContext context,float delta) { wrapperContained.renderPanoramaBackground(context.wrapperContained,delta); }
// public static void renderPanoramaBackground(yarnwrap.client.gui.DrawContext context,float delta, ) { net.minecraft.client.gui.screen.Screen.renderPanoramaBackground(context.wrapperContained,delta); }
// public void applyBlur(float delta) { wrapperContained.applyBlur(delta); }
// public static void applyBlur(float delta, ) { net.minecraft.client.gui.screen.Screen.applyBlur(delta); }
// public void renderDarkening(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderDarkening(context.wrapperContained); }
// public static void renderDarkening(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.screen.Screen.renderDarkening(context.wrapperContained); }
// public void renderDarkening(yarnwrap.client.gui.DrawContext context,int x,int y,int width,int height) { wrapperContained.renderDarkening(context.wrapperContained,x,y,width,height); }
// public static void renderDarkening(yarnwrap.client.gui.DrawContext context,int x,int y,int width,int height, ) { net.minecraft.client.gui.screen.Screen.renderDarkening(context.wrapperContained,x,y,width,height); }
// public void renderBackgroundTexture(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,int x,int y,float u,float v,int width,int height) { wrapperContained.renderBackgroundTexture(context.wrapperContained,texture.wrapperContained,x,y,u,v,width,height); }
// public static void renderBackgroundTexture(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,int x,int y,float u,float v,int width,int height, ) { net.minecraft.client.gui.screen.Screen.renderBackgroundTexture(context.wrapperContained,texture.wrapperContained,x,y,u,v,width,height); }
// public void clearTooltip() { wrapperContained.clearTooltip(); }
// public static void clearTooltip() { net.minecraft.client.gui.screen.Screen.clearTooltip(); }
// public void method_61039(java.net.URI confirmed) { wrapperContained.method_61039(confirmed); }
// public static void method_61039(java.net.URI confirmed, ) { net.minecraft.client.gui.screen.Screen.method_61039(confirmed); }
public void refreshNarrator(boolean previouslyDisabled) { wrapperContained.refreshNarrator(previouslyDisabled); }
// public static void refreshNarrator(boolean previouslyDisabled, ) { net.minecraft.client.gui.screen.Screen.refreshNarrator(previouslyDisabled); }

}