package yarnwrap.item;
public class Item { public net.minecraft.item.Item wrapperContained; public Item(net.minecraft.item.Item wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public int DEFAULT_MAX_COUNT() { return wrapperContained.DEFAULT_MAX_COUNT; }
// public void DEFAULT_MAX_COUNT(int value) { wrapperContained.DEFAULT_MAX_COUNT = value; }
public int ITEM_BAR_STEPS() { return wrapperContained.ITEM_BAR_STEPS; }
// public void ITEM_BAR_STEPS(int value) { wrapperContained.ITEM_BAR_STEPS = value; }
// public Object registryEntry() { return wrapperContained.registryEntry; }
// // public void registryEntry(Object value) { wrapperContained.registryEntry = value; }
// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public yarnwrap.component.ComponentMap components() { return new yarnwrap.component.ComponentMap(wrapperContained.components); }
// public void components(yarnwrap.component.ComponentMap value) { wrapperContained.components = value.wrapperContained; }
public int MAX_MAX_COUNT() { return wrapperContained.MAX_MAX_COUNT; }
// public void MAX_MAX_COUNT(int value) { wrapperContained.MAX_MAX_COUNT = value; }
public yarnwrap.util.Identifier BASE_ATTACK_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.BASE_ATTACK_SPEED_MODIFIER_ID); }
// public void BASE_ATTACK_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.BASE_ATTACK_SPEED_MODIFIER_ID = value.wrapperContained; }
public java.util.Map BLOCK_ITEMS() { return wrapperContained.BLOCK_ITEMS; }
// public void BLOCK_ITEMS(java.util.Map value) { wrapperContained.BLOCK_ITEMS = value; }
public yarnwrap.util.Identifier BASE_ATTACK_DAMAGE_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.BASE_ATTACK_DAMAGE_MODIFIER_ID); }
// public void BASE_ATTACK_DAMAGE_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.BASE_ATTACK_DAMAGE_MODIFIER_ID = value.wrapperContained; }
// public yarnwrap.item.Item recipeRemainder() { return new yarnwrap.item.Item(wrapperContained.recipeRemainder); }
// public void recipeRemainder(yarnwrap.item.Item value) { wrapperContained.recipeRemainder = value.wrapperContained; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public Item(Object settings) { this.wrapperContained = new net.minecraft.item.Item(settings); }
public boolean isNetworkSynced() { return wrapperContained.isNetworkSynced(); }
public yarnwrap.sound.SoundEvent getEatSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getEatSound()); }
public yarnwrap.sound.SoundEvent getDrinkSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getDrinkSound()); }
public boolean onStackClicked(yarnwrap.item.ItemStack stack,yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.onStackClicked(stack.wrapperContained,slot.wrapperContained,clickType.wrapperContained,player.wrapperContained); }
public boolean onClicked(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack otherStack,yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.StackReference cursorStackReference) { return wrapperContained.onClicked(stack.wrapperContained,otherStack.wrapperContained,slot.wrapperContained,clickType.wrapperContained,player.wrapperContained,cursorStackReference.wrapperContained); }
public boolean isItemBarVisible(yarnwrap.item.ItemStack stack) { return wrapperContained.isItemBarVisible(stack.wrapperContained); }
public boolean canBeNested() { return wrapperContained.canBeNested(); }
public int getItemBarStep(yarnwrap.item.ItemStack stack) { return wrapperContained.getItemBarStep(stack.wrapperContained); }
public int getItemBarColor(yarnwrap.item.ItemStack stack) { return wrapperContained.getItemBarColor(stack.wrapperContained); }
public java.util.Optional getTooltipData(yarnwrap.item.ItemStack stack) { return wrapperContained.getTooltipData(stack.wrapperContained); }
public void onItemEntityDestroyed(yarnwrap.entity.ItemEntity entity) { wrapperContained.onItemEntityDestroyed(entity.wrapperContained); }
public Object getRegistryEntry() { return wrapperContained.getRegistryEntry(); }
public void onCraftByPlayer(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onCraftByPlayer(stack.wrapperContained,world.wrapperContained,player.wrapperContained); }
public yarnwrap.sound.SoundEvent getBreakSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBreakSound()); }
public yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.getComponents()); }
public float getBonusAttackDamage(yarnwrap.entity.Entity target,float baseAttackDamage,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.getBonusAttackDamage(target.wrapperContained,baseAttackDamage,damageSource.wrapperContained); }
public float getMiningSpeed(yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state) { return wrapperContained.getMiningSpeed(stack.wrapperContained,state.wrapperContained); }
public boolean isCorrectForDrops(yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state) { return wrapperContained.isCorrectForDrops(stack.wrapperContained,state.wrapperContained); }
public void postDamageEntity(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity target,yarnwrap.entity.LivingEntity attacker) { wrapperContained.postDamageEntity(stack.wrapperContained,target.wrapperContained,attacker.wrapperContained); }
public yarnwrap.util.TypedActionResult use(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity user,yarnwrap.util.Hand hand) { return new yarnwrap.util.TypedActionResult(wrapperContained.use(world.wrapperContained,user.wrapperContained,hand.wrapperContained)); }
public int getEnchantability() { return wrapperContained.getEnchantability(); }
public boolean isUsedOnRelease(yarnwrap.item.ItemStack stack) { return wrapperContained.isUsedOnRelease(stack.wrapperContained); }
public void onStoppedUsing(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,int remainingUseTicks) { wrapperContained.onStoppedUsing(stack.wrapperContained,world.wrapperContained,user.wrapperContained,remainingUseTicks); }
public void onCraft(yarnwrap.item.ItemStack stack,yarnwrap.world.World world) { wrapperContained.onCraft(stack.wrapperContained,world.wrapperContained); }
public yarnwrap.component.type.AttributeModifiersComponent getAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.getAttributeModifiers()); }
public yarnwrap.util.ActionResult useOnEntity(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity user,yarnwrap.entity.LivingEntity entity,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.useOnEntity(stack.wrapperContained,user.wrapperContained,entity.wrapperContained,hand.wrapperContained)); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public void appendTooltip(yarnwrap.item.ItemStack stack,Object context,java.util.List tooltip,yarnwrap.item.tooltip.TooltipType type) { wrapperContained.appendTooltip(stack.wrapperContained,context,tooltip,type.wrapperContained); }
public void usageTick(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,int remainingUseTicks) { wrapperContained.usageTick(world.wrapperContained,user.wrapperContained,stack.wrapperContained,remainingUseTicks); }
public yarnwrap.util.UseAction getUseAction(yarnwrap.item.ItemStack stack) { return new yarnwrap.util.UseAction(wrapperContained.getUseAction(stack.wrapperContained)); }
public yarnwrap.item.ItemStack getDefaultStack() { return new yarnwrap.item.ItemStack(wrapperContained.getDefaultStack()); }
public boolean hasRecipeRemainder() { return wrapperContained.hasRecipeRemainder(); }
public yarnwrap.item.Item getRecipeRemainder() { return new yarnwrap.item.Item(wrapperContained.getRecipeRemainder()); }
public void postProcessComponents(yarnwrap.item.ItemStack stack) { wrapperContained.postProcessComponents(stack.wrapperContained); }
public yarnwrap.item.ItemStack finishUsing(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.LivingEntity user) { return new yarnwrap.item.ItemStack(wrapperContained.finishUsing(stack.wrapperContained,world.wrapperContained,user.wrapperContained)); }
public yarnwrap.text.Text getName(yarnwrap.item.ItemStack stack) { return new yarnwrap.text.Text(wrapperContained.getName(stack.wrapperContained)); }
public java.lang.String getTranslationKey(yarnwrap.item.ItemStack stack) { return wrapperContained.getTranslationKey(stack.wrapperContained); }
public yarnwrap.item.Item fromBlock(yarnwrap.block.Block block) { return new yarnwrap.item.Item(wrapperContained.fromBlock(block.wrapperContained)); }
// public java.lang.String getOrCreateTranslationKey() { return wrapperContained.getOrCreateTranslationKey(); }
public boolean isEnchantable(yarnwrap.item.ItemStack stack) { return wrapperContained.isEnchantable(stack.wrapperContained); }
// public yarnwrap.util.hit.BlockHitResult raycast(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,Object fluidHandling) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.raycast(world.wrapperContained,player.wrapperContained,fluidHandling)); }
public boolean postHit(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity target,yarnwrap.entity.LivingEntity attacker) { return wrapperContained.postHit(stack.wrapperContained,target.wrapperContained,attacker.wrapperContained); }
public yarnwrap.item.Item byRawId(int id) { return new yarnwrap.item.Item(wrapperContained.byRawId(id)); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
public boolean canRepair(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack ingredient) { return wrapperContained.canRepair(stack.wrapperContained,ingredient.wrapperContained); }
public boolean postMine(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity miner) { return wrapperContained.postMine(stack.wrapperContained,world.wrapperContained,state.wrapperContained,pos.wrapperContained,miner.wrapperContained); }
public int getRawId(yarnwrap.item.Item item) { return wrapperContained.getRawId(item.wrapperContained); }
public int getMaxUseTime(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user) { return wrapperContained.getMaxUseTime(stack.wrapperContained,user.wrapperContained); }
public int getMaxCount() { return wrapperContained.getMaxCount(); }
public yarnwrap.util.ActionResult useOnBlock(yarnwrap.item.ItemUsageContext context) { return new yarnwrap.util.ActionResult(wrapperContained.useOnBlock(context.wrapperContained)); }
public boolean canMine(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity miner) { return wrapperContained.canMine(state.wrapperContained,world.wrapperContained,pos.wrapperContained,miner.wrapperContained); }
public boolean hasGlint(yarnwrap.item.ItemStack stack) { return wrapperContained.hasGlint(stack.wrapperContained); }
public void inventoryTick(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.Entity entity,int slot,boolean selected) { wrapperContained.inventoryTick(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,slot,selected); }

}