package yarnwrap.server;
public class SaveLoader { public net.minecraft.server.SaveLoader wrapperContained; public SaveLoader(net.minecraft.server.SaveLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(wrapperContained.dataPackContents); }
// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries); }
// public yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.saveProperties); }
// public yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(wrapperContained.dataPackContents()); }
// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries()); }
// public yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.saveProperties()); }

}