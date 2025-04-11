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
// public int method_13886(Object context) { return wrapperContained.method_13886(context); }
// public int method_13887(Object context) { return wrapperContained.method_13887(context); }
// public int method_13888(com.mojang.brigadier.context.CommandContext context,yarnwrap.nbt.NbtCompound sourceNbt,Object path,java.util.List elements) { return wrapperContained.method_13888(context,sourceNbt.wrapperContained,path,elements); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_13889(Object builder) { return wrapperContained.method_13889(builder); }
// public boolean method_13890(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13890(source.wrapperContained); }
// public int method_13891(com.mojang.brigadier.context.CommandContext context,yarnwrap.nbt.NbtCompound sourceNbt,Object path,java.util.List elements) { return wrapperContained.method_13891(context,sourceNbt.wrapperContained,path,elements); }
// public com.mojang.brigadier.Message method_13892(java.lang.Object path) { return wrapperContained.method_13892(path); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_13893(Object builderx) { return wrapperContained.method_13893(builderx); }
// public void method_13895(com.mojang.brigadier.builder.ArgumentBuilder builder,Object modifier) { wrapperContained.method_13895(builder,modifier); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_13896(Object builder) { return wrapperContained.method_13896(builder); }
// public com.mojang.brigadier.builder.ArgumentBuilder addModifyArgument(java.util.function.BiConsumer subArgumentAdder) { return wrapperContained.addModifyArgument(subArgumentAdder); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_13899(Object modifier) { return wrapperContained.method_13899(modifier); }
// public int method_13900(Object context) { return wrapperContained.method_13900(context); }
// public int executeMerge(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.DataCommandObject object,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.executeMerge(source.wrapperContained,object.wrapperContained,nbt.wrapperContained); }
// public com.mojang.brigadier.Message method_13902(java.lang.Object path) { return wrapperContained.method_13902(path); }
// public int executeGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.DataCommandObject object,Object path,double scale) { return wrapperContained.executeGet(source.wrapperContained,object.wrapperContained,path,scale); }
// public int method_13904(Object context) { return wrapperContained.method_13904(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public Object method_13906(java.util.function.Function factory) { return wrapperContained.method_13906(factory); }
// public com.mojang.brigadier.Message method_13907(java.lang.Object nbt) { return wrapperContained.method_13907(nbt); }
// public int executeGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.DataCommandObject object) { return wrapperContained.executeGet(source.wrapperContained,object.wrapperContained); }
// public int method_13909(Object context) { return wrapperContained.method_13909(context); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_13911(Object operation) { return wrapperContained.method_13911(operation); }
// public int method_13912(Object context) { return wrapperContained.method_13912(context); }
// public int executeGet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.command.DataCommandObject object,Object path) { return wrapperContained.executeGet(source.wrapperContained,object.wrapperContained,path); }
// public Object method_13919(java.util.function.Function factory) { return wrapperContained.method_13919(factory); }
// public int executeModify(com.mojang.brigadier.context.CommandContext context,Object objectType,Object modifier,java.util.List elements) { return wrapperContained.executeModify(context,objectType,modifier,elements); }
// public yarnwrap.nbt.NbtElement getNbt(Object path,yarnwrap.command.DataCommandObject object) { return new yarnwrap.nbt.NbtElement(wrapperContained.getNbt(path,object.wrapperContained)); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_13922(java.util.function.BiConsumer builder) { return wrapperContained.method_13922(builder); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_13923(Object builder) { return wrapperContained.method_13923(builder); }
// public int method_47952(com.mojang.brigadier.context.CommandContext context,yarnwrap.nbt.NbtCompound element,Object path,java.util.List elements) { return wrapperContained.method_47952(context,element.wrapperContained,path,elements); }
// public int method_47953(com.mojang.brigadier.context.CommandContext context,yarnwrap.nbt.NbtCompound sourceNbt,Object path,java.util.List elements) { return wrapperContained.method_47953(context,sourceNbt.wrapperContained,path,elements); }
// public int method_47954(com.mojang.brigadier.context.CommandContext context,yarnwrap.nbt.NbtCompound sourceNbt,Object path,java.util.List elements) { return wrapperContained.method_47954(context,sourceNbt.wrapperContained,path,elements); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_48088(Object builderx) { return wrapperContained.method_48088(builderx); }
// public int method_48089(Object context) { return wrapperContained.method_48089(context); }
// public com.mojang.brigadier.builder.ArgumentBuilder method_48090(Object operation) { return wrapperContained.method_48090(operation); }
// public java.util.List getValues(com.mojang.brigadier.context.CommandContext context,Object objectType) { return wrapperContained.getValues(context,objectType); }
// public java.lang.String method_48092(com.mojang.brigadier.context.CommandContext value) { return wrapperContained.method_48092(value); }
// public com.mojang.brigadier.Message method_48093(java.lang.Object nbt) { return wrapperContained.method_48093(nbt); }
// public java.lang.String method_48094(java.lang.String value) { return wrapperContained.method_48094(value); }
// public java.util.List mapValues(java.util.List list,Object processor) { return wrapperContained.mapValues(list,processor); }
// public java.lang.String asString(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.asString(nbt.wrapperContained); }
// public int method_48097(Object context) { return wrapperContained.method_48097(context); }
// public java.util.List getValuesByPath(com.mojang.brigadier.context.CommandContext context,Object objectType) { return wrapperContained.getValuesByPath(context,objectType); }
// public java.lang.String method_48099(com.mojang.brigadier.context.CommandContext value) { return wrapperContained.method_48099(value); }
// public java.lang.String method_48100(java.lang.String value) { return wrapperContained.method_48100(value); }
// public int method_48101(Object context) { return wrapperContained.method_48101(context); }
// public int method_48102(Object context) { return wrapperContained.method_48102(context); }
// public int method_48103(Object context) { return wrapperContained.method_48103(context); }
// public int method_48104(Object context) { return wrapperContained.method_48104(context); }
// public int getSubstringIndex(int index,int length) { return wrapperContained.getSubstringIndex(index,length); }
// public java.lang.String substring(java.lang.String string,int startIndex) { return wrapperContained.substring(string,startIndex); }
// public java.lang.String substring(java.lang.String string,int startIndex,int endIndex) { return wrapperContained.substring(string,startIndex,endIndex); }
// public com.mojang.brigadier.Message method_52164(java.lang.Object startIndex,java.lang.Object endIndex) { return wrapperContained.method_52164(startIndex,endIndex); }
// public java.lang.String substringInternal(java.lang.String string,int startIndex,int endIndex) { return wrapperContained.substringInternal(string,startIndex,endIndex); }

}