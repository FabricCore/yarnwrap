package yarnwrap.client.realms.gui.screen;
public class RealmsSettingsScreen { public net.minecraft.client.realms.gui.screen.RealmsSettingsScreen wrapperContained; public RealmsSettingsScreen(net.minecraft.client.realms.gui.screen.RealmsSettingsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.parent); }
// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public yarnwrap.client.gui.widget.TextFieldWidget descEdit() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.descEdit); }
// public yarnwrap.client.gui.widget.TextFieldWidget nameEdit() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.nameEdit); }
// public yarnwrap.text.Text WORLD_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_NAME_TEXT); }
// public yarnwrap.text.Text WORLD_DESCRIPTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_DESCRIPTION_TEXT); }
// public int TEXT_FIELD_WIDTH() { return wrapperContained.TEXT_FIELD_WIDTH; }
public void save() { wrapperContained.save(); }

}