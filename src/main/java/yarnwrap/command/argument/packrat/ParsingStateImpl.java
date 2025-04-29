package yarnwrap.command.argument.packrat;
public class ParsingStateImpl { public net.minecraft.command.argument.packrat.ParsingStateImpl wrapperContained; public ParsingStateImpl(net.minecraft.command.argument.packrat.ParsingStateImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.StringReader reader() { return wrapperContained.reader; }
// public void reader(com.mojang.brigadier.StringReader value) { wrapperContained.reader = value; }
// public static com.mojang.brigadier.StringReader reader() { return net.minecraft.command.argument.packrat.ParsingStateImpl.reader; }
// public static void reader(com.mojang.brigadier.StringReader value, ) { net.minecraft.command.argument.packrat.ParsingStateImpl.reader = value; }

public ParsingStateImpl(yarnwrap.command.argument.packrat.ParsingRules rules,yarnwrap.command.argument.packrat.ParseErrorList errors,com.mojang.brigadier.StringReader reader) { this.wrapperContained = new net.minecraft.command.argument.packrat.ParsingStateImpl(rules.wrapperContained,errors.wrapperContained,reader); }

}