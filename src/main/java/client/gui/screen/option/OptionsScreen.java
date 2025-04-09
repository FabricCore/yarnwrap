package yarnwrap.client.gui.screen.option;
public class OptionsScreen { public net.minecraft.client.gui.screen.option.OptionsScreen wrapperContained; public OptionsScreen(net.minecraft.client.gui.screen.option.OptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.CyclingButtonWidget difficultyButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.difficultyButton); }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.client.option.GameOptions settings() { return new yarnwrap.client.option.GameOptions(wrapperContained.settings); }
// public yarnwrap.client.gui.widget.LockButtonWidget lockDifficultyButton() { return new yarnwrap.client.gui.widget.LockButtonWidget(wrapperContained.lockDifficultyButton); }
// public yarnwrap.text.Text SKIN_CUSTOMIZATION_TEXT() { return new yarnwrap.text.Text(wrapperContained.SKIN_CUSTOMIZATION_TEXT); }
// public yarnwrap.text.Text SOUNDS_TEXT() { return new yarnwrap.text.Text(wrapperContained.SOUNDS_TEXT); }
// public yarnwrap.text.Text VIDEO_TEXT() { return new yarnwrap.text.Text(wrapperContained.VIDEO_TEXT); }
// public yarnwrap.text.Text CONTROL_TEXT() { return new yarnwrap.text.Text(wrapperContained.CONTROL_TEXT); }
// public yarnwrap.text.Text LANGUAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.LANGUAGE_TEXT); }
// public yarnwrap.text.Text CHAT_TEXT() { return new yarnwrap.text.Text(wrapperContained.CHAT_TEXT); }
// public yarnwrap.text.Text RESOURCE_PACK_TEXT() { return new yarnwrap.text.Text(wrapperContained.RESOURCE_PACK_TEXT); }
// public yarnwrap.text.Text ACCESSIBILITY_TEXT() { return new yarnwrap.text.Text(wrapperContained.ACCESSIBILITY_TEXT); }
// public yarnwrap.text.Text TELEMETRY_TEXT() { return new yarnwrap.text.Text(wrapperContained.TELEMETRY_TEXT); }
// public int COLUMNS() { return wrapperContained.COLUMNS; }
// public yarnwrap.text.Text CREDITS_AND_ATTRIBUTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.CREDITS_AND_ATTRIBUTION_TEXT); }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public yarnwrap.client.gui.tooltip.Tooltip TELEMETRY_DISABLED_TOOLTIP() { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.TELEMETRY_DISABLED_TOOLTIP); }
// public void lockDifficulty(boolean difficultyLocked) { wrapperContained.lockDifficulty(difficultyLocked); }
public yarnwrap.client.gui.widget.CyclingButtonWidget createDifficultyButtonWidget(int x,int y,java.lang.String translationKey,yarnwrap.client.MinecraftClient client) { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.createDifficultyButtonWidget(x,y,translationKey,client.wrapperContained)); }
// public yarnwrap.client.gui.widget.ButtonWidget createButton(yarnwrap.text.Text message,java.util.function.Supplier screenSupplier) { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.createButton(message.wrapperContained,screenSupplier)); }
// public yarnwrap.client.gui.widget.Widget createTopRightButton() { return new yarnwrap.client.gui.widget.Widget(wrapperContained.createTopRightButton()); }
// public void refreshResourcePacks(yarnwrap.resource.ResourcePackManager resourcePackManager) { wrapperContained.refreshResourcePacks(resourcePackManager.wrapperContained); }

}