package yarnwrap.command.argument;
public class ArgumentHelper { public net.minecraft.command.argument.ArgumentHelper wrapperContained; public ArgumentHelper(net.minecraft.command.argument.ArgumentHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public byte MIN_FLAG() { return wrapperContained.MIN_FLAG; }
// public void MIN_FLAG(byte value) { wrapperContained.MIN_FLAG = value; }
// public byte MAX_FLAG() { return wrapperContained.MAX_FLAG; }
// public void MAX_FLAG(byte value) { wrapperContained.MAX_FLAG = value; }
public boolean hasMinFlag(byte flags) { return wrapperContained.hasMinFlag(flags); }
// public void writeArgument(com.google.gson.JsonObject json,com.mojang.brigadier.arguments.ArgumentType argumentType) { wrapperContained.writeArgument(json,argumentType); }
// public void writeArgumentProperties(com.google.gson.JsonObject json,Object properties) { wrapperContained.writeArgumentProperties(json,properties); }
// public void writeArgumentProperties(com.google.gson.JsonObject json,yarnwrap.command.argument.serialize.ArgumentSerializer serializer,Object properties) { wrapperContained.writeArgumentProperties(json,serializer.wrapperContained,properties); }
public com.google.gson.JsonObject toJson(com.mojang.brigadier.CommandDispatcher dispatcher,com.mojang.brigadier.tree.CommandNode rootNode) { return wrapperContained.toJson(dispatcher,rootNode); }
public java.util.Set collectUsedArgumentTypes(com.mojang.brigadier.tree.CommandNode rootNode) { return wrapperContained.collectUsedArgumentTypes(rootNode); }
// public void collectUsedArgumentTypes(com.mojang.brigadier.tree.CommandNode node,java.util.Set usedArgumentTypes,java.util.Set visitedNodes) { wrapperContained.collectUsedArgumentTypes(node,usedArgumentTypes,visitedNodes); }
// public void method_41993(java.util.Set child) { wrapperContained.method_41993(child); }
public int getMinMaxFlag(boolean hasMin,boolean hasMax) { return wrapperContained.getMinMaxFlag(hasMin,hasMax); }
public boolean hasMaxFlag(byte flags) { return wrapperContained.hasMaxFlag(flags); }

}