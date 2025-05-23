package yarnwrap.client.gui.screen.world;
public class CreateWorldCallback { public net.minecraft.client.gui.screen.world.CreateWorldCallback wrapperContained; public CreateWorldCallback(net.minecraft.client.gui.screen.world.CreateWorldCallback wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean create(yarnwrap.client.gui.screen.world.CreateWorldScreen screen,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.world.level.LevelProperties levelProperties,java.nio.file.Path dataPackTempDir) { return wrapperContained.create(screen.wrapperContained,dynamicRegistries.wrapperContained,levelProperties.wrapperContained,dataPackTempDir); }
// public static boolean create(yarnwrap.client.gui.screen.world.CreateWorldScreen screen,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.world.level.LevelProperties levelProperties,java.nio.file.Path dataPackTempDir, ) { return net.minecraft.client.gui.screen.world.CreateWorldCallback.create(screen.wrapperContained,dynamicRegistries.wrapperContained,levelProperties.wrapperContained,dataPackTempDir); }

}