package yarnwrap.data.report;
public class CommandSyntaxProvider { public net.minecraft.data.report.CommandSyntaxProvider wrapperContained; public CommandSyntaxProvider(net.minecraft.data.report.CommandSyntaxProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.report.CommandSyntaxProvider.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.report.CommandSyntaxProvider.output = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
// public static java.util.concurrent.CompletableFuture registryLookupFuture() { return net.minecraft.data.report.CommandSyntaxProvider.registryLookupFuture; }
// public static void registryLookupFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.report.CommandSyntaxProvider.registryLookupFuture = value; }

public CommandSyntaxProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.report.CommandSyntaxProvider(output.wrapperContained,registryLookupFuture); }
// public java.util.concurrent.CompletionStage method_46811(yarnwrap.data.DataWriter lookup) { return wrapperContained.method_46811(lookup.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_46811(yarnwrap.data.DataWriter lookup, ) { return net.minecraft.data.report.CommandSyntaxProvider.method_46811(lookup.wrapperContained); }

}