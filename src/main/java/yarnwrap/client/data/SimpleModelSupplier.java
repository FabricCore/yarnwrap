package yarnwrap.client.data;
public class SimpleModelSupplier { public net.minecraft.client.data.SimpleModelSupplier wrapperContained; public SimpleModelSupplier(net.minecraft.client.data.SimpleModelSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier parent() { return new yarnwrap.util.Identifier(wrapperContained.parent); }
// public void parent(yarnwrap.util.Identifier value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.util.Identifier parent() { return new yarnwrap.util.Identifier(net.minecraft.client.data.SimpleModelSupplier.parent); }
// public static void parent(yarnwrap.util.Identifier value, ) { net.minecraft.client.data.SimpleModelSupplier.parent = value.wrapperContained; }

public SimpleModelSupplier(yarnwrap.util.Identifier parent) { this.wrapperContained = new net.minecraft.client.data.SimpleModelSupplier(parent.wrapperContained); }

}