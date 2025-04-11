package yarnwrap.item;
public class ItemStack { public net.minecraft.item.ItemStack wrapperContained; public ItemStack(net.minecraft.item.ItemStack wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.Entity holder() { return new yarnwrap.entity.Entity(wrapperContained.holder); }
// public void holder(yarnwrap.entity.Entity value) { wrapperContained.holder = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.text.Text DISABLED_TEXT() { return new yarnwrap.text.Text(wrapperContained.DISABLED_TEXT); }
// public void DISABLED_TEXT(yarnwrap.text.Text value) { wrapperContained.DISABLED_TEXT = value.wrapperContained; }
public com.mojang.serialization.Codec ITEM_CODEC() { return wrapperContained.ITEM_CODEC; }
// public void ITEM_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ITEM_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec LIST_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.LIST_PACKET_CODEC); }
// public void LIST_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.LIST_PACKET_CODEC = value.wrapperContained; }
public com.mojang.serialization.Codec OPTIONAL_CODEC() { return wrapperContained.OPTIONAL_CODEC; }
// public void OPTIONAL_CODEC(com.mojang.serialization.Codec value) { wrapperContained.OPTIONAL_CODEC = value; }
public com.mojang.serialization.Codec REGISTRY_ENTRY_CODEC() { return wrapperContained.REGISTRY_ENTRY_CODEC; }
// public void REGISTRY_ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_ENTRY_CODEC = value; }
public yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_PACKET_CODEC); }
// public void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_PACKET_CODEC = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec OPTIONAL_LIST_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_LIST_PACKET_CODEC); }
// public void OPTIONAL_LIST_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_LIST_PACKET_CODEC = value.wrapperContained; }
// public yarnwrap.component.ComponentMapImpl components() { return new yarnwrap.component.ComponentMapImpl(wrapperContained.components); }
// public void components(yarnwrap.component.ComponentMapImpl value) { wrapperContained.components = value.wrapperContained; }
public com.mojang.serialization.Codec UNCOUNTED_CODEC() { return wrapperContained.UNCOUNTED_CODEC; }
// public void UNCOUNTED_CODEC(com.mojang.serialization.Codec value) { wrapperContained.UNCOUNTED_CODEC = value; }
public com.mojang.serialization.Codec VALIDATED_CODEC() { return wrapperContained.VALIDATED_CODEC; }
// public void VALIDATED_CODEC(com.mojang.serialization.Codec value) { wrapperContained.VALIDATED_CODEC = value; }
public com.mojang.serialization.Codec VALIDATED_UNCOUNTED_CODEC() { return wrapperContained.VALIDATED_UNCOUNTED_CODEC; }
// public void VALIDATED_UNCOUNTED_CODEC(com.mojang.serialization.Codec value) { wrapperContained.VALIDATED_UNCOUNTED_CODEC = value; }
// public int bobbingAnimationTime() { return wrapperContained.bobbingAnimationTime; }
// public void bobbingAnimationTime(int value) { wrapperContained.bobbingAnimationTime = value; }
// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.item.ItemStack EMPTY() { return new yarnwrap.item.ItemStack(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.item.ItemStack value) { wrapperContained.EMPTY = value.wrapperContained; }
// public yarnwrap.item.Item item() { return new yarnwrap.item.Item(wrapperContained.item); }
// public void item(yarnwrap.item.Item value) { wrapperContained.item = value.wrapperContained; }
// public ItemStack(java.lang.Void v) { this.wrapperContained = new net.minecraft.item.ItemStack(v); }
public ItemStack(yarnwrap.item.ItemConvertible item) { this.wrapperContained = new net.minecraft.item.ItemStack(item.wrapperContained); }
public ItemStack(yarnwrap.item.ItemConvertible item,int count) { this.wrapperContained = new net.minecraft.item.ItemStack(item.wrapperContained,count); }
// public ItemStack(yarnwrap.item.ItemConvertible item,int count,yarnwrap.component.ComponentMapImpl components) { this.wrapperContained = new net.minecraft.item.ItemStack(item.wrapperContained,count,components.wrapperContained); }
public ItemStack(yarnwrap.registry.entry.RegistryEntry entry) { this.wrapperContained = new net.minecraft.item.ItemStack(entry.wrapperContained); }
public ItemStack(yarnwrap.registry.entry.RegistryEntry itemEntry,int count) { this.wrapperContained = new net.minecraft.item.ItemStack(itemEntry.wrapperContained,count); }
public ItemStack(yarnwrap.registry.entry.RegistryEntry item,int count,yarnwrap.component.ComponentChanges changes) { this.wrapperContained = new net.minecraft.item.ItemStack(item.wrapperContained,count,changes.wrapperContained); }
public yarnwrap.sound.SoundEvent getDrinkSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getDrinkSound()); }
public yarnwrap.sound.SoundEvent getEatSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getEatSound()); }
public yarnwrap.entity.Entity getHolder() { return new yarnwrap.entity.Entity(wrapperContained.getHolder()); }
public void setHolder(yarnwrap.entity.Entity holder) { wrapperContained.setHolder(holder.wrapperContained); }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
public boolean isOf(yarnwrap.item.Item item) { return wrapperContained.isOf(item.wrapperContained); }
public boolean onStackClicked(yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.onStackClicked(slot.wrapperContained,clickType.wrapperContained,player.wrapperContained); }
public boolean onClicked(yarnwrap.item.ItemStack stack,yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.StackReference cursorStackReference) { return wrapperContained.onClicked(stack.wrapperContained,slot.wrapperContained,clickType.wrapperContained,player.wrapperContained,cursorStackReference.wrapperContained); }
public boolean areItemsAndComponentsEqual(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack otherStack) { return wrapperContained.areItemsAndComponentsEqual(stack.wrapperContained,otherStack.wrapperContained); }
public boolean isItemBarVisible() { return wrapperContained.isItemBarVisible(); }
public int getItemBarStep() { return wrapperContained.getItemBarStep(); }
public int getItemBarColor() { return wrapperContained.getItemBarColor(); }
public java.util.Optional getTooltipData() { return wrapperContained.getTooltipData(); }
public void onItemEntityDestroyed(yarnwrap.entity.ItemEntity entity) { wrapperContained.onItemEntityDestroyed(entity.wrapperContained); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }
public boolean itemMatches(yarnwrap.registry.entry.RegistryEntry itemEntry) { return wrapperContained.itemMatches(itemEntry.wrapperContained); }
public boolean itemMatches(java.util.function.Predicate predicate) { return wrapperContained.itemMatches(predicate); }
public yarnwrap.registry.entry.RegistryEntry getRegistryEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getRegistryEntry()); }
public boolean isItemEnabled(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return wrapperContained.isItemEnabled(enabledFeatures.wrapperContained); }
public yarnwrap.item.ItemStack copyWithCount(int count) { return new yarnwrap.item.ItemStack(wrapperContained.copyWithCount(count)); }
public yarnwrap.item.ItemStack copyAndEmpty() { return new yarnwrap.item.ItemStack(wrapperContained.copyAndEmpty()); }
public boolean isIn(yarnwrap.registry.entry.RegistryEntryList registryEntryList) { return wrapperContained.isIn(registryEntryList.wrapperContained); }
public void onCraftByCrafter(yarnwrap.world.World world) { wrapperContained.onCraftByCrafter(world.wrapperContained); }
// public void method_56097(yarnwrap.entity.LivingEntity item) { wrapperContained.method_56097(item.wrapperContained); }
// public java.util.Optional method_56700(yarnwrap.item.ItemStack stack) { return wrapperContained.method_56700(stack.wrapperContained); }
public yarnwrap.item.ItemStack copyComponentsToNewStack(yarnwrap.item.ItemConvertible item,int count) { return new yarnwrap.item.ItemStack(wrapperContained.copyComponentsToNewStack(item.wrapperContained,count)); }
public com.mojang.serialization.MapCodec createOptionalCodec(java.lang.String fieldName) { return wrapperContained.createOptionalCodec(fieldName); }
// public yarnwrap.item.ItemStack method_56703(java.util.Optional optional) { return new yarnwrap.item.ItemStack(wrapperContained.method_56703(optional)); }
// public yarnwrap.item.ItemStack copyComponentsToNewStackIgnoreEmpty(yarnwrap.item.ItemConvertible item,int count) { return new yarnwrap.item.ItemStack(wrapperContained.copyComponentsToNewStackIgnoreEmpty(item.wrapperContained,count)); }
public void decrementUnlessCreative(int amount,yarnwrap.entity.LivingEntity entity) { wrapperContained.decrementUnlessCreative(amount,entity.wrapperContained); }
public yarnwrap.sound.SoundEvent getBreakSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBreakSound()); }
public void applyAttributeModifiers(yarnwrap.entity.EquipmentSlot slot,java.util.function.BiConsumer attributeModifierConsumer) { wrapperContained.applyAttributeModifiers(slot.wrapperContained,attributeModifierConsumer); }
public int hashCode(yarnwrap.item.ItemStack stack) { return wrapperContained.hashCode(stack.wrapperContained); }
// public void method_57356(yarnwrap.registry.entry.RegistryEntry builder) { wrapperContained.method_57356(builder.wrapperContained); }
public boolean canPlaceOn(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.canPlaceOn(pos.wrapperContained); }
// public yarnwrap.nbt.NbtElement encode(Object registries) { return new yarnwrap.nbt.NbtElement(wrapperContained.encode(registries)); }
// public yarnwrap.item.ItemStack fromNbtOrEmpty(Object registries,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.item.ItemStack(wrapperContained.fromNbtOrEmpty(registries,nbt.wrapperContained)); }
// public java.util.Optional fromNbt(Object registries,yarnwrap.nbt.NbtElement nbt) { return wrapperContained.fromNbt(registries,nbt.wrapperContained); }
public int listHashCode(java.util.List stacks) { return wrapperContained.listHashCode(stacks); }
public boolean stacksEqual(java.util.List left,java.util.List right) { return wrapperContained.stacksEqual(left,right); }
// public void appendAttributeModifiersTooltip(java.util.function.Consumer textConsumer,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.appendAttributeModifiersTooltip(textConsumer,player.wrapperContained); }
// public void appendAttributeModifierTooltip(java.util.function.Consumer textConsumer,yarnwrap.entity.player.PlayerEntity player,yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.appendAttributeModifierTooltip(textConsumer,player.wrapperContained,attribute.wrapperContained,modifier.wrapperContained); }
public void applyComponentsFrom(yarnwrap.component.ComponentMap components) { wrapperContained.applyComponentsFrom(components.wrapperContained); }
public void applyUnvalidatedChanges(yarnwrap.component.ComponentChanges changes) { wrapperContained.applyUnvalidatedChanges(changes.wrapperContained); }
public java.lang.Object apply(yarnwrap.component.ComponentType type,java.lang.Object defaultValue,java.lang.Object change,java.util.function.BiFunction applier) { return wrapperContained.apply(type.wrapperContained,defaultValue,change,applier); }
public java.lang.Object apply(yarnwrap.component.ComponentType type,java.lang.Object defaultValue,java.util.function.UnaryOperator applier) { return wrapperContained.apply(type.wrapperContained,defaultValue,applier); }
// public void appendTooltip(yarnwrap.component.ComponentType componentType,Object context,java.util.function.Consumer textConsumer,yarnwrap.item.tooltip.TooltipType type) { wrapperContained.appendTooltip(componentType.wrapperContained,context,textConsumer,type.wrapperContained); }
// public void method_57370(org.apache.commons.lang3.mutable.MutableBoolean attribute,java.util.function.Consumer modifier) { wrapperContained.method_57370(attribute,modifier); }
// public com.mojang.datafixers.kinds.App method_57371(Object instance) { return wrapperContained.method_57371(instance); }
// public com.mojang.serialization.DataResult validate(yarnwrap.item.ItemStack stack) { return wrapperContained.validate(stack.wrapperContained); }
public boolean canBreak(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.canBreak(pos.wrapperContained); }
// public com.mojang.serialization.DataResult method_57374(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.method_57374(entry.wrapperContained); }
// public yarnwrap.nbt.NbtElement encodeAllowEmpty(Object registries) { return new yarnwrap.nbt.NbtElement(wrapperContained.encodeAllowEmpty(registries)); }
// public yarnwrap.nbt.NbtElement encode(Object registries,yarnwrap.nbt.NbtElement prefix) { return new yarnwrap.nbt.NbtElement(wrapperContained.encode(registries,prefix.wrapperContained)); }
// public void method_57377(java.lang.String error) { wrapperContained.method_57377(error); }
// public yarnwrap.item.ItemStack method_57378(java.util.Optional optional) { return new yarnwrap.item.ItemStack(wrapperContained.method_57378(optional)); }
public java.lang.Object set(yarnwrap.component.ComponentType type,java.lang.Object value) { return wrapperContained.set(type.wrapperContained,value); }
public yarnwrap.component.ComponentChanges getComponentChanges() { return new yarnwrap.component.ComponentChanges(wrapperContained.getComponentChanges()); }
public java.lang.Object remove(yarnwrap.component.ComponentType type) { return wrapperContained.remove(type.wrapperContained); }
// public java.util.Optional method_57382(yarnwrap.item.ItemStack stack) { return wrapperContained.method_57382(stack.wrapperContained); }
// public yarnwrap.item.ItemStack method_57383(yarnwrap.item.ItemStack v) { return new yarnwrap.item.ItemStack(wrapperContained.method_57383(v.wrapperContained)); }
// public yarnwrap.component.ComponentChanges method_57385(yarnwrap.item.ItemStack stack) { return new yarnwrap.component.ComponentChanges(wrapperContained.method_57385(stack.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_58092(Object instance) { return wrapperContained.method_58092(instance); }
// public yarnwrap.item.ItemStack method_58093(yarnwrap.registry.entry.RegistryEntry item,yarnwrap.component.ComponentChanges components) { return new yarnwrap.item.ItemStack(wrapperContained.method_58093(item.wrapperContained,components.wrapperContained)); }
// public yarnwrap.component.ComponentChanges method_58094(yarnwrap.item.ItemStack stack) { return new yarnwrap.component.ComponentChanges(wrapperContained.method_58094(stack.wrapperContained)); }
public boolean takesDamageFrom(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.takesDamageFrom(source.wrapperContained); }
public void capCount(int maxCount) { wrapperContained.capCount(maxCount); }
public yarnwrap.component.type.ItemEnchantmentsComponent getEnchantments() { return new yarnwrap.component.type.ItemEnchantmentsComponent(wrapperContained.getEnchantments()); }
public yarnwrap.component.ComponentMap getDefaultComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.getDefaultComponents()); }
public com.mojang.serialization.DataResult validateComponents(yarnwrap.component.ComponentMap components) { return wrapperContained.validateComponents(components.wrapperContained); }
public void applyChanges(yarnwrap.component.ComponentChanges changes) { wrapperContained.applyChanges(changes.wrapperContained); }
public yarnwrap.network.codec.PacketCodec createExtraValidatingPacketCodec(yarnwrap.network.codec.PacketCodec basePacketCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createExtraValidatingPacketCodec(basePacketCodec.wrapperContained)); }
public void postDamageEntity(yarnwrap.entity.LivingEntity target,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.postDamageEntity(target.wrapperContained,player.wrapperContained); }
public yarnwrap.item.ItemStack withItem(yarnwrap.item.ItemConvertible item) { return new yarnwrap.item.ItemStack(wrapperContained.withItem(item.wrapperContained)); }
public yarnwrap.item.ItemStack splitUnlessCreative(int amount,yarnwrap.entity.LivingEntity entity) { return new yarnwrap.item.ItemStack(wrapperContained.splitUnlessCreative(amount,entity.wrapperContained)); }
public void applyAttributeModifier(yarnwrap.component.type.AttributeModifierSlot slot,java.util.function.BiConsumer attributeModifierConsumer) { wrapperContained.applyAttributeModifier(slot.wrapperContained,attributeModifierConsumer); }
public yarnwrap.item.ItemStack damage(int amount,yarnwrap.item.ItemConvertible itemAfterBreaking,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.damage(amount,itemAfterBreaking.wrapperContained,entity.wrapperContained,slot.wrapperContained)); }
public yarnwrap.item.Item getItem() { return new yarnwrap.item.Item(wrapperContained.getItem()); }
public yarnwrap.item.ItemStack finishUsing(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user) { return new yarnwrap.item.ItemStack(wrapperContained.finishUsing(world.wrapperContained,user.wrapperContained)); }
public void setBobbingAnimationTime(int bobbingAnimationTime) { wrapperContained.setBobbingAnimationTime(bobbingAnimationTime); }
public yarnwrap.util.TypedActionResult use(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity user,yarnwrap.util.Hand hand) { return new yarnwrap.util.TypedActionResult(wrapperContained.use(world.wrapperContained,user.wrapperContained,hand.wrapperContained)); }
public int getMaxCount() { return wrapperContained.getMaxCount(); }
public void inventoryTick(yarnwrap.world.World world,yarnwrap.entity.Entity entity,int slot,boolean selected) { wrapperContained.inventoryTick(world.wrapperContained,entity.wrapperContained,slot,selected); }
public int getDamage() { return wrapperContained.getDamage(); }
public yarnwrap.util.ActionResult useOnEntity(yarnwrap.entity.player.PlayerEntity user,yarnwrap.entity.LivingEntity entity,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.useOnEntity(user.wrapperContained,entity.wrapperContained,hand.wrapperContained)); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
public boolean isEnchantable() { return wrapperContained.isEnchantable(); }
public float getMiningSpeedMultiplier(yarnwrap.block.BlockState state) { return wrapperContained.getMiningSpeedMultiplier(state.wrapperContained); }
public void onStoppedUsing(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,int remainingUseTicks) { wrapperContained.onStoppedUsing(world.wrapperContained,user.wrapperContained,remainingUseTicks); }
public yarnwrap.util.Rarity getRarity() { return new yarnwrap.util.Rarity(wrapperContained.getRarity()); }
public void increment(int amount) { wrapperContained.increment(amount); }
public void decrement(int amount) { wrapperContained.decrement(amount); }
public int getMaxUseTime(yarnwrap.entity.LivingEntity user) { return wrapperContained.getMaxUseTime(user.wrapperContained); }
public int getMaxDamage() { return wrapperContained.getMaxDamage(); }
public void setCount(int count) { wrapperContained.setCount(count); }
public boolean hasEnchantments() { return wrapperContained.hasEnchantments(); }
public yarnwrap.entity.decoration.ItemFrameEntity getFrame() { return new yarnwrap.entity.decoration.ItemFrameEntity(wrapperContained.getFrame()); }
public boolean isStackable() { return wrapperContained.isStackable(); }
public int getCount() { return wrapperContained.getCount(); }
public void usageTick(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,int remainingUseTicks) { wrapperContained.usageTick(world.wrapperContained,user.wrapperContained,remainingUseTicks); }
// public java.util.List getTooltip(Object context,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.tooltip.TooltipType type) { return wrapperContained.getTooltip(context,player.wrapperContained,type.wrapperContained); }
public boolean isSuitableFor(yarnwrap.block.BlockState state) { return wrapperContained.isSuitableFor(state.wrapperContained); }
public void postMine(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity miner) { wrapperContained.postMine(world.wrapperContained,state.wrapperContained,pos.wrapperContained,miner.wrapperContained); }
public yarnwrap.text.Text toHoverableText() { return new yarnwrap.text.Text(wrapperContained.toHoverableText()); }
public void damage(int amount,yarnwrap.server.world.ServerWorld world,yarnwrap.server.network.ServerPlayerEntity player,java.util.function.Consumer breakCallback) { wrapperContained.damage(amount,world.wrapperContained,player.wrapperContained,breakCallback); }
public boolean hasGlint() { return wrapperContained.hasGlint(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public boolean isInFrame() { return wrapperContained.isInFrame(); }
public boolean isDamageable() { return wrapperContained.isDamageable(); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
public int getBobbingAnimationTime() { return wrapperContained.getBobbingAnimationTime(); }
// public yarnwrap.text.Style method_7966(yarnwrap.text.Style style) { return new yarnwrap.text.Style(wrapperContained.method_7966(style.wrapperContained)); }
public boolean isUsedOnRelease() { return wrapperContained.isUsedOnRelease(); }
public void damage(int amount,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot) { wrapperContained.damage(amount,entity.wrapperContained,slot.wrapperContained); }
public yarnwrap.item.ItemStack split(int amount) { return new yarnwrap.item.ItemStack(wrapperContained.split(amount)); }
public yarnwrap.item.ItemStack copy() { return new yarnwrap.item.ItemStack(wrapperContained.copy()); }
public boolean areEqual(yarnwrap.item.ItemStack left,yarnwrap.item.ItemStack right) { return wrapperContained.areEqual(left.wrapperContained,right.wrapperContained); }
public void setDamage(int damage) { wrapperContained.setDamage(damage); }
public yarnwrap.util.UseAction getUseAction() { return new yarnwrap.util.UseAction(wrapperContained.getUseAction()); }
public void addEnchantment(yarnwrap.registry.entry.RegistryEntry enchantment,int level) { wrapperContained.addEnchantment(enchantment.wrapperContained,level); }
public boolean postHit(yarnwrap.entity.LivingEntity target,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.postHit(target.wrapperContained,player.wrapperContained); }
public yarnwrap.util.ActionResult useOnBlock(yarnwrap.item.ItemUsageContext context) { return new yarnwrap.util.ActionResult(wrapperContained.useOnBlock(context.wrapperContained)); }
public void onCraftByPlayer(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,int amount) { wrapperContained.onCraftByPlayer(world.wrapperContained,player.wrapperContained,amount); }
public boolean areItemsEqual(yarnwrap.item.ItemStack left,yarnwrap.item.ItemStack right) { return wrapperContained.areItemsEqual(left.wrapperContained,right.wrapperContained); }
public boolean isDamaged() { return wrapperContained.isDamaged(); }

}