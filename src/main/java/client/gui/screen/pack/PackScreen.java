package yarnwrap.client.gui.screen.pack;
public class PackScreen { public net.minecraft.client.gui.screen.pack.PackScreen wrapperContained; public PackScreen(net.minecraft.client.gui.screen.pack.PackScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text DROP_INFO() { return new yarnwrap.text.Text(wrapperContained.DROP_INFO); }
// public yarnwrap.text.Text FOLDER_INFO() { return new yarnwrap.text.Text(wrapperContained.FOLDER_INFO); }
// public yarnwrap.client.gui.screen.pack.ResourcePackOrganizer organizer() { return new yarnwrap.client.gui.screen.pack.ResourcePackOrganizer(wrapperContained.organizer); }
// public yarnwrap.client.gui.screen.pack.PackListWidget availablePackList() { return new yarnwrap.client.gui.screen.pack.PackListWidget(wrapperContained.availablePackList); }
// public yarnwrap.client.gui.screen.pack.PackListWidget selectedPackList() { return new yarnwrap.client.gui.screen.pack.PackListWidget(wrapperContained.selectedPackList); }
// public java.nio.file.Path file() { return wrapperContained.file; }
// public yarnwrap.client.gui.widget.ButtonWidget doneButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.doneButton); }
// public yarnwrap.util.Identifier UNKNOWN_PACK() { return new yarnwrap.util.Identifier(wrapperContained.UNKNOWN_PACK); }
// public Object directoryWatcher() { return wrapperContained.directoryWatcher; }
// public long refreshTimeout() { return wrapperContained.refreshTimeout; }
// public java.util.Map iconTextures() { return wrapperContained.iconTextures; }
// public yarnwrap.text.Text AVAILABLE_TITLE() { return new yarnwrap.text.Text(wrapperContained.AVAILABLE_TITLE); }
// public yarnwrap.text.Text SELECTED_TITLE() { return new yarnwrap.text.Text(wrapperContained.SELECTED_TITLE); }
// public yarnwrap.text.Text OPEN_FOLDER() { return new yarnwrap.text.Text(wrapperContained.OPEN_FOLDER); }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void copyPacks(yarnwrap.client.MinecraftClient client,java.util.List srcPaths,java.nio.file.Path destPath) { wrapperContained.copyPacks(client.wrapperContained,srcPaths,destPath); }
// public void updatePackList(yarnwrap.client.gui.screen.pack.PackListWidget widget,java.util.stream.Stream packs) { wrapperContained.updatePackList(widget.wrapperContained,packs); }
// public void updatePackLists() { wrapperContained.updatePackLists(); }
// public void refresh() { wrapperContained.refresh(); }
// public yarnwrap.util.Identifier getPackIconTexture(yarnwrap.resource.ResourcePackProfile resourcePackProfile) { return new yarnwrap.util.Identifier(wrapperContained.getPackIconTexture(resourcePackProfile.wrapperContained)); }
// public yarnwrap.util.Identifier loadPackIcon(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.resource.ResourcePackProfile resourcePackProfile) { return new yarnwrap.util.Identifier(wrapperContained.loadPackIcon(textureManager.wrapperContained,resourcePackProfile.wrapperContained)); }
// public void closeDirectoryWatcher() { wrapperContained.closeDirectoryWatcher(); }
public void switchFocusedList(yarnwrap.client.gui.screen.pack.PackListWidget listWidget) { wrapperContained.switchFocusedList(listWidget.wrapperContained); }
public void clearSelection() { wrapperContained.clearSelection(); }
// public java.util.stream.Stream streamFileNames(java.util.Collection paths) { return wrapperContained.streamFileNames(paths); }

}