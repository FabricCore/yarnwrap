package yarnwrap.client.gui.screen.option;
public class OptionsScreen { public net.minecraft.client.gui.screen.option.OptionsScreen wrapperContained; public OptionsScreen(net.minecraft.client.gui.screen.option.OptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.CyclingButtonWidget difficultyButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.difficultyButton); }
// public void difficultyButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.difficultyButton = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.option.GameOptions settings() { return new yarnwrap.client.option.GameOptions(wrapperContained.settings); }
// public void settings(yarnwrap.client.option.GameOptions value) { wrapperContained.settings = value.wrapperContained; }
// public yarnwrap.client.gui.widget.LockButtonWidget lockDifficultyButton() { return new yarnwrap.client.gui.widget.LockButtonWidget(wrapperContained.lockDifficultyButton); }
// public void lockDifficultyButton(yarnwrap.client.gui.widget.LockButtonWidget value) { wrapperContained.lockDifficultyButton = value.wrapperContained; }
// public yarnwrap.text.Text SKIN_CUSTOMIZATION_TEXT() { return new yarnwrap.text.Text(wrapperContained.SKIN_CUSTOMIZATION_TEXT); }
// public void SKIN_CUSTOMIZATION_TEXT(yarnwrap.text.Text value) { wrapperContained.SKIN_CUSTOMIZATION_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SOUNDS_TEXT() { return new yarnwrap.text.Text(wrapperContained.SOUNDS_TEXT); }
// public void SOUNDS_TEXT(yarnwrap.text.Text value) { wrapperContained.SOUNDS_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text VIDEO_TEXT() { return new yarnwrap.text.Text(wrapperContained.VIDEO_TEXT); }
// public void VIDEO_TEXT(yarnwrap.text.Text value) { wrapperContained.VIDEO_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text CONTROL_TEXT() { return new yarnwrap.text.Text(wrapperContained.CONTROL_TEXT); }
// public void CONTROL_TEXT(yarnwrap.text.Text value) { wrapperContained.CONTROL_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text LANGUAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.LANGUAGE_TEXT); }
// public void LANGUAGE_TEXT(yarnwrap.text.Text value) { wrapperContained.LANGUAGE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text CHAT_TEXT() { return new yarnwrap.text.Text(wrapperContained.CHAT_TEXT); }
// public void CHAT_TEXT(yarnwrap.text.Text value) { wrapperContained.CHAT_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text RESOURCE_PACK_TEXT() { return new yarnwrap.text.Text(wrapperContained.RESOURCE_PACK_TEXT); }
// public void RESOURCE_PACK_TEXT(yarnwrap.text.Text value) { wrapperContained.RESOURCE_PACK_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text ACCESSIBILITY_TEXT() { return new yarnwrap.text.Text(wrapperContained.ACCESSIBILITY_TEXT); }
// public void ACCESSIBILITY_TEXT(yarnwrap.text.Text value) { wrapperContained.ACCESSIBILITY_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text TELEMETRY_TEXT() { return new yarnwrap.text.Text(wrapperContained.TELEMETRY_TEXT); }
// public void TELEMETRY_TEXT(yarnwrap.text.Text value) { wrapperContained.TELEMETRY_TEXT = value.wrapperContained; }
// public int COLUMNS() { return wrapperContained.COLUMNS; }
// public void COLUMNS(int value) { wrapperContained.COLUMNS = value; }
// public yarnwrap.text.Text CREDITS_AND_ATTRIBUTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.CREDITS_AND_ATTRIBUTION_TEXT); }
// public void CREDITS_AND_ATTRIBUTION_TEXT(yarnwrap.text.Text value) { wrapperContained.CREDITS_AND_ATTRIBUTION_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public yarnwrap.client.gui.tooltip.Tooltip TELEMETRY_DISABLED_TOOLTIP() { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.TELEMETRY_DISABLED_TOOLTIP); }
// public void TELEMETRY_DISABLED_TOOLTIP(yarnwrap.client.gui.tooltip.Tooltip value) { wrapperContained.TELEMETRY_DISABLED_TOOLTIP = value.wrapperContained; }
public OptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.gui.screen.option.OptionsScreen(parent.wrapperContained,gameOptions.wrapperContained); }
// public void lockDifficulty(boolean difficultyLocked) { wrapperContained.lockDifficulty(difficultyLocked); }
public yarnwrap.client.gui.widget.CyclingButtonWidget createDifficultyButtonWidget(int x,int y,java.lang.String translationKey,yarnwrap.client.MinecraftClient client) { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.createDifficultyButtonWidget(x,y,translationKey,client.wrapperContained)); }
// public void method_39487(yarnwrap.client.MinecraftClient button,yarnwrap.client.gui.widget.CyclingButtonWidget difficulty) { wrapperContained.method_39487(button.wrapperContained,difficulty.wrapperContained); }
// public void method_47623(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_47623(button.wrapperContained); }
// public void method_47624(java.util.function.Supplier button) { wrapperContained.method_47624(button); }
// public yarnwrap.client.gui.widget.ButtonWidget createButton(yarnwrap.text.Text message,java.util.function.Supplier screenSupplier) { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.createButton(message.wrapperContained,screenSupplier)); }
// public void method_47626(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_47626(button.wrapperContained); }
// public void method_47627(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_47627(button.wrapperContained); }
// public yarnwrap.client.gui.widget.Widget createTopRightButton() { return new yarnwrap.client.gui.widget.Widget(wrapperContained.createTopRightButton()); }
// public void refreshResourcePacks(yarnwrap.resource.ResourcePackManager resourcePackManager) { wrapperContained.refreshResourcePacks(resourcePackManager.wrapperContained); }

}