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
// public void method_47331(Object group) { wrapperContained.method_47331(group); }
// public void addSuspiciousStews(Object entries,Object visibility) { wrapperContained.addSuspiciousStews(entries,visibility); }
// public boolean method_47333(yarnwrap.item.ItemGroup group) { return wrapperContained.method_47333(group.wrapperContained); }
public void collect() { wrapperContained.collect(); }
public java.util.List getGroupsToDisplay() { return wrapperContained.getGroupsToDisplay(); }
// public void updateEntries(Object displayContext) { wrapperContained.updateEntries(displayContext); }
// public void method_47338(Object group) { wrapperContained.method_47338(group); }
// public void addFireworkRockets(Object entries,Object visibility) { wrapperContained.addFireworkRockets(entries,visibility); }
// public boolean method_47340(yarnwrap.item.ItemGroup group) { return wrapperContained.method_47340(group.wrapperContained); }
public java.util.List getGroups() { return wrapperContained.getGroups(); }
public yarnwrap.item.ItemGroup getSearchGroup() { return new yarnwrap.item.ItemGroup(wrapperContained.getSearchGroup()); }
// public void method_48934(Object stack) { wrapperContained.method_48934(stack); }
// public void method_48935(yarnwrap.registry.RegistryOps paintingVariantEntry) { wrapperContained.method_48935(paintingVariantEntry.wrapperContained); }
// public void addPaintings(Object entries,Object registryLookup,Object registryWrapper,java.util.function.Predicate filter,Object stackVisibility) { wrapperContained.addPaintings(entries,registryLookup,registryWrapper,filter,stackVisibility); }
// public void method_48939(yarnwrap.item.Item entryList) { wrapperContained.method_48939(entryList.wrapperContained); }
// public yarnwrap.item.ItemStack method_48940(yarnwrap.item.Item entry) { return new yarnwrap.item.ItemStack(wrapperContained.method_48940(entry.wrapperContained)); }
// public yarnwrap.item.ItemStack method_48941(yarnwrap.item.Item instrument) { return new yarnwrap.item.ItemStack(wrapperContained.method_48941(instrument.wrapperContained)); }
// public void method_48947(Object stack) { wrapperContained.method_48947(stack); }
// public void method_48952(Object stack) { wrapperContained.method_48952(stack); }
// public void method_48954(Object stack) { wrapperContained.method_48954(stack); }
// public void method_51311(Object displayContext,Object entries) { wrapperContained.method_51311(displayContext,entries); }
// public void method_51312(Object registryWrapper) { wrapperContained.method_51312(registryWrapper); }
// public void method_51313(Object registryWrapper) { wrapperContained.method_51313(registryWrapper); }
// public boolean method_51314(yarnwrap.registry.entry.RegistryEntry registryEntry) { return wrapperContained.method_51314(registryEntry.wrapperContained); }
public yarnwrap.item.ItemGroup registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.item.ItemGroup(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public void method_51316(yarnwrap.registry.Registry displayContext,Object entries) { wrapperContained.method_51316(displayContext.wrapperContained,entries); }
// public yarnwrap.registry.RegistryKey register(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.register(id)); }
// public void method_51318(Object displayContext,Object entries) { wrapperContained.method_51318(displayContext,entries); }
// public void method_51319(Object registryWrapper) { wrapperContained.method_51319(registryWrapper); }
// public boolean method_51320(yarnwrap.registry.entry.RegistryEntry registryEntry) { return wrapperContained.method_51320(registryEntry.wrapperContained); }
// public void method_51321(Object displayContext,Object entries) { wrapperContained.method_51321(displayContext,entries); }
// public void method_51322(Object registryWrapper) { wrapperContained.method_51322(registryWrapper); }
// public void method_51323(Object displayContext,Object entries) { wrapperContained.method_51323(displayContext,entries); }
// public void method_51324(Object wrapper) { wrapperContained.method_51324(wrapper); }
// public void method_51325(Object displayContext,Object entries) { wrapperContained.method_51325(displayContext,entries); }
// public void method_51326(Object registryWrapper) { wrapperContained.method_51326(registryWrapper); }
// public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public void method_51328(Object displayContext,Object entries) { wrapperContained.method_51328(displayContext,entries); }
// public void method_51330(Object displayContext,Object entries) { wrapperContained.method_51330(displayContext,entries); }
// public void method_51332(Object displayContext,Object entries) { wrapperContained.method_51332(displayContext,entries); }
// public void method_51334(Object displayContext,Object entries) { wrapperContained.method_51334(displayContext,entries); }
// public void method_51336(Object displayContext,Object entries) { wrapperContained.method_51336(displayContext,entries); }
// public void method_51338(Object displayContext,Object entries) { wrapperContained.method_51338(displayContext,entries); }
// public void method_58091(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.method_58091(nbt.wrapperContained); }
// public boolean method_58650(yarnwrap.resource.featuretoggle.FeatureSet potionEntry) { return wrapperContained.method_58650(potionEntry.wrapperContained); }
// public void addOminousBottles(Object entries,Object visibility) { wrapperContained.addOminousBottles(entries,visibility); }
// public java.util.stream.Stream method_59969(Object enchantmentEntry) { return wrapperContained.method_59969(enchantmentEntry); }
// public yarnwrap.item.ItemStack method_59970(Object level) { return new yarnwrap.item.ItemStack(wrapperContained.method_59970(level)); }
// public yarnwrap.item.ItemStack method_59972(Object enchantmentEntry) { return new yarnwrap.item.ItemStack(wrapperContained.method_59972(enchantmentEntry)); }

}