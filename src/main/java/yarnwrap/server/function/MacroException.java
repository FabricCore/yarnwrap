package yarnwrap.server.function;
public class MacroException { public net.minecraft.server.function.MacroException wrapperContained; public MacroException(net.minecraft.server.function.MacroException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
public yarnwrap.text.Text getMessage() { return new yarnwrap.text.Text(wrapperContained.getMessage()); }

}