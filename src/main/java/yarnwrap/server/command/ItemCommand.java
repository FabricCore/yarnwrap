package yarnwrap.server.command;
public class ItemCommand { public net.minecraft.server.command.ItemCommand wrapperContained; public ItemCommand(net.minecraft.server.command.ItemCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType NOT_A_CONTAINER_TARGET_EXCEPTION() { return wrapperContained.NOT_A_CONTAINER_TARGET_EXCEPTION; }
// public void NOT_A_CONTAINER_TARGET_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value) { wrapperContained.NOT_A_CONTAINER_TARGET_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NO_SUCH_SLOT_TARGET_EXCEPTION() { return wrapperContained.NO_SUCH_SLOT_TARGET_EXCEPTION; }
// public void NO_SUCH_SLOT_TARGET_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NO_SUCH_SLOT_TARGET_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType NOT_A_CONTAINER_SOURCE_EXCEPTION() { return wrapperContained.NOT_A_CONTAINER_SOURCE_EXCEPTION; }
// public void NOT_A_CONTAINER_SOURCE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value) { wrapperContained.NOT_A_CONTAINER_SOURCE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NO_SUCH_SLOT_SOURCE_EXCEPTION() { return wrapperContained.NO_SUCH_SLOT_SOURCE_EXCEPTION; }
// public void NO_SUCH_SLOT_SOURCE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NO_SUCH_SLOT_SOURCE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NO_CHANGES_EXCEPTION() { return wrapperContained.NO_CHANGES_EXCEPTION; }
// public void NO_CHANGES_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.NO_CHANGES_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType KNOWN_ITEM_EXCEPTION() { return wrapperContained.KNOWN_ITEM_EXCEPTION; }
// public void KNOWN_ITEM_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.KNOWN_ITEM_EXCEPTION = value; }
// public com.mojang.brigadier.suggestion.SuggestionProvider MODIFIER_SUGGESTION_PROVIDER() { return wrapperContained.MODIFIER_SUGGESTION_PROVIDER; }
// public void MODIFIER_SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.MODIFIER_SUGGESTION_PROVIDER = value; }
// public yarnwrap.item.ItemStack getStackInSlot(yarnwrap.entity.Entity entity,int slotId) { return new yarnwrap.item.ItemStack(wrapperContained.getStackInSlot(entity.wrapperContained,slotId)); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int method_32708(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32708(context); }
// public java.util.concurrent.CompletableFuture method_32709(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_32709(context,builder); }
// public boolean method_32710(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_32710(source.wrapperContained); }
// public int executeBlockCopyEntity(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity sourceEntity,int sourceSlot,yarnwrap.util.math.BlockPos pos,int slot) { return wrapperContained.executeBlockCopyEntity(source.wrapperContained,sourceEntity.wrapperContained,sourceSlot,pos.wrapperContained,slot); }
// public int executeBlockCopyEntity(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity sourceEntity,int sourceSlot,yarnwrap.util.math.BlockPos pos,int slot,yarnwrap.registry.entry.RegistryEntry lootFunction) { return wrapperContained.executeBlockCopyEntity(source.wrapperContained,sourceEntity.wrapperContained,sourceSlot,pos.wrapperContained,slot,lootFunction.wrapperContained); }
// public int executeEntityCopyEntity(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity sourceEntity,int sourceSlot,java.util.Collection targets,int slot) { return wrapperContained.executeEntityCopyEntity(source.wrapperContained,sourceEntity.wrapperContained,sourceSlot,targets,slot); }
// public int executeEntityCopyEntity(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity sourceEntity,int sourceSlot,java.util.Collection targets,int slot,yarnwrap.registry.entry.RegistryEntry lootFunction) { return wrapperContained.executeEntityCopyEntity(source.wrapperContained,sourceEntity.wrapperContained,sourceSlot,targets,slot,lootFunction.wrapperContained); }
// public yarnwrap.item.ItemStack getStackWithModifier(yarnwrap.server.command.ServerCommandSource source,yarnwrap.registry.entry.RegistryEntry lootFunction,yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.getStackWithModifier(source.wrapperContained,lootFunction.wrapperContained,stack.wrapperContained)); }
// public yarnwrap.item.ItemStack getStackInSlotFromInventoryAt(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos,int slotId) { return new yarnwrap.item.ItemStack(wrapperContained.getStackInSlotFromInventoryAt(source.wrapperContained,pos.wrapperContained,slotId)); }
// public int executeBlockReplace(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos,int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.executeBlockReplace(source.wrapperContained,pos.wrapperContained,slot,stack.wrapperContained); }
// public int executeBlockModify(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos,int slot,yarnwrap.registry.entry.RegistryEntry lootFunction) { return wrapperContained.executeBlockModify(source.wrapperContained,pos.wrapperContained,slot,lootFunction.wrapperContained); }
// public int executeBlockCopyBlock(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos sourcePos,int sourceSlot,yarnwrap.util.math.BlockPos pos,int slot) { return wrapperContained.executeBlockCopyBlock(source.wrapperContained,sourcePos.wrapperContained,sourceSlot,pos.wrapperContained,slot); }
// public int executeBlockCopyBlock(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos sourcePos,int sourceSlot,yarnwrap.util.math.BlockPos pos,int slot,yarnwrap.registry.entry.RegistryEntry lootFunction) { return wrapperContained.executeBlockCopyBlock(source.wrapperContained,sourcePos.wrapperContained,sourceSlot,pos.wrapperContained,slot,lootFunction.wrapperContained); }
// public int executeEntityCopyBlock(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos sourcePos,int sourceSlot,java.util.Collection targets,int slot) { return wrapperContained.executeEntityCopyBlock(source.wrapperContained,sourcePos.wrapperContained,sourceSlot,targets,slot); }
// public int executeEntityCopyBlock(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos sourcePos,int sourceSlot,java.util.Collection targets,int slot,yarnwrap.registry.entry.RegistryEntry lootFunction) { return wrapperContained.executeEntityCopyBlock(source.wrapperContained,sourcePos.wrapperContained,sourceSlot,targets,slot,lootFunction.wrapperContained); }
// public yarnwrap.inventory.Inventory getInventoryAtPos(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos,com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType exception) { return new yarnwrap.inventory.Inventory(wrapperContained.getInventoryAtPos(source.wrapperContained,pos.wrapperContained,exception)); }
// public int executeEntityReplace(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.executeEntityReplace(source.wrapperContained,targets,slot,stack.wrapperContained); }
// public int executeEntityModify(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int slot,yarnwrap.registry.entry.RegistryEntry lootFunction) { return wrapperContained.executeEntityModify(source.wrapperContained,targets,slot,lootFunction.wrapperContained); }
// public com.mojang.brigadier.Message method_32726(java.lang.Object slot) { return wrapperContained.method_32726(slot); }
// public com.mojang.brigadier.Message method_32727(java.lang.Object itemName,java.lang.Object slot) { return wrapperContained.method_32727(itemName,slot); }
// public com.mojang.brigadier.Message method_32728(java.lang.Object x,java.lang.Object y,java.lang.Object z) { return wrapperContained.method_32728(x,y,z); }
// public int method_32729(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32729(context); }
// public com.mojang.brigadier.Message method_32730(java.lang.Object slot) { return wrapperContained.method_32730(slot); }
// public com.mojang.brigadier.Message method_32731(java.lang.Object x,java.lang.Object y,java.lang.Object z) { return wrapperContained.method_32731(x,y,z); }
// public int method_32732(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32732(context); }
// public com.mojang.brigadier.Message method_32733(java.lang.Object slot) { return wrapperContained.method_32733(slot); }
// public int method_32734(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32734(context); }
// public int method_32735(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32735(context); }
// public int method_32736(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32736(context); }
// public int method_32737(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32737(context); }
// public int method_32738(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32738(context); }
// public int method_32739(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32739(context); }
// public int method_32740(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32740(context); }
// public int method_32741(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32741(context); }
// public int method_32742(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32742(context); }
// public int method_32743(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32743(context); }
// public int method_32744(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_32744(context); }

}