package yarnwrap.data.report;
public class ItemListProvider { public net.minecraft.data.report.ItemListProvider wrapperContained; public ItemListProvider(net.minecraft.data.report.ItemListProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }

}