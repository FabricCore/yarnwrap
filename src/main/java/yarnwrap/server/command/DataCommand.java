package yarnwrap.server.command;
public class DataCommand { public net.minecraft.server.command.DataCommand wrapperContained; public DataCommand(net.minecraft.server.command.DataCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List OBJECT_TYPE_FACTORIES() { return wrapperContained.OBJECT_TYPE_FACTORIES; }
// public void OBJECT_TYPE_FACTORIES(java.util.List value) { wrapperContained.OBJECT_TYPE_FACTORIES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType GET_INVALID_EXCEPTION() { return wrapperContained.GET_INVALID_EXCEPTION; }
// public void GET_INVALID_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.GET_INVALID_EXCEPTION = value; }
public java.util.List SOURCE_OBJECT_TYPES() { return wrapperContained.SOURCE_OBJECT_TYPES; }
// public void SOURCE_OBJECT_TYPES(java.util.List value) { wrapperContained.SOURCE_OBJECT_TYPES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType GET_UNKNOWN_EXCEPTION() { return wrapperContained.GET_UNKNOWN_EXCEPTION; }
// public void GET_UNKNOWN_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.GET_UNKNOWN_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType GET_MULTIPLE_EXCEPTION() { return wrapperContained.GET_MULTIPLE_EXCEPTION; }
// public void GET_MULTIPLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.GET_MULTIPLE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType MERGE_FAILED_EXCEPTION() { return wrapperContained.MERGE_FAILED_EXCEPTION; }
// public void MERGE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.MERGE_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType MODIFY_EXPECTED_OBJECT_EXCEPTION() { return wrapperContained.MODIFY_EXPECTED_OBJECT_EXCEPTION; }
// public void MODIFY_EXPECTED_OBJECT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.MODIFY_EXPECTED_OBJECT_EXCEPTION = value; }
public java.util.List TARGET_OBJECT_TYPES() { return wrapperContained.TARGET_OBJECT_TYPES; }
// public void TARGET_OBJECT_TYPES(java.util.List value) { wrapperContained.TARGET_OBJECT_TYPES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType MODIFY_EXPECTED_VALUE_EXCEPTION() { return wrapperContained.MODIFY_EXPECTED_VALUE_EXCEPTION; }
// public void MODIFY_EXPECTED_VALUE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.MODIFY_EXPECTED_VALUE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MODIFY_INVALID_SUBSTRING_EXCEPTION() { return wrapperContained.MODIFY_INVALID_SUBSTRING_EXCEPTION; }
// public void MODIFY_INVALID_SUBSTRING_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.MODIFY_INVALID_SUBSTRING_EXCEPTION = value; }
// public int executeRemove(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.DataCommandObject object,Object path) { return wrapperContained.executeRemove(source.wrapperContained,object.wrapperContained,path); }
// public com.mojang.brigadier.builder.ArgumentBuilder addModifyArgument(java.util.function.BiConsumer subArgumentAdder) { return wrapperContained.addModifyArgument(subArgumentAdder); }
// public int executeMerge(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.DataCommandObject object,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.executeMerge(source.wrapperContained,object.wrapperContained,nbt.wrapperContained); }
// public int executeGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.DataCommandObject object,Object path,double scale) { return wrapperContained.executeGet(source.wrapperContained,object.wrapperContained,path,scale); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.DataCommandObject object) { return wrapperContained.executeGet(source.wrapperContained,object.wrapperContained); }
// public int executeGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.DataCommandObject object,Object path) { return wrapperContained.executeGet(source.wrapperContained,object.wrapperContained,path); }
// public int executeModify(com.mojang.brigadier.context.CommandContext context,Object objectType,Object modifier,java.util.List elements) { return wrapperContained.executeModify(context,objectType,modifier,elements); }
// public yarnwrap.nbt.NbtElement getNbt(Object path,yarnwrap.command.DataCommandObject object) { return new yarnwrap.nbt.NbtElement(wrapperContained.getNbt(path,object.wrapperContained)); }
// public java.util.List getValues(com.mojang.brigadier.context.CommandContext context,Object objectType) { return wrapperContained.getValues(context,objectType); }
// public java.util.List mapValues(java.util.List list,Object processor) { return wrapperContained.mapValues(list,processor); }
// public java.lang.String asString(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.asString(nbt.wrapperContained); }
// public java.util.List getValuesByPath(com.mojang.brigadier.context.CommandContext context,Object objectType) { return wrapperContained.getValuesByPath(context,objectType); }
// public int getSubstringIndex(int index,int length) { return wrapperContained.getSubstringIndex(index,length); }
// public java.lang.String substring(java.lang.String string,int startIndex) { return wrapperContained.substring(string,startIndex); }
// public java.lang.String substring(java.lang.String string,int startIndex,int endIndex) { return wrapperContained.substring(string,startIndex,endIndex); }
// public java.lang.String substringInternal(java.lang.String string,int startIndex,int endIndex) { return wrapperContained.substringInternal(string,startIndex,endIndex); }

}