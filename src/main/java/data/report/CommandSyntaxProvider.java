package yarnwrap.data.report;
public class CommandSyntaxProvider { public net.minecraft.data.report.CommandSyntaxProvider wrapperContained; public CommandSyntaxProvider(net.minecraft.data.report.CommandSyntaxProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }

}