package yarnwrap.util.packrat;
public class CursorExceptionType { public net.minecraft.util.packrat.CursorExceptionType wrapperContained; public CursorExceptionType(net.minecraft.util.packrat.CursorExceptionType wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Exception create(java.lang.String input,int cursor) { return wrapperContained.create(input,cursor); }
// public static java.lang.Exception create(java.lang.String input,int cursor, ) { return net.minecraft.util.packrat.CursorExceptionType.create(input,cursor); }
// public yarnwrap.util.packrat.CursorExceptionType create(com.mojang.brigadier.exceptions.DynamicCommandExceptionType type,java.lang.String arg) { return new yarnwrap.util.packrat.CursorExceptionType(wrapperContained.create(type,arg)); }
// public static yarnwrap.util.packrat.CursorExceptionType create(com.mojang.brigadier.exceptions.DynamicCommandExceptionType type,java.lang.String arg, ) { return new yarnwrap.util.packrat.CursorExceptionType(net.minecraft.util.packrat.CursorExceptionType.create(type,arg)); }
// public com.mojang.brigadier.exceptions.CommandSyntaxException method_68202(com.mojang.brigadier.exceptions.DynamicCommandExceptionType input,java.lang.String cursor) { return wrapperContained.method_68202(input,cursor); }
// public static com.mojang.brigadier.exceptions.CommandSyntaxException method_68202(com.mojang.brigadier.exceptions.DynamicCommandExceptionType input,java.lang.String cursor, ) { return net.minecraft.util.packrat.CursorExceptionType.method_68202(input,cursor); }
// public yarnwrap.util.packrat.CursorExceptionType create(com.mojang.brigadier.exceptions.SimpleCommandExceptionType type) { return new yarnwrap.util.packrat.CursorExceptionType(wrapperContained.create(type)); }
// public static yarnwrap.util.packrat.CursorExceptionType create(com.mojang.brigadier.exceptions.SimpleCommandExceptionType type, ) { return new yarnwrap.util.packrat.CursorExceptionType(net.minecraft.util.packrat.CursorExceptionType.create(type)); }
// public com.mojang.brigadier.exceptions.CommandSyntaxException method_68204(com.mojang.brigadier.exceptions.SimpleCommandExceptionType input,java.lang.String cursor) { return wrapperContained.method_68204(input,cursor); }
// public static com.mojang.brigadier.exceptions.CommandSyntaxException method_68204(com.mojang.brigadier.exceptions.SimpleCommandExceptionType input,java.lang.String cursor, ) { return net.minecraft.util.packrat.CursorExceptionType.method_68204(input,cursor); }

}