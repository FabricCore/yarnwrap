package yarnwrap.command;
public class CommandRegistryAccess { public net.minecraft.command.CommandRegistryAccess wrapperContained; public CommandRegistryAccess(net.minecraft.command.CommandRegistryAccess wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.CommandRegistryAccess of(Object wrapperLookup,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return new yarnwrap.command.CommandRegistryAccess(wrapperContained.of(wrapperLookup,enabledFeatures.wrapperContained)); }
// public static yarnwrap.command.CommandRegistryAccess of(Object wrapperLookup,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { return new yarnwrap.command.CommandRegistryAccess(net.minecraft.command.CommandRegistryAccess.of(wrapperLookup,enabledFeatures.wrapperContained)); }

}