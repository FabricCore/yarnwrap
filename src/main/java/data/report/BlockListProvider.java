package yarnwrap.data.report;
public class BlockListProvider { public net.minecraft.data.report.BlockListProvider wrapperContained; public BlockListProvider(net.minecraft.data.report.BlockListProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }

}