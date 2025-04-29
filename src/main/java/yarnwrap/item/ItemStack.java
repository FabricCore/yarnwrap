package yarnwrap.item;
public class ItemStack { public net.minecraft.item.ItemStack wrapperContained; public ItemStack(net.minecraft.item.ItemStack wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.Entity holder() { return new yarnwrap.entity.Entity(wrapperContained.holder); }
// public void holder(yarnwrap.entity.Entity value) { wrapperContained.holder = value.wrapperContained; }
// public static yarnwrap.entity.Entity holder() { return new yarnwrap.entity.Entity(net.minecraft.item.ItemStack.holder); }
// public static void holder(yarnwrap.entity.Entity value, ) { net.minecraft.item.ItemStack.holder = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.ItemStack.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.ItemStack.CODEC = value; }

// public yarnwrap.text.Text DISABLED_TEXT() { return new yarnwrap.text.Text(wrapperContained.DISABLED_TEXT); }
// public void DISABLED_TEXT(yarnwrap.text.Text value) { wrapperContained.DISABLED_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text DISABLED_TEXT() { return new yarnwrap.text.Text(net.minecraft.item.ItemStack.DISABLED_TEXT); }
// public static void DISABLED_TEXT(yarnwrap.text.Text value, ) { net.minecraft.item.ItemStack.DISABLED_TEXT = value.wrapperContained; }

// public com.mojang.serialization.Codec ITEM_CODEC() { return wrapperContained.ITEM_CODEC; }
// public void ITEM_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ITEM_CODEC = value; }
public static com.mojang.serialization.Codec ITEM_CODEC() { return net.minecraft.item.ItemStack.ITEM_CODEC; }
// public static void ITEM_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.ItemStack.ITEM_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.ItemStack.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.ItemStack.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec LIST_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.LIST_PACKET_CODEC); }
// public void LIST_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.LIST_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec LIST_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.ItemStack.LIST_PACKET_CODEC); }
// public static void LIST_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.ItemStack.LIST_PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec OPTIONAL_CODEC() { return wrapperContained.OPTIONAL_CODEC; }
// public void OPTIONAL_CODEC(com.mojang.serialization.Codec value) { wrapperContained.OPTIONAL_CODEC = value; }
public static com.mojang.serialization.Codec OPTIONAL_CODEC() { return net.minecraft.item.ItemStack.OPTIONAL_CODEC; }
// public static void OPTIONAL_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.ItemStack.OPTIONAL_CODEC = value; }

// public com.mojang.serialization.Codec REGISTRY_ENTRY_CODEC() { return wrapperContained.REGISTRY_ENTRY_CODEC; }
// public void REGISTRY_ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec REGISTRY_ENTRY_CODEC() { return net.minecraft.item.ItemStack.REGISTRY_ENTRY_CODEC; }
// public static void REGISTRY_ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.ItemStack.REGISTRY_ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_PACKET_CODEC); }
// public void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.ItemStack.OPTIONAL_PACKET_CODEC); }
// public static void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.ItemStack.OPTIONAL_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec OPTIONAL_LIST_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_LIST_PACKET_CODEC); }
// public void OPTIONAL_LIST_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_LIST_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec OPTIONAL_LIST_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.ItemStack.OPTIONAL_LIST_PACKET_CODEC); }
// public static void OPTIONAL_LIST_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.ItemStack.OPTIONAL_LIST_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.component.ComponentMapImpl components() { return new yarnwrap.component.ComponentMapImpl(wrapperContained.components); }
// public void components(yarnwrap.component.ComponentMapImpl value) { wrapperContained.components = value.wrapperContained; }
// public static yarnwrap.component.ComponentMapImpl components() { return new yarnwrap.component.ComponentMapImpl(net.minecraft.item.ItemStack.components); }
// public static void components(yarnwrap.component.ComponentMapImpl value, ) { net.minecraft.item.ItemStack.components = value.wrapperContained; }

// public com.mojang.serialization.Codec UNCOUNTED_CODEC() { return wrapperContained.UNCOUNTED_CODEC; }
// public void UNCOUNTED_CODEC(com.mojang.serialization.Codec value) { wrapperContained.UNCOUNTED_CODEC = value; }
public static com.mojang.serialization.Codec UNCOUNTED_CODEC() { return net.minecraft.item.ItemStack.UNCOUNTED_CODEC; }
// public static void UNCOUNTED_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.ItemStack.UNCOUNTED_CODEC = value; }

// public com.mojang.serialization.Codec VALIDATED_CODEC() { return wrapperContained.VALIDATED_CODEC; }
// public void VALIDATED_CODEC(com.mojang.serialization.Codec value) { wrapperContained.VALIDATED_CODEC = value; }
public static com.mojang.serialization.Codec VALIDATED_CODEC() { return net.minecraft.item.ItemStack.VALIDATED_CODEC; }
// public static void VALIDATED_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.ItemStack.VALIDATED_CODEC = value; }

// public com.mojang.serialization.Codec VALIDATED_UNCOUNTED_CODEC() { return wrapperContained.VALIDATED_UNCOUNTED_CODEC; }
// public void VALIDATED_UNCOUNTED_CODEC(com.mojang.serialization.Codec value) { wrapperContained.VALIDATED_UNCOUNTED_CODEC = value; }
public static com.mojang.serialization.Codec VALIDATED_UNCOUNTED_CODEC() { return net.minecraft.item.ItemStack.VALIDATED_UNCOUNTED_CODEC; }
// public static void VALIDATED_UNCOUNTED_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.ItemStack.VALIDATED_UNCOUNTED_CODEC = value; }

// public int bobbingAnimationTime() { return wrapperContained.bobbingAnimationTime; }
// public void bobbingAnimationTime(int value) { wrapperContained.bobbingAnimationTime = value; }
// public static int bobbingAnimationTime() { return net.minecraft.item.ItemStack.bobbingAnimationTime; }
// public static void bobbingAnimationTime(int value, ) { net.minecraft.item.ItemStack.bobbingAnimationTime = value; }

// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public static int count() { return net.minecraft.item.ItemStack.count; }
// public static void count(int value, ) { net.minecraft.item.ItemStack.count = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.item.ItemStack.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.item.ItemStack.LOGGER = value; }

// public yarnwrap.item.ItemStack EMPTY() { return new yarnwrap.item.ItemStack(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.item.ItemStack value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.item.ItemStack EMPTY() { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.EMPTY); }
// public static void EMPTY(yarnwrap.item.ItemStack value, ) { net.minecraft.item.ItemStack.EMPTY = value.wrapperContained; }

// public yarnwrap.item.Item item() { return new yarnwrap.item.Item(wrapperContained.item); }
// public void item(yarnwrap.item.Item value) { wrapperContained.item = value.wrapperContained; }
// public static yarnwrap.item.Item item() { return new yarnwrap.item.Item(net.minecraft.item.ItemStack.item); }
// public static void item(yarnwrap.item.Item value, ) { net.minecraft.item.ItemStack.item = value.wrapperContained; }

// public ItemStack(java.lang.Void v) { this.wrapperContained = new net.minecraft.item.ItemStack(v); }
public ItemStack(yarnwrap.item.ItemConvertible item) { this.wrapperContained = new net.minecraft.item.ItemStack(item.wrapperContained); }
public ItemStack(yarnwrap.item.ItemConvertible item,int count) { this.wrapperContained = new net.minecraft.item.ItemStack(item.wrapperContained,count); }
// public ItemStack(yarnwrap.item.ItemConvertible item,int count,yarnwrap.component.ComponentMapImpl components) { this.wrapperContained = new net.minecraft.item.ItemStack(item.wrapperContained,count,components.wrapperContained); }
public ItemStack(yarnwrap.registry.entry.RegistryEntry entry) { this.wrapperContained = new net.minecraft.item.ItemStack(entry.wrapperContained); }
public ItemStack(yarnwrap.registry.entry.RegistryEntry itemEntry,int count) { this.wrapperContained = new net.minecraft.item.ItemStack(itemEntry.wrapperContained,count); }
public ItemStack(yarnwrap.registry.entry.RegistryEntry item,int count,yarnwrap.component.ComponentChanges changes) { this.wrapperContained = new net.minecraft.item.ItemStack(item.wrapperContained,count,changes.wrapperContained); }
public yarnwrap.sound.SoundEvent getDrinkSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getDrinkSound()); }
// public static yarnwrap.sound.SoundEvent getDrinkSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.item.ItemStack.getDrinkSound()); }
public yarnwrap.sound.SoundEvent getEatSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getEatSound()); }
// public static yarnwrap.sound.SoundEvent getEatSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.item.ItemStack.getEatSound()); }
public yarnwrap.entity.Entity getHolder() { return new yarnwrap.entity.Entity(wrapperContained.getHolder()); }
// public static yarnwrap.entity.Entity getHolder() { return new yarnwrap.entity.Entity(net.minecraft.item.ItemStack.getHolder()); }
public void setHolder(yarnwrap.entity.Entity holder) { wrapperContained.setHolder(holder.wrapperContained); }
// public static void setHolder(yarnwrap.entity.Entity holder, ) { net.minecraft.item.ItemStack.setHolder(holder.wrapperContained); }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
// public static boolean isIn(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.item.ItemStack.isIn(tag.wrapperContained); }
public boolean isOf(yarnwrap.item.Item item) { return wrapperContained.isOf(item.wrapperContained); }
// public static boolean isOf(yarnwrap.item.Item item, ) { return net.minecraft.item.ItemStack.isOf(item.wrapperContained); }
public boolean onStackClicked(yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.onStackClicked(slot.wrapperContained,clickType.wrapperContained,player.wrapperContained); }
// public static boolean onStackClicked(yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.item.ItemStack.onStackClicked(slot.wrapperContained,clickType.wrapperContained,player.wrapperContained); }
public boolean onClicked(yarnwrap.item.ItemStack stack,yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.StackReference cursorStackReference) { return wrapperContained.onClicked(stack.wrapperContained,slot.wrapperContained,clickType.wrapperContained,player.wrapperContained,cursorStackReference.wrapperContained); }
// public static boolean onClicked(yarnwrap.item.ItemStack stack,yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.StackReference cursorStackReference, ) { return net.minecraft.item.ItemStack.onClicked(stack.wrapperContained,slot.wrapperContained,clickType.wrapperContained,player.wrapperContained,cursorStackReference.wrapperContained); }
// public boolean areItemsAndComponentsEqual(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack otherStack) { return wrapperContained.areItemsAndComponentsEqual(stack.wrapperContained,otherStack.wrapperContained); }
// public static boolean areItemsAndComponentsEqual(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack otherStack, ) { return net.minecraft.item.ItemStack.areItemsAndComponentsEqual(stack.wrapperContained,otherStack.wrapperContained); }
public boolean isItemBarVisible() { return wrapperContained.isItemBarVisible(); }
// public static boolean isItemBarVisible() { return net.minecraft.item.ItemStack.isItemBarVisible(); }
public int getItemBarStep() { return wrapperContained.getItemBarStep(); }
// public static int getItemBarStep() { return net.minecraft.item.ItemStack.getItemBarStep(); }
public int getItemBarColor() { return wrapperContained.getItemBarColor(); }
// public static int getItemBarColor() { return net.minecraft.item.ItemStack.getItemBarColor(); }
public java.util.Optional getTooltipData() { return wrapperContained.getTooltipData(); }
// public static java.util.Optional getTooltipData() { return net.minecraft.item.ItemStack.getTooltipData(); }
public void onItemEntityDestroyed(yarnwrap.entity.ItemEntity entity) { wrapperContained.onItemEntityDestroyed(entity.wrapperContained); }
// public static void onItemEntityDestroyed(yarnwrap.entity.ItemEntity entity, ) { net.minecraft.item.ItemStack.onItemEntityDestroyed(entity.wrapperContained); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }
// public static java.util.stream.Stream streamTags() { return net.minecraft.item.ItemStack.streamTags(); }
public boolean itemMatches(yarnwrap.registry.entry.RegistryEntry itemEntry) { return wrapperContained.itemMatches(itemEntry.wrapperContained); }
// public static boolean itemMatches(yarnwrap.registry.entry.RegistryEntry itemEntry, ) { return net.minecraft.item.ItemStack.itemMatches(itemEntry.wrapperContained); }
public boolean itemMatches(java.util.function.Predicate predicate) { return wrapperContained.itemMatches(predicate); }
// public static boolean itemMatches(java.util.function.Predicate predicate, ) { return net.minecraft.item.ItemStack.itemMatches(predicate); }
public yarnwrap.registry.entry.RegistryEntry getRegistryEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getRegistryEntry()); }
// public static yarnwrap.registry.entry.RegistryEntry getRegistryEntry() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.item.ItemStack.getRegistryEntry()); }
public boolean isItemEnabled(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return wrapperContained.isItemEnabled(enabledFeatures.wrapperContained); }
// public static boolean isItemEnabled(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { return net.minecraft.item.ItemStack.isItemEnabled(enabledFeatures.wrapperContained); }
public yarnwrap.item.ItemStack copyWithCount(int count) { return new yarnwrap.item.ItemStack(wrapperContained.copyWithCount(count)); }
// public static yarnwrap.item.ItemStack copyWithCount(int count, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.copyWithCount(count)); }
public yarnwrap.item.ItemStack copyAndEmpty() { return new yarnwrap.item.ItemStack(wrapperContained.copyAndEmpty()); }
// public static yarnwrap.item.ItemStack copyAndEmpty() { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.copyAndEmpty()); }
public boolean isIn(yarnwrap.registry.entry.RegistryEntryList registryEntryList) { return wrapperContained.isIn(registryEntryList.wrapperContained); }
// public static boolean isIn(yarnwrap.registry.entry.RegistryEntryList registryEntryList, ) { return net.minecraft.item.ItemStack.isIn(registryEntryList.wrapperContained); }
public void onCraftByCrafter(yarnwrap.world.World world) { wrapperContained.onCraftByCrafter(world.wrapperContained); }
// public static void onCraftByCrafter(yarnwrap.world.World world, ) { net.minecraft.item.ItemStack.onCraftByCrafter(world.wrapperContained); }
// public void method_56097(yarnwrap.entity.LivingEntity item) { wrapperContained.method_56097(item.wrapperContained); }
// public static void method_56097(yarnwrap.entity.LivingEntity item, ) { net.minecraft.item.ItemStack.method_56097(item.wrapperContained); }
// public java.util.Optional method_56700(yarnwrap.item.ItemStack stack) { return wrapperContained.method_56700(stack.wrapperContained); }
// public static java.util.Optional method_56700(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.ItemStack.method_56700(stack.wrapperContained); }
public yarnwrap.item.ItemStack copyComponentsToNewStack(yarnwrap.item.ItemConvertible item,int count) { return new yarnwrap.item.ItemStack(wrapperContained.copyComponentsToNewStack(item.wrapperContained,count)); }
// public static yarnwrap.item.ItemStack copyComponentsToNewStack(yarnwrap.item.ItemConvertible item,int count, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.copyComponentsToNewStack(item.wrapperContained,count)); }
// public com.mojang.serialization.MapCodec createOptionalCodec(java.lang.String fieldName) { return wrapperContained.createOptionalCodec(fieldName); }
// public static com.mojang.serialization.MapCodec createOptionalCodec(java.lang.String fieldName, ) { return net.minecraft.item.ItemStack.createOptionalCodec(fieldName); }
// public yarnwrap.item.ItemStack method_56703(java.util.Optional optional) { return new yarnwrap.item.ItemStack(wrapperContained.method_56703(optional)); }
// public static yarnwrap.item.ItemStack method_56703(java.util.Optional optional, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.method_56703(optional)); }
// public yarnwrap.item.ItemStack copyComponentsToNewStackIgnoreEmpty(yarnwrap.item.ItemConvertible item,int count) { return new yarnwrap.item.ItemStack(wrapperContained.copyComponentsToNewStackIgnoreEmpty(item.wrapperContained,count)); }
// public static yarnwrap.item.ItemStack copyComponentsToNewStackIgnoreEmpty(yarnwrap.item.ItemConvertible item,int count, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.copyComponentsToNewStackIgnoreEmpty(item.wrapperContained,count)); }
public void decrementUnlessCreative(int amount,yarnwrap.entity.LivingEntity entity) { wrapperContained.decrementUnlessCreative(amount,entity.wrapperContained); }
// public static void decrementUnlessCreative(int amount,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.item.ItemStack.decrementUnlessCreative(amount,entity.wrapperContained); }
public yarnwrap.sound.SoundEvent getBreakSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBreakSound()); }
// public static yarnwrap.sound.SoundEvent getBreakSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.item.ItemStack.getBreakSound()); }
public void applyAttributeModifiers(yarnwrap.entity.EquipmentSlot slot,java.util.function.BiConsumer attributeModifierConsumer) { wrapperContained.applyAttributeModifiers(slot.wrapperContained,attributeModifierConsumer); }
// public static void applyAttributeModifiers(yarnwrap.entity.EquipmentSlot slot,java.util.function.BiConsumer attributeModifierConsumer, ) { net.minecraft.item.ItemStack.applyAttributeModifiers(slot.wrapperContained,attributeModifierConsumer); }
// public int hashCode(yarnwrap.item.ItemStack stack) { return wrapperContained.hashCode(stack.wrapperContained); }
// public static int hashCode(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.ItemStack.hashCode(stack.wrapperContained); }
// public void method_57356(yarnwrap.registry.entry.RegistryEntry builder) { wrapperContained.method_57356(builder.wrapperContained); }
// public static void method_57356(yarnwrap.registry.entry.RegistryEntry builder, ) { net.minecraft.item.ItemStack.method_57356(builder.wrapperContained); }
public boolean canPlaceOn(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.canPlaceOn(pos.wrapperContained); }
// public static boolean canPlaceOn(yarnwrap.block.pattern.CachedBlockPosition pos, ) { return net.minecraft.item.ItemStack.canPlaceOn(pos.wrapperContained); }
// public yarnwrap.nbt.NbtElement encode(Object registries) { return new yarnwrap.nbt.NbtElement(wrapperContained.encode(registries)); }
// public static yarnwrap.nbt.NbtElement encode(Object registries, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.item.ItemStack.encode(registries)); }
// public yarnwrap.item.ItemStack fromNbtOrEmpty(Object registries,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.item.ItemStack(wrapperContained.fromNbtOrEmpty(registries,nbt.wrapperContained)); }
// public static yarnwrap.item.ItemStack fromNbtOrEmpty(Object registries,yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.fromNbtOrEmpty(registries,nbt.wrapperContained)); }
// public java.util.Optional fromNbt(Object registries,yarnwrap.nbt.NbtElement nbt) { return wrapperContained.fromNbt(registries,nbt.wrapperContained); }
// public static java.util.Optional fromNbt(Object registries,yarnwrap.nbt.NbtElement nbt, ) { return net.minecraft.item.ItemStack.fromNbt(registries,nbt.wrapperContained); }
// public int listHashCode(java.util.List stacks) { return wrapperContained.listHashCode(stacks); }
// public static int listHashCode(java.util.List stacks, ) { return net.minecraft.item.ItemStack.listHashCode(stacks); }
// public boolean stacksEqual(java.util.List left,java.util.List right) { return wrapperContained.stacksEqual(left,right); }
// public static boolean stacksEqual(java.util.List left,java.util.List right, ) { return net.minecraft.item.ItemStack.stacksEqual(left,right); }
// public void appendAttributeModifiersTooltip(java.util.function.Consumer textConsumer,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.appendAttributeModifiersTooltip(textConsumer,player.wrapperContained); }
// public static void appendAttributeModifiersTooltip(java.util.function.Consumer textConsumer,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.item.ItemStack.appendAttributeModifiersTooltip(textConsumer,player.wrapperContained); }
// public void appendAttributeModifierTooltip(java.util.function.Consumer textConsumer,yarnwrap.entity.player.PlayerEntity player,yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.appendAttributeModifierTooltip(textConsumer,player.wrapperContained,attribute.wrapperContained,modifier.wrapperContained); }
// public static void appendAttributeModifierTooltip(java.util.function.Consumer textConsumer,yarnwrap.entity.player.PlayerEntity player,yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier, ) { net.minecraft.item.ItemStack.appendAttributeModifierTooltip(textConsumer,player.wrapperContained,attribute.wrapperContained,modifier.wrapperContained); }
public void applyComponentsFrom(yarnwrap.component.ComponentMap components) { wrapperContained.applyComponentsFrom(components.wrapperContained); }
// public static void applyComponentsFrom(yarnwrap.component.ComponentMap components, ) { net.minecraft.item.ItemStack.applyComponentsFrom(components.wrapperContained); }
public void applyUnvalidatedChanges(yarnwrap.component.ComponentChanges changes) { wrapperContained.applyUnvalidatedChanges(changes.wrapperContained); }
// public static void applyUnvalidatedChanges(yarnwrap.component.ComponentChanges changes, ) { net.minecraft.item.ItemStack.applyUnvalidatedChanges(changes.wrapperContained); }
public java.lang.Object apply(yarnwrap.component.ComponentType type,java.lang.Object defaultValue,java.lang.Object change,java.util.function.BiFunction applier) { return wrapperContained.apply(type.wrapperContained,defaultValue,change,applier); }
// public static java.lang.Object apply(yarnwrap.component.ComponentType type,java.lang.Object defaultValue,java.lang.Object change,java.util.function.BiFunction applier, ) { return net.minecraft.item.ItemStack.apply(type.wrapperContained,defaultValue,change,applier); }
public java.lang.Object apply(yarnwrap.component.ComponentType type,java.lang.Object defaultValue,java.util.function.UnaryOperator applier) { return wrapperContained.apply(type.wrapperContained,defaultValue,applier); }
// public static java.lang.Object apply(yarnwrap.component.ComponentType type,java.lang.Object defaultValue,java.util.function.UnaryOperator applier, ) { return net.minecraft.item.ItemStack.apply(type.wrapperContained,defaultValue,applier); }
// public void appendTooltip(yarnwrap.component.ComponentType componentType,Object context,java.util.function.Consumer textConsumer,yarnwrap.item.tooltip.TooltipType type) { wrapperContained.appendTooltip(componentType.wrapperContained,context,textConsumer,type.wrapperContained); }
// public static void appendTooltip(yarnwrap.component.ComponentType componentType,Object context,java.util.function.Consumer textConsumer,yarnwrap.item.tooltip.TooltipType type, ) { net.minecraft.item.ItemStack.appendTooltip(componentType.wrapperContained,context,textConsumer,type.wrapperContained); }
// public void method_57370(org.apache.commons.lang3.mutable.MutableBoolean attribute,java.util.function.Consumer modifier) { wrapperContained.method_57370(attribute,modifier); }
// public static void method_57370(org.apache.commons.lang3.mutable.MutableBoolean attribute,java.util.function.Consumer modifier, ) { net.minecraft.item.ItemStack.method_57370(attribute,modifier); }
// public com.mojang.datafixers.kinds.App method_57371(Object instance) { return wrapperContained.method_57371(instance); }
// public static com.mojang.datafixers.kinds.App method_57371(Object instance, ) { return net.minecraft.item.ItemStack.method_57371(instance); }
// public com.mojang.serialization.DataResult validate(yarnwrap.item.ItemStack stack) { return wrapperContained.validate(stack.wrapperContained); }
// public static com.mojang.serialization.DataResult validate(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.ItemStack.validate(stack.wrapperContained); }
public boolean canBreak(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.canBreak(pos.wrapperContained); }
// public static boolean canBreak(yarnwrap.block.pattern.CachedBlockPosition pos, ) { return net.minecraft.item.ItemStack.canBreak(pos.wrapperContained); }
// public com.mojang.serialization.DataResult method_57374(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.method_57374(entry.wrapperContained); }
// public static com.mojang.serialization.DataResult method_57374(yarnwrap.registry.entry.RegistryEntry entry, ) { return net.minecraft.item.ItemStack.method_57374(entry.wrapperContained); }
// public yarnwrap.nbt.NbtElement encodeAllowEmpty(Object registries) { return new yarnwrap.nbt.NbtElement(wrapperContained.encodeAllowEmpty(registries)); }
// public static yarnwrap.nbt.NbtElement encodeAllowEmpty(Object registries, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.item.ItemStack.encodeAllowEmpty(registries)); }
// public yarnwrap.nbt.NbtElement encode(Object registries,yarnwrap.nbt.NbtElement prefix) { return new yarnwrap.nbt.NbtElement(wrapperContained.encode(registries,prefix.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement encode(Object registries,yarnwrap.nbt.NbtElement prefix, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.item.ItemStack.encode(registries,prefix.wrapperContained)); }
// public void method_57377(java.lang.String error) { wrapperContained.method_57377(error); }
// public static void method_57377(java.lang.String error, ) { net.minecraft.item.ItemStack.method_57377(error); }
// public yarnwrap.item.ItemStack method_57378(java.util.Optional optional) { return new yarnwrap.item.ItemStack(wrapperContained.method_57378(optional)); }
// public static yarnwrap.item.ItemStack method_57378(java.util.Optional optional, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.method_57378(optional)); }
public java.lang.Object set(yarnwrap.component.ComponentType type,java.lang.Object value) { return wrapperContained.set(type.wrapperContained,value); }
// public static java.lang.Object set(yarnwrap.component.ComponentType type,java.lang.Object value, ) { return net.minecraft.item.ItemStack.set(type.wrapperContained,value); }
public yarnwrap.component.ComponentChanges getComponentChanges() { return new yarnwrap.component.ComponentChanges(wrapperContained.getComponentChanges()); }
// public static yarnwrap.component.ComponentChanges getComponentChanges() { return new yarnwrap.component.ComponentChanges(net.minecraft.item.ItemStack.getComponentChanges()); }
public java.lang.Object remove(yarnwrap.component.ComponentType type) { return wrapperContained.remove(type.wrapperContained); }
// public static java.lang.Object remove(yarnwrap.component.ComponentType type, ) { return net.minecraft.item.ItemStack.remove(type.wrapperContained); }
// public java.util.Optional method_57382(yarnwrap.item.ItemStack stack) { return wrapperContained.method_57382(stack.wrapperContained); }
// public static java.util.Optional method_57382(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.ItemStack.method_57382(stack.wrapperContained); }
// public yarnwrap.item.ItemStack method_57383(yarnwrap.item.ItemStack v) { return new yarnwrap.item.ItemStack(wrapperContained.method_57383(v.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_57383(yarnwrap.item.ItemStack v, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.method_57383(v.wrapperContained)); }
// public yarnwrap.component.ComponentChanges method_57385(yarnwrap.item.ItemStack stack) { return new yarnwrap.component.ComponentChanges(wrapperContained.method_57385(stack.wrapperContained)); }
// public static yarnwrap.component.ComponentChanges method_57385(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.component.ComponentChanges(net.minecraft.item.ItemStack.method_57385(stack.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_58092(Object instance) { return wrapperContained.method_58092(instance); }
// public static com.mojang.datafixers.kinds.App method_58092(Object instance, ) { return net.minecraft.item.ItemStack.method_58092(instance); }
// public yarnwrap.item.ItemStack method_58093(yarnwrap.registry.entry.RegistryEntry item,yarnwrap.component.ComponentChanges components) { return new yarnwrap.item.ItemStack(wrapperContained.method_58093(item.wrapperContained,components.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_58093(yarnwrap.registry.entry.RegistryEntry item,yarnwrap.component.ComponentChanges components, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.method_58093(item.wrapperContained,components.wrapperContained)); }
// public yarnwrap.component.ComponentChanges method_58094(yarnwrap.item.ItemStack stack) { return new yarnwrap.component.ComponentChanges(wrapperContained.method_58094(stack.wrapperContained)); }
// public static yarnwrap.component.ComponentChanges method_58094(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.component.ComponentChanges(net.minecraft.item.ItemStack.method_58094(stack.wrapperContained)); }
public boolean takesDamageFrom(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.takesDamageFrom(source.wrapperContained); }
// public static boolean takesDamageFrom(yarnwrap.entity.damage.DamageSource source, ) { return net.minecraft.item.ItemStack.takesDamageFrom(source.wrapperContained); }
public void capCount(int maxCount) { wrapperContained.capCount(maxCount); }
// public static void capCount(int maxCount, ) { net.minecraft.item.ItemStack.capCount(maxCount); }
public yarnwrap.component.type.ItemEnchantmentsComponent getEnchantments() { return new yarnwrap.component.type.ItemEnchantmentsComponent(wrapperContained.getEnchantments()); }
// public static yarnwrap.component.type.ItemEnchantmentsComponent getEnchantments() { return new yarnwrap.component.type.ItemEnchantmentsComponent(net.minecraft.item.ItemStack.getEnchantments()); }
public yarnwrap.component.ComponentMap getDefaultComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.getDefaultComponents()); }
// public static yarnwrap.component.ComponentMap getDefaultComponents() { return new yarnwrap.component.ComponentMap(net.minecraft.item.ItemStack.getDefaultComponents()); }
// public com.mojang.serialization.DataResult validateComponents(yarnwrap.component.ComponentMap components) { return wrapperContained.validateComponents(components.wrapperContained); }
// public static com.mojang.serialization.DataResult validateComponents(yarnwrap.component.ComponentMap components, ) { return net.minecraft.item.ItemStack.validateComponents(components.wrapperContained); }
public void applyChanges(yarnwrap.component.ComponentChanges changes) { wrapperContained.applyChanges(changes.wrapperContained); }
// public static void applyChanges(yarnwrap.component.ComponentChanges changes, ) { net.minecraft.item.ItemStack.applyChanges(changes.wrapperContained); }
// public yarnwrap.network.codec.PacketCodec createExtraValidatingPacketCodec(yarnwrap.network.codec.PacketCodec basePacketCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createExtraValidatingPacketCodec(basePacketCodec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec createExtraValidatingPacketCodec(yarnwrap.network.codec.PacketCodec basePacketCodec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.ItemStack.createExtraValidatingPacketCodec(basePacketCodec.wrapperContained)); }
public void postDamageEntity(yarnwrap.entity.LivingEntity target,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.postDamageEntity(target.wrapperContained,player.wrapperContained); }
// public static void postDamageEntity(yarnwrap.entity.LivingEntity target,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.item.ItemStack.postDamageEntity(target.wrapperContained,player.wrapperContained); }
public yarnwrap.item.ItemStack withItem(yarnwrap.item.ItemConvertible item) { return new yarnwrap.item.ItemStack(wrapperContained.withItem(item.wrapperContained)); }
// public static yarnwrap.item.ItemStack withItem(yarnwrap.item.ItemConvertible item, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.withItem(item.wrapperContained)); }
public yarnwrap.item.ItemStack splitUnlessCreative(int amount,yarnwrap.entity.LivingEntity entity) { return new yarnwrap.item.ItemStack(wrapperContained.splitUnlessCreative(amount,entity.wrapperContained)); }
// public static yarnwrap.item.ItemStack splitUnlessCreative(int amount,yarnwrap.entity.LivingEntity entity, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.splitUnlessCreative(amount,entity.wrapperContained)); }
public void applyAttributeModifier(yarnwrap.component.type.AttributeModifierSlot slot,java.util.function.BiConsumer attributeModifierConsumer) { wrapperContained.applyAttributeModifier(slot.wrapperContained,attributeModifierConsumer); }
// public static void applyAttributeModifier(yarnwrap.component.type.AttributeModifierSlot slot,java.util.function.BiConsumer attributeModifierConsumer, ) { net.minecraft.item.ItemStack.applyAttributeModifier(slot.wrapperContained,attributeModifierConsumer); }
public yarnwrap.item.ItemStack damage(int amount,yarnwrap.item.ItemConvertible itemAfterBreaking,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.damage(amount,itemAfterBreaking.wrapperContained,entity.wrapperContained,slot.wrapperContained)); }
// public static yarnwrap.item.ItemStack damage(int amount,yarnwrap.item.ItemConvertible itemAfterBreaking,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.damage(amount,itemAfterBreaking.wrapperContained,entity.wrapperContained,slot.wrapperContained)); }
public yarnwrap.item.Item getItem() { return new yarnwrap.item.Item(wrapperContained.getItem()); }
// public static yarnwrap.item.Item getItem() { return new yarnwrap.item.Item(net.minecraft.item.ItemStack.getItem()); }
public yarnwrap.item.ItemStack finishUsing(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user) { return new yarnwrap.item.ItemStack(wrapperContained.finishUsing(world.wrapperContained,user.wrapperContained)); }
// public static yarnwrap.item.ItemStack finishUsing(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.finishUsing(world.wrapperContained,user.wrapperContained)); }
public void setBobbingAnimationTime(int bobbingAnimationTime) { wrapperContained.setBobbingAnimationTime(bobbingAnimationTime); }
// public static void setBobbingAnimationTime(int bobbingAnimationTime, ) { net.minecraft.item.ItemStack.setBobbingAnimationTime(bobbingAnimationTime); }
public yarnwrap.util.TypedActionResult use(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity user,yarnwrap.util.Hand hand) { return new yarnwrap.util.TypedActionResult(wrapperContained.use(world.wrapperContained,user.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.TypedActionResult use(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity user,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.TypedActionResult(net.minecraft.item.ItemStack.use(world.wrapperContained,user.wrapperContained,hand.wrapperContained)); }
public int getMaxCount() { return wrapperContained.getMaxCount(); }
// public static int getMaxCount() { return net.minecraft.item.ItemStack.getMaxCount(); }
public void inventoryTick(yarnwrap.world.World world,yarnwrap.entity.Entity entity,int slot,boolean selected) { wrapperContained.inventoryTick(world.wrapperContained,entity.wrapperContained,slot,selected); }
// public static void inventoryTick(yarnwrap.world.World world,yarnwrap.entity.Entity entity,int slot,boolean selected, ) { net.minecraft.item.ItemStack.inventoryTick(world.wrapperContained,entity.wrapperContained,slot,selected); }
public int getDamage() { return wrapperContained.getDamage(); }
// public static int getDamage() { return net.minecraft.item.ItemStack.getDamage(); }
public yarnwrap.util.ActionResult useOnEntity(yarnwrap.entity.player.PlayerEntity user,yarnwrap.entity.LivingEntity entity,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.useOnEntity(user.wrapperContained,entity.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult useOnEntity(yarnwrap.entity.player.PlayerEntity user,yarnwrap.entity.LivingEntity entity,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.item.ItemStack.useOnEntity(user.wrapperContained,entity.wrapperContained,hand.wrapperContained)); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public static java.lang.String getTranslationKey() { return net.minecraft.item.ItemStack.getTranslationKey(); }
public boolean isEnchantable() { return wrapperContained.isEnchantable(); }
// public static boolean isEnchantable() { return net.minecraft.item.ItemStack.isEnchantable(); }
public float getMiningSpeedMultiplier(yarnwrap.block.BlockState state) { return wrapperContained.getMiningSpeedMultiplier(state.wrapperContained); }
// public static float getMiningSpeedMultiplier(yarnwrap.block.BlockState state, ) { return net.minecraft.item.ItemStack.getMiningSpeedMultiplier(state.wrapperContained); }
public void onStoppedUsing(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,int remainingUseTicks) { wrapperContained.onStoppedUsing(world.wrapperContained,user.wrapperContained,remainingUseTicks); }
// public static void onStoppedUsing(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,int remainingUseTicks, ) { net.minecraft.item.ItemStack.onStoppedUsing(world.wrapperContained,user.wrapperContained,remainingUseTicks); }
public yarnwrap.util.Rarity getRarity() { return new yarnwrap.util.Rarity(wrapperContained.getRarity()); }
// public static yarnwrap.util.Rarity getRarity() { return new yarnwrap.util.Rarity(net.minecraft.item.ItemStack.getRarity()); }
public void increment(int amount) { wrapperContained.increment(amount); }
// public static void increment(int amount, ) { net.minecraft.item.ItemStack.increment(amount); }
public void decrement(int amount) { wrapperContained.decrement(amount); }
// public static void decrement(int amount, ) { net.minecraft.item.ItemStack.decrement(amount); }
public int getMaxUseTime(yarnwrap.entity.LivingEntity user) { return wrapperContained.getMaxUseTime(user.wrapperContained); }
// public static int getMaxUseTime(yarnwrap.entity.LivingEntity user, ) { return net.minecraft.item.ItemStack.getMaxUseTime(user.wrapperContained); }
public int getMaxDamage() { return wrapperContained.getMaxDamage(); }
// public static int getMaxDamage() { return net.minecraft.item.ItemStack.getMaxDamage(); }
public void setCount(int count) { wrapperContained.setCount(count); }
// public static void setCount(int count, ) { net.minecraft.item.ItemStack.setCount(count); }
public boolean hasEnchantments() { return wrapperContained.hasEnchantments(); }
// public static boolean hasEnchantments() { return net.minecraft.item.ItemStack.hasEnchantments(); }
public yarnwrap.entity.decoration.ItemFrameEntity getFrame() { return new yarnwrap.entity.decoration.ItemFrameEntity(wrapperContained.getFrame()); }
// public static yarnwrap.entity.decoration.ItemFrameEntity getFrame() { return new yarnwrap.entity.decoration.ItemFrameEntity(net.minecraft.item.ItemStack.getFrame()); }
public boolean isStackable() { return wrapperContained.isStackable(); }
// public static boolean isStackable() { return net.minecraft.item.ItemStack.isStackable(); }
public int getCount() { return wrapperContained.getCount(); }
// public static int getCount() { return net.minecraft.item.ItemStack.getCount(); }
public void usageTick(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,int remainingUseTicks) { wrapperContained.usageTick(world.wrapperContained,user.wrapperContained,remainingUseTicks); }
// public static void usageTick(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,int remainingUseTicks, ) { net.minecraft.item.ItemStack.usageTick(world.wrapperContained,user.wrapperContained,remainingUseTicks); }
// public java.util.List getTooltip(Object context,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.tooltip.TooltipType type) { return wrapperContained.getTooltip(context,player.wrapperContained,type.wrapperContained); }
// public static java.util.List getTooltip(Object context,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.tooltip.TooltipType type, ) { return net.minecraft.item.ItemStack.getTooltip(context,player.wrapperContained,type.wrapperContained); }
public boolean isSuitableFor(yarnwrap.block.BlockState state) { return wrapperContained.isSuitableFor(state.wrapperContained); }
// public static boolean isSuitableFor(yarnwrap.block.BlockState state, ) { return net.minecraft.item.ItemStack.isSuitableFor(state.wrapperContained); }
public void postMine(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity miner) { wrapperContained.postMine(world.wrapperContained,state.wrapperContained,pos.wrapperContained,miner.wrapperContained); }
// public static void postMine(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity miner, ) { net.minecraft.item.ItemStack.postMine(world.wrapperContained,state.wrapperContained,pos.wrapperContained,miner.wrapperContained); }
public yarnwrap.text.Text toHoverableText() { return new yarnwrap.text.Text(wrapperContained.toHoverableText()); }
// public static yarnwrap.text.Text toHoverableText() { return new yarnwrap.text.Text(net.minecraft.item.ItemStack.toHoverableText()); }
public void damage(int amount,yarnwrap.server.world.ServerWorld world,yarnwrap.server.network.ServerPlayerEntity player,java.util.function.Consumer breakCallback) { wrapperContained.damage(amount,world.wrapperContained,player.wrapperContained,breakCallback); }
// public static void damage(int amount,yarnwrap.server.world.ServerWorld world,yarnwrap.server.network.ServerPlayerEntity player,java.util.function.Consumer breakCallback, ) { net.minecraft.item.ItemStack.damage(amount,world.wrapperContained,player.wrapperContained,breakCallback); }
public boolean hasGlint() { return wrapperContained.hasGlint(); }
// public static boolean hasGlint() { return net.minecraft.item.ItemStack.hasGlint(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.item.ItemStack.isEmpty(); }
public boolean isInFrame() { return wrapperContained.isInFrame(); }
// public static boolean isInFrame() { return net.minecraft.item.ItemStack.isInFrame(); }
public boolean isDamageable() { return wrapperContained.isDamageable(); }
// public static boolean isDamageable() { return net.minecraft.item.ItemStack.isDamageable(); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.item.ItemStack.getName()); }
public int getBobbingAnimationTime() { return wrapperContained.getBobbingAnimationTime(); }
// public static int getBobbingAnimationTime() { return net.minecraft.item.ItemStack.getBobbingAnimationTime(); }
// public yarnwrap.text.Style method_7966(yarnwrap.text.Style style) { return new yarnwrap.text.Style(wrapperContained.method_7966(style.wrapperContained)); }
// public static yarnwrap.text.Style method_7966(yarnwrap.text.Style style, ) { return new yarnwrap.text.Style(net.minecraft.item.ItemStack.method_7966(style.wrapperContained)); }
public boolean isUsedOnRelease() { return wrapperContained.isUsedOnRelease(); }
// public static boolean isUsedOnRelease() { return net.minecraft.item.ItemStack.isUsedOnRelease(); }
public void damage(int amount,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot) { wrapperContained.damage(amount,entity.wrapperContained,slot.wrapperContained); }
// public static void damage(int amount,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot, ) { net.minecraft.item.ItemStack.damage(amount,entity.wrapperContained,slot.wrapperContained); }
public yarnwrap.item.ItemStack split(int amount) { return new yarnwrap.item.ItemStack(wrapperContained.split(amount)); }
// public static yarnwrap.item.ItemStack split(int amount, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.split(amount)); }
public yarnwrap.item.ItemStack copy() { return new yarnwrap.item.ItemStack(wrapperContained.copy()); }
// public static yarnwrap.item.ItemStack copy() { return new yarnwrap.item.ItemStack(net.minecraft.item.ItemStack.copy()); }
// public boolean areEqual(yarnwrap.item.ItemStack left,yarnwrap.item.ItemStack right) { return wrapperContained.areEqual(left.wrapperContained,right.wrapperContained); }
// public static boolean areEqual(yarnwrap.item.ItemStack left,yarnwrap.item.ItemStack right, ) { return net.minecraft.item.ItemStack.areEqual(left.wrapperContained,right.wrapperContained); }
public void setDamage(int damage) { wrapperContained.setDamage(damage); }
// public static void setDamage(int damage, ) { net.minecraft.item.ItemStack.setDamage(damage); }
public yarnwrap.util.UseAction getUseAction() { return new yarnwrap.util.UseAction(wrapperContained.getUseAction()); }
// public static yarnwrap.util.UseAction getUseAction() { return new yarnwrap.util.UseAction(net.minecraft.item.ItemStack.getUseAction()); }
public void addEnchantment(yarnwrap.registry.entry.RegistryEntry enchantment,int level) { wrapperContained.addEnchantment(enchantment.wrapperContained,level); }
// public static void addEnchantment(yarnwrap.registry.entry.RegistryEntry enchantment,int level, ) { net.minecraft.item.ItemStack.addEnchantment(enchantment.wrapperContained,level); }
public boolean postHit(yarnwrap.entity.LivingEntity target,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.postHit(target.wrapperContained,player.wrapperContained); }
// public static boolean postHit(yarnwrap.entity.LivingEntity target,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.item.ItemStack.postHit(target.wrapperContained,player.wrapperContained); }
public yarnwrap.util.ActionResult useOnBlock(yarnwrap.item.ItemUsageContext context) { return new yarnwrap.util.ActionResult(wrapperContained.useOnBlock(context.wrapperContained)); }
// public static yarnwrap.util.ActionResult useOnBlock(yarnwrap.item.ItemUsageContext context, ) { return new yarnwrap.util.ActionResult(net.minecraft.item.ItemStack.useOnBlock(context.wrapperContained)); }
public void onCraftByPlayer(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,int amount) { wrapperContained.onCraftByPlayer(world.wrapperContained,player.wrapperContained,amount); }
// public static void onCraftByPlayer(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,int amount, ) { net.minecraft.item.ItemStack.onCraftByPlayer(world.wrapperContained,player.wrapperContained,amount); }
// public boolean areItemsEqual(yarnwrap.item.ItemStack left,yarnwrap.item.ItemStack right) { return wrapperContained.areItemsEqual(left.wrapperContained,right.wrapperContained); }
// public static boolean areItemsEqual(yarnwrap.item.ItemStack left,yarnwrap.item.ItemStack right, ) { return net.minecraft.item.ItemStack.areItemsEqual(left.wrapperContained,right.wrapperContained); }
public boolean isDamaged() { return wrapperContained.isDamaged(); }
// public static boolean isDamaged() { return net.minecraft.item.ItemStack.isDamaged(); }

}