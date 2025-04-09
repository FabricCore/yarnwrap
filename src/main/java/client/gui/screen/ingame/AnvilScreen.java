package yarnwrap.client.gui.screen.ingame;
public class AnvilScreen { public net.minecraft.client.gui.screen.ingame.AnvilScreen wrapperContained; public AnvilScreen(net.minecraft.client.gui.screen.ingame.AnvilScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TOO_EXPENSIVE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOO_EXPENSIVE_TEXT); }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.client.gui.widget.TextFieldWidget nameField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.nameField); }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public yarnwrap.util.Identifier TEXT_FIELD_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXT_FIELD_TEXTURE); }
// public yarnwrap.util.Identifier TEXT_FIELD_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXT_FIELD_DISABLED_TEXTURE); }
// public yarnwrap.util.Identifier ERROR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ERROR_TEXTURE); }
// public void onRenamed(java.lang.String name) { wrapperContained.onRenamed(name); }

}