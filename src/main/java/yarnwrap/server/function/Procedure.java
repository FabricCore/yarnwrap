package yarnwrap.server.function;
public class Procedure { public net.minecraft.server.function.Procedure wrapperContained; public Procedure(net.minecraft.server.function.Procedure wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.server.function.Procedure.id()); }

}