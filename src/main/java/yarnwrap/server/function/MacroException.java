package yarnwrap.server.function;
public class MacroException { public net.minecraft.server.function.MacroException wrapperContained; public MacroException(net.minecraft.server.function.MacroException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public static yarnwrap.text.Text message() { return new yarnwrap.text.Text(net.minecraft.server.function.MacroException.message); }
// public static void message(yarnwrap.text.Text value, ) { net.minecraft.server.function.MacroException.message = value.wrapperContained; }

public MacroException(yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.server.function.MacroException(message.wrapperContained); }
public yarnwrap.text.Text getMessage() { return new yarnwrap.text.Text(wrapperContained.getMessage()); }
// public static yarnwrap.text.Text getMessage() { return new yarnwrap.text.Text(net.minecraft.server.function.MacroException.getMessage()); }

}