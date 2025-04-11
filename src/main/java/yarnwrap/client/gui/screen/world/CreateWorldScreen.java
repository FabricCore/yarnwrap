package yarnwrap.client.gui.screen.world;
public class CreateWorldScreen { public net.minecraft.client.gui.screen.world.CreateWorldScreen wrapperContained; public CreateWorldScreen(net.minecraft.client.gui.screen.world.CreateWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path dataPackTempDir() { return wrapperContained.dataPackTempDir; }
// public void dataPackTempDir(java.nio.file.Path value) { wrapperContained.dataPackTempDir = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.resource.ResourcePackManager packManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.packManager); }
// public void packManager(yarnwrap.resource.ResourcePackManager value) { wrapperContained.packManager = value.wrapperContained; }
// public yarnwrap.text.Text GAME_MODE_TEXT() { return new yarnwrap.text.Text(wrapperContained.GAME_MODE_TEXT); }
// public void GAME_MODE_TEXT(yarnwrap.text.Text value) { wrapperContained.GAME_MODE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text ENTER_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.ENTER_NAME_TEXT); }
// public void ENTER_NAME_TEXT(yarnwrap.text.Text value) { wrapperContained.ENTER_NAME_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public java.lang.String TEMP_DIR_PREFIX() { return wrapperContained.TEMP_DIR_PREFIX; }
// public void TEMP_DIR_PREFIX(java.lang.String value) { wrapperContained.TEMP_DIR_PREFIX = value; }
// public yarnwrap.text.Text PREPARING_TEXT() { return new yarnwrap.text.Text(wrapperContained.PREPARING_TEXT); }
// public void PREPARING_TEXT(yarnwrap.text.Text value) { wrapperContained.PREPARING_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TabNavigationWidget tabNavigation() { return new yarnwrap.client.gui.widget.TabNavigationWidget(wrapperContained.tabNavigation); }
// public void tabNavigation(yarnwrap.client.gui.widget.TabNavigationWidget value) { wrapperContained.tabNavigation = value.wrapperContained; }
// public yarnwrap.text.Text ALLOW_COMMANDS_INFO_TEXT() { return new yarnwrap.text.Text(wrapperContained.ALLOW_COMMANDS_INFO_TEXT); }
// public void ALLOW_COMMANDS_INFO_TEXT(yarnwrap.text.Text value) { wrapperContained.ALLOW_COMMANDS_INFO_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.screen.world.WorldCreator worldCreator() { return new yarnwrap.client.gui.screen.world.WorldCreator(wrapperContained.worldCreator); }
// public void worldCreator(yarnwrap.client.gui.screen.world.WorldCreator value) { wrapperContained.worldCreator = value.wrapperContained; }
// public yarnwrap.client.gui.tab.TabManager tabManager() { return new yarnwrap.client.gui.tab.TabManager(wrapperContained.tabManager); }
// public void tabManager(yarnwrap.client.gui.tab.TabManager value) { wrapperContained.tabManager = value.wrapperContained; }
// public yarnwrap.text.Text EXPERIMENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.EXPERIMENTS_TEXT); }
// public void EXPERIMENTS_TEXT(yarnwrap.text.Text value) { wrapperContained.EXPERIMENTS_TEXT = value.wrapperContained; }
// public boolean recreated() { return wrapperContained.recreated; }
// public void recreated(boolean value) { wrapperContained.recreated = value; }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public void symlinkFinder(yarnwrap.util.path.SymlinkFinder value) { wrapperContained.symlinkFinder = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
public yarnwrap.util.Identifier TAB_HEADER_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TAB_HEADER_BACKGROUND_TEXTURE); }
// public void TAB_HEADER_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TAB_HEADER_BACKGROUND_TEXTURE = value.wrapperContained; }
// public CreateWorldScreen(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder,java.util.Optional defaultWorldType,java.util.OptionalLong seed) { this.wrapperContained = new net.minecraft.client.gui.screen.world.CreateWorldScreen(client.wrapperContained,parent.wrapperContained,generatorOptionsHolder.wrapperContained,defaultWorldType,seed); }
// public void method_19921(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19921(button.wrapperContained); }
// public void method_19922(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19922(button.wrapperContained); }
// public void createLevel() { wrapperContained.createLevel(); }
// public void applyDataPacks(yarnwrap.resource.ResourcePackManager dataPackManager,boolean fromPackScreen,java.util.function.Consumer configurationSetter) { wrapperContained.applyDataPacks(dataPackManager.wrapperContained,fromPackScreen,configurationSetter); }
public java.nio.file.Path copyDataPack(java.nio.file.Path srcFolder,yarnwrap.client.MinecraftClient client) { return wrapperContained.copyDataPack(srcFolder,client.wrapperContained); }
// public boolean method_29686(java.nio.file.Path dataPackFile) { return wrapperContained.method_29686(dataPackFile); }
// public void copyDataPack(java.nio.file.Path srcFolder,java.nio.file.Path destFolder,java.nio.file.Path dataPackFile) { wrapperContained.copyDataPack(srcFolder,destFolder,dataPackFile); }
// public void method_29688(org.apache.commons.lang3.mutable.MutableObject dataPackFile) { wrapperContained.method_29688(dataPackFile); }
// public void method_29689(java.nio.file.Path path) { wrapperContained.method_29689(path); }
// public java.nio.file.Path getDataPackTempDir() { return wrapperContained.getDataPackTempDir(); }
// public void openPackScreen(yarnwrap.resource.DataConfiguration dataConfiguration) { wrapperContained.openPackScreen(dataConfiguration.wrapperContained); }
// public void clearDataPackTempDir() { wrapperContained.clearDataPackTempDir(); }
// public boolean method_29983(java.util.List name) { return wrapperContained.method_29983(name); }
// public com.mojang.datafixers.util.Pair getScannedPack(yarnwrap.resource.DataConfiguration dataConfiguration) { return wrapperContained.getScannedPack(dataConfiguration.wrapperContained); }
public void onCloseScreen() { wrapperContained.onCloseScreen(); }
public void create(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.Screen parent) { wrapperContained.create(client.wrapperContained,parent.wrapperContained); }
public yarnwrap.client.gui.screen.world.CreateWorldScreen create(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.Screen parent,yarnwrap.world.level.LevelInfo levelInfo,yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder,java.nio.file.Path dataPackTempDir) { return new yarnwrap.client.gui.screen.world.CreateWorldScreen(wrapperContained.create(client.wrapperContained,parent.wrapperContained,levelInfo.wrapperContained,generatorOptionsHolder.wrapperContained,dataPackTempDir)); }
// public yarnwrap.world.level.LevelInfo createLevelInfo(boolean debugWorld) { return new yarnwrap.world.level.LevelInfo(wrapperContained.createLevelInfo(debugWorld)); }
// public void startServer(Object specialProperty,yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries,com.mojang.serialization.Lifecycle lifecycle) { wrapperContained.startServer(specialProperty,combinedDynamicRegistries.wrapperContained,lifecycle); }
// public java.util.Optional createSession() { return wrapperContained.createSession(); }
// public Object createServerConfig(yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.resource.DataConfiguration dataConfiguration) { return wrapperContained.createServerConfig(dataPackManager.wrapperContained,dataConfiguration.wrapperContained); }
// public yarnwrap.client.world.GeneratorOptionsHolder method_41851(yarnwrap.resource.LifecycledResourceManager resourceManager,yarnwrap.server.DataPackContents dataPackContents,yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries,Object generatorOptions) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.method_41851(resourceManager.wrapperContained,dataPackContents.wrapperContained,combinedDynamicRegistries.wrapperContained,generatorOptions)); }
// public void showMessage(yarnwrap.client.MinecraftClient client,yarnwrap.text.Text text) { wrapperContained.showMessage(client.wrapperContained,text.wrapperContained); }
// public boolean method_41853(java.nio.file.Path path) { return wrapperContained.method_41853(path); }
// public void method_41855(java.nio.file.Path path) { wrapperContained.method_41855(path); }
// public Object method_45678(Object context) { return wrapperContained.method_45678(context); }
// public void validateDataPacks(yarnwrap.resource.ResourcePackManager dataPackManager,yarnwrap.resource.DataConfiguration dataConfiguration,java.util.function.Consumer configurationSetter) { wrapperContained.validateDataPacks(dataPackManager.wrapperContained,dataConfiguration.wrapperContained,configurationSetter); }
// public yarnwrap.client.world.GeneratorOptionsHolder method_45681(yarnwrap.resource.LifecycledResourceManager resourceManager,yarnwrap.server.DataPackContents dataPackContents,yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries,Object context) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.method_45681(resourceManager.wrapperContained,dataPackContents.wrapperContained,combinedDynamicRegistries.wrapperContained,context)); }
// public com.mojang.serialization.DataResult method_45682(com.mojang.serialization.DynamicOps json) { return wrapperContained.method_45682(json); }
// public Object method_45686(Object context) { return wrapperContained.method_45686(context); }
// public void method_48643(yarnwrap.resource.ResourcePackManager confirmed) { wrapperContained.method_48643(confirmed.wrapperContained); }
// public void method_48644(yarnwrap.client.gui.widget.ClickableWidget child) { wrapperContained.method_48644(child.wrapperContained); }
// public void method_48650(yarnwrap.client.gui.screen.world.CreateWorldScreen child) { wrapperContained.method_48650(child.wrapperContained); }
// public void method_48654(java.util.function.Consumer confirmed) { wrapperContained.method_48654(confirmed); }
public yarnwrap.client.gui.screen.world.WorldCreator getWorldCreator() { return new yarnwrap.client.gui.screen.world.WorldCreator(wrapperContained.getWorldCreator()); }
// public void method_49009(yarnwrap.resource.ResourcePackManager resourcePackManager) { wrapperContained.method_49009(resourcePackManager.wrapperContained); }
// public void openExperimentsScreen(yarnwrap.resource.DataConfiguration dataConfiguration) { wrapperContained.openExperimentsScreen(dataConfiguration.wrapperContained); }
// public void method_49011(yarnwrap.resource.ResourcePackManager resourcePackManager) { wrapperContained.method_49011(resourcePackManager.wrapperContained); }
// public java.lang.Object method_49629(java.util.function.Consumer throwable) { return wrapperContained.method_49629(throwable); }
// public yarnwrap.client.world.GeneratorOptionsHolder method_59841(yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.method_59841(generatorOptionsHolder.wrapperContained)); }

}