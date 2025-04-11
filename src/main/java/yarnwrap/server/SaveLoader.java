package yarnwrap.server;
public class SaveLoader { public net.minecraft.server.SaveLoader wrapperContained; public SaveLoader(net.minecraft.server.SaveLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(wrapperContained.dataPackContents); }
// public void dataPackContents(yarnwrap.server.DataPackContents value) { wrapperContained.dataPackContents = value.wrapperContained; }
// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries); }
// public void combinedDynamicRegistries(yarnwrap.registry.CombinedDynamicRegistries value) { wrapperContained.combinedDynamicRegistries = value.wrapperContained; }
// public yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.saveProperties); }
// public void saveProperties(yarnwrap.world.SaveProperties value) { wrapperContained.saveProperties = value.wrapperContained; }
// public yarnwrap.server.DataPackContents dataPackContents() { return new yarnwrap.server.DataPackContents(wrapperContained.dataPackContents()); }
// public yarnwrap.registry.CombinedDynamicRegistries combinedDynamicRegistries() { return new yarnwrap.registry.CombinedDynamicRegistries(wrapperContained.combinedDynamicRegistries()); }
// public yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.saveProperties()); }

}