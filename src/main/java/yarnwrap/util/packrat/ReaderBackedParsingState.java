package yarnwrap.util.packrat;
public class ReaderBackedParsingState { public net.minecraft.util.packrat.ReaderBackedParsingState wrapperContained; public ReaderBackedParsingState(net.minecraft.util.packrat.ReaderBackedParsingState wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.StringReader reader() { return wrapperContained.reader; }
// public void reader(com.mojang.brigadier.StringReader value) { wrapperContained.reader = value; }
// public static com.mojang.brigadier.StringReader reader() { return net.minecraft.util.packrat.ReaderBackedParsingState.reader; }
// public static void reader(com.mojang.brigadier.StringReader value, ) { net.minecraft.util.packrat.ReaderBackedParsingState.reader = value; }

public ReaderBackedParsingState(yarnwrap.util.packrat.ParseErrorList errors,com.mojang.brigadier.StringReader reader) { this.wrapperContained = new net.minecraft.util.packrat.ReaderBackedParsingState(errors.wrapperContained,reader); }

}