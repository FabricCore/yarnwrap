package yarnwrap.client.realms.gui.screen;
public class RealmsSettingsScreen { public net.minecraft.client.realms.gui.screen.RealmsSettingsScreen wrapperContained; public RealmsSettingsScreen(net.minecraft.client.realms.gui.screen.RealmsSettingsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.parent); }
// public static void parent(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen value, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.parent = value.wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public void serverData(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.serverData = value.wrapperContained; }
// public static yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.serverData); }
// public static void serverData(yarnwrap.client.realms.dto.RealmsServer value, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.serverData = value.wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget descEdit() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.descEdit); }
// public void descEdit(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.descEdit = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.TextFieldWidget descEdit() { return new yarnwrap.client.gui.widget.TextFieldWidget(net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.descEdit); }
// public static void descEdit(yarnwrap.client.gui.widget.TextFieldWidget value, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.descEdit = value.wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget nameEdit() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.nameEdit); }
// public void nameEdit(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.nameEdit = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.TextFieldWidget nameEdit() { return new yarnwrap.client.gui.widget.TextFieldWidget(net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.nameEdit); }
// public static void nameEdit(yarnwrap.client.gui.widget.TextFieldWidget value, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.nameEdit = value.wrapperContained; }

// public yarnwrap.text.Text WORLD_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_NAME_TEXT); }
// public void WORLD_NAME_TEXT(yarnwrap.text.Text value) { wrapperContained.WORLD_NAME_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text WORLD_NAME_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.WORLD_NAME_TEXT); }
// public static void WORLD_NAME_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.WORLD_NAME_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text WORLD_DESCRIPTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_DESCRIPTION_TEXT); }
// public void WORLD_DESCRIPTION_TEXT(yarnwrap.text.Text value) { wrapperContained.WORLD_DESCRIPTION_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text WORLD_DESCRIPTION_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.WORLD_DESCRIPTION_TEXT); }
// public static void WORLD_DESCRIPTION_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.WORLD_DESCRIPTION_TEXT = value.wrapperContained; }

// public int TEXT_FIELD_WIDTH() { return wrapperContained.TEXT_FIELD_WIDTH; }
// public void TEXT_FIELD_WIDTH(int value) { wrapperContained.TEXT_FIELD_WIDTH = value; }
// public static int TEXT_FIELD_WIDTH() { return net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.TEXT_FIELD_WIDTH; }
// public static void TEXT_FIELD_WIDTH(int value, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.TEXT_FIELD_WIDTH = value; }

public RealmsSettingsScreen(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent,yarnwrap.client.realms.dto.RealmsServer serverData) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsSettingsScreen(parent.wrapperContained,serverData.wrapperContained); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.save(); }
// public void method_25251(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25251(button.wrapperContained); }
// public static void method_25251(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.method_25251(button.wrapperContained); }
// public void method_25253(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25253(button.wrapperContained); }
// public static void method_25253(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.method_25253(button.wrapperContained); }
// public void method_54575(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_54575(button.wrapperContained); }
// public static void method_54575(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.method_54575(button.wrapperContained); }
// public void method_54576(yarnwrap.client.gui.widget.ButtonWidget name) { wrapperContained.method_54576(name.wrapperContained); }
// public static void method_54576(yarnwrap.client.gui.widget.ButtonWidget name, ) { net.minecraft.client.realms.gui.screen.RealmsSettingsScreen.method_54576(name.wrapperContained); }

}