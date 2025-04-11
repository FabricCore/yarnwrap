package yarnwrap.client.resource.language;
public class ReorderingUtil { public net.minecraft.client.resource.language.ReorderingUtil wrapperContained; public ReorderingUtil(net.minecraft.client.resource.language.ReorderingUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String shapeArabic(java.lang.String string) { return wrapperContained.shapeArabic(string); }
public yarnwrap.text.OrderedText reorder(yarnwrap.text.StringVisitable text,boolean rightToLeft) { return new yarnwrap.text.OrderedText(wrapperContained.reorder(text.wrapperContained,rightToLeft)); }

}