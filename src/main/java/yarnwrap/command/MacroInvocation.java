package yarnwrap.command;
public class MacroInvocation { public net.minecraft.command.MacroInvocation wrapperContained; public MacroInvocation(net.minecraft.command.MacroInvocation wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isValidMacroName(java.lang.String name) { return wrapperContained.isValidMacroName(name); }
// public static boolean isValidMacroName(java.lang.String name, ) { return net.minecraft.command.MacroInvocation.isValidMacroName(name); }
// public yarnwrap.command.MacroInvocation parse(java.lang.String command) { return new yarnwrap.command.MacroInvocation(wrapperContained.parse(command)); }
// public static yarnwrap.command.MacroInvocation parse(java.lang.String command, ) { return new yarnwrap.command.MacroInvocation(net.minecraft.command.MacroInvocation.parse(command)); }
public java.lang.String apply(java.util.List arguments) { return wrapperContained.apply(arguments); }
// public static java.lang.String apply(java.util.List arguments, ) { return net.minecraft.command.MacroInvocation.apply(arguments); }

}