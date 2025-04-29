package yarnwrap.server.command;
public class AttributeCommand { public net.minecraft.server.command.AttributeCommand wrapperContained; public AttributeCommand(net.minecraft.server.command.AttributeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ENTITY_FAILED_EXCEPTION() { return wrapperContained.ENTITY_FAILED_EXCEPTION; }
// public void ENTITY_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.ENTITY_FAILED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType ENTITY_FAILED_EXCEPTION() { return net.minecraft.server.command.AttributeCommand.ENTITY_FAILED_EXCEPTION; }
// public static void ENTITY_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.server.command.AttributeCommand.ENTITY_FAILED_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NO_ATTRIBUTE_EXCEPTION() { return wrapperContained.NO_ATTRIBUTE_EXCEPTION; }
// public void NO_ATTRIBUTE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.NO_ATTRIBUTE_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NO_ATTRIBUTE_EXCEPTION() { return net.minecraft.server.command.AttributeCommand.NO_ATTRIBUTE_EXCEPTION; }
// public static void NO_ATTRIBUTE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.server.command.AttributeCommand.NO_ATTRIBUTE_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType NO_MODIFIER_EXCEPTION() { return wrapperContained.NO_MODIFIER_EXCEPTION; }
// public void NO_MODIFIER_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value) { wrapperContained.NO_MODIFIER_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType NO_MODIFIER_EXCEPTION() { return net.minecraft.server.command.AttributeCommand.NO_MODIFIER_EXCEPTION; }
// public static void NO_MODIFIER_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value, ) { net.minecraft.server.command.AttributeCommand.NO_MODIFIER_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType MODIFIER_ALREADY_PRESENT_EXCEPTION() { return wrapperContained.MODIFIER_ALREADY_PRESENT_EXCEPTION; }
// public void MODIFIER_ALREADY_PRESENT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value) { wrapperContained.MODIFIER_ALREADY_PRESENT_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType MODIFIER_ALREADY_PRESENT_EXCEPTION() { return net.minecraft.server.command.AttributeCommand.MODIFIER_ALREADY_PRESENT_EXCEPTION; }
// public static void MODIFIER_ALREADY_PRESENT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value, ) { net.minecraft.server.command.AttributeCommand.MODIFIER_ALREADY_PRESENT_EXCEPTION = value; }

// public yarnwrap.entity.LivingEntity getLivingEntity(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.LivingEntity(wrapperContained.getLivingEntity(entity.wrapperContained)); }
// public static yarnwrap.entity.LivingEntity getLivingEntity(yarnwrap.entity.Entity entity, ) { return new yarnwrap.entity.LivingEntity(net.minecraft.server.command.AttributeCommand.getLivingEntity(entity.wrapperContained)); }
// public yarnwrap.entity.attribute.EntityAttributeInstance getAttributeInstance(yarnwrap.entity.Entity entity,yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.getAttributeInstance(entity.wrapperContained,attribute.wrapperContained)); }
// public static yarnwrap.entity.attribute.EntityAttributeInstance getAttributeInstance(yarnwrap.entity.Entity entity,yarnwrap.registry.entry.RegistryEntry attribute, ) { return new yarnwrap.entity.attribute.EntityAttributeInstance(net.minecraft.server.command.AttributeCommand.getAttributeInstance(entity.wrapperContained,attribute.wrapperContained)); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess, ) { net.minecraft.server.command.AttributeCommand.register(dispatcher,registryAccess.wrapperContained); }
// public int method_27736(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27736(context); }
// public static int method_27736(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27736(context); }
// public boolean method_27738(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_27738(source.wrapperContained); }
// public static boolean method_27738(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.AttributeCommand.method_27738(source.wrapperContained); }
// public int executeValueGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,double multiplier) { return wrapperContained.executeValueGet(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,multiplier); }
// public static int executeValueGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,double multiplier, ) { return net.minecraft.server.command.AttributeCommand.executeValueGet(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,multiplier); }
// public int executeModifierRemove(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id) { return wrapperContained.executeModifierRemove(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,id.wrapperContained); }
// public static int executeModifierRemove(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id, ) { return net.minecraft.server.command.AttributeCommand.executeModifierRemove(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,id.wrapperContained); }
// public int executeModifierValueGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id,double multiplier) { return wrapperContained.executeModifierValueGet(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,id.wrapperContained,multiplier); }
// public static int executeModifierValueGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id,double multiplier, ) { return net.minecraft.server.command.AttributeCommand.executeModifierValueGet(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,id.wrapperContained,multiplier); }
// public int executeModifierAdd(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id,double value,Object operation) { return wrapperContained.executeModifierAdd(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,id.wrapperContained,value,operation); }
// public static int executeModifierAdd(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id,double value,Object operation, ) { return net.minecraft.server.command.AttributeCommand.executeModifierAdd(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,id.wrapperContained,value,operation); }
// public com.mojang.brigadier.Message method_27743(java.lang.Object name) { return wrapperContained.method_27743(name); }
// public static com.mojang.brigadier.Message method_27743(java.lang.Object name, ) { return net.minecraft.server.command.AttributeCommand.method_27743(name); }
// public com.mojang.brigadier.Message method_27744(java.lang.Object entityName,java.lang.Object attributeName) { return wrapperContained.method_27744(entityName,attributeName); }
// public static com.mojang.brigadier.Message method_27744(java.lang.Object entityName,java.lang.Object attributeName, ) { return net.minecraft.server.command.AttributeCommand.method_27744(entityName,attributeName); }
// public com.mojang.brigadier.Message method_27745(java.lang.Object entityName,java.lang.Object attributeName,java.lang.Object uuid) { return wrapperContained.method_27745(entityName,attributeName,uuid); }
// public static com.mojang.brigadier.Message method_27745(java.lang.Object entityName,java.lang.Object attributeName,java.lang.Object uuid, ) { return net.minecraft.server.command.AttributeCommand.method_27745(entityName,attributeName,uuid); }
// public yarnwrap.entity.LivingEntity getLivingEntityWithAttribute(yarnwrap.entity.Entity entity,yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.LivingEntity(wrapperContained.getLivingEntityWithAttribute(entity.wrapperContained,attribute.wrapperContained)); }
// public static yarnwrap.entity.LivingEntity getLivingEntityWithAttribute(yarnwrap.entity.Entity entity,yarnwrap.registry.entry.RegistryEntry attribute, ) { return new yarnwrap.entity.LivingEntity(net.minecraft.server.command.AttributeCommand.getLivingEntityWithAttribute(entity.wrapperContained,attribute.wrapperContained)); }
// public int method_27747(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27747(context); }
// public static int method_27747(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27747(context); }
// public int executeBaseValueGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,double multiplier) { return wrapperContained.executeBaseValueGet(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,multiplier); }
// public static int executeBaseValueGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,double multiplier, ) { return net.minecraft.server.command.AttributeCommand.executeBaseValueGet(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,multiplier); }
// public com.mojang.brigadier.Message method_27749(java.lang.Object entityName,java.lang.Object attributeName,java.lang.Object uuid) { return wrapperContained.method_27749(entityName,attributeName,uuid); }
// public static com.mojang.brigadier.Message method_27749(java.lang.Object entityName,java.lang.Object attributeName,java.lang.Object uuid, ) { return net.minecraft.server.command.AttributeCommand.method_27749(entityName,attributeName,uuid); }
// public int method_27750(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27750(context); }
// public static int method_27750(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27750(context); }
// public int executeBaseValueSet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,double value) { return wrapperContained.executeBaseValueSet(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,value); }
// public static int executeBaseValueSet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity target,yarnwrap.registry.entry.RegistryEntry attribute,double value, ) { return net.minecraft.server.command.AttributeCommand.executeBaseValueSet(source.wrapperContained,target.wrapperContained,attribute.wrapperContained,value); }
// public int method_27752(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27752(context); }
// public static int method_27752(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27752(context); }
// public int method_27753(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27753(context); }
// public static int method_27753(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27753(context); }
// public int method_27754(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27754(context); }
// public static int method_27754(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27754(context); }
// public int method_27755(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27755(context); }
// public static int method_27755(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27755(context); }
// public int method_27756(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27756(context); }
// public static int method_27756(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27756(context); }
// public int method_27757(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27757(context); }
// public static int method_27757(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27757(context); }
// public int method_27758(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27758(context); }
// public static int method_27758(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27758(context); }
// public int method_27759(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_27759(context); }
// public static int method_27759(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.AttributeCommand.method_27759(context); }
// public yarnwrap.text.Text getName(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.text.Text(wrapperContained.getName(attribute.wrapperContained)); }
// public static yarnwrap.text.Text getName(yarnwrap.registry.entry.RegistryEntry attribute, ) { return new yarnwrap.text.Text(net.minecraft.server.command.AttributeCommand.getName(attribute.wrapperContained)); }

}