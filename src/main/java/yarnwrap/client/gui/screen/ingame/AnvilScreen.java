package yarnwrap.client.gui.screen.ingame;
public class AnvilScreen { public net.minecraft.client.gui.screen.ingame.AnvilScreen wrapperContained; public AnvilScreen(net.minecraft.client.gui.screen.ingame.AnvilScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AnvilScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AnvilScreen.TEXTURE = value.wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget nameField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.nameField); }
// public void nameField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.nameField = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.TextFieldWidget nameField() { return new yarnwrap.client.gui.widget.TextFieldWidget(net.minecraft.client.gui.screen.ingame.AnvilScreen.nameField); }
// public static void nameField(yarnwrap.client.gui.widget.TextFieldWidget value, ) { net.minecraft.client.gui.screen.ingame.AnvilScreen.nameField = value.wrapperContained; }

// public yarnwrap.text.Text TOO_EXPENSIVE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOO_EXPENSIVE_TEXT); }
// public void TOO_EXPENSIVE_TEXT(yarnwrap.text.Text value) { wrapperContained.TOO_EXPENSIVE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TOO_EXPENSIVE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.AnvilScreen.TOO_EXPENSIVE_TEXT); }
// public static void TOO_EXPENSIVE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ingame.AnvilScreen.TOO_EXPENSIVE_TEXT = value.wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.client.gui.screen.ingame.AnvilScreen.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.client.gui.screen.ingame.AnvilScreen.player = value.wrapperContained; }

// public yarnwrap.util.Identifier TEXT_FIELD_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXT_FIELD_TEXTURE); }
// public void TEXT_FIELD_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXT_FIELD_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXT_FIELD_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AnvilScreen.TEXT_FIELD_TEXTURE); }
// public static void TEXT_FIELD_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AnvilScreen.TEXT_FIELD_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier TEXT_FIELD_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXT_FIELD_DISABLED_TEXTURE); }
// public void TEXT_FIELD_DISABLED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXT_FIELD_DISABLED_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXT_FIELD_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AnvilScreen.TEXT_FIELD_DISABLED_TEXTURE); }
// public static void TEXT_FIELD_DISABLED_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AnvilScreen.TEXT_FIELD_DISABLED_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier ERROR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ERROR_TEXTURE); }
// public void ERROR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ERROR_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier ERROR_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AnvilScreen.ERROR_TEXTURE); }
// public static void ERROR_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AnvilScreen.ERROR_TEXTURE = value.wrapperContained; }

public AnvilScreen(yarnwrap.screen.AnvilScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.AnvilScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }
// public void onRenamed(java.lang.String name) { wrapperContained.onRenamed(name); }
// public static void onRenamed(java.lang.String name, ) { net.minecraft.client.gui.screen.ingame.AnvilScreen.onRenamed(name); }

}