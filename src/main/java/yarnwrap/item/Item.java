package yarnwrap.item;
public class Item { public net.minecraft.item.Item wrapperContained; public Item(net.minecraft.item.Item wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.item.Item.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.item.Item.LOGGER = value; }

// public int DEFAULT_MAX_COUNT() { return wrapperContained.DEFAULT_MAX_COUNT; }
// public void DEFAULT_MAX_COUNT(int value) { wrapperContained.DEFAULT_MAX_COUNT = value; }
public static int DEFAULT_MAX_COUNT() { return net.minecraft.item.Item.DEFAULT_MAX_COUNT; }
// public static void DEFAULT_MAX_COUNT(int value, ) { net.minecraft.item.Item.DEFAULT_MAX_COUNT = value; }

// public int ITEM_BAR_STEPS() { return wrapperContained.ITEM_BAR_STEPS; }
// public void ITEM_BAR_STEPS(int value) { wrapperContained.ITEM_BAR_STEPS = value; }
public static int ITEM_BAR_STEPS() { return net.minecraft.item.Item.ITEM_BAR_STEPS; }
// public static void ITEM_BAR_STEPS(int value, ) { net.minecraft.item.Item.ITEM_BAR_STEPS = value; }

// public Object registryEntry() { return wrapperContained.registryEntry; }
// // public void registryEntry(Object value) { wrapperContained.registryEntry = value; }
// // public static Object registryEntry() { return net.minecraft.item.Item.registryEntry; }
// // public static void registryEntry(Object value, ) { net.minecraft.item.Item.registryEntry = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.item.Item.requiredFeatures); }
// public static void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.item.Item.requiredFeatures = value.wrapperContained; }

// public yarnwrap.component.ComponentMap components() { return new yarnwrap.component.ComponentMap(wrapperContained.components); }
// public void components(yarnwrap.component.ComponentMap value) { wrapperContained.components = value.wrapperContained; }
// public static yarnwrap.component.ComponentMap components() { return new yarnwrap.component.ComponentMap(net.minecraft.item.Item.components); }
// public static void components(yarnwrap.component.ComponentMap value, ) { net.minecraft.item.Item.components = value.wrapperContained; }

// public int MAX_MAX_COUNT() { return wrapperContained.MAX_MAX_COUNT; }
// public void MAX_MAX_COUNT(int value) { wrapperContained.MAX_MAX_COUNT = value; }
public static int MAX_MAX_COUNT() { return net.minecraft.item.Item.MAX_MAX_COUNT; }
// public static void MAX_MAX_COUNT(int value, ) { net.minecraft.item.Item.MAX_MAX_COUNT = value; }

// public yarnwrap.util.Identifier BASE_ATTACK_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.BASE_ATTACK_SPEED_MODIFIER_ID); }
// public void BASE_ATTACK_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.BASE_ATTACK_SPEED_MODIFIER_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier BASE_ATTACK_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(net.minecraft.item.Item.BASE_ATTACK_SPEED_MODIFIER_ID); }
// public static void BASE_ATTACK_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.item.Item.BASE_ATTACK_SPEED_MODIFIER_ID = value.wrapperContained; }

// public java.util.Map BLOCK_ITEMS() { return wrapperContained.BLOCK_ITEMS; }
// public void BLOCK_ITEMS(java.util.Map value) { wrapperContained.BLOCK_ITEMS = value; }
public static java.util.Map BLOCK_ITEMS() { return net.minecraft.item.Item.BLOCK_ITEMS; }
// public static void BLOCK_ITEMS(java.util.Map value, ) { net.minecraft.item.Item.BLOCK_ITEMS = value; }

// public yarnwrap.util.Identifier BASE_ATTACK_DAMAGE_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.BASE_ATTACK_DAMAGE_MODIFIER_ID); }
// public void BASE_ATTACK_DAMAGE_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.BASE_ATTACK_DAMAGE_MODIFIER_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier BASE_ATTACK_DAMAGE_MODIFIER_ID() { return new yarnwrap.util.Identifier(net.minecraft.item.Item.BASE_ATTACK_DAMAGE_MODIFIER_ID); }
// public static void BASE_ATTACK_DAMAGE_MODIFIER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.item.Item.BASE_ATTACK_DAMAGE_MODIFIER_ID = value.wrapperContained; }

// public yarnwrap.item.Item recipeRemainder() { return new yarnwrap.item.Item(wrapperContained.recipeRemainder); }
// public void recipeRemainder(yarnwrap.item.Item value) { wrapperContained.recipeRemainder = value.wrapperContained; }
// public static yarnwrap.item.Item recipeRemainder() { return new yarnwrap.item.Item(net.minecraft.item.Item.recipeRemainder); }
// public static void recipeRemainder(yarnwrap.item.Item value, ) { net.minecraft.item.Item.recipeRemainder = value.wrapperContained; }

// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public static java.lang.String translationKey() { return net.minecraft.item.Item.translationKey; }
// public static void translationKey(java.lang.String value, ) { net.minecraft.item.Item.translationKey = value; }

// public Item(Object settings) { this.wrapperContained = new net.minecraft.item.Item(settings); }
public boolean isNetworkSynced() { return wrapperContained.isNetworkSynced(); }
// public static boolean isNetworkSynced() { return net.minecraft.item.Item.isNetworkSynced(); }
public yarnwrap.sound.SoundEvent getEatSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getEatSound()); }
// public static yarnwrap.sound.SoundEvent getEatSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.item.Item.getEatSound()); }
public yarnwrap.sound.SoundEvent getDrinkSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getDrinkSound()); }
// public static yarnwrap.sound.SoundEvent getDrinkSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.item.Item.getDrinkSound()); }
public boolean onStackClicked(yarnwrap.item.ItemStack stack,yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.onStackClicked(stack.wrapperContained,slot.wrapperContained,clickType.wrapperContained,player.wrapperContained); }
// public static boolean onStackClicked(yarnwrap.item.ItemStack stack,yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.item.Item.onStackClicked(stack.wrapperContained,slot.wrapperContained,clickType.wrapperContained,player.wrapperContained); }
public boolean onClicked(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack otherStack,yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.StackReference cursorStackReference) { return wrapperContained.onClicked(stack.wrapperContained,otherStack.wrapperContained,slot.wrapperContained,clickType.wrapperContained,player.wrapperContained,cursorStackReference.wrapperContained); }
// public static boolean onClicked(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack otherStack,yarnwrap.screen.slot.Slot slot,yarnwrap.util.ClickType clickType,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.StackReference cursorStackReference, ) { return net.minecraft.item.Item.onClicked(stack.wrapperContained,otherStack.wrapperContained,slot.wrapperContained,clickType.wrapperContained,player.wrapperContained,cursorStackReference.wrapperContained); }
public boolean isItemBarVisible(yarnwrap.item.ItemStack stack) { return wrapperContained.isItemBarVisible(stack.wrapperContained); }
// public static boolean isItemBarVisible(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.Item.isItemBarVisible(stack.wrapperContained); }
public boolean canBeNested() { return wrapperContained.canBeNested(); }
// public static boolean canBeNested() { return net.minecraft.item.Item.canBeNested(); }
public int getItemBarStep(yarnwrap.item.ItemStack stack) { return wrapperContained.getItemBarStep(stack.wrapperContained); }
// public static int getItemBarStep(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.Item.getItemBarStep(stack.wrapperContained); }
public int getItemBarColor(yarnwrap.item.ItemStack stack) { return wrapperContained.getItemBarColor(stack.wrapperContained); }
// public static int getItemBarColor(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.Item.getItemBarColor(stack.wrapperContained); }
public java.util.Optional getTooltipData(yarnwrap.item.ItemStack stack) { return wrapperContained.getTooltipData(stack.wrapperContained); }
// public static java.util.Optional getTooltipData(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.Item.getTooltipData(stack.wrapperContained); }
public void onItemEntityDestroyed(yarnwrap.entity.ItemEntity entity) { wrapperContained.onItemEntityDestroyed(entity.wrapperContained); }
// public static void onItemEntityDestroyed(yarnwrap.entity.ItemEntity entity, ) { net.minecraft.item.Item.onItemEntityDestroyed(entity.wrapperContained); }
public Object getRegistryEntry() { return wrapperContained.getRegistryEntry(); }
// public static Object getRegistryEntry() { return net.minecraft.item.Item.getRegistryEntry(); }
public void onCraftByPlayer(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onCraftByPlayer(stack.wrapperContained,world.wrapperContained,player.wrapperContained); }
// public static void onCraftByPlayer(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.item.Item.onCraftByPlayer(stack.wrapperContained,world.wrapperContained,player.wrapperContained); }
public yarnwrap.sound.SoundEvent getBreakSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBreakSound()); }
// public static yarnwrap.sound.SoundEvent getBreakSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.item.Item.getBreakSound()); }
public yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.getComponents()); }
// public static yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(net.minecraft.item.Item.getComponents()); }
public float getBonusAttackDamage(yarnwrap.entity.Entity target,float baseAttackDamage,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.getBonusAttackDamage(target.wrapperContained,baseAttackDamage,damageSource.wrapperContained); }
// public static float getBonusAttackDamage(yarnwrap.entity.Entity target,float baseAttackDamage,yarnwrap.entity.damage.DamageSource damageSource, ) { return net.minecraft.item.Item.getBonusAttackDamage(target.wrapperContained,baseAttackDamage,damageSource.wrapperContained); }
public float getMiningSpeed(yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state) { return wrapperContained.getMiningSpeed(stack.wrapperContained,state.wrapperContained); }
// public static float getMiningSpeed(yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state, ) { return net.minecraft.item.Item.getMiningSpeed(stack.wrapperContained,state.wrapperContained); }
public boolean isCorrectForDrops(yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state) { return wrapperContained.isCorrectForDrops(stack.wrapperContained,state.wrapperContained); }
// public static boolean isCorrectForDrops(yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state, ) { return net.minecraft.item.Item.isCorrectForDrops(stack.wrapperContained,state.wrapperContained); }
public void postDamageEntity(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity target,yarnwrap.entity.LivingEntity attacker) { wrapperContained.postDamageEntity(stack.wrapperContained,target.wrapperContained,attacker.wrapperContained); }
// public static void postDamageEntity(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity target,yarnwrap.entity.LivingEntity attacker, ) { net.minecraft.item.Item.postDamageEntity(stack.wrapperContained,target.wrapperContained,attacker.wrapperContained); }
public yarnwrap.util.TypedActionResult use(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity user,yarnwrap.util.Hand hand) { return new yarnwrap.util.TypedActionResult(wrapperContained.use(world.wrapperContained,user.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.TypedActionResult use(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity user,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.TypedActionResult(net.minecraft.item.Item.use(world.wrapperContained,user.wrapperContained,hand.wrapperContained)); }
public int getEnchantability() { return wrapperContained.getEnchantability(); }
// public static int getEnchantability() { return net.minecraft.item.Item.getEnchantability(); }
public boolean isUsedOnRelease(yarnwrap.item.ItemStack stack) { return wrapperContained.isUsedOnRelease(stack.wrapperContained); }
// public static boolean isUsedOnRelease(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.Item.isUsedOnRelease(stack.wrapperContained); }
public void onStoppedUsing(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,int remainingUseTicks) { wrapperContained.onStoppedUsing(stack.wrapperContained,world.wrapperContained,user.wrapperContained,remainingUseTicks); }
// public static void onStoppedUsing(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,int remainingUseTicks, ) { net.minecraft.item.Item.onStoppedUsing(stack.wrapperContained,world.wrapperContained,user.wrapperContained,remainingUseTicks); }
public void onCraft(yarnwrap.item.ItemStack stack,yarnwrap.world.World world) { wrapperContained.onCraft(stack.wrapperContained,world.wrapperContained); }
// public static void onCraft(yarnwrap.item.ItemStack stack,yarnwrap.world.World world, ) { net.minecraft.item.Item.onCraft(stack.wrapperContained,world.wrapperContained); }
public yarnwrap.component.type.AttributeModifiersComponent getAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.getAttributeModifiers()); }
// public static yarnwrap.component.type.AttributeModifiersComponent getAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.item.Item.getAttributeModifiers()); }
public yarnwrap.util.ActionResult useOnEntity(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity user,yarnwrap.entity.LivingEntity entity,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.useOnEntity(stack.wrapperContained,user.wrapperContained,entity.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult useOnEntity(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity user,yarnwrap.entity.LivingEntity entity,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.item.Item.useOnEntity(stack.wrapperContained,user.wrapperContained,entity.wrapperContained,hand.wrapperContained)); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.item.Item.getName()); }
// public void appendTooltip(yarnwrap.item.ItemStack stack,Object context,java.util.List tooltip,yarnwrap.item.tooltip.TooltipType type) { wrapperContained.appendTooltip(stack.wrapperContained,context,tooltip,type.wrapperContained); }
// public static void appendTooltip(yarnwrap.item.ItemStack stack,Object context,java.util.List tooltip,yarnwrap.item.tooltip.TooltipType type, ) { net.minecraft.item.Item.appendTooltip(stack.wrapperContained,context,tooltip,type.wrapperContained); }
public void usageTick(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,int remainingUseTicks) { wrapperContained.usageTick(world.wrapperContained,user.wrapperContained,stack.wrapperContained,remainingUseTicks); }
// public static void usageTick(yarnwrap.world.World world,yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,int remainingUseTicks, ) { net.minecraft.item.Item.usageTick(world.wrapperContained,user.wrapperContained,stack.wrapperContained,remainingUseTicks); }
public yarnwrap.util.UseAction getUseAction(yarnwrap.item.ItemStack stack) { return new yarnwrap.util.UseAction(wrapperContained.getUseAction(stack.wrapperContained)); }
// public static yarnwrap.util.UseAction getUseAction(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.util.UseAction(net.minecraft.item.Item.getUseAction(stack.wrapperContained)); }
public yarnwrap.item.ItemStack getDefaultStack() { return new yarnwrap.item.ItemStack(wrapperContained.getDefaultStack()); }
// public static yarnwrap.item.ItemStack getDefaultStack() { return new yarnwrap.item.ItemStack(net.minecraft.item.Item.getDefaultStack()); }
public boolean hasRecipeRemainder() { return wrapperContained.hasRecipeRemainder(); }
// public static boolean hasRecipeRemainder() { return net.minecraft.item.Item.hasRecipeRemainder(); }
public yarnwrap.item.Item getRecipeRemainder() { return new yarnwrap.item.Item(wrapperContained.getRecipeRemainder()); }
// public static yarnwrap.item.Item getRecipeRemainder() { return new yarnwrap.item.Item(net.minecraft.item.Item.getRecipeRemainder()); }
public void postProcessComponents(yarnwrap.item.ItemStack stack) { wrapperContained.postProcessComponents(stack.wrapperContained); }
// public static void postProcessComponents(yarnwrap.item.ItemStack stack, ) { net.minecraft.item.Item.postProcessComponents(stack.wrapperContained); }
public yarnwrap.item.ItemStack finishUsing(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.LivingEntity user) { return new yarnwrap.item.ItemStack(wrapperContained.finishUsing(stack.wrapperContained,world.wrapperContained,user.wrapperContained)); }
// public static yarnwrap.item.ItemStack finishUsing(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.LivingEntity user, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.Item.finishUsing(stack.wrapperContained,world.wrapperContained,user.wrapperContained)); }
public yarnwrap.text.Text getName(yarnwrap.item.ItemStack stack) { return new yarnwrap.text.Text(wrapperContained.getName(stack.wrapperContained)); }
// public static yarnwrap.text.Text getName(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.text.Text(net.minecraft.item.Item.getName(stack.wrapperContained)); }
public java.lang.String getTranslationKey(yarnwrap.item.ItemStack stack) { return wrapperContained.getTranslationKey(stack.wrapperContained); }
// public static java.lang.String getTranslationKey(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.Item.getTranslationKey(stack.wrapperContained); }
// public yarnwrap.item.Item fromBlock(yarnwrap.block.Block block) { return new yarnwrap.item.Item(wrapperContained.fromBlock(block.wrapperContained)); }
// public static yarnwrap.item.Item fromBlock(yarnwrap.block.Block block, ) { return new yarnwrap.item.Item(net.minecraft.item.Item.fromBlock(block.wrapperContained)); }
// public java.lang.String getOrCreateTranslationKey() { return wrapperContained.getOrCreateTranslationKey(); }
// public static java.lang.String getOrCreateTranslationKey() { return net.minecraft.item.Item.getOrCreateTranslationKey(); }
public boolean isEnchantable(yarnwrap.item.ItemStack stack) { return wrapperContained.isEnchantable(stack.wrapperContained); }
// public static boolean isEnchantable(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.Item.isEnchantable(stack.wrapperContained); }
// public yarnwrap.util.hit.BlockHitResult raycast(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,Object fluidHandling) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.raycast(world.wrapperContained,player.wrapperContained,fluidHandling)); }
// public static yarnwrap.util.hit.BlockHitResult raycast(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,Object fluidHandling, ) { return new yarnwrap.util.hit.BlockHitResult(net.minecraft.item.Item.raycast(world.wrapperContained,player.wrapperContained,fluidHandling)); }
public boolean postHit(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity target,yarnwrap.entity.LivingEntity attacker) { return wrapperContained.postHit(stack.wrapperContained,target.wrapperContained,attacker.wrapperContained); }
// public static boolean postHit(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity target,yarnwrap.entity.LivingEntity attacker, ) { return net.minecraft.item.Item.postHit(stack.wrapperContained,target.wrapperContained,attacker.wrapperContained); }
// public yarnwrap.item.Item byRawId(int id) { return new yarnwrap.item.Item(wrapperContained.byRawId(id)); }
// public static yarnwrap.item.Item byRawId(int id, ) { return new yarnwrap.item.Item(net.minecraft.item.Item.byRawId(id)); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public static java.lang.String getTranslationKey() { return net.minecraft.item.Item.getTranslationKey(); }
public boolean canRepair(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack ingredient) { return wrapperContained.canRepair(stack.wrapperContained,ingredient.wrapperContained); }
// public static boolean canRepair(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack ingredient, ) { return net.minecraft.item.Item.canRepair(stack.wrapperContained,ingredient.wrapperContained); }
public boolean postMine(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity miner) { return wrapperContained.postMine(stack.wrapperContained,world.wrapperContained,state.wrapperContained,pos.wrapperContained,miner.wrapperContained); }
// public static boolean postMine(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity miner, ) { return net.minecraft.item.Item.postMine(stack.wrapperContained,world.wrapperContained,state.wrapperContained,pos.wrapperContained,miner.wrapperContained); }
// public int getRawId(yarnwrap.item.Item item) { return wrapperContained.getRawId(item.wrapperContained); }
// public static int getRawId(yarnwrap.item.Item item, ) { return net.minecraft.item.Item.getRawId(item.wrapperContained); }
public int getMaxUseTime(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user) { return wrapperContained.getMaxUseTime(stack.wrapperContained,user.wrapperContained); }
// public static int getMaxUseTime(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user, ) { return net.minecraft.item.Item.getMaxUseTime(stack.wrapperContained,user.wrapperContained); }
public int getMaxCount() { return wrapperContained.getMaxCount(); }
// public static int getMaxCount() { return net.minecraft.item.Item.getMaxCount(); }
public yarnwrap.util.ActionResult useOnBlock(yarnwrap.item.ItemUsageContext context) { return new yarnwrap.util.ActionResult(wrapperContained.useOnBlock(context.wrapperContained)); }
// public static yarnwrap.util.ActionResult useOnBlock(yarnwrap.item.ItemUsageContext context, ) { return new yarnwrap.util.ActionResult(net.minecraft.item.Item.useOnBlock(context.wrapperContained)); }
public boolean canMine(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity miner) { return wrapperContained.canMine(state.wrapperContained,world.wrapperContained,pos.wrapperContained,miner.wrapperContained); }
// public static boolean canMine(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity miner, ) { return net.minecraft.item.Item.canMine(state.wrapperContained,world.wrapperContained,pos.wrapperContained,miner.wrapperContained); }
public boolean hasGlint(yarnwrap.item.ItemStack stack) { return wrapperContained.hasGlint(stack.wrapperContained); }
// public static boolean hasGlint(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.Item.hasGlint(stack.wrapperContained); }
public void inventoryTick(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.Entity entity,int slot,boolean selected) { wrapperContained.inventoryTick(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,slot,selected); }
// public static void inventoryTick(yarnwrap.item.ItemStack stack,yarnwrap.world.World world,yarnwrap.entity.Entity entity,int slot,boolean selected, ) { net.minecraft.item.Item.inventoryTick(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,slot,selected); }

}