package yarnwrap.data.client;
public class SimpleModelSupplier { public net.minecraft.data.client.SimpleModelSupplier wrapperContained; public SimpleModelSupplier(net.minecraft.data.client.SimpleModelSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier parent() { return new yarnwrap.util.Identifier(wrapperContained.parent); }
// public void parent(yarnwrap.util.Identifier value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.util.Identifier parent() { return new yarnwrap.util.Identifier(net.minecraft.data.client.SimpleModelSupplier.parent); }
// public static void parent(yarnwrap.util.Identifier value, ) { net.minecraft.data.client.SimpleModelSupplier.parent = value.wrapperContained; }

public SimpleModelSupplier(yarnwrap.util.Identifier parent) { this.wrapperContained = new net.minecraft.data.client.SimpleModelSupplier(parent.wrapperContained); }

}