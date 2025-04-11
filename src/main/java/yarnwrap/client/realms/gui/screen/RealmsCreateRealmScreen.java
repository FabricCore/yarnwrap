package yarnwrap.client.realms.gui.screen;
public class RealmsCreateRealmScreen { public net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen wrapperContained; public RealmsCreateRealmScreen(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.gui.screen.RealmsMainScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsMainScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.realms.gui.screen.RealmsMainScreen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget nameBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.nameBox); }
// public void nameBox(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.nameBox = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget descriptionBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.descriptionBox); }
// public void descriptionBox(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.descriptionBox = value.wrapperContained; }
// public yarnwrap.text.Text WORLD_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_NAME_TEXT); }
// public void WORLD_NAME_TEXT(yarnwrap.text.Text value) { wrapperContained.WORLD_NAME_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text WORLD_DESCRIPTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_DESCRIPTION_TEXT); }
// public void WORLD_DESCRIPTION_TEXT(yarnwrap.text.Text value) { wrapperContained.WORLD_DESCRIPTION_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public java.lang.Runnable worldCreator() { return wrapperContained.worldCreator; }
// public void worldCreator(java.lang.Runnable value) { wrapperContained.worldCreator = value; }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
public RealmsCreateRealmScreen(yarnwrap.client.realms.gui.screen.RealmsMainScreen parent,long parentId) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen(parent.wrapperContained,parentId); }
public RealmsCreateRealmScreen(yarnwrap.client.realms.gui.screen.RealmsMainScreen parent,yarnwrap.client.realms.dto.RealmsServer realmsServer) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen(parent.wrapperContained,realmsServer.wrapperContained); }
// public void createWorld(yarnwrap.client.realms.dto.RealmsServer realmsServer) { wrapperContained.createWorld(realmsServer.wrapperContained); }
// public void method_52665(yarnwrap.client.realms.gui.screen.RealmsCreateRealmScreen child) { wrapperContained.method_52665(child.wrapperContained); }
// public void method_52666(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_52666(button.wrapperContained); }
// public void method_52667(yarnwrap.client.gui.widget.ButtonWidget name) { wrapperContained.method_52667(name.wrapperContained); }
// public void createSnapshotWorld(long parentId) { wrapperContained.createSnapshotWorld(parentId); }
// public void method_54371(long info) { wrapperContained.method_54371(info); }
// public void method_54374(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_54374(button.wrapperContained); }

}