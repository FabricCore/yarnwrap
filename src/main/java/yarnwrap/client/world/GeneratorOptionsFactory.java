package yarnwrap.client.world;
public class GeneratorOptionsFactory { public net.minecraft.client.world.GeneratorOptionsFactory wrapperContained; public GeneratorOptionsFactory(net.minecraft.client.world.GeneratorOptionsFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.world.GeneratorOptionsHolder apply(yarnwrap.server.DataPackContents dataPackContents,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.client.gui.screen.world.WorldCreationSettings settings) { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.apply(dataPackContents.wrapperContained,dynamicRegistries.wrapperContained,settings.wrapperContained)); }
// public static yarnwrap.client.world.GeneratorOptionsHolder apply(yarnwrap.server.DataPackContents dataPackContents,yarnwrap.registry.CombinedDynamicRegistries dynamicRegistries,yarnwrap.client.gui.screen.world.WorldCreationSettings settings, ) { return new yarnwrap.client.world.GeneratorOptionsHolder(net.minecraft.client.world.GeneratorOptionsFactory.apply(dataPackContents.wrapperContained,dynamicRegistries.wrapperContained,settings.wrapperContained)); }

}