package yarnwrap.client.main;
public class Main { public net.minecraft.client.main.Main wrapperContained; public Main(net.minecraft.client.main.Main wrapperContained) { this.wrapperContained = wrapperContained; }

public void main(java.lang.String[] args) { wrapperContained.main(args); }
// public java.lang.Object getOption(joptsimple.OptionSet optionSet,joptsimple.OptionSpec optionSpec) { return wrapperContained.getOption(optionSet,optionSpec); }
// public boolean isNotNullOrEmpty(java.lang.String s) { return wrapperContained.isNotNullOrEmpty(s); }
// public java.util.OptionalInt toOptional(java.lang.Integer i) { return wrapperContained.toOptional(i); }
// public java.util.Optional toOptional(java.lang.String string) { return wrapperContained.toOptional(string); }
// public java.lang.String unescape(java.lang.String string) { return wrapperContained.unescape(string); }

}