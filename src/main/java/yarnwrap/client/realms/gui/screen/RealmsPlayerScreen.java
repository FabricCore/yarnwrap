package yarnwrap.client.realms.gui.screen;
public class RealmsPlayerScreen { public net.minecraft.client.realms.gui.screen.RealmsPlayerScreen wrapperContained; public RealmsPlayerScreen(net.minecraft.client.realms.gui.screen.RealmsPlayerScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public void serverData(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.serverData = value.wrapperContained; }
// public boolean stateChanged() { return wrapperContained.stateChanged; }
// public void stateChanged(boolean value) { wrapperContained.stateChanged = value; }
// public yarnwrap.text.Text QUESTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.QUESTION_TEXT); }
// public void QUESTION_TEXT(yarnwrap.text.Text value) { wrapperContained.QUESTION_TEXT = value.wrapperContained; }
// public Object selectionList() { return wrapperContained.selectionList; }
// // public void selectionList(Object value) { wrapperContained.selectionList = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
public RealmsPlayerScreen(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent,yarnwrap.client.realms.dto.RealmsServer serverData) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsPlayerScreen(parent.wrapperContained,serverData.wrapperContained); }
// public void backButtonClicked() { wrapperContained.backButtonClicked(); }
// public void method_25197(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25197(button.wrapperContained); }
// public void method_57681(yarnwrap.client.realms.gui.screen.RealmsPlayerScreen child) { wrapperContained.method_57681(child.wrapperContained); }
// public void method_57682(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_57682(button.wrapperContained); }
// public void refreshPlayers() { wrapperContained.refreshPlayers(); }

}