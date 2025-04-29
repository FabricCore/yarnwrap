package yarnwrap.block.enums;
public class StructureBlockMode { public net.minecraft.block.enums.StructureBlockMode wrapperContained; public StructureBlockMode(net.minecraft.block.enums.StructureBlockMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.block.enums.StructureBlockMode.name; }
// public static void name(java.lang.String value, ) { net.minecraft.block.enums.StructureBlockMode.name = value; }

// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public void text(yarnwrap.text.Text value) { wrapperContained.text = value.wrapperContained; }
// public static yarnwrap.text.Text text() { return new yarnwrap.text.Text(net.minecraft.block.enums.StructureBlockMode.text); }
// public static void text(yarnwrap.text.Text value, ) { net.minecraft.block.enums.StructureBlockMode.text = value.wrapperContained; }

// public StructureBlockMode(java.lang.String name) { this.wrapperContained = new net.minecraft.block.enums.StructureBlockMode(name); }
public yarnwrap.text.Text asText() { return new yarnwrap.text.Text(wrapperContained.asText()); }
// public static yarnwrap.text.Text asText() { return new yarnwrap.text.Text(net.minecraft.block.enums.StructureBlockMode.asText()); }

}