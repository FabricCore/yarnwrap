package yarnwrap.server.command;
public class LootCommand { public net.minecraft.server.command.LootCommand wrapperContained; public LootCommand(net.minecraft.server.command.LootCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NO_HELD_ITEMS_EXCEPTION() { return wrapperContained.NO_HELD_ITEMS_EXCEPTION; }
// public void NO_HELD_ITEMS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NO_HELD_ITEMS_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType NO_HELD_ITEMS_EXCEPTION() { return net.minecraft.server.command.LootCommand.NO_HELD_ITEMS_EXCEPTION; }
// public static void NO_HELD_ITEMS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.server.command.LootCommand.NO_HELD_ITEMS_EXCEPTION = value; }

// public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUGGESTION_PROVIDER = value; }
public static com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return net.minecraft.server.command.LootCommand.SUGGESTION_PROVIDER; }
// public static void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value, ) { net.minecraft.server.command.LootCommand.SUGGESTION_PROVIDER = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NO_LOOT_TABLE_EXCEPTION() { return wrapperContained.NO_LOOT_TABLE_EXCEPTION; }
// public void NO_LOOT_TABLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NO_LOOT_TABLE_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType NO_LOOT_TABLE_EXCEPTION() { return net.minecraft.server.command.LootCommand.NO_LOOT_TABLE_EXCEPTION; }
// public static void NO_LOOT_TABLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.server.command.LootCommand.NO_LOOT_TABLE_EXCEPTION = value; }

// public int method_13177(Object context) { return wrapperContained.method_13177(context); }
// public static int method_13177(Object context, ) { return net.minecraft.server.command.LootCommand.method_13177(context); }
// public yarnwrap.item.ItemStack getHeldItem(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.getHeldItem(source.wrapperContained,slot.wrapperContained)); }
// public static yarnwrap.item.ItemStack getHeldItem(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.EquipmentSlot slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.server.command.LootCommand.getHeldItem(source.wrapperContained,slot.wrapperContained)); }
// public void method_13179(yarnwrap.server.world.ServerWorld stack) { wrapperContained.method_13179(stack.wrapperContained); }
// public static void method_13179(yarnwrap.server.world.ServerWorld stack, ) { net.minecraft.server.command.LootCommand.method_13179(stack.wrapperContained); }
// public int getFeedbackMessageSingle(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.entry.RegistryEntry lootTable,yarnwrap.loot.context.LootContextParameterSet lootContextParameters,Object constructor) { return wrapperContained.getFeedbackMessageSingle(context,lootTable.wrapperContained,lootContextParameters.wrapperContained,constructor); }
// public static int getFeedbackMessageSingle(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.entry.RegistryEntry lootTable,yarnwrap.loot.context.LootContextParameterSet lootContextParameters,Object constructor, ) { return net.minecraft.server.command.LootCommand.getFeedbackMessageSingle(context,lootTable.wrapperContained,lootContextParameters.wrapperContained,constructor); }
// public boolean method_13181(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13181(source.wrapperContained); }
// public static boolean method_13181(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.LootCommand.method_13181(source.wrapperContained); }
// public int method_13182(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender) { return wrapperContained.method_13182(context,stacks,messageSender); }
// public static int method_13182(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.method_13182(context,stacks,messageSender); }
// public int executeSpawn(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.Vec3d pos,java.util.List stacks,Object messageSender) { return wrapperContained.executeSpawn(source.wrapperContained,pos.wrapperContained,stacks,messageSender); }
// public static int executeSpawn(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.Vec3d pos,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.executeSpawn(source.wrapperContained,pos.wrapperContained,stacks,messageSender); }
// public void method_13184(yarnwrap.server.command.ServerCommandSource stacks) { wrapperContained.method_13184(stacks.wrapperContained); }
// public static void method_13184(yarnwrap.server.command.ServerCommandSource stacks, ) { net.minecraft.server.command.LootCommand.method_13184(stacks.wrapperContained); }
// public void method_13185(yarnwrap.server.command.ServerCommandSource stacks) { wrapperContained.method_13185(stacks.wrapperContained); }
// public static void method_13185(yarnwrap.server.command.ServerCommandSource stacks, ) { net.minecraft.server.command.LootCommand.method_13185(stacks.wrapperContained); }
// public int executeReplace(java.util.Collection targets,int slot,int stackCount,java.util.List stacks,Object messageSender) { return wrapperContained.executeReplace(targets,slot,stackCount,stacks,messageSender); }
// public static int executeReplace(java.util.Collection targets,int slot,int stackCount,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.executeReplace(targets,slot,stackCount,stacks,messageSender); }
// public int method_13188(Object context) { return wrapperContained.method_13188(context); }
// public static int method_13188(Object context, ) { return net.minecraft.server.command.LootCommand.method_13188(context); }
// public int executeKill(com.mojang.brigadier.context.CommandContext context,yarnwrap.entity.Entity entity,Object constructor) { return wrapperContained.executeKill(context,entity.wrapperContained,constructor); }
// public static int executeKill(com.mojang.brigadier.context.CommandContext context,yarnwrap.entity.Entity entity,Object constructor, ) { return net.minecraft.server.command.LootCommand.executeKill(context,entity.wrapperContained,constructor); }
// public int method_13191(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender) { return wrapperContained.method_13191(context,stacks,messageSender); }
// public static int method_13191(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.method_13191(context,stacks,messageSender); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess, ) { net.minecraft.server.command.LootCommand.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public com.mojang.brigadier.Message method_13195(java.lang.Object entityName) { return wrapperContained.method_13195(entityName); }
// public static com.mojang.brigadier.Message method_13195(java.lang.Object entityName, ) { return net.minecraft.server.command.LootCommand.method_13195(entityName); }
// public int executeInsert(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos targetPos,java.util.List stacks,Object messageSender) { return wrapperContained.executeInsert(source.wrapperContained,targetPos.wrapperContained,stacks,messageSender); }
// public static int executeInsert(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos targetPos,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.executeInsert(source.wrapperContained,targetPos.wrapperContained,stacks,messageSender); }
// public int executeLoot(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.entry.RegistryEntry lootTable,Object constructor) { return wrapperContained.executeLoot(context,lootTable.wrapperContained,constructor); }
// public static int executeLoot(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.entry.RegistryEntry lootTable,Object constructor, ) { return net.minecraft.server.command.LootCommand.executeLoot(context,lootTable.wrapperContained,constructor); }
// public int method_13198(Object context) { return wrapperContained.method_13198(context); }
// public static int method_13198(Object context, ) { return net.minecraft.server.command.LootCommand.method_13198(context); }
// public int executeFish(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.entry.RegistryEntry lootTable,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,Object constructor) { return wrapperContained.executeFish(context,lootTable.wrapperContained,pos.wrapperContained,stack.wrapperContained,constructor); }
// public static int executeFish(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.entry.RegistryEntry lootTable,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,Object constructor, ) { return net.minecraft.server.command.LootCommand.executeFish(context,lootTable.wrapperContained,pos.wrapperContained,stack.wrapperContained,constructor); }
// public int executeGive(java.util.Collection players,java.util.List stacks,Object messageSender) { return wrapperContained.executeGive(players,stacks,messageSender); }
// public static int executeGive(java.util.Collection players,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.executeGive(players,stacks,messageSender); }
// public int method_13202(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender) { return wrapperContained.method_13202(context,stacks,messageSender); }
// public static int method_13202(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.method_13202(context,stacks,messageSender); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_13203(yarnwrap.command.CommandRegistryAccess builder,com.mojang.brigadier.builder.ArgumentBuilder constructor) { return wrapperContained.method_13203(builder.wrapperContained,constructor); }
// public static com.mojang.brigadier.builder.ArgumentBuilder method_13203(yarnwrap.command.CommandRegistryAccess builder,com.mojang.brigadier.builder.ArgumentBuilder constructor, ) { return net.minecraft.server.command.LootCommand.method_13203(builder.wrapperContained,constructor); }
// public int method_13204(Object context) { return wrapperContained.method_13204(context); }
// public static int method_13204(Object context, ) { return net.minecraft.server.command.LootCommand.method_13204(context); }
// public int method_13205(Object context) { return wrapperContained.method_13205(context); }
// public static int method_13205(Object context, ) { return net.minecraft.server.command.LootCommand.method_13205(context); }
// public com.mojang.brigadier.builder.ArgumentBuilder addTargetArguments(com.mojang.brigadier.builder.ArgumentBuilder rootArgument,Object sourceConstructor) { return wrapperContained.addTargetArguments(rootArgument,sourceConstructor); }
// public static com.mojang.brigadier.builder.ArgumentBuilder addTargetArguments(com.mojang.brigadier.builder.ArgumentBuilder rootArgument,Object sourceConstructor, ) { return net.minecraft.server.command.LootCommand.addTargetArguments(rootArgument,sourceConstructor); }
// public yarnwrap.inventory.Inventory getBlockInventory(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.inventory.Inventory(wrapperContained.getBlockInventory(source.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.inventory.Inventory getBlockInventory(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.inventory.Inventory(net.minecraft.server.command.LootCommand.getBlockInventory(source.wrapperContained,pos.wrapperContained)); }
// public int method_13208(Object context) { return wrapperContained.method_13208(context); }
// public static int method_13208(Object context, ) { return net.minecraft.server.command.LootCommand.method_13208(context); }
// public int executeBlock(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos targetPos,int slot,int stackCount,java.util.List stacks,Object messageSender) { return wrapperContained.executeBlock(source.wrapperContained,targetPos.wrapperContained,slot,stackCount,stacks,messageSender); }
// public static int executeBlock(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos targetPos,int slot,int stackCount,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.executeBlock(source.wrapperContained,targetPos.wrapperContained,slot,stackCount,stacks,messageSender); }
// public java.util.concurrent.CompletableFuture method_13210(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13210(context,builder); }
// public static java.util.concurrent.CompletableFuture method_13210(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.server.command.LootCommand.method_13210(context,builder); }
// public int method_13211(Object context) { return wrapperContained.method_13211(context); }
// public static int method_13211(Object context, ) { return net.minecraft.server.command.LootCommand.method_13211(context); }
// public void sendDroppedFeedback(yarnwrap.server.command.ServerCommandSource source,java.util.List stacks,yarnwrap.registry.RegistryKey lootTable) { wrapperContained.sendDroppedFeedback(source.wrapperContained,stacks,lootTable.wrapperContained); }
// public static void sendDroppedFeedback(yarnwrap.server.command.ServerCommandSource source,java.util.List stacks,yarnwrap.registry.RegistryKey lootTable, ) { net.minecraft.server.command.LootCommand.sendDroppedFeedback(source.wrapperContained,stacks,lootTable.wrapperContained); }
// public void sendDroppedFeedback(yarnwrap.server.command.ServerCommandSource source,java.util.List stacks) { wrapperContained.sendDroppedFeedback(source.wrapperContained,stacks); }
// public static void sendDroppedFeedback(yarnwrap.server.command.ServerCommandSource source,java.util.List stacks, ) { net.minecraft.server.command.LootCommand.sendDroppedFeedback(source.wrapperContained,stacks); }
// public int method_13214(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender) { return wrapperContained.method_13214(context,stacks,messageSender); }
// public static int method_13214(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.method_13214(context,stacks,messageSender); }
// public int method_13215(Object context) { return wrapperContained.method_13215(context); }
// public static int method_13215(Object context, ) { return net.minecraft.server.command.LootCommand.method_13215(context); }
// public int method_13216(Object context) { return wrapperContained.method_13216(context); }
// public static int method_13216(Object context, ) { return net.minecraft.server.command.LootCommand.method_13216(context); }
// public com.mojang.brigadier.Message method_13217(java.lang.Object entityName) { return wrapperContained.method_13217(entityName); }
// public static com.mojang.brigadier.Message method_13217(java.lang.Object entityName, ) { return net.minecraft.server.command.LootCommand.method_13217(entityName); }
// public boolean itemsMatch(yarnwrap.item.ItemStack first,yarnwrap.item.ItemStack second) { return wrapperContained.itemsMatch(first.wrapperContained,second.wrapperContained); }
// public static boolean itemsMatch(yarnwrap.item.ItemStack first,yarnwrap.item.ItemStack second, ) { return net.minecraft.server.command.LootCommand.itemsMatch(first.wrapperContained,second.wrapperContained); }
// public int executeMine(com.mojang.brigadier.context.CommandContext context,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,Object constructor) { return wrapperContained.executeMine(context,pos.wrapperContained,stack.wrapperContained,constructor); }
// public static int executeMine(com.mojang.brigadier.context.CommandContext context,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,Object constructor, ) { return net.minecraft.server.command.LootCommand.executeMine(context,pos.wrapperContained,stack.wrapperContained,constructor); }
// public int method_13220(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender) { return wrapperContained.method_13220(context,stacks,messageSender); }
// public static int method_13220(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.method_13220(context,stacks,messageSender); }
// public int method_13221(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender) { return wrapperContained.method_13221(context,stacks,messageSender); }
// public static int method_13221(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.method_13221(context,stacks,messageSender); }
// public int method_13222(Object context) { return wrapperContained.method_13222(context); }
// public static int method_13222(Object context, ) { return net.minecraft.server.command.LootCommand.method_13222(context); }
// public boolean insert(yarnwrap.inventory.Inventory inventory,yarnwrap.item.ItemStack stack) { return wrapperContained.insert(inventory.wrapperContained,stack.wrapperContained); }
// public static boolean insert(yarnwrap.inventory.Inventory inventory,yarnwrap.item.ItemStack stack, ) { return net.minecraft.server.command.LootCommand.insert(inventory.wrapperContained,stack.wrapperContained); }
// public void method_13224(yarnwrap.server.command.ServerCommandSource stacks) { wrapperContained.method_13224(stacks.wrapperContained); }
// public static void method_13224(yarnwrap.server.command.ServerCommandSource stacks, ) { net.minecraft.server.command.LootCommand.method_13224(stacks.wrapperContained); }
// public void replace(yarnwrap.entity.Entity entity,java.util.List stacks,int slot,int stackCount,java.util.List addedStacks) { wrapperContained.replace(entity.wrapperContained,stacks,slot,stackCount,addedStacks); }
// public static void replace(yarnwrap.entity.Entity entity,java.util.List stacks,int slot,int stackCount,java.util.List addedStacks, ) { net.minecraft.server.command.LootCommand.replace(entity.wrapperContained,stacks,slot,stackCount,addedStacks); }
// public int method_16339(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender) { return wrapperContained.method_16339(context,stacks,messageSender); }
// public static int method_16339(com.mojang.brigadier.context.CommandContext context,java.util.List stacks,Object messageSender, ) { return net.minecraft.server.command.LootCommand.method_16339(context,stacks,messageSender); }

}