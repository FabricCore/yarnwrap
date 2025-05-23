package yarnwrap.command;
public class CommandRegistryAccess { public net.minecraft.command.CommandRegistryAccess wrapperContained; public CommandRegistryAccess(net.minecraft.command.CommandRegistryAccess wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.CommandRegistryAccess of(Object registries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return new yarnwrap.command.CommandRegistryAccess(wrapperContained.of(registries,enabledFeatures.wrapperContained)); }
// public static yarnwrap.command.CommandRegistryAccess of(Object registries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { return new yarnwrap.command.CommandRegistryAccess(net.minecraft.command.CommandRegistryAccess.of(registries,enabledFeatures.wrapperContained)); }
public yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getEnabledFeatures()); }
// public static yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.command.CommandRegistryAccess.getEnabledFeatures()); }

}