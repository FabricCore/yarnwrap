package yarnwrap.server.command;
public class LootCommand { public net.minecraft.server.command.LootCommand wrapperContained; public LootCommand(net.minecraft.server.command.LootCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NO_HELD_ITEMS_EXCEPTION() { return wrapperContained.NO_HELD_ITEMS_EXCEPTION; }
// public void NO_HELD_ITEMS_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NO_HELD_ITEMS_EXCEPTION = value; }
public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUGGESTION_PROVIDER = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NO_LOOT_TABLE_EXCEPTION() { return wrapperContained.NO_LOOT_TABLE_EXCEPTION; }
// public void NO_LOOT_TABLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NO_LOOT_TABLE_EXCEPTION = value; }
// public yarnwrap.item.ItemStack getHeldItem(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.getHeldItem(source.wrapperContained,slot.wrapperContained)); }
// public int getFeedbackMessageSingle(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.entry.RegistryEntry lootTable,yarnwrap.loot.context.LootContextParameterSet lootContextParameters,Object constructor) { return wrapperContained.getFeedbackMessageSingle(context,lootTable.wrapperContained,lootContextParameters.wrapperContained,constructor); }
// public int executeSpawn(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.Vec3d pos,java.util.List stacks,Object messageSender) { return wrapperContained.executeSpawn(source.wrapperContained,pos.wrapperContained,stacks,messageSender); }
// public int executeReplace(java.util.Collection targets,int slot,int stackCount,java.util.List stacks,Object messageSender) { return wrapperContained.executeReplace(targets,slot,stackCount,stacks,messageSender); }
// public int executeKill(com.mojang.brigadier.context.CommandContext context,yarnwrap.entity.Entity entity,Object constructor) { return wrapperContained.executeKill(context,entity.wrapperContained,constructor); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int executeInsert(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos targetPos,java.util.List stacks,Object messageSender) { return wrapperContained.executeInsert(source.wrapperContained,targetPos.wrapperContained,stacks,messageSender); }
// public int executeLoot(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.entry.RegistryEntry lootTable,Object constructor) { return wrapperContained.executeLoot(context,lootTable.wrapperContained,constructor); }
// public int executeFish(com.mojang.brigadier.context.CommandContext context,yarnwrap.registry.entry.RegistryEntry lootTable,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,Object constructor) { return wrapperContained.executeFish(context,lootTable.wrapperContained,pos.wrapperContained,stack.wrapperContained,constructor); }
// public int executeGive(java.util.Collection players,java.util.List stacks,Object messageSender) { return wrapperContained.executeGive(players,stacks,messageSender); }
// public com.mojang.brigadier.builder.ArgumentBuilder addTargetArguments(com.mojang.brigadier.builder.ArgumentBuilder rootArgument,Object sourceConstructor) { return wrapperContained.addTargetArguments(rootArgument,sourceConstructor); }
// public yarnwrap.inventory.Inventory getBlockInventory(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.inventory.Inventory(wrapperContained.getBlockInventory(source.wrapperContained,pos.wrapperContained)); }
// public int executeBlock(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos targetPos,int slot,int stackCount,java.util.List stacks,Object messageSender) { return wrapperContained.executeBlock(source.wrapperContained,targetPos.wrapperContained,slot,stackCount,stacks,messageSender); }
// public void sendDroppedFeedback(yarnwrap.server.command.ServerCommandSource source,java.util.List stacks,yarnwrap.registry.RegistryKey lootTable) { wrapperContained.sendDroppedFeedback(source.wrapperContained,stacks,lootTable.wrapperContained); }
// public void sendDroppedFeedback(yarnwrap.server.command.ServerCommandSource source,java.util.List stacks) { wrapperContained.sendDroppedFeedback(source.wrapperContained,stacks); }
// public boolean itemsMatch(yarnwrap.item.ItemStack first,yarnwrap.item.ItemStack second) { return wrapperContained.itemsMatch(first.wrapperContained,second.wrapperContained); }
// public int executeMine(com.mojang.brigadier.context.CommandContext context,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,Object constructor) { return wrapperContained.executeMine(context,pos.wrapperContained,stack.wrapperContained,constructor); }
// public boolean insert(yarnwrap.inventory.Inventory inventory,yarnwrap.item.ItemStack stack) { return wrapperContained.insert(inventory.wrapperContained,stack.wrapperContained); }
// public void replace(yarnwrap.entity.Entity entity,java.util.List stacks,int slot,int stackCount,java.util.List addedStacks) { wrapperContained.replace(entity.wrapperContained,stacks,slot,stackCount,addedStacks); }

}