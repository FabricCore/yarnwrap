package yarnwrap.command;
public class MacroInvocation { public net.minecraft.command.MacroInvocation wrapperContained; public MacroInvocation(net.minecraft.command.MacroInvocation wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isValidMacroName(java.lang.String name) { return wrapperContained.isValidMacroName(name); }
public yarnwrap.command.MacroInvocation parse(java.lang.String command,int lineNumber) { return new yarnwrap.command.MacroInvocation(wrapperContained.parse(command,lineNumber)); }
public java.lang.String apply(java.util.List arguments) { return wrapperContained.apply(arguments); }

}