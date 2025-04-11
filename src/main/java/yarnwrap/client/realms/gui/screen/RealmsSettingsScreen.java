package yarnwrap.client.realms.gui.screen;
public class RealmsSettingsScreen { public net.minecraft.client.realms.gui.screen.RealmsSettingsScreen wrapperContained; public RealmsSettingsScreen(net.minecraft.client.realms.gui.screen.RealmsSettingsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public void serverData(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.serverData = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget descEdit() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.descEdit); }
// public void descEdit(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.descEdit = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget nameEdit() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.nameEdit); }
// public void nameEdit(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.nameEdit = value.wrapperContained; }
// public yarnwrap.text.Text WORLD_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_NAME_TEXT); }
// public void WORLD_NAME_TEXT(yarnwrap.text.Text value) { wrapperContained.WORLD_NAME_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text WORLD_DESCRIPTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_DESCRIPTION_TEXT); }
// public void WORLD_DESCRIPTION_TEXT(yarnwrap.text.Text value) { wrapperContained.WORLD_DESCRIPTION_TEXT = value.wrapperContained; }
// public int TEXT_FIELD_WIDTH() { return wrapperContained.TEXT_FIELD_WIDTH; }
// public void TEXT_FIELD_WIDTH(int value) { wrapperContained.TEXT_FIELD_WIDTH = value; }
public RealmsSettingsScreen(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent,yarnwrap.client.realms.dto.RealmsServer serverData) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsSettingsScreen(parent.wrapperContained,serverData.wrapperContained); }
public void save() { wrapperContained.save(); }
// public void method_25251(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25251(button.wrapperContained); }
// public void method_25253(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25253(button.wrapperContained); }
// public void method_54575(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_54575(button.wrapperContained); }
// public void method_54576(yarnwrap.client.gui.widget.ButtonWidget name) { wrapperContained.method_54576(name.wrapperContained); }

}