package yarnwrap.client.gui.screen.world;
public class CreateWorldScreen { public net.minecraft.client.gui.screen.world.CreateWorldScreen wrapperContained; public CreateWorldScreen(net.minecraft.client.gui.screen.world.CreateWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path dataPackTempDir() { return wrapperContained.dataPackTempDir; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.resource.ResourcePackManager packManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.packManager); }
// public yarnwrap.text.Text GAME_MODE_TEXT() { return new yarnwrap.text.Text(wrapperContained.GAME_MODE_TEXT); }
// public yarnwrap.text.Text ENTER_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.ENTER_NAME_TEXT); }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public java.lang.String TEMP_DIR_PREFIX() { return wrapperContained.TEMP_DIR_PREFIX; }
// public yarnwrap.text.Text PREPARING_TEXT() { return new yarnwrap.text.Text(wrapperContained.PREPARING_TEXT); }
// public yarnwrap.client.gui.widget.TabNavigationWidget tabNavigation() { return new yarnwrap.client.gui.widget.TabNavigationWidget(wrapperContained.tabNavigation); }
// public yarnwrap.text.Text ALLOW_COMMANDS_INFO_TEXT() { return new yarnwrap.text.Text(wrapperContained.ALLOW_COMMANDS_INFO_TEXT); }
// public yarnwrap.client.gui.screen.world.WorldCreator worldCreator() { return new yarnwrap.client.gui.screen.world.WorldCreator(wrapperContained.worldCreator); }
// public yarnwrap.client.gui.tab.TabManager tabManager() { return new yarnwrap.client.gui.tab.TabManager(wrapperContained.tabManager); }
// public yarnwrap.text.Text EXPERIMENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.EXPERIMENTS_TEXT); }
// public boolean recreated() { return wrapperContained.recreated; }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
public yarnwrap.util.Identifier TAB_HEADER_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TAB_HEADER_BACKGROUND_TEXTURE); }
// public void createLevel() { wrapperContained.createLevel(); }
// public void applyDataPacks(yarnwrap.resource.ResourcePackManager dataPackManager,boolean fromPackScreen,java.util.function.Consumer configurationSetter) { wrapperContained.applyDataPacks(dataPackManager.wrapperContained,fromPackScreen,configurationSetter); }
public java.nio.file.Path copyDataPack(java.nio.file.Path srcFolder,yarnwrap.client.MinecraftClient client) { return wrapperContained.copyDataPack(srcFolder,client.wrapperContained); }
// public void copyDataPack(java.nio.file.Path srcFolder,java.nio.file.Path destFolder,java.nio.file.Path dataPackFile) { wrapperContained.copyDataPack(srcFolder,destFolder,dataPackFile); }
// public java.nio.file.Path getDataPackTempDir() { return wrapperContained.getDataPackTempDir(); }
// public void openPackScreen(yarnwrap.resource.DataConfiguration dataConfiguration) { wrapperContained.openPackScreen(dataConfiguration.wrapperContained); }
// public void clearDataPackTempDir() { wrapperContained.clearDataPackTempDir(); }
// public com.mojang.datafixers.util.Pair getScannedPack(yarnwrap.resource.DataConfiguration dataConfiguration) { return wrapperContained.getScannedPack(dataConfiguration.wrapperContained); }
public void onCloseScreen() { wrapperContained.onCloseScreen(); }
public void create(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.Screen parent) { wrapperContained.create(client.wrapperContained,parent.wrapperContained); }
public yarnwrap.client.gui.screen.world.CreateWorldScreen create(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.Screen parent,yarnwrap.world.level.LevelInfo levelInfo,yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder,java.nio.file.Path dataPackTempDir) { return new yarnwrap.client.gui.screen.world.CreateWorldScreen(wrapperContained.create(client.wrapperContained,parent.wrapperContained,levelInfo.wrapperContained,generatorOptionsHolder.wrapperContained,dataPackTempDir)); }
// public yarnwrap.world.level.LevelInfo createLevelInfo(boolean debugWorld) { return new yarnwrap.world.level.LevelInfo(wrapperContained.createLevelInfo(debugWorld)); }
// public void startServer(Object specialProperty,yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries,com.mojang.serialization.Lifecycle lifecycle) { wrapperContained.startServer(specialProperty,combinedDynamicRegistries.wrapperContained,lifecycle); }
// public java.util.Optional createSession() { return wrapperContained.createSession(); }
// public Object createServerConfig(yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.resource.DataConfiguration dataConfiguration) { return wrapperContained.createServerConfig(dataPackManager.wrapperContained,dataConfiguration.wrapperContained); }
// public void showMessage(yarnwrap.client.MinecraftClient client,yarnwrap.text.Text text) { wrapperContained.showMessage(client.wrapperContained,text.wrapperContained); }
// public void validateDataPacks(yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.resource.DataConfiguration dataConfiguration,java.util.function.Consumer configurationSetter) { wrapperContained.validateDataPacks(dataPackManager.wrapperContained,dataConfiguration.wrapperContained,configurationSetter); }
public yarnwrap.client.gui.screen.world.WorldCreator getWorldCreator() { return new yarnwrap.client.gui.screen.world.WorldCreator(wrapperContained.getWorldCreator()); }
// public void openExperimentsScreen(yarnwrap.resource.DataConfiguration dataConfiguration) { wrapperContained.openExperimentsScreen(dataConfiguration.wrapperContained); }

}