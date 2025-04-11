package yarnwrap.item;
public class ItemGroups { public net.minecraft.item.ItemGroups wrapperContained; public ItemGroups(net.minecraft.item.ItemGroups wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey BUILDING_BLOCKS() { return new yarnwrap.registry.RegistryKey(wrapperContained.BUILDING_BLOCKS); }
// public void BUILDING_BLOCKS(yarnwrap.registry.RegistryKey value) { wrapperContained.BUILDING_BLOCKS = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey FUNCTIONAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.FUNCTIONAL); }
// public void FUNCTIONAL(yarnwrap.registry.RegistryKey value) { wrapperContained.FUNCTIONAL = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey REDSTONE() { return new yarnwrap.registry.RegistryKey(wrapperContained.REDSTONE); }
// public void REDSTONE(yarnwrap.registry.RegistryKey value) { wrapperContained.REDSTONE = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey HOTBAR() { return new yarnwrap.registry.RegistryKey(wrapperContained.HOTBAR); }
// public void HOTBAR(yarnwrap.registry.RegistryKey value) { wrapperContained.HOTBAR = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey SEARCH() { return new yarnwrap.registry.RegistryKey(wrapperContained.SEARCH); }
// public void SEARCH(yarnwrap.registry.RegistryKey value) { wrapperContained.SEARCH = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey COMBAT() { return new yarnwrap.registry.RegistryKey(wrapperContained.COMBAT); }
// public void COMBAT(yarnwrap.registry.RegistryKey value) { wrapperContained.COMBAT = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey SPAWN_EGGS() { return new yarnwrap.registry.RegistryKey(wrapperContained.SPAWN_EGGS); }
// public void SPAWN_EGGS(yarnwrap.registry.RegistryKey value) { wrapperContained.SPAWN_EGGS = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey INVENTORY() { return new yarnwrap.registry.RegistryKey(wrapperContained.INVENTORY); }
// public void INVENTORY(yarnwrap.registry.RegistryKey value) { wrapperContained.INVENTORY = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey NATURAL() { return new yarnwrap.registry.RegistryKey(wrapperContained.NATURAL); }
// public void NATURAL(yarnwrap.registry.RegistryKey value) { wrapperContained.NATURAL = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey COLORED_BLOCKS() { return new yarnwrap.registry.RegistryKey(wrapperContained.COLORED_BLOCKS); }
// public void COLORED_BLOCKS(yarnwrap.registry.RegistryKey value) { wrapperContained.COLORED_BLOCKS = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey TOOLS() { return new yarnwrap.registry.RegistryKey(wrapperContained.TOOLS); }
// public void TOOLS(yarnwrap.registry.RegistryKey value) { wrapperContained.TOOLS = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey FOOD_AND_DRINK() { return new yarnwrap.registry.RegistryKey(wrapperContained.FOOD_AND_DRINK); }
// public void FOOD_AND_DRINK(yarnwrap.registry.RegistryKey value) { wrapperContained.FOOD_AND_DRINK = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey INGREDIENTS() { return new yarnwrap.registry.RegistryKey(wrapperContained.INGREDIENTS); }
// public void INGREDIENTS(yarnwrap.registry.RegistryKey value) { wrapperContained.INGREDIENTS = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey OPERATOR() { return new yarnwrap.registry.RegistryKey(wrapperContained.OPERATOR); }
// public void OPERATOR(yarnwrap.registry.RegistryKey value) { wrapperContained.OPERATOR = value.wrapperContained; }
// public java.util.Comparator PAINTING_VARIANT_COMPARATOR() { return wrapperContained.PAINTING_VARIANT_COMPARATOR; }
// public void PAINTING_VARIANT_COMPARATOR(java.util.Comparator value) { wrapperContained.PAINTING_VARIANT_COMPARATOR = value; }
// public Object displayContext() { return wrapperContained.displayContext; }
// // public void displayContext(Object value) { wrapperContained.displayContext = value; }
// public yarnwrap.util.Identifier INVENTORY_TAB_TEXTURE_ID() { return new yarnwrap.util.Identifier(wrapperContained.INVENTORY_TAB_TEXTURE_ID); }
// public void INVENTORY_TAB_TEXTURE_ID(yarnwrap.util.Identifier value) { wrapperContained.INVENTORY_TAB_TEXTURE_ID = value.wrapperContained; }
// public yarnwrap.util.Identifier ITEM_SEARCH_TAB_TEXTURE_ID() { return new yarnwrap.util.Identifier(wrapperContained.ITEM_SEARCH_TAB_TEXTURE_ID); }
// public void ITEM_SEARCH_TAB_TEXTURE_ID(yarnwrap.util.Identifier value) { wrapperContained.ITEM_SEARCH_TAB_TEXTURE_ID = value.wrapperContained; }
// public void addInstruments(Object entries,yarnwrap.registry.RegistryWrapper registryWrapper,yarnwrap.item.Item item,yarnwrap.registry.tag.TagKey instrumentTag,Object visibility) { wrapperContained.addInstruments(entries,registryWrapper.wrapperContained,item.wrapperContained,instrumentTag.wrapperContained,visibility); }
// public void addPotions(Object entries,yarnwrap.registry.RegistryWrapper registryWrapper,yarnwrap.item.Item item,Object visibility,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { wrapperContained.addPotions(entries,registryWrapper.wrapperContained,item.wrapperContained,visibility,enabledFeatures.wrapperContained); }
// public void addMaxLevelEnchantedBooks(Object entries,yarnwrap.registry.RegistryWrapper registryWrapper,Object stackVisibility) { wrapperContained.addMaxLevelEnchantedBooks(entries,registryWrapper.wrapperContained,stackVisibility); }
// public void addAllLevelEnchantedBooks(Object entries,yarnwrap.registry.RegistryWrapper registryWrapper,Object stackVisibility) { wrapperContained.addAllLevelEnchantedBooks(entries,registryWrapper.wrapperContained,stackVisibility); }
public yarnwrap.item.ItemGroup getDefaultTab() { return new yarnwrap.item.ItemGroup(wrapperContained.getDefaultTab()); }
// public boolean updateDisplayContext(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,boolean operatorEnabled,Object lookup) { return wrapperContained.updateDisplayContext(enabledFeatures.wrapperContained,operatorEnabled,lookup); }
// public void addSuspiciousStews(Object entries,Object visibility) { wrapperContained.addSuspiciousStews(entries,visibility); }
public void collect() { wrapperContained.collect(); }
public java.util.List getGroupsToDisplay() { return wrapperContained.getGroupsToDisplay(); }
// public void updateEntries(Object displayContext) { wrapperContained.updateEntries(displayContext); }
// public void addFireworkRockets(Object entries,Object visibility) { wrapperContained.addFireworkRockets(entries,visibility); }
public java.util.List getGroups() { return wrapperContained.getGroups(); }
public yarnwrap.item.ItemGroup getSearchGroup() { return new yarnwrap.item.ItemGroup(wrapperContained.getSearchGroup()); }
// public void addPaintings(Object entries,Object registryLookup,Object registryWrapper,java.util.function.Predicate filter,Object stackVisibility) { wrapperContained.addPaintings(entries,registryLookup,registryWrapper,filter,stackVisibility); }
public yarnwrap.item.ItemGroup registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.item.ItemGroup(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public yarnwrap.registry.RegistryKey register(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.register(id)); }
// public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public void addOminousBottles(Object entries,Object visibility) { wrapperContained.addOminousBottles(entries,visibility); }

}