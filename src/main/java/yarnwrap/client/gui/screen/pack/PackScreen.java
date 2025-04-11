package yarnwrap.client.gui.screen.pack;
public class PackScreen { public net.minecraft.client.gui.screen.pack.PackScreen wrapperContained; public PackScreen(net.minecraft.client.gui.screen.pack.PackScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text DROP_INFO() { return new yarnwrap.text.Text(wrapperContained.DROP_INFO); }
// public void DROP_INFO(yarnwrap.text.Text value) { wrapperContained.DROP_INFO = value.wrapperContained; }
// public yarnwrap.text.Text FOLDER_INFO() { return new yarnwrap.text.Text(wrapperContained.FOLDER_INFO); }
// public void FOLDER_INFO(yarnwrap.text.Text value) { wrapperContained.FOLDER_INFO = value.wrapperContained; }
// public yarnwrap.client.gui.screen.pack.ResourcePackOrganizer organizer() { return new yarnwrap.client.gui.screen.pack.ResourcePackOrganizer(wrapperContained.organizer); }
// public void organizer(yarnwrap.client.gui.screen.pack.ResourcePackOrganizer value) { wrapperContained.organizer = value.wrapperContained; }
// public yarnwrap.client.gui.screen.pack.PackListWidget availablePackList() { return new yarnwrap.client.gui.screen.pack.PackListWidget(wrapperContained.availablePackList); }
// public void availablePackList(yarnwrap.client.gui.screen.pack.PackListWidget value) { wrapperContained.availablePackList = value.wrapperContained; }
// public yarnwrap.client.gui.screen.pack.PackListWidget selectedPackList() { return new yarnwrap.client.gui.screen.pack.PackListWidget(wrapperContained.selectedPackList); }
// public void selectedPackList(yarnwrap.client.gui.screen.pack.PackListWidget value) { wrapperContained.selectedPackList = value.wrapperContained; }
// public java.nio.file.Path file() { return wrapperContained.file; }
// public void file(java.nio.file.Path value) { wrapperContained.file = value; }
// public yarnwrap.client.gui.widget.ButtonWidget doneButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.doneButton); }
// public void doneButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.doneButton = value.wrapperContained; }
// public yarnwrap.util.Identifier UNKNOWN_PACK() { return new yarnwrap.util.Identifier(wrapperContained.UNKNOWN_PACK); }
// public void UNKNOWN_PACK(yarnwrap.util.Identifier value) { wrapperContained.UNKNOWN_PACK = value.wrapperContained; }
// public Object directoryWatcher() { return wrapperContained.directoryWatcher; }
// // public void directoryWatcher(Object value) { wrapperContained.directoryWatcher = value; }
// public long refreshTimeout() { return wrapperContained.refreshTimeout; }
// public void refreshTimeout(long value) { wrapperContained.refreshTimeout = value; }
// public java.util.Map iconTextures() { return wrapperContained.iconTextures; }
// public void iconTextures(java.util.Map value) { wrapperContained.iconTextures = value; }
// public yarnwrap.text.Text AVAILABLE_TITLE() { return new yarnwrap.text.Text(wrapperContained.AVAILABLE_TITLE); }
// public void AVAILABLE_TITLE(yarnwrap.text.Text value) { wrapperContained.AVAILABLE_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text SELECTED_TITLE() { return new yarnwrap.text.Text(wrapperContained.SELECTED_TITLE); }
// public void SELECTED_TITLE(yarnwrap.text.Text value) { wrapperContained.SELECTED_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text OPEN_FOLDER() { return new yarnwrap.text.Text(wrapperContained.OPEN_FOLDER); }
// public void OPEN_FOLDER(yarnwrap.text.Text value) { wrapperContained.OPEN_FOLDER = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
public PackScreen(yarnwrap.resource.ResourcePackManager resourcePackManager,java.util.function.Consumer applier,java.nio.file.Path file,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.pack.PackScreen(resourcePackManager.wrapperContained,applier,file,title.wrapperContained); }
// public void copyPacks(yarnwrap.client.MinecraftClient client,java.util.List srcPaths,java.nio.file.Path destPath) { wrapperContained.copyPacks(client.wrapperContained,srcPaths,destPath); }
// public void method_29670(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_29670(button.wrapperContained); }
// public void method_29672(yarnwrap.client.gui.screen.pack.PackListWidget pack) { wrapperContained.method_29672(pack.wrapperContained); }
// public void updatePackList(yarnwrap.client.gui.screen.pack.PackListWidget widget,java.util.stream.Stream packs) { wrapperContained.updatePackList(widget.wrapperContained,packs); }
// public void method_29674(java.nio.file.Path toCopy) { wrapperContained.method_29674(toCopy); }
// public void method_29675(java.nio.file.Path src) { wrapperContained.method_29675(src); }
// public void method_29676(java.util.List confirmed) { wrapperContained.method_29676(confirmed); }
// public void updatePackLists() { wrapperContained.updatePackLists(); }
// public void refresh() { wrapperContained.refresh(); }
// public void method_29982(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_29982(button.wrapperContained); }
// public yarnwrap.util.Identifier getPackIconTexture(yarnwrap.resource.ResourcePackProfile resourcePackProfile) { return new yarnwrap.util.Identifier(wrapperContained.getPackIconTexture(resourcePackProfile.wrapperContained)); }
// public yarnwrap.util.Identifier method_30288(yarnwrap.resource.ResourcePackProfile profileName) { return new yarnwrap.util.Identifier(wrapperContained.method_30288(profileName.wrapperContained)); }
// public yarnwrap.util.Identifier loadPackIcon(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.resource.ResourcePackProfile resourcePackProfile) { return new yarnwrap.util.Identifier(wrapperContained.loadPackIcon(textureManager.wrapperContained,resourcePackProfile.wrapperContained)); }
// public void closeDirectoryWatcher() { wrapperContained.closeDirectoryWatcher(); }
public void switchFocusedList(yarnwrap.client.gui.screen.pack.PackListWidget listWidget) { wrapperContained.switchFocusedList(listWidget.wrapperContained); }
public void clearSelection() { wrapperContained.clearSelection(); }
// public java.util.stream.Stream streamFileNames(java.util.Collection paths) { return wrapperContained.streamFileNames(paths); }

}