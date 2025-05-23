package yarnwrap.util.packrat;
public class PackratParser { public net.minecraft.util.packrat.PackratParser wrapperContained; public PackratParser(net.minecraft.util.packrat.PackratParser wrapperContained) { this.wrapperContained = wrapperContained; }

// public void method_58339(com.mojang.brigadier.StringReader error,yarnwrap.util.packrat.ParseError callback) { wrapperContained.method_58339(error,callback.wrapperContained); }
// public static void method_58339(com.mojang.brigadier.StringReader error,yarnwrap.util.packrat.ParseError callback, ) { net.minecraft.util.packrat.PackratParser.method_58339(error,callback.wrapperContained); }
public java.util.Optional startParsing(yarnwrap.util.packrat.ParsingState state) { return wrapperContained.startParsing(state.wrapperContained); }
// public static java.util.Optional startParsing(yarnwrap.util.packrat.ParsingState state, ) { return net.minecraft.util.packrat.PackratParser.startParsing(state.wrapperContained); }

}