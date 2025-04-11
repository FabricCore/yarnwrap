package yarnwrap.client.gui.screen.ingame;
public class BeaconScreen { public net.minecraft.client.gui.screen.ingame.BeaconScreen wrapperContained; public BeaconScreen(net.minecraft.client.gui.screen.ingame.BeaconScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry primaryEffect() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.primaryEffect); }
// public void primaryEffect(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.primaryEffect = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry secondaryEffect() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.secondaryEffect); }
// public void secondaryEffect(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.secondaryEffect = value.wrapperContained; }
// public yarnwrap.text.Text PRIMARY_POWER_TEXT() { return new yarnwrap.text.Text(wrapperContained.PRIMARY_POWER_TEXT); }
// public void PRIMARY_POWER_TEXT(yarnwrap.text.Text value) { wrapperContained.PRIMARY_POWER_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SECONDARY_POWER_TEXT() { return new yarnwrap.text.Text(wrapperContained.SECONDARY_POWER_TEXT); }
// public void SECONDARY_POWER_TEXT(yarnwrap.text.Text value) { wrapperContained.SECONDARY_POWER_TEXT = value.wrapperContained; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public java.util.List buttons() { return wrapperContained.buttons; }
// public void buttons(java.util.List value) { wrapperContained.buttons = value; }
// public yarnwrap.util.Identifier BUTTON_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BUTTON_HIGHLIGHTED_TEXTURE); }
// public void BUTTON_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BUTTON_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier BUTTON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BUTTON_TEXTURE); }
// public void BUTTON_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BUTTON_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CONFIRM_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CONFIRM_TEXTURE); }
// public void CONFIRM_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CONFIRM_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CANCEL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CANCEL_TEXTURE); }
// public void CANCEL_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CANCEL_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier BUTTON_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BUTTON_DISABLED_TEXTURE); }
// public void BUTTON_DISABLED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BUTTON_DISABLED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier BUTTON_SELECTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BUTTON_SELECTED_TEXTURE); }
// public void BUTTON_SELECTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BUTTON_SELECTED_TEXTURE = value.wrapperContained; }
public BeaconScreen(yarnwrap.screen.BeaconScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.BeaconScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }
// public void method_37075(int button) { wrapperContained.method_37075(button); }
// public void addButton(yarnwrap.client.gui.widget.ClickableWidget button) { wrapperContained.addButton(button.wrapperContained); }
// public void tickButtons() { wrapperContained.tickButtons(); }

}