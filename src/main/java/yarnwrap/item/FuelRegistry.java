package yarnwrap.item;
public class FuelRegistry { public net.minecraft.item.FuelRegistry wrapperContained; public FuelRegistry(net.minecraft.item.FuelRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntSortedMap fuelValues() { return wrapperContained.fuelValues; }
// public void fuelValues(it.unimi.dsi.fastutil.objects.Object2IntSortedMap value) { wrapperContained.fuelValues = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntSortedMap fuelValues() { return net.minecraft.item.FuelRegistry.fuelValues; }
// public static void fuelValues(it.unimi.dsi.fastutil.objects.Object2IntSortedMap value, ) { net.minecraft.item.FuelRegistry.fuelValues = value; }

// public FuelRegistry(it.unimi.dsi.fastutil.objects.Object2IntSortedMap fuelValues) { this.wrapperContained = new net.minecraft.item.FuelRegistry(fuelValues); }
public java.util.SequencedSet getFuelItems() { return wrapperContained.getFuelItems(); }
// public static java.util.SequencedSet getFuelItems() { return net.minecraft.item.FuelRegistry.getFuelItems(); }
public boolean isFuel(yarnwrap.item.ItemStack item) { return wrapperContained.isFuel(item.wrapperContained); }
// public static boolean isFuel(yarnwrap.item.ItemStack item, ) { return net.minecraft.item.FuelRegistry.isFuel(item.wrapperContained); }
// public yarnwrap.item.FuelRegistry createDefault(Object registries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return new yarnwrap.item.FuelRegistry(wrapperContained.createDefault(registries,enabledFeatures.wrapperContained)); }
// public static yarnwrap.item.FuelRegistry createDefault(Object registries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { return new yarnwrap.item.FuelRegistry(net.minecraft.item.FuelRegistry.createDefault(registries,enabledFeatures.wrapperContained)); }
// public yarnwrap.item.FuelRegistry createDefault(Object registries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,int itemSmeltTime) { return new yarnwrap.item.FuelRegistry(wrapperContained.createDefault(registries,enabledFeatures.wrapperContained,itemSmeltTime)); }
// public static yarnwrap.item.FuelRegistry createDefault(Object registries,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,int itemSmeltTime, ) { return new yarnwrap.item.FuelRegistry(net.minecraft.item.FuelRegistry.createDefault(registries,enabledFeatures.wrapperContained,itemSmeltTime)); }
public int getFuelTicks(yarnwrap.item.ItemStack item) { return wrapperContained.getFuelTicks(item.wrapperContained); }
// public static int getFuelTicks(yarnwrap.item.ItemStack item, ) { return net.minecraft.item.FuelRegistry.getFuelTicks(item.wrapperContained); }

}