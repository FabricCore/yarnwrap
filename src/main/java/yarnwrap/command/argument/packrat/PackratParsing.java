package yarnwrap.command.argument.packrat;
public class PackratParsing { public net.minecraft.command.argument.packrat.PackratParsing wrapperContained; public PackratParsing(net.minecraft.command.argument.packrat.PackratParsing wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.argument.packrat.ArgumentParser createParser(Object callbacks) { return new yarnwrap.command.argument.packrat.ArgumentParser(wrapperContained.createParser(callbacks)); }

}