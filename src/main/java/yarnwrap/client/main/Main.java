package yarnwrap.client.main;
public class Main { public net.minecraft.client.main.Main wrapperContained; public Main(net.minecraft.client.main.Main wrapperContained) { this.wrapperContained = wrapperContained; }

// public void main(java.lang.String[] args) { wrapperContained.main(args); }
// public static void main(java.lang.String[] args, ) { net.minecraft.client.main.Main.main(args); }
// public java.lang.Object getOption(joptsimple.OptionSet optionSet,joptsimple.OptionSpec optionSpec) { return wrapperContained.getOption(optionSet,optionSpec); }
// public static java.lang.Object getOption(joptsimple.OptionSet optionSet,joptsimple.OptionSpec optionSpec, ) { return net.minecraft.client.main.Main.getOption(optionSet,optionSpec); }
// public boolean isNotNullOrEmpty(java.lang.String s) { return wrapperContained.isNotNullOrEmpty(s); }
// public static boolean isNotNullOrEmpty(java.lang.String s, ) { return net.minecraft.client.main.Main.isNotNullOrEmpty(s); }
// public java.util.OptionalInt toOptional(java.lang.Integer i) { return wrapperContained.toOptional(i); }
// public static java.util.OptionalInt toOptional(java.lang.Integer i, ) { return net.minecraft.client.main.Main.toOptional(i); }
// public java.util.Optional toOptional(java.lang.String string) { return wrapperContained.toOptional(string); }
// public static java.util.Optional toOptional(java.lang.String string, ) { return net.minecraft.client.main.Main.toOptional(string); }
// public java.lang.String unescape(java.lang.String string) { return wrapperContained.unescape(string); }
// public static java.lang.String unescape(java.lang.String string, ) { return net.minecraft.client.main.Main.unescape(string); }

}