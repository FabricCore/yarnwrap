package yarnwrap.client.util;
public class ModelIdentifier { public net.minecraft.client.util.ModelIdentifier wrapperContained; public ModelIdentifier(net.minecraft.client.util.ModelIdentifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String INVENTORY_VARIANT() { return wrapperContained.INVENTORY_VARIANT; }
// public void INVENTORY_VARIANT(java.lang.String value) { wrapperContained.INVENTORY_VARIANT = value; }
public static java.lang.String INVENTORY_VARIANT() { return net.minecraft.client.util.ModelIdentifier.INVENTORY_VARIANT; }
// public static void INVENTORY_VARIANT(java.lang.String value, ) { net.minecraft.client.util.ModelIdentifier.INVENTORY_VARIANT = value; }

public ModelIdentifier(yarnwrap.util.Identifier id,java.lang.String variant) { this.wrapperContained = new net.minecraft.client.util.ModelIdentifier(id.wrapperContained,variant); }
// public yarnwrap.client.util.ModelIdentifier ofVanilla(java.lang.String path,java.lang.String variant) { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.ofVanilla(path,variant)); }
// public static yarnwrap.client.util.ModelIdentifier ofVanilla(java.lang.String path,java.lang.String variant, ) { return new yarnwrap.client.util.ModelIdentifier(net.minecraft.client.util.ModelIdentifier.ofVanilla(path,variant)); }
// public java.lang.String toLowerCase(java.lang.String string) { return wrapperContained.toLowerCase(string); }
// public static java.lang.String toLowerCase(java.lang.String string, ) { return net.minecraft.client.util.ModelIdentifier.toLowerCase(string); }
public java.lang.String getVariant() { return wrapperContained.getVariant(); }
// public static java.lang.String getVariant() { return net.minecraft.client.util.ModelIdentifier.getVariant(); }
// public yarnwrap.client.util.ModelIdentifier ofInventoryVariant(yarnwrap.util.Identifier id) { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.ofInventoryVariant(id.wrapperContained)); }
// public static yarnwrap.client.util.ModelIdentifier ofInventoryVariant(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.util.ModelIdentifier(net.minecraft.client.util.ModelIdentifier.ofInventoryVariant(id.wrapperContained)); }

}